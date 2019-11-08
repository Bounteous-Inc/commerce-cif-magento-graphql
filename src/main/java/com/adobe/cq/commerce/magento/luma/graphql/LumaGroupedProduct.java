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

package com.adobe.cq.commerce.magento.luma.graphql;

import java.util.Map;

import com.adobe.cq.commerce.magento.graphql.GroupedProduct;
import com.adobe.cq.commerce.magento.graphql.PhysicalProductInterface;
import com.adobe.cq.commerce.magento.graphql.ProductInterface;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * GroupedProduct defines a grouped product
 */
public class LumaGroupedProduct extends GroupedProduct implements PhysicalProductInterface, ProductInterface {
    public LumaGroupedProduct() {
        super();
    }

    public LumaGroupedProduct(JsonObject fields) throws SchemaViolationError {
        super(fields, true);
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "activity": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "category_gear": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "climate": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "collar": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "eco_collection": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "erin_recommends": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "features_bags": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "format": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "gender": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "material": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "new": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pattern": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "performance_fabric": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sale": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "size": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "sleeve": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "strap_bags": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "style_bags": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "style_bottom": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "style_general": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }

                default: {
                    readCustomField(fieldName, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "LumaGroupedProduct";
    }

    public String getActivity() {
        return (String) get("activity");
    }

    public LumaGroupedProduct setActivity(String arg) {
        optimisticData.put(getKey("activity"), arg);
        return this;
    }

    public String getCategoryGear() {
        return (String) get("category_gear");
    }

    public LumaGroupedProduct setCategoryGear(String arg) {
        optimisticData.put(getKey("category_gear"), arg);
        return this;
    }

    public String getClimate() {
        return (String) get("climate");
    }

    public LumaGroupedProduct setClimate(String arg) {
        optimisticData.put(getKey("climate"), arg);
        return this;
    }

    public String getCollar() {
        return (String) get("collar");
    }

    public LumaGroupedProduct setCollar(String arg) {
        optimisticData.put(getKey("collar"), arg);
        return this;
    }

    public Integer getEcoCollection() {
        return (Integer) get("eco_collection");
    }

    public LumaGroupedProduct setEcoCollection(Integer arg) {
        optimisticData.put(getKey("eco_collection"), arg);
        return this;
    }

    public Integer getErinRecommends() {
        return (Integer) get("erin_recommends");
    }

    public LumaGroupedProduct setErinRecommends(Integer arg) {
        optimisticData.put(getKey("erin_recommends"), arg);
        return this;
    }

    public String getFeaturesBags() {
        return (String) get("features_bags");
    }

    public LumaGroupedProduct setFeaturesBags(String arg) {
        optimisticData.put(getKey("features_bags"), arg);
        return this;
    }

    public Integer getFormat() {
        return (Integer) get("format");
    }

    public LumaGroupedProduct setFormat(Integer arg) {
        optimisticData.put(getKey("format"), arg);
        return this;
    }

    public String getGender() {
        return (String) get("gender");
    }

    public LumaGroupedProduct setGender(String arg) {
        optimisticData.put(getKey("gender"), arg);
        return this;
    }

    public String getMaterial() {
        return (String) get("material");
    }

    public LumaGroupedProduct setMaterial(String arg) {
        optimisticData.put(getKey("material"), arg);
        return this;
    }

    public Integer getNew() {
        return (Integer) get("new");
    }

    public LumaGroupedProduct setNew(Integer arg) {
        optimisticData.put(getKey("new"), arg);
        return this;
    }

    public String getPattern() {
        return (String) get("pattern");
    }

    public LumaGroupedProduct setPattern(String arg) {
        optimisticData.put(getKey("pattern"), arg);
        return this;
    }

    public Integer getPerformanceFabric() {
        return (Integer) get("performance_fabric");
    }

    public LumaGroupedProduct setPerformanceFabric(Integer arg) {
        optimisticData.put(getKey("performance_fabric"), arg);
        return this;
    }

    public Integer getSale() {
        return (Integer) get("sale");
    }

    public LumaGroupedProduct setSale(Integer arg) {
        optimisticData.put(getKey("sale"), arg);
        return this;
    }

    public Integer getSize() {
        return (Integer) get("size");
    }

    public LumaGroupedProduct setSize(Integer arg) {
        optimisticData.put(getKey("size"), arg);
        return this;
    }

    public String getSleeve() {
        return (String) get("sleeve");
    }

    public LumaGroupedProduct setSleeve(String arg) {
        optimisticData.put(getKey("sleeve"), arg);
        return this;
    }

    public String getStrapBags() {
        return (String) get("strap_bags");
    }

    public LumaGroupedProduct setStrapBags(String arg) {
        optimisticData.put(getKey("strap_bags"), arg);
        return this;
    }

    public String getStyleBags() {
        return (String) get("style_bags");
    }

    public LumaGroupedProduct setStyleBags(String arg) {
        optimisticData.put(getKey("style_bags"), arg);
        return this;
    }

    public String getStyleBottom() {
        return (String) get("style_bottom");
    }

    public LumaGroupedProduct setStyleBottom(String arg) {
        optimisticData.put(getKey("style_bottom"), arg);
        return this;
    }

    public String getStyleGeneral() {
        return (String) get("style_general");
    }

    public LumaGroupedProduct setStyleGeneral(String arg) {
        optimisticData.put(getKey("style_general"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "activity": return false;

            case "category_gear": return false;

            case "climate": return false;

            case "collar": return false;

            case "eco_collection": return false;

            case "erin_recommends": return false;

            case "features_bags": return false;

            case "format": return false;

            case "gender": return false;

            case "material": return false;

            case "new": return false;

            case "pattern": return false;

            case "performance_fabric": return false;

            case "sale": return false;

            case "size": return false;

            case "sleeve": return false;

            case "strap_bags": return false;

            case "style_bags": return false;

            case "style_bottom": return false;

            case "style_general": return false;

            default: return false;
        }
    }
}

