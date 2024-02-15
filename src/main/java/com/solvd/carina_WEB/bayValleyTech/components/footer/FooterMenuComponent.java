package com.solvd.carina_WEB.bayValleyTech.components.footer;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FooterMenuComponent extends AbstractUIObject {
    public FooterMenuComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @FindBy (xpath = "//div[@id='comp-llolc3vr']//a")
    private ExtendedWebElement HtmlSite;

    public ExtendedWebElement getHtmlSite() {
        return HtmlSite;
    }

    public void  HtmlSiteClick() {
        HtmlSite.click();
    }
}
