package com.spanx;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    private WebDriver driver;

    @When("I enter search field")
    public void iEnterValueInTheSearchField() {
        SearchClass searchClass = new SearchClass(driver);
        searchClass.enterSearchValue();
    }

    @And("I click on the search button")
    public void iClickOnTheSearchButton() {
        SearchClass.clickSearchButton();
    }

    @Then ("Verify the search result page")
    public void searchResult(){
        SearchClass searchClass = new SearchClass(driver);
        searchClass.resultSearchPage();

    }
}