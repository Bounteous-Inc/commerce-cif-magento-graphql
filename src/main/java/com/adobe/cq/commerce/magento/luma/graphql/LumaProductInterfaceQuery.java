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

import com.adobe.cq.commerce.magento.graphql.BundleProductQuery;
import com.adobe.cq.commerce.magento.graphql.BundleProductQueryDefinition;
import com.adobe.cq.commerce.magento.graphql.ConfigurableProductQuery;
import com.adobe.cq.commerce.magento.graphql.ConfigurableProductQueryDefinition;
import com.adobe.cq.commerce.magento.graphql.DownloadableProductQuery;
import com.adobe.cq.commerce.magento.graphql.DownloadableProductQueryDefinition;
import com.adobe.cq.commerce.magento.graphql.GroupedProductQuery;
import com.adobe.cq.commerce.magento.graphql.GroupedProductQueryDefinition;
import com.adobe.cq.commerce.magento.graphql.ProductInterfaceQuery;
import com.adobe.cq.commerce.magento.graphql.SimpleProductQuery;
import com.adobe.cq.commerce.magento.graphql.SimpleProductQueryDefinition;
import com.adobe.cq.commerce.magento.graphql.VirtualProductQuery;
import com.adobe.cq.commerce.magento.graphql.VirtualProductQueryDefinition;

/**
 * The ProductInterface contains attributes that are common to all types of products. Note that
 * descriptions may not be available for custom and EAV attributes.
 */
public class LumaProductInterfaceQuery extends ProductInterfaceQuery {
    public LumaProductInterfaceQuery(StringBuilder _queryBuilder) {
        this(_queryBuilder, false, true);
    }

    public LumaProductInterfaceQuery(StringBuilder _queryBuilder, boolean skipTypename, boolean firstSelection) {
        super(_queryBuilder, skipTypename);
        this.firstSelection = firstSelection;
    }

    public LumaProductInterfaceQuery activity() {
        startField("activity");

        return this;
    }

    public LumaProductInterfaceQuery categoryGear() {
        startField("category_gear");

        return this;
    }

    public LumaProductInterfaceQuery climate() {
        startField("climate");

        return this;
    }

    public LumaProductInterfaceQuery collar() {
        startField("collar");

        return this;
    }

    public LumaProductInterfaceQuery ecoCollection() {
        startField("eco_collection");

        return this;
    }

    public LumaProductInterfaceQuery erinRecommends() {
        startField("erin_recommends");

        return this;
    }

    public LumaProductInterfaceQuery featuresBags() {
        startField("features_bags");

        return this;
    }

    public LumaProductInterfaceQuery format() {
        startField("format");

        return this;
    }

    public LumaProductInterfaceQuery gender() {
        startField("gender");

        return this;
    }

    public LumaProductInterfaceQuery material() {
        startField("material");

        return this;
    }

    public LumaProductInterfaceQuery newValue() {
        startField("new");

        return this;
    }

    public LumaProductInterfaceQuery pattern() {
        startField("pattern");

        return this;
    }

    public LumaProductInterfaceQuery performanceFabric() {
        startField("performance_fabric");

        return this;
    }

    public LumaProductInterfaceQuery sale() {
        startField("sale");

        return this;
    }

    public LumaProductInterfaceQuery size() {
        startField("size");

        return this;
    }

    public LumaProductInterfaceQuery sleeve() {
        startField("sleeve");

        return this;
    }

    public LumaProductInterfaceQuery strapBags() {
        startField("strap_bags");

        return this;
    }

    public LumaProductInterfaceQuery styleBags() {
        startField("style_bags");

        return this;
    }

    public LumaProductInterfaceQuery styleBottom() {
        startField("style_bottom");

        return this;
    }

    public LumaProductInterfaceQuery styleGeneral() {
        startField("style_general");

        return this;
    }

    public ProductInterfaceQuery onBundleProduct(BundleProductQueryDefinition queryDef) {
        startInlineFragment("BundleProduct");
        queryDef.define(new BundleProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductInterfaceQuery onConfigurableProduct(ConfigurableProductQueryDefinition queryDef) {
        startInlineFragment("ConfigurableProduct");
        queryDef.define(new ConfigurableProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductInterfaceQuery onDownloadableProduct(DownloadableProductQueryDefinition queryDef) {
        startInlineFragment("DownloadableProduct");
        queryDef.define(new DownloadableProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductInterfaceQuery onGroupedProduct(GroupedProductQueryDefinition queryDef) {
        startInlineFragment("GroupedProduct");
        queryDef.define(new GroupedProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductInterfaceQuery onSimpleProduct(SimpleProductQueryDefinition queryDef) {
        startInlineFragment("SimpleProduct");
        queryDef.define(new SimpleProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public ProductInterfaceQuery onVirtualProduct(VirtualProductQueryDefinition queryDef) {
        startInlineFragment("VirtualProduct");
        queryDef.define(new VirtualProductQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
