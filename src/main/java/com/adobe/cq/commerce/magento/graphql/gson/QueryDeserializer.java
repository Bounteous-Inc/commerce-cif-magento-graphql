/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
 *    This file is licensed to you under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License. You may obtain a copy
 *    of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software distributed under
 *    the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 *    OF ANY KIND, either express or implied. See the License for the specific language
 *    governing permissions and limitations under the License.
 *
 ******************************************************************************/

package com.adobe.cq.commerce.magento.graphql.gson;

import java.lang.reflect.Type;

import com.adobe.cq.commerce.magento.graphql.Query;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * This is a custom deserializer for the Magento GraphQL {@link Query} root type.
 * It is needed because the empty constructor used by default by Gson cannot be used to build {@link Query} objects.
 */
public class QueryDeserializer implements JsonDeserializer<Query> {

    private static final Gson gson = new GsonBuilder().registerTypeAdapter(Query.class, new QueryDeserializer()).create();
    private static final Gson customGson = new GsonBuilder().registerTypeAdapter(Query.class, new QueryDeserializer(true)).create();

    private boolean ignoreUnknownFields = false;

    private QueryDeserializer() {}

    private QueryDeserializer(boolean ignoreUnknownFields) {
        this.ignoreUnknownFields = ignoreUnknownFields;
    }

    public Query deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        try {
            return new Query(json.getAsJsonObject(), ignoreUnknownFields);
        } catch (SchemaViolationError e) {
            throw new JsonParseException(e);
        }
    }

    /**
     * This method returns a static {@link Gson} instance configured with this custom deserializer for the Magento
     * GraphQL {@link Query} root type. This method always returns the same static deserializer.
     * 
     * @return The custom deserializer.
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * This method returns a static <b>permissive</b> {@link Gson} instance configured with this custom deserializer for the Magento
     * GraphQL {@link Query} root type. This method always returns the same static deserializer.
     * 
     * This deserializer is permissive in the sense that it <b>ignores</b> unknown fields, that is, it doesn't throw any
     * schema violation exception if it finds an unknown field in the JSON response.
     * 
     * @return The custom deserializer.
     */
    public static Gson getCustomGson() {
        return customGson;
    }
}
