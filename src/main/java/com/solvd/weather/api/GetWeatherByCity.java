package com.solvd.weather.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.utils.config.Configuration;

import java.util.Optional;

@Endpoint(url = "http://api.openweathermap.org/geo/1.0/direct?q=city name,state code,country code&limit=limit&appid=API key", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/get_weather_rs.json")
public class GetWeatherByCity extends AbstractApiMethodV2 {

    public GetWeatherByCity() {
       //super (null, "api/get_weather_rs.json", "_api_key.properties");

      //  replaceUrlPlaceholder("city name", cityName);
      //  replaceUrlPlaceholder("state code", stateCode);
        //replaceUrlPlaceholder("country code", String.valueOf(countryCode));
      //  replaceUrlPlaceholder("limit", String.valueOf(limit));

        ignorePropertiesProcessor(NotStringValuesProcessor.class);

    }
}
