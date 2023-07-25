package com.solvd.test.carina.api.basketball;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;


@Endpoint(url = "${base_url}api/top_assists/playoffs/2023/", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/playoffs_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetPlayoffsAssistsMethod extends AbstractApiMethodV2 {
    public GetPlayoffsAssistsMethod(){
        replaceUrlPlaceholder("base_url", Configuration.getRequired("ball_url"));
    }
}
