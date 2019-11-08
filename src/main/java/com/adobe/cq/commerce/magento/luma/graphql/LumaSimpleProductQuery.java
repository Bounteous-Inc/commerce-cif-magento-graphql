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

import com.adobe.cq.commerce.magento.graphql.SimpleProductQuery;

/**
 * A simple product is tangible and are usually sold as single units or in fixed quantities.
 */
public class LumaSimpleProductQuery extends SimpleProductQuery {
    public LumaSimpleProductQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public LumaSimpleProductQuery activity() {
        startField("activity");

        return this;
    }

    public LumaSimpleProductQuery categoryGear() {
        startField("category_gear");

        return this;
    }

    public LumaSimpleProductQuery climate() {
        startField("climate");

        return this;
    }

    public LumaSimpleProductQuery collar() {
        startField("collar");

        return this;
    }

    public LumaSimpleProductQuery ecoCollection() {
        startField("eco_collection");

        return this;
    }

    public LumaSimpleProductQuery erinRecommends() {
        startField("erin_recommends");

        return this;
    }

    public LumaSimpleProductQuery featuresBags() {
        startField("features_bags");

        return this;
    }

    public LumaSimpleProductQuery format() {
        startField("format");

        return this;
    }

    public LumaSimpleProductQuery gender() {
        startField("gender");

        return this;
    }

    public LumaSimpleProductQuery material() {
        startField("material");

        return this;
    }

    public LumaSimpleProductQuery newValue() {
        startField("new");

        return this;
    }

    public LumaSimpleProductQuery pattern() {
        startField("pattern");

        return this;
    }

    public LumaSimpleProductQuery performanceFabric() {
        startField("performance_fabric");

        return this;
    }

    public LumaSimpleProductQuery sale() {
        startField("sale");

        return this;
    }

    public LumaSimpleProductQuery size() {
        startField("size");

        return this;
    }

    public LumaSimpleProductQuery sleeve() {
        startField("sleeve");

        return this;
    }

    public LumaSimpleProductQuery strapBags() {
        startField("strap_bags");

        return this;
    }

    public LumaSimpleProductQuery styleBags() {
        startField("style_bags");

        return this;
    }

    public LumaSimpleProductQuery styleBottom() {
        startField("style_bottom");

        return this;
    }

    public LumaSimpleProductQuery styleGeneral() {
        startField("style_general");

        return this;
    }
}
