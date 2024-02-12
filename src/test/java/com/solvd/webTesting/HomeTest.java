package com.solvd.webTesting;

import com.solvd.carina_WEB.bayValleyTech.HomePage;
import com.solvd.carina_WEB.bayValleyTech.components.header.Header;
import com.solvd.carina_WEB.bayValleyTech.components.header.HeaderMenuComponent;
import com.zebrunner.carina.core.AbstractTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeTest extends AbstractTest {

    private static final Logger LOGGER = LogManager.getLogger(HomeTest.class);

    @Test (description = "01 check contact us tab")
    public void verifyHeader(){
        SoftAssert sa = new SoftAssert();
        WebDriver driver = getDriver();
        HomePage homePage=  new HomePage( driver);
        homePage.open();
        HeaderMenuComponent headerMenuComponent = homePage.getHeader().getHeaderMenu();
        sa.assertTrue(headerMenuComponent.getContactUs().isElementPresent(),"contactus page opened");
        Point Location =headerMenuComponent.getContactUs().getLocation();
        int X_Axis = Location.getX();
        int Y_Axis = Location.getY();
        int ExpectedX = 942;
        int ExpectedY = 27;
        sa.assertEquals(X_Axis, ExpectedX );
        sa.assertEquals(Y_Axis, ExpectedY );
        LOGGER.info("\n" + "Actual X location: " + X_Axis + "  =  " + "Expected  X location: " + ExpectedX + "\n"+
                "Actual Y location: " + Y_Axis + "  =  " + "Expected Y location: " + ExpectedY );
        headerMenuComponent.clickContactUs();
        String Actual = driver.getCurrentUrl();
        String Expected = "https://www.bayvalleytech.com/contact-us";
        LOGGER.info("\n" + "Actual Title: " + Actual+ "  =  " + "Expected Title;" + Expected);
        sa.assertEquals(Actual, Expected, "contact us page is opened");
    }




}
