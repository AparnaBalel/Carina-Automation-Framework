package com.solvd.weather.carina_API.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.utils.R;

@Endpoint(url = "http://api.openweathermap.org/geo/1.0/direct?q=city name,state code,country code&limit=limit&appid=API key", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/get_weather_rs.json")
public class GetWeatherByCity extends AbstractApiMethodV2 {

    public GetWeatherByCity(String city, String state, String country, int limit, String appid) {
       //super (null, "api/get_weather_rs.json", "_api_key.properties");
        String apiKey = R.CONFIG.get("weather_api_key");

        replaceUrlPlaceholder("city name", city);
        replaceUrlPlaceholder("state code", state);
        replaceUrlPlaceholder("country code", country);
        replaceUrlPlaceholder("limit", String.valueOf(limit));
        replaceUrlPlaceholder("API key", apiKey);

        ignorePropertiesProcessor(NotStringValuesProcessor.class);

    }
}
