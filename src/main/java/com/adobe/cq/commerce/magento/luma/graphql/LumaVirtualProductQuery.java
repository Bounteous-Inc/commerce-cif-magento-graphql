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

import com.adobe.cq.commerce.magento.graphql.VirtualProductQuery;

/**
 * A virtual product is non-tangible product that does not require shipping and is not kept in
 * inventory.
 */
public class LumaVirtualProductQuery extends VirtualProductQuery {
    public LumaVirtualProductQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public LumaVirtualProductQuery activity() {
        startField("activity");

        return this;
    }

    public LumaVirtualProductQuery categoryGear() {
        startField("category_gear");

        return this;
    }

    public LumaVirtualProductQuery climate() {
        startField("climate");

        return this;
    }

    public LumaVirtualProductQuery collar() {
        startField("collar");

        return this;
    }

    public LumaVirtualProductQuery ecoCollection() {
        startField("eco_collection");

        return this;
    }

    public LumaVirtualProductQuery erinRecommends() {
        startField("erin_recommends");

        return this;
    }

    public LumaVirtualProductQuery featuresBags() {
        startField("features_bags");

        return this;
    }

    public LumaVirtualProductQuery format() {
        startField("format");

        return this;
    }

    public LumaVirtualProductQuery gender() {
        startField("gender");

        return this;
    }

    public LumaVirtualProductQuery material() {
        startField("material");

        return this;
    }

    public LumaVirtualProductQuery newValue() {
        startField("new");

        return this;
    }

    public LumaVirtualProductQuery pattern() {
        startField("pattern");

        return this;
    }

    public LumaVirtualProductQuery performanceFabric() {
        startField("performance_fabric");

        return this;
    }

    public LumaVirtualProductQuery sale() {
        startField("sale");

        return this;
    }

    public LumaVirtualProductQuery size() {
        startField("size");

        return this;
    }

    public LumaVirtualProductQuery sleeve() {
        startField("sleeve");

        return this;
    }

    public LumaVirtualProductQuery strapBags() {
        startField("strap_bags");

        return this;
    }

    public LumaVirtualProductQuery styleBags() {
        startField("style_bags");

        return this;
    }

    public LumaVirtualProductQuery styleBottom() {
        startField("style_bottom");

        return this;
    }

    public LumaVirtualProductQuery styleGeneral() {
        startField("style_general");

        return this;
    }
}
