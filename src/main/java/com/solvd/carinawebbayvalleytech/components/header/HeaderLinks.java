package com.solvd.carinawebbayvalleytech.components.header;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderLinks extends AbstractUIObject {

    @FindBy(xpath=".//div[@class='VrZrC0'][1] //ul//a")
    List<ExtendedWebElement> links;

    public List<ExtendedWebElement> getLinks() {
        return links;
    }


    public HeaderLinks(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

}
