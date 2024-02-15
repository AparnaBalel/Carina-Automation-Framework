package com.solvd.carina_WEB.bayValleyTech.components.header;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HeaderMenuComponent extends AbstractUIObject {

    public HeaderMenuComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    @FindBy(xpath = ".//a[@href='https://www.bayvalleytech.com/contact-us'][1]") // contact us tab
    private ExtendedWebElement ContactUs;
    public ExtendedWebElement getContactUs() {
        return ContactUs;
    }
    public void clickContactUs(){
        ContactUs.click();
    }



}
