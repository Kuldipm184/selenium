package com.selenium.design.srp.result;

import com.selenium.design.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractComponent {
    @FindBy(id = "hdtb")
    private WebElement bar;

    @FindBy(linkText = "Images")
    private WebElement images;

    @FindBy(linkText = "News")
    private WebElement news;

    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public void gotoImages(){
        this.images.click();
    }

    public void gotoNews(){
        this.news.click();
    }
    @Override
    public boolean isDisplayed() {
        return this.wait.until((d)->this.bar.isDisplayed());
    }
}
