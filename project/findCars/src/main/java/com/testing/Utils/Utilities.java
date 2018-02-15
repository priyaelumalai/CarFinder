package com.testing.Utils;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Utilities has the general utility functions
 */
public class Utilities {
    /**
     * filter links in the list, based on the search string provided
     * @param lstALink
     * @param strSearchString
     * @return
     */
    public static List<String> filterLinks(List<WebElement> lstALink, String strSearchString){
        List<String> lstHref = new ArrayList<String>();
        for (WebElement aLink: lstALink) {

            if(aLink.getText().toLowerCase().contains(strSearchString)){
                lstHref.add(aLink.getAttribute("href"));
            }
        }
        return lstHref;
    }
}
