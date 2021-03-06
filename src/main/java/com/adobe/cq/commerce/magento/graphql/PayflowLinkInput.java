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

package com.adobe.cq.commerce.magento.graphql;

import java.io.Serializable;

import com.shopify.graphql.support.AbstractQuery;

public class PayflowLinkInput implements Serializable {
    private String cancelUrl;

    private String errorUrl;

    private String returnUrl;

    public PayflowLinkInput(String cancelUrl, String errorUrl, String returnUrl) {
        this.cancelUrl = cancelUrl;

        this.errorUrl = errorUrl;

        this.returnUrl = returnUrl;
    }

    public String getCancelUrl() {
        return cancelUrl;
    }

    public PayflowLinkInput setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
        return this;
    }

    public String getErrorUrl() {
        return errorUrl;
    }

    public PayflowLinkInput setErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
        return this;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public PayflowLinkInput setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("cancel_url:");
        AbstractQuery.appendQuotedString(_queryBuilder, cancelUrl.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("error_url:");
        AbstractQuery.appendQuotedString(_queryBuilder, errorUrl.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("return_url:");
        AbstractQuery.appendQuotedString(_queryBuilder, returnUrl.toString());

        _queryBuilder.append('}');
    }
}
