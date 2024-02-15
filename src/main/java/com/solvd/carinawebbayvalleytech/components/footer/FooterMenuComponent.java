package com.solvd.carinawebbayvalleytech.components.footer;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FooterMenuComponent extends AbstractUIObject {

    @FindBy (xpath = "//div[@id='comp-llolc3vr']//a")
    private ExtendedWebElement htmlSite;

    public ExtendedWebElement getHtmlSite() {
        return htmlSite;
    }

    public void  clickHtmlSite() {
        htmlSite.click();
    }

    public FooterMenuComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

}
