package com.solvd.carinawebbayvalleytech.components.htmlsitemap;

import com.solvd.carinawebbayvalleytech.components.main.HTMLSitemapComponent;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HTML extends AbstractUIObject {
    @FindBy(xpath = ".//section[@id='comp-lloe4p6q']") // footer menu bar
    private HTMLSitemapComponent htmlSitemapComponent;

    public HTMLSitemapComponent getHtmlSitemapComponent() {
        return htmlSitemapComponent;
    }

    public HTML(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}