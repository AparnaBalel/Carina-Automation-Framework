package com.solvd.weather;

import com.solvd.weatherapi.api.GetUser;
import com.solvd.weatherapi.api.GetUserList;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class UserTest {
    @Test
    public void verifyUser() {
        GetUser getUser = new GetUser(2);
        getUser.expectResponseStatus(HttpResponseStatusType.OK_200);
        getUser.callAPI();
        getUser.validateResponse();
    }

    @Test
    public void verifyUsersList(){
        GetUserList getUserList = new GetUserList();
        getUserList.expectResponseStatus(HttpResponseStatusType.OK_200);
        getUserList.callAPI();
        getUserList.validateResponse();
    }
}
