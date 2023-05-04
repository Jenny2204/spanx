package com.spanx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUpClass {
    private WebDriver driver;
    By firstNameInput = By.id("FirstName");
    By lastNameInput = By.id("LastName");
    By emailInput = By.id("Email");
    By passwordInput = By.id("CreatePassword");
    By registerButton = By.xpath("//body/div[@id='app']/div[@id='MainContentWrapper']/main[@id='MainContent']/section[1]/div[1]/div[2]/form[1]/div[5]/button[1]");
    //    By errorMessage = By.className("error");
    public SignUpClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameInput).sendKeys(lastName);
    }
}


