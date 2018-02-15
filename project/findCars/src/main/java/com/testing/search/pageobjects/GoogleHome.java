package com.testing.search.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * GoogleHome represents the home page in google.co.uk
 */
public class GoogleHome {

    public static WebElement element = null;

    public static WebElement txtSearchBox(WebDriver driver){
        element = driver.findElement(By.id("lst-ib"));
        return element;
    }

    public static WebElement btnSubmit(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]"));
        return element;
    }

}
