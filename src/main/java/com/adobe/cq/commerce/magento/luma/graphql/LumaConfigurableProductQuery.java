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

import com.adobe.cq.commerce.magento.graphql.ConfigurableProductQuery;

/**
 * ConfigurableProduct defines basic features of a configurable product and its simple product variants
 */
public class LumaConfigurableProductQuery extends ConfigurableProductQuery {
    public LumaConfigurableProductQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public LumaConfigurableProductQuery activity() {
        startField("activity");

        return this;
    }

    public LumaConfigurableProductQuery categoryGear() {
        startField("category_gear");

        return this;
    }

    public LumaConfigurableProductQuery climate() {
        startField("climate");

        return this;
    }

    public LumaConfigurableProductQuery collar() {
        startField("collar");

        return this;
    }

    public LumaConfigurableProductQuery ecoCollection() {
        startField("eco_collection");

        return this;
    }

    public LumaConfigurableProductQuery erinRecommends() {
        startField("erin_recommends");

        return this;
    }

    public LumaConfigurableProductQuery featuresBags() {
        startField("features_bags");

        return this;
    }

    public LumaConfigurableProductQuery format() {
        startField("format");

        return this;
    }

    public LumaConfigurableProductQuery gender() {
        startField("gender");

        return this;
    }

    public LumaConfigurableProductQuery material() {
        startField("material");

        return this;
    }

    public LumaConfigurableProductQuery newValue() {
        startField("new");

        return this;
    }

    public LumaConfigurableProductQuery pattern() {
        startField("pattern");

        return this;
    }

    public LumaConfigurableProductQuery performanceFabric() {
        startField("performance_fabric");

        return this;
    }

    public LumaConfigurableProductQuery sale() {
        startField("sale");

        return this;
    }

    public LumaConfigurableProductQuery size() {
        startField("size");

        return this;
    }

    public LumaConfigurableProductQuery sleeve() {
        startField("sleeve");

        return this;
    }

    public LumaConfigurableProductQuery strapBags() {
        startField("strap_bags");

        return this;
    }

    public LumaConfigurableProductQuery styleBags() {
        startField("style_bags");

        return this;
    }

    public LumaConfigurableProductQuery styleBottom() {
        startField("style_bottom");

        return this;
    }

    public LumaConfigurableProductQuery styleGeneral() {
        startField("style_general");

        return this;
    }
}
