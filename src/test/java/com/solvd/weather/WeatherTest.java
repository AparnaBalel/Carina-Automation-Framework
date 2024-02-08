package com.solvd.weather;

import com.solvd.weather.api.GetWeatherByCoordinates;
import com.solvd.weather.api.GetWeatherByCity;
import com.solvd.weather.domain.Weather;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class WeatherTest {
    @DataProvider
    public  Object [][] cityWeather(){

        return new Object[][]{
                {"Tracy", "CA","USA",1,"72052cf2683f2922ada9f7ac00449440"}
        };
    }
    Weather weather = new Weather();


    @Test(dataProvider = "cityWeather")
    public void verifyGetWeatherByCity(String cityName,  String stateCode,  String country, int  limit, String APIkey){
        weather.setCity(cityName);
        weather.setState(stateCode);
        weather.setCountry(country);
        weather.setAppid(APIkey);
        weather.setLimit(limit);

        GetWeatherByCity getWeatherByCity = new GetWeatherByCity();
       System.out.println(weather.toString());
        getWeatherByCity.addProperty("weather", weather);
        getWeatherByCity.expectResponseStatus(HttpResponseStatusType.UNAUTHORIZED_401);
        getWeatherByCity.callAPI();
        getWeatherByCity.validateResponse();
    }

    @Test(description = "verify getting current weather by valid coordinates")
    public void verifyGetWeatherByCoordinatesTest() {
        weather.setLatitude(37.7833);
        weather.setLongitude(-121.5427);
        weather.setAppid("72052cf2683f2922ada9f7ac00449440");
        GetWeatherByCoordinates getWeatherByCoordinates =
                new GetWeatherByCoordinates(weather.getLatitude(), weather.getLongitude(), weather.getAppid());
        getWeatherByCoordinates.addProperty("weather", weather);
        getWeatherByCoordinates.expectResponseStatus(HttpResponseStatusType.UNAUTHORIZED_401);
        getWeatherByCoordinates.callAPI();

        getWeatherByCoordinates.validateResponse();
    }
}
