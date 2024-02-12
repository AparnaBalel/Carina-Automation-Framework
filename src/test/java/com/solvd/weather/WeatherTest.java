package com.solvd.weather;

import com.solvd.weather.carina_API.api.GetWeatherByCoordinates;
import com.solvd.weather.carina_API.api.GetWeatherByCity;
import com.solvd.weather.carina_API.domain.Weather;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.R;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class WeatherTest {
    @DataProvider
    public  Object [][] cityWeather(){

        return new Object[][]{
                {"Tracy", "CA","USA",1,R.CONFIG.get("weather_api_key")}
        };
    }

    @Test(dataProvider = "cityWeather")

    public void verifyGetWeatherByCity(String cityName,  String stateCode,  String country, int  limit, String APIkey){
        Weather weather = new Weather();
        weather.setCityName("Tracy");
        weather.setState("CA");
        weather.setCountry("USA");
        weather.setLimit(1);
        weather.setAppid(R.CONFIG.get("weather_api_key"));


        GetWeatherByCity getWeatherByCity = new GetWeatherByCity(weather.getCityName(), weather.getState(), weather.getCountry(), weather.getLimit(), weather.getAppid());System.out.println(weather.toString());
        getWeatherByCity.addProperty("weather", weather);
        getWeatherByCity.expectResponseStatus(HttpResponseStatusType.UNAUTHORIZED_401);
        getWeatherByCity.callAPI();
        getWeatherByCity.validateResponse();
    }

    @Test(description = "verify getting current weather by valid coordinates")
    public void verifyGetWeatherByCoordinatesTest() {
        Weather weather = new Weather();
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
