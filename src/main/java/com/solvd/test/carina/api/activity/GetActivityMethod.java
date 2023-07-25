package com.solvd.test.carina.api.activity;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;


@Endpoint(url = "${base_url}activity?key=5881028", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/activity_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetActivityMethod extends AbstractApiMethodV2 {
    public GetActivityMethod(){
        replaceUrlPlaceholder("base_url", Configuration.getRequired("bored_url"));
    }
}
