package com.testing.search;

import com.testing.Utils.SeleniumHelper;
import com.testing.Utils.Utilities;
import com.testing.search.pageobjects.GoogleHome;
import com.testing.search.pageobjects.GoogleSearchResults;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * SearchCars - test steps for the car search
 */
public class SearchCars {
    private static final Logger log = LogManager.getLogger(SearchCars.class);
    WebDriver driver;
    List<String> lstHref ;
    @Given("^user has the \"([^\"]*)\" browser open on \"([^\"]*)\" OS$")
    public void user_has_the_browser_open(String strBrowserName, String strOSName) throws Throwable {

        SeleniumHelper driverHelper = new SeleniumHelper();
        driver = driverHelper.getDriver(strBrowserName, strOSName);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @When("^user opens Google$")
    public void user_opens_Google() throws Throwable {
        driver.get("https://www.google.co.uk/");
    }

    @When("^search \"([^\"]*)\"$")
    public void search(String strSearchString) throws Throwable {
        GoogleHome.txtSearchBox(driver).sendKeys(strSearchString);
        Thread.sleep(2000);
        GoogleHome.btnSubmit(driver).submit();

    }

    @Then("^user can see the number of gumtree links displayed$")
    public void user_can_see_the_number_of_gumtree_links_displayed() throws Throwable {
        lstHref = Utilities.filterLinks(GoogleSearchResults.lnkTopResults(driver), "gumtree");
        log.info("Number of Gum tree links :" + lstHref.size());
    }


    @Then("^user can navigate to the gumtree links and check the title of the page$")
    public void check_the_title_of_the_page() throws Throwable {
        log.info("The page titles are");
        for (int i=0; i< lstHref.size(); i++) {
            log.info((i+1) + ") " + lstHref.get(i));
            driver.navigate().to(lstHref.get(i));
            log.info(driver.getTitle());
            Thread.sleep(1000);
        }

    }

    @After("@selenium")
    public void tearDown(Scenario scenario) {
        if ( driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
