package com.solvd.carina_WEB.bayValleyTech.components.main;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ContactPageComponent extends AbstractUIObject {
    public ContactPageComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @FindBy(xpath = ".//div[@id='comp-llnwyj2e']//h1") // contact us title
    private ExtendedWebElement contactUsTitle;

    public ExtendedWebElement getContactUsTitle() {
        return contactUsTitle;
    }

    public String getContactUsTitleText(){
        return contactUsTitle.getText();
    }

    @FindBy(xpath = ".//div[@id='comp-llnwzk7c']//h2 ") // contact us title
    private ExtendedWebElement ContactUsOrRequestTitle;

    public ExtendedWebElement getContactUsOrRequestTitle() {
        return ContactUsOrRequestTitle;
    }

    public String getRequestTietleText(){
        return ContactUsOrRequestTitle.getText();
    }
}
