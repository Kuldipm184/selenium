package com.selenium.design.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    private WebDriver driver;
    private SearchWidget searchWidget;
    private SearchSuggestion searchSuggestion;

    public GoogleMainPage(final WebDriver driver){
        this.driver=driver;
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
        this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
    }

    public void goTo(){
        this.driver.get("www.google.com");
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }
}
