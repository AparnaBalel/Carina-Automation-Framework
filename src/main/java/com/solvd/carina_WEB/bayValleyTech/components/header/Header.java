package com.solvd.carina_WEB.bayValleyTech.components.header;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    @FindBy(xpath =".//ul[@class='StylableHorizontalMenu3372578893__menu'] ") // header menu bar

    private HeaderMenuComponent headerMenu;
    public HeaderMenuComponent getHeaderMenu() {
        return headerMenu;
    }

    @FindBy(xpath =".//div[@id='SITE_HEADER'] ") // all links in header
     private  HeaderLinks  headerLinksComponent;

    public HeaderLinks getHeaderLinksComponent() {
        return headerLinksComponent;
    }
}
