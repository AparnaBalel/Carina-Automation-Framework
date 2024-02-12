package com.solvd.webTesting;

import com.solvd.carina_WEB.bayValleyTech.HomePage;
import com.solvd.carina_WEB.bayValleyTech.components.header.HeaderMenuComponent;
import com.solvd.carina_WEB.bayValleyTech.components.main.ContactPageComponent;
import com.zebrunner.carina.core.AbstractTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ContactUsPageTest extends AbstractTest {
    private static final Logger LOGGER = LogManager.getLogger(ContactUsPageTest.class);


    @Test(description = "02 check contact us title text")
    public void ContactUsTitle() {
        SoftAssert sa = new SoftAssert();
        WebDriver driver = getDriver();
        HomePage homePage=  new HomePage( driver);
        homePage.open();
        HeaderMenuComponent headerMenuComponent = homePage.getHeader().getHeaderMenu();
        sa.assertTrue(headerMenuComponent.getContactUs().isElementPresent(),"contactus page opened");
        headerMenuComponent.clickContactUs();
       ContactPageComponent contactPageComponent = homePage.getMain().getContactPage();
       sa.assertTrue(contactPageComponent.getContactUsTitle().isElementPresent(),"contact us title present" );
        Point Location =contactPageComponent.getContactUsTitle().getLocation();
        int X_Axis = Location.getX();
        int Y_Axis = Location.getY();
        int ExpectedX = 564;
        int ExpectedY = 111;
        sa.assertEquals(X_Axis, ExpectedX );
        sa.assertEquals(Y_Axis, ExpectedY );
        LOGGER.info("\n" + "Actual X location: " + X_Axis + "  =  " + "Expected  X location: " + ExpectedX + "\n"+
                "Actual Y location: " + Y_Axis + "  =  " + "Expected Y location: " + ExpectedY );
       String Actual = contactPageComponent.getContactUsTitleText();
       String Expected = "Contact Us";
        LOGGER.info("\n" + "Actual Title: " + Actual+ "=" + "Expected Title;" + Expected);
        sa.assertEquals(Actual, Expected,"title match");
    }


    @Test(description = "03 check contact us or Request Info title text")
    public void ContactUsOrRequestInfoTitle() {
        SoftAssert sa = new SoftAssert();
        WebDriver driver = getDriver();
        HomePage homePage=  new HomePage( driver);
        homePage.open();
        HeaderMenuComponent headerMenuComponent = homePage.getHeader().getHeaderMenu();
        sa.assertTrue(headerMenuComponent.getContactUs().isElementPresent(),"contactus page opened");
        headerMenuComponent.clickContactUs();
        ContactPageComponent contactPageComponent = homePage.getMain().getContactPage();
        sa.assertTrue(contactPageComponent.getContactUsOrRequestTitle().isElementPresent(),"contact us title present" );
        Point Location =contactPageComponent.getContactUsOrRequestTitle().getLocation();
        int X_Axis = Location.getX();
        int Y_Axis = Location.getY();
        int ExpectedX = 427;
        int ExpectedY = 256;
        sa.assertEquals(X_Axis, ExpectedX );
        sa.assertEquals(Y_Axis, ExpectedY );
        LOGGER.info("\n" + "Actual X location: " + X_Axis + "  =  " + "Expected  X location: " + ExpectedX + "\n"+
                "Actual Y location: " + Y_Axis + "  =  " + "Expected Y location: " + ExpectedY );
        String Actual = contactPageComponent.getRequestTietleText();
        String Expected = "Contact Us or Request Info";
        LOGGER.info("\n" + "Actual Title: " + Actual + " = " + "Expected Title: " + Expected);
        sa.assertEquals(Actual, Expected,"title match");
    }



}
