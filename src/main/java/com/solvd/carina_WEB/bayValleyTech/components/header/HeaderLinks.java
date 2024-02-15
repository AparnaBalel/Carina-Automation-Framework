package com.solvd.carina_WEB.bayValleyTech.components.header;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderLinks extends AbstractUIObject {

    public HeaderLinks(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    @FindBy(xpath ="(//div[@class='VrZrC0'])[1]") // all links in header
    private ExtendedWebElement headerLinks;

    public ExtendedWebElement getHeaderLinks() {
        return headerLinks;
    }

    public void byTagName(){
        List<WebElement> Links = headerLinks.findElements(By.tagName("a"));
        int Actual_links = Links.size();
        int expectedLinks = 10;
        int Broken_linkcount = 0;
        System.out.println("Actual Links : " + Actual_links);
        System.out.println("Expected Links : " + expectedLinks);

        for( int i=0; i<Actual_links; i++) {
            String link_title = driver.getTitle();
            System.out.println("title of link: "+ Links.get(i).getText() +"\n");     // printing title text
            System.out.println(Links.get(i).getAttribute("href"));             // printing all links in header
            if( link_title.contains("404")) {
                System.out.println("Link is broken" +"\n");                      // checking for any broken links
                Broken_linkcount++;
            }
            if( Broken_linkcount==0) {
                System.out.println("Link is working fine" +"\n");
            }
        }
    }

}
