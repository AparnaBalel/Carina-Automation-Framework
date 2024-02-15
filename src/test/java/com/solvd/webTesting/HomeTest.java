package com.solvd.webTesting;

import com.solvd.carina_WEB.bayValleyTech.HomePage;
import com.solvd.carina_WEB.bayValleyTech.components.footer.FooterMenuComponent;
import com.solvd.carina_WEB.bayValleyTech.components.header.HeaderLinks;
import com.solvd.carina_WEB.bayValleyTech.components.header.HeaderMenuComponent;
import com.solvd.carina_WEB.bayValleyTech.components.main.HTMLSitemapComponent;
import com.zebrunner.carina.core.AbstractTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Set;

public class HomeTest extends AbstractTest {

    private static final Logger LOGGER = LogManager.getLogger(HomeTest.class);

    @Test (description = "01 check all header links")
    public void verifyAllHeaderLinks(){
        SoftAssert sa = new SoftAssert();
        WebDriver driver = getDriver();
        HomePage homePage=  new HomePage( driver);
        homePage.open();
        HeaderLinks headerLinks = homePage.getHeader().getHeaderLinksComponent();
        headerLinks.byTagName();

        sa.assertAll();
    }

    @Test (description = "02 check contact us tab")
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
        LOGGER.info("\n" + "Actual Title: " + Actual+ "  =  " + "Expected Title: " + Expected);
        sa.assertEquals(Actual, Expected, "contact us page is opened");
        sa.assertAll();
    }

    @Test (description = "03 check contact us tab")
    public void verifyHTMLSiteLink(){
        SoftAssert sa = new SoftAssert();
        WebDriver driver = getDriver();
        HomePage homePage=  new HomePage( driver);
        homePage.open();
        FooterMenuComponent footerMenuComponent = homePage.getFooter().getFooterMenuComponent();
        sa.assertTrue(footerMenuComponent.getHtmlSite().isElementPresent(),"HTML Site page opened");
        Point Location =footerMenuComponent.getHtmlSite().getLocation();
        int X_Axis = Location.getX();
        int Y_Axis = Location.getY();
        int ExpectedX = 589;
        int ExpectedY = 4050;
        sa.assertEquals(X_Axis, ExpectedX );
        sa.assertEquals(Y_Axis, ExpectedY );
        LOGGER.info("\n" + "Actual X location: " + X_Axis + "  =  " + "Expected  X location: " + ExpectedX + "\n"+
                "Actual Y location: " + Y_Axis + "  =  " + "Expected Y location: " + ExpectedY );
        footerMenuComponent.HtmlSiteClick();
        String Actual = driver.getCurrentUrl();
        String Expected = "https://www.bayvalleytech.com/html-sitemap";
        LOGGER.info("\n" + "Actual Title: " + Actual+ "  =  " + "Expected Title: " + Expected);
        sa.assertEquals(Actual, Expected, "HTML site page is opened");
        sa.assertAll();
    }

    @Test (description = "04 check apply link")
    public void verifyApplyLink(){
        SoftAssert sa = new SoftAssert();
        WebDriver driver = getDriver();
        HomePage homePage=  new HomePage( driver);
        homePage.open();
        FooterMenuComponent footerMenuComponent = homePage.getFooter().getFooterMenuComponent();
        sa.assertTrue(footerMenuComponent.getHtmlSite().isElementPresent(),"HTML Site page opened");
        footerMenuComponent.HtmlSiteClick();
        HTMLSitemapComponent htmlSitemapComponent = homePage.getMain().getHtmlSitemapComponent();
        sa.assertTrue(htmlSitemapComponent.getProgramLinks().isElementPresent(),"Apply page opened");
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        new WebDriverWait(driver, Duration.ofSeconds(20));
        htmlSitemapComponent.ClickApplyLink();
        new WebDriverWait(driver, Duration.ofSeconds(20));
        String parentwindow = driver.getWindowHandle();
        System.out.println(driver.getWindowHandles()+"\n");
        for  (String handle:driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        String Actual_URL = driver.getCurrentUrl();
        String Expected_URL ="https://www.bayvalleytech.com/apply";
        sa.assertEquals(Actual_URL, Expected_URL, "Apply link opened");
        sa.assertAll();
    }


}
