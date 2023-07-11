package com.spanx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductElements {
    private final WebDriver driver;
    static By searchResult = By.id("the-perfect-a-line-3-4-sleeve-dress");
//    static By searchResult = driver.findElements("the-perfect-a-line-3-4-sleeve-dress");
    public ProductElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setSearchResultValue() {
        if (driver.findElement(searchResult).isDisplayed()) {
            driver.findElement(searchResult).getAttribute("href");
            driver.findElement(searchResult).getAttribute("class");
        } else {
            System.out.println("not found relevant result");
        }

    }
}
