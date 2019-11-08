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

import com.adobe.cq.commerce.magento.graphql.BundleProduct;
import com.adobe.cq.commerce.magento.graphql.CustomizableProductInterface;
import com.adobe.cq.commerce.magento.graphql.PhysicalProductInterface;
import com.adobe.cq.commerce.magento.graphql.ProductInterface;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.SchemaViolationError;

/**
 * BundleProduct defines basic features of a bundle product and contains multiple BundleItems.
 */
public class LumaBundleProduct extends BundleProduct implements CustomizableProductInterface, PhysicalProductInterface, ProductInterface {
    public LumaBundleProduct() {
        super();
    }

    public LumaBundleProduct(JsonObject fields) throws SchemaViolationError {
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
        return "LumaBundleProduct";
    }

    public String getActivity() {
        return (String) get("activity");
    }

    public LumaBundleProduct setActivity(String arg) {
        optimisticData.put(getKey("activity"), arg);
        return this;
    }

    public String getCategoryGear() {
        return (String) get("category_gear");
    }

    public LumaBundleProduct setCategoryGear(String arg) {
        optimisticData.put(getKey("category_gear"), arg);
        return this;
    }

    public String getClimate() {
        return (String) get("climate");
    }

    public LumaBundleProduct setClimate(String arg) {
        optimisticData.put(getKey("climate"), arg);
        return this;
    }

    public String getCollar() {
        return (String) get("collar");
    }

    public LumaBundleProduct setCollar(String arg) {
        optimisticData.put(getKey("collar"), arg);
        return this;
    }

    public Integer getEcoCollection() {
        return (Integer) get("eco_collection");
    }

    public LumaBundleProduct setEcoCollection(Integer arg) {
        optimisticData.put(getKey("eco_collection"), arg);
        return this;
    }

    public Integer getErinRecommends() {
        return (Integer) get("erin_recommends");
    }

    public LumaBundleProduct setErinRecommends(Integer arg) {
        optimisticData.put(getKey("erin_recommends"), arg);
        return this;
    }

    public String getFeaturesBags() {
        return (String) get("features_bags");
    }

    public LumaBundleProduct setFeaturesBags(String arg) {
        optimisticData.put(getKey("features_bags"), arg);
        return this;
    }

    public Integer getFormat() {
        return (Integer) get("format");
    }

    public LumaBundleProduct setFormat(Integer arg) {
        optimisticData.put(getKey("format"), arg);
        return this;
    }

    public String getGender() {
        return (String) get("gender");
    }

    public LumaBundleProduct setGender(String arg) {
        optimisticData.put(getKey("gender"), arg);
        return this;
    }

    public String getMaterial() {
        return (String) get("material");
    }

    public LumaBundleProduct setMaterial(String arg) {
        optimisticData.put(getKey("material"), arg);
        return this;
    }

    public Integer getNew() {
        return (Integer) get("new");
    }

    public LumaBundleProduct setNew(Integer arg) {
        optimisticData.put(getKey("new"), arg);
        return this;
    }

    public String getPattern() {
        return (String) get("pattern");
    }

    public LumaBundleProduct setPattern(String arg) {
        optimisticData.put(getKey("pattern"), arg);
        return this;
    }

    public Integer getPerformanceFabric() {
        return (Integer) get("performance_fabric");
    }

    public LumaBundleProduct setPerformanceFabric(Integer arg) {
        optimisticData.put(getKey("performance_fabric"), arg);
        return this;
    }

    public Integer getSale() {
        return (Integer) get("sale");
    }

    public LumaBundleProduct setSale(Integer arg) {
        optimisticData.put(getKey("sale"), arg);
        return this;
    }

    public Integer getSize() {
        return (Integer) get("size");
    }

    public LumaBundleProduct setSize(Integer arg) {
        optimisticData.put(getKey("size"), arg);
        return this;
    }

    public String getSleeve() {
        return (String) get("sleeve");
    }

    public LumaBundleProduct setSleeve(String arg) {
        optimisticData.put(getKey("sleeve"), arg);
        return this;
    }

    public String getStrapBags() {
        return (String) get("strap_bags");
    }

    public LumaBundleProduct setStrapBags(String arg) {
        optimisticData.put(getKey("strap_bags"), arg);
        return this;
    }

    public String getStyleBags() {
        return (String) get("style_bags");
    }

    public LumaBundleProduct setStyleBags(String arg) {
        optimisticData.put(getKey("style_bags"), arg);
        return this;
    }

    public String getStyleBottom() {
        return (String) get("style_bottom");
    }

    public LumaBundleProduct setStyleBottom(String arg) {
        optimisticData.put(getKey("style_bottom"), arg);
        return this;
    }

    public String getStyleGeneral() {
        return (String) get("style_general");
    }

    public LumaBundleProduct setStyleGeneral(String arg) {
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

