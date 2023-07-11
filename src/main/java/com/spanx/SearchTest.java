package com.spanx;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static com.spanx.SearchClass.driver;

public class SearchTest {
//    private WebDriver driver;

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

    @Then ("Verify the relevant result page")
    public void setSearchResult(){
//        ProductElements productelements = new ProductElements(driver);
//        productelements.setSearchResultValue();
        List<WebElement> elements = driver.findElements(By.id("the-perfect-a-line-3-4-sleeve-dress"));
        if (!elements.isEmpty()) {
            WebElement firstElement = elements.get(0);
            firstElement.click();
        } else {
            System.out.println("not found");

        }

    }
}