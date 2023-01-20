package com.frontend.steps;

import com.frontend.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomepageSteps {

    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I am on Home page I accept cookies$")
    public void iAmOnHomePageIAcceptCookies()throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().clickOnAcceptCookies();

    }

    @And("^I click on Online Slots tab$")
    public void iClickOnOnlineSlotsTab() throws InterruptedException{
        Thread.sleep(1000);
        new HomePage().mouseHooverAndClickOnOnlineSlots();
    }

    @And("^I nevigate to online slots page$")
    public void iNevigateToOnlineSlotsPage() {
    }

    @Then("^I verify the text Play Online Slots at Virgin Games$")
    public void iVerifyTheTextPlayOnlineSlotsAtVirginGames() throws InterruptedException{
        Thread.sleep(1000);
        Assert.assertEquals("Play Online Slots at Virgin Games",new HomePage().verifyTextmassage());
    }
}
