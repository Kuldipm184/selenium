package com.selenium.design.srp.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchSuggestion extends AbstractComponent{
    @FindBy(css = "li.sbct")
    private List<WebElement> suggestions;

    public SearchSuggestion(final WebDriver driver){
        super(driver);
    }

    public void clickSuggestion(int index){
        this.suggestions.get(index-1).click();
    }
    @Override
    public boolean isDisplayed() {
        return this.wait.until(((driver) -> this.suggestions.size()>5));
    }
}
