package com.selenium.design.srp.common;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SearchWidget extends AbstractComponent{

    @FindBy(name = "q")
    private WebElement searchBox;
    public SearchWidget(final WebDriver driver){
        super(driver);
    }

    public void enter(String keyword){
        this.searchBox.clear();
        char[] toCharArray = keyword.toCharArray();
        for (char c: toCharArray){
            Uninterruptibles.sleepUninterruptibly(20, TimeUnit.MILLISECONDS);
            this.searchBox.sendKeys(String.valueOf(c));
        }
    }
    @Override
    public boolean isDisplayed() {

        return this.wait.until((d)->this.searchBox.isDisplayed());
    }
}
