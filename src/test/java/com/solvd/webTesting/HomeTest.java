package com.solvd.webTesting;

import com.solvd.carinawebbayvalleytech.HomePage;
import com.solvd.carinawebbayvalleytech.components.footer.FooterMenuComponent;
import com.solvd.carinawebbayvalleytech.components.header.HeaderLinks;
import com.solvd.carinawebbayvalleytech.components.header.HeaderMenuComponent;
import com.solvd.carinawebbayvalleytech.components.main.HTMLSitemapComponent;
import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class HomeTest extends AbstractTest {

    private static final Logger LOGGER = LogManager.getLogger(HomeTest.class);

    @Test (description = "01 check all header links")
    public void verifyAllHeaderLinks(){
        SoftAssert sa = new SoftAssert();
        WebDriver driver = getDriver();
        HomePage homePage=  new HomePage( driver);
        homePage.open();
        HeaderLinks headerLinks = homePage.getHeader().getHeaderLinksComponent();
        List<ExtendedWebElement> allHeaderLinks = headerLinks.getLinks();
        int actualLinks = allHeaderLinks.size();
        int expectedLinks = 10;
        sa.assertEquals(actualLinks, expectedLinks, "found 10 links");
        LOGGER.info( "\n" + "Actual Links: " + actualLinks + " = " + "Expected Links: " + expectedLinks);
        allHeaderLinks.subList(0, actualLinks).forEach(link -> {
        String link_title = driver.getTitle();
        LOGGER.info("\n" + "title of link: " + link.getText() + " : " + link.getAttribute("href") + "\n");
        });
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
        sa.assertEquals(X_Axis, ExpectedX , "location match for x axis");
        sa.assertEquals(Y_Axis, ExpectedY , "location match for y axis");
        LOGGER.info("\n" + "Actual X location: " + X_Axis + "  =  " + "Expected  X location: " + ExpectedX + "\n"+
                "Actual Y location: " + Y_Axis + "  =  " + "Expected Y location: " + ExpectedY );
        headerMenuComponent.clickContactUs();
        String Actual = driver.getCurrentUrl();
        String Expected = "https://www.bayvalleytech.com/contact-us";
        LOGGER.info("\n" + "Actual Title: " + Actual+ "  =  " + "Expected Title: " + Expected);
        sa.assertEquals(Actual, Expected, "contact us page is opened");
        sa.assertAll();
    }

    @Test (description = "03 check html site link in footer")
    public void verifyHTMLSiteLink(){
        SoftAssert sa = new SoftAssert();
        WebDriver driver = getDriver();
        HomePage homePage=  new HomePage( driver);
        homePage.open();
        FooterMenuComponent footerMenuComponent = homePage.getFooter().getFooterMenuComponent();
        sa.assertTrue(footerMenuComponent.getHtmlSite().isElementPresent(),"HTML Site page opened");
        Point Location =footerMenuComponent.getHtmlSite().getLocation();
        int xAxis = Location.getX();
        int yAxis = Location.getY();
        int ExpectedX = 589;
        int ExpectedY = 4050;
        sa.assertEquals(xAxis, ExpectedX , "location match for x axis");
        sa.assertEquals(yAxis, ExpectedY , "location match for y axis");
        LOGGER.info("\n" + "Actual X location: " + xAxis + "  =  " + "Expected  X location: " + ExpectedX + "\n"+
                "Actual Y location: " + yAxis + "  =  " + "Expected Y location: " + ExpectedY );
        footerMenuComponent.clickHtmlSite();
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
        footerMenuComponent.clickHtmlSite();
        HTMLSitemapComponent htmlSitemapComponent = homePage.getMain().getHtmlSitemapComponent();
        sa.assertTrue(htmlSitemapComponent.getProgramLinks().isElementPresent(),"Apply page opened");
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        htmlSitemapComponent.ClickApplyLink();
        String parentwindow = driver.getWindowHandle();
       LOGGER.info("/n" + driver.getWindowHandles() + "\n");
        driver.getWindowHandles().forEach(handle -> {
            driver.switchTo().window(handle);
        });
        String actualURL = driver.getCurrentUrl();
        String expectedURL ="https://www.bayvalleytech.com/apply";
        LOGGER.info("\n" +"Actual URL:" + actualURL + " = " + "Expected URL:" + expectedURL);
        sa.assertEquals(actualURL, expectedURL, "url matched");
        sa.assertAll();
    }


}
