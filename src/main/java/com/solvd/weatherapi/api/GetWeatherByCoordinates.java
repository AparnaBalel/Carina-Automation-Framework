package com.solvd.weatherapi.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "https://api.openweathermap.org/data/2.5/weather?latitude=latitude&longitude=longitude&appid=APIkey", methodType = HttpMethodType.GET )
@ResponseTemplatePath(path = "api/get_current_weather_rs.json")

public class GetWeatherByCoordinates extends AbstractApiMethodV2 {
    public GetWeatherByCoordinates(double latitude, double longitude, String appid) {
       // super(null, "api/get/current_weather_rs.json");
        //replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
        replaceUrlPlaceholder("latitude", String.valueOf(latitude));
        replaceUrlPlaceholder("longitude", String.valueOf(longitude));
      //  replaceUrlPlaceholder("API key", API);
        addUrlParameter("API key", appid);

        ignorePropertiesProcessor(NotStringValuesProcessor.class);

    }

}
