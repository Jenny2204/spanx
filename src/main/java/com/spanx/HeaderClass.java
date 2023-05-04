package com.spanx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HeaderClass {

    private WebDriver driver;
    By signUpIcon = By.xpath("//header/div[4]/ul[1]/li[2]/div[1]/button[1]/*[1]");
    By buttonCreateAccount = By.xpath("//a[contains(text(),'Create An Account')]");

    public HeaderClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void signUpIconCheck() {
        if (driver.findElement(signUpIcon).isDisplayed()) {
            driver.findElement(signUpIcon).getAttribute("type");
            driver.findElement(signUpIcon).getAttribute("class");
        } else {
            System.out.println("not found  signUp icon");
        }


    }

    public void CheckCreateAccountLink() {
        if (driver.findElement(buttonCreateAccount).isDisplayed()) {
            driver.findElement(buttonCreateAccount).getAttribute("href");
            driver.findElement(buttonCreateAccount).getAttribute("class");
        } else {
            System.out.println("not found Create An Account link");
        }
    }
}