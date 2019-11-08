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

import com.adobe.cq.commerce.magento.graphql.GroupedProductQuery;

/**
 * GroupedProduct defines a grouped product
 */
public class LumaGroupedProductQuery extends GroupedProductQuery {
    public LumaGroupedProductQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public LumaGroupedProductQuery activity() {
        startField("activity");

        return this;
    }

    public LumaGroupedProductQuery categoryGear() {
        startField("category_gear");

        return this;
    }

    public LumaGroupedProductQuery climate() {
        startField("climate");

        return this;
    }

    public LumaGroupedProductQuery collar() {
        startField("collar");

        return this;
    }

    public LumaGroupedProductQuery ecoCollection() {
        startField("eco_collection");

        return this;
    }

    public LumaGroupedProductQuery erinRecommends() {
        startField("erin_recommends");

        return this;
    }

    public LumaGroupedProductQuery featuresBags() {
        startField("features_bags");

        return this;
    }

    public LumaGroupedProductQuery format() {
        startField("format");

        return this;
    }

    public LumaGroupedProductQuery gender() {
        startField("gender");

        return this;
    }

    public LumaGroupedProductQuery material() {
        startField("material");

        return this;
    }

    public LumaGroupedProductQuery newValue() {
        startField("new");

        return this;
    }

    public LumaGroupedProductQuery pattern() {
        startField("pattern");

        return this;
    }

    public LumaGroupedProductQuery performanceFabric() {
        startField("performance_fabric");

        return this;
    }

    public LumaGroupedProductQuery sale() {
        startField("sale");

        return this;
    }

    public LumaGroupedProductQuery size() {
        startField("size");

        return this;
    }

    public LumaGroupedProductQuery sleeve() {
        startField("sleeve");

        return this;
    }

    public LumaGroupedProductQuery strapBags() {
        startField("strap_bags");

        return this;
    }

    public LumaGroupedProductQuery styleBags() {
        startField("style_bags");

        return this;
    }

    public LumaGroupedProductQuery styleBottom() {
        startField("style_bottom");

        return this;
    }

    public LumaGroupedProductQuery styleGeneral() {
        startField("style_general");

        return this;
    }
}
