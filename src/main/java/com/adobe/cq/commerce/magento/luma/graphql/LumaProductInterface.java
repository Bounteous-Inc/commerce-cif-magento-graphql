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

import com.adobe.cq.commerce.magento.graphql.ProductInterface;

/**
 * The ProductInterface contains attributes that are common to all types of products. Note that
 * descriptions may not be available for custom and EAV attributes.
 */

public interface LumaProductInterface extends ProductInterface {
    String getActivity();

    String getCategoryGear();

    String getClimate();

    String getCollar();

    Integer getEcoCollection();

    Integer getErinRecommends();

    String getFeaturesBags();

    Integer getFormat();

    String getGender();

    String getMaterial();

    Integer getNew();

    String getPattern();

    Integer getPerformanceFabric();

    Integer getSale();

    Integer getSize();

    String getSleeve();

    String getStrapBags();

    String getStyleBags();

    String getStyleBottom();

    String getStyleGeneral();
}

