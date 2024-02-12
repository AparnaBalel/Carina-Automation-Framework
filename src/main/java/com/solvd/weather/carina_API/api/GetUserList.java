package com.solvd.weather.carina_API.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.api.http.HttpMethodType;


@Endpoint(url = "https://reqres.in/api/users?page=2", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/get_usersList_rs.json")

public class GetUserList extends AbstractApiMethodV2 {


    public GetUserList(){
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}
