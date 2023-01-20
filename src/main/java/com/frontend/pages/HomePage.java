package com.frontend.pages;

import com.frontend.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Accept')]")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Online Slots')]")
    WebElement onlineSlots;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Play Online Slots at Virgin Games')]")
    WebElement verifyTextonlineSlots;

    public void clickOnAcceptCookies(){
        clickOnElement(acceptCookies);
        log.info("Click on cookies"+ acceptCookies.toString());
    }
    public void mouseHooverAndClickOnOnlineSlots(){

        clickOnElement(onlineSlots);
        log.info("Click on Online slots"+ onlineSlots.toString());
    }
    public String verifyTextmassage(){
        log.info("Verify Text "+ verifyTextonlineSlots.toString());
        return getTextFromElement(verifyTextonlineSlots);


    }

}
