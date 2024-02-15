package com.solvd.carina_WEB.bayValleyTech.components.htmlSiteMap;

import com.solvd.carina_WEB.bayValleyTech.components.main.HTMLSitemapComponent;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HTML extends AbstractUIObject {
    public HTML(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @FindBy(xpath = ".//section[@id='comp-lloe4p6q']") // footer menu bar
    private HTMLSitemapComponent htmlSitemapComponent;

    public HTMLSitemapComponent getHtmlSitemapComponent() {
        return htmlSitemapComponent;
    }
}