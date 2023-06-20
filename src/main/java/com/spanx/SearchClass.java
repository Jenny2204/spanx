package com.spanx;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchClass {
    private static WebDriver driver;

    static By searchInput = By.id("search-input");
    static By searchButton = By.cssSelector("svg.button__icon.icon.icon--search");
    static By ResultValue = By.xpath("//span[contains(text(),'Viewing 1-12 out of 15 results for \"dress\"')]");
    public SearchClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchButton() {
        if (driver.findElement(searchInput).isDisplayed()) {
            driver.findElement(searchInput).getAttribute("href");
            driver.findElement(searchInput).getAttribute("class");
        } else {
            System.out.println("not found Create An Account link");
        }

    }

    public static void enterSearchValue() {
        WebElement searchField = driver.findElement(searchInput);
        searchField.sendKeys("dress");

    }

    public static void clickSearchButton() {
        WebElement searchButt = driver.findElement(searchButton);
        searchButt.click();
    }

    //
////    public static void main(String[] args) {
////        WebDriver driver = new ChromeDriver();
////        SearchClass searchClass = new SearchClass(driver);
////
////        searchClass.enterSearchValue();
////        searchClass.clickSearchButton();
////
////        driver.quit();
//    }
    public void resultSearchPage() {
        WebElement searchButt = driver.findElement(searchButton);
        searchButt.click();
        String currentUrl = driver.getCurrentUrl();
        String exPageUrl = "https://spanx.com/search?q=dress";
    }
    public void setSearchResultValue(){
        WebElement searchResultValue = driver.findElement(ResultValue);
        Assert.assertTrue("Viewing 1-12 out of 15 results for \"dress\"", searchResultValue.isDisplayed());

    }
}
