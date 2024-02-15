package com.solvd.webTesting;

import com.solvd.carinawebbayvalleytech.HomePage;
import com.solvd.carinawebbayvalleytech.components.header.HeaderMenuComponent;
import com.solvd.carinawebbayvalleytech.components.main.ContactPageComponent;
import com.zebrunner.carina.core.AbstractTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class
  ContactUsPageTest extends AbstractTest {
    private static final Logger LOGGER = LogManager.getLogger(ContactUsPageTest.class);

    @Test(description = "01 check contact us title text")
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
        int xAxis = Location.getX();
        int yAxis = Location.getY();
        int ExpectedX = 564;
        int ExpectedY = 112;
        sa.assertEquals(xAxis, ExpectedX , "location match for x axis" );
        sa.assertEquals(yAxis, ExpectedY, "location match for y axis"  );
        LOGGER.info("\n" + "Actual X location: " + xAxis + "  =  " + "Expected  X location: " + ExpectedX + "\n"+
                "Actual Y location: " + yAxis + "  =  " + "Expected Y location: " + ExpectedY );
        String Actual = contactPageComponent.getContactUsTitleText();
        String Expected = "Contact Us";
        LOGGER.info("\n" + "Actual Title: " + Actual+ "=" + "Expected Title;" + Expected);
        sa.assertEquals(Actual, Expected,"title match");
        sa.assertAll();
    }


    @Test(description = "04 check contact us or Request Info title text")
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
        int xAxis = Location.getX();
        int yAxis = Location.getY();
        int ExpectedX = 427;
        int ExpectedY = 257;
        sa.assertEquals(xAxis, ExpectedX , "location match for x axis" );
        sa.assertEquals(yAxis, ExpectedY , "location match for y axis" );
        LOGGER.info("\n" + "Actual X location: " + xAxis + "  =  " + "Expected  X location: " + ExpectedX + "\n"+
                "Actual Y location: " + yAxis + "  =  " + "Expected Y location: " + ExpectedY );
        String Actual = contactPageComponent.getRequestTietleText();
        String Expected = "Contact Us or Request Info";
        LOGGER.info("\n" + "Actual Title: " + Actual + " = " + "Expected Title: " + Expected);
        sa.assertEquals(Actual, Expected,"title match");
        sa.assertAll();
    }



}
