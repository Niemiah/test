package com.solvd.test.carina.api.basketball;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;


@Endpoint(url = "${base_url}api/top_rebounds/totals/2023/", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/rebounds_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetReboundsMethod extends AbstractApiMethodV2 {
    public GetReboundsMethod(){
        replaceUrlPlaceholder("base_url", Configuration.getRequired("ball_url"));
    }
}
