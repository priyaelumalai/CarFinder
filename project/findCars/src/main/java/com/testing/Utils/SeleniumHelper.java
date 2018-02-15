package com.testing.Utils;

import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.IOException;
import java.net.URL;
import org.apache.log4j.Logger;

/**
 * SeleniumHelper is a utility class to help with the driver related activities
 */
public class SeleniumHelper {
    protected static final Logger log = LogManager.getLogger(SeleniumHelper.class);

    /**
     * gets the Webdirver object based on the input parameters
     * @param strBrowserName
     * @param strOSName
     * @return
     */
    public WebDriver getDriver(String strBrowserName, String strOSName){
        WebDriver driver = null;

        log.info("OS name property read: " + System.getProperty("os.name"));
        if (strBrowserName != null) {
            switch (strBrowserName.toLowerCase()) {
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", getWebDriverPath("geckodriver", strOSName));
                    driver = new FirefoxDriver();
                    break;
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", getWebDriverPath("chromedriver",strOSName));
                    driver = new ChromeDriver();
                    break;
                case "ie":
                    System.setProperty("webdriver.ie.driver", getWebDriverPath("IEDriverServer", strOSName));
                    driver = new InternetExplorerDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    log.info("The browser name doesn't match with any config, Chrome will be set by default");
                    driver = new ChromeDriver();
                    break;
            }
        } else {
            log.warn("The browserName property is null, Chrome will be set by default");
            driver = new ChromeDriver();
        }

        return driver;
    }

    /**
     * gets the driver.exe location based on the input parameters
     * @param strDriverName
     * @param strOSName
     * @return
     */
    private String getWebDriverPath(String strDriverName, String strOSName) {
        URL idUrl;

        log.info("OS name property read: " + strOSName);
        if ("Windows".equalsIgnoreCase(strOSName)) {
            idUrl = getClass().getClassLoader().getResource("webdriversWindows/" + strDriverName + ".exe");
        } else if ("Linux".equalsIgnoreCase(strOSName)) {
            idUrl = getClass().getClassLoader().getResource("webdriversLinux/" + strDriverName);
            try {
                log.info("Driver path: " + idUrl.getPath());
                Runtime.getRuntime().exec("chmod u+x " + idUrl.getPath());
            } catch (IOException | NullPointerException e) {
                log.error("Error trying to retrieve the driver path", e);
                return "";
            }
        } else {
            log.warn("OS name detected doesn't match with any driver config");
            return "";
        }
        return idUrl.getPath();
    }

}
