package com.solvd.carina_WEB.bayValleyTech;

import com.solvd.carina_WEB.bayValleyTech.components.header.Header;
import com.solvd.carina_WEB.bayValleyTech.components.main.Main;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

      @FindBy (xpath= "//div[@id='masterPage']//header")
      private Header header;

    @FindBy(xpath= "//div[@id='masterPage']//main")
    private Main main;

    public Main getMain() {
        return main;
    }


    public HomePage(WebDriver driver) {
        super(driver);
      //  setPageURL("/"); // second approach PROD.url
      //  setPageAbsoluteURL(Configuration.getRequired("home_url")); // first approach
    }

    @Override
    public void open() {
        openURL(Configuration.getRequired("home_url")); // third approach
    }


    public Header getHeader() {
        return header;
    }
}
