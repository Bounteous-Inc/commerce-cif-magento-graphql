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

/**
 * BundleProduct defines basic features of a bundle product and contains multiple BundleItems.
 */
public class LumaBundleProductQuery extends BundleProductQuery {
    public LumaBundleProductQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public LumaBundleProductQuery activity() {
        startField("activity");

        return this;
    }

    public LumaBundleProductQuery categoryGear() {
        startField("category_gear");

        return this;
    }

    public LumaBundleProductQuery climate() {
        startField("climate");

        return this;
    }

    public LumaBundleProductQuery collar() {
        startField("collar");

        return this;
    }

    public LumaBundleProductQuery ecoCollection() {
        startField("eco_collection");

        return this;
    }

    public LumaBundleProductQuery erinRecommends() {
        startField("erin_recommends");

        return this;
    }

    public LumaBundleProductQuery featuresBags() {
        startField("features_bags");

        return this;
    }

    public LumaBundleProductQuery format() {
        startField("format");

        return this;
    }

    public LumaBundleProductQuery gender() {
        startField("gender");

        return this;
    }

    public LumaBundleProductQuery material() {
        startField("material");

        return this;
    }

    public LumaBundleProductQuery newValue() {
        startField("new");

        return this;
    }

    public LumaBundleProductQuery pattern() {
        startField("pattern");

        return this;
    }

    public LumaBundleProductQuery performanceFabric() {
        startField("performance_fabric");

        return this;
    }

    public LumaBundleProductQuery sale() {
        startField("sale");

        return this;
    }

    public LumaBundleProductQuery size() {
        startField("size");

        return this;
    }

    public LumaBundleProductQuery sleeve() {
        startField("sleeve");

        return this;
    }

    public LumaBundleProductQuery strapBags() {
        startField("strap_bags");

        return this;
    }

    public LumaBundleProductQuery styleBags() {
        startField("style_bags");

        return this;
    }

    public LumaBundleProductQuery styleBottom() {
        startField("style_bottom");

        return this;
    }

    public LumaBundleProductQuery styleGeneral() {
        startField("style_general");

        return this;
    }
}
