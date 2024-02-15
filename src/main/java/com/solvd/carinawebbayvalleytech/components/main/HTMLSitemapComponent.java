package com.solvd.carinawebbayvalleytech.components.main;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HTMLSitemapComponent  extends AbstractUIObject {
    @FindBy(xpath = ".//div[@id='comp-llq4dqj6']//a[@href='https://www.bayvalleytech.com/apply']")
    private ExtendedWebElement applyLink;

    public ExtendedWebElement getProgramLinks() {
        return applyLink;
    }
    public void ClickApplyLink( ) {
        applyLink.click();
    }

    public HTMLSitemapComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

}
