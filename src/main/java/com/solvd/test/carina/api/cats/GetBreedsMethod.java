package com.solvd.test.carina.api.cats;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/breeds_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetBreedsMethod extends AbstractApiMethodV2 {
    public GetBreedsMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("cat_facts_api_url"));
    }
}

