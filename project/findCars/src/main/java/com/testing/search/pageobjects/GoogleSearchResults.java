package com.testing.search.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * GoogleSearchResults represents the search results page in google.co.uk
 */
public class GoogleSearchResults {

    public static List<WebElement> listLinks = null;
    public static List<WebElement> lnkTopResults(WebDriver driver){
        listLinks = driver.findElement(By.id("rso")).findElements(By.tagName("a"));
        return listLinks;
    }

}
