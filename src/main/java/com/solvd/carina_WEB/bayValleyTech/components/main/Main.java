package com.solvd.carina_WEB.bayValleyTech.components.main;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Main  extends AbstractUIObject {
    public Main(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @FindBy(xpath =".//div[@class='HT5ybB'] ") // main page

    private ContactPageComponent contactPage;

////div[@class='HT5ybB']

    public ContactPageComponent getContactPage() {
        return contactPage;
    }
}
