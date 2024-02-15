package com.solvd.carinawebbayvalleytech.components.main;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Main  extends AbstractUIObject {

    @FindBy(xpath =".//div[@class='HT5ybB'] ") // main page

    private ContactPageComponent contactPage;

    public ContactPageComponent getContactPage() {
        return contactPage;
    }
    @FindBy(xpath =".//section[@id='comp-lloe4p6q']") // apply  link
    private HTMLSitemapComponent htmlSitemapComponent;

    public HTMLSitemapComponent getHtmlSitemapComponent() {
        return htmlSitemapComponent;
    }
    public Main(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

}
