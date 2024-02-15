package com.solvd.carinawebbayvalleytech.components.footer;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Footer extends AbstractUIObject {

    @FindBy(xpath =".//div[@class='VrZrC0']") // footer menu bar
    private FooterMenuComponent footerMenuComponent;

    public FooterMenuComponent getFooterMenuComponent() {
        return footerMenuComponent;
    }

    public Footer(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

}
