package com.solvd.weather.carina_API.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.api.http.HttpMethodType;


@Endpoint(url = "https://reqres.in/api/users/2", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/get_user_rs.json")
public class GetUser extends AbstractApiMethodV2 {

    public GetUser(int id ) {

//        super(null, "/api/get_user_rs.json");
       // replaceUrlPlaceholder("base_url", Configuration.getRequired("user_api_url"));
       replaceUrlPlaceholder("id", String.valueOf(id) );
      ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}
