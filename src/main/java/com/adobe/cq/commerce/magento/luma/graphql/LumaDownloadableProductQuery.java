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

import com.adobe.cq.commerce.magento.graphql.DownloadableProductQuery;

/**
 * DownloadableProduct defines a product that the customer downloads
 */
public class LumaDownloadableProductQuery extends DownloadableProductQuery {
    public LumaDownloadableProductQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public LumaDownloadableProductQuery activity() {
        startField("activity");

        return this;
    }

    public LumaDownloadableProductQuery categoryGear() {
        startField("category_gear");

        return this;
    }

    public LumaDownloadableProductQuery climate() {
        startField("climate");

        return this;
    }

    public LumaDownloadableProductQuery collar() {
        startField("collar");

        return this;
    }

    public LumaDownloadableProductQuery ecoCollection() {
        startField("eco_collection");

        return this;
    }

    public LumaDownloadableProductQuery erinRecommends() {
        startField("erin_recommends");

        return this;
    }

    public LumaDownloadableProductQuery featuresBags() {
        startField("features_bags");

        return this;
    }

    public LumaDownloadableProductQuery format() {
        startField("format");

        return this;
    }

    public LumaDownloadableProductQuery gender() {
        startField("gender");

        return this;
    }

    public LumaDownloadableProductQuery material() {
        startField("material");

        return this;
    }

    public LumaDownloadableProductQuery newValue() {
        startField("new");

        return this;
    }

    public LumaDownloadableProductQuery pattern() {
        startField("pattern");

        return this;
    }

    public LumaDownloadableProductQuery performanceFabric() {
        startField("performance_fabric");

        return this;
    }

    public LumaDownloadableProductQuery sale() {
        startField("sale");

        return this;
    }

    public LumaDownloadableProductQuery size() {
        startField("size");

        return this;
    }

    public LumaDownloadableProductQuery sleeve() {
        startField("sleeve");

        return this;
    }

    public LumaDownloadableProductQuery strapBags() {
        startField("strap_bags");

        return this;
    }

    public LumaDownloadableProductQuery styleBags() {
        startField("style_bags");

        return this;
    }

    public LumaDownloadableProductQuery styleBottom() {
        startField("style_bottom");

        return this;
    }

    public LumaDownloadableProductQuery styleGeneral() {
        startField("style_general");

        return this;
    }
}
