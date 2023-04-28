package com.spanx;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePageTest {
    private WebDriver driver;
    @Given("Open site")
    public void open_site() {
        ChromeOptions chromeOptions = new ChromeOptions();
        //?
        chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        OpenSiteClass openSiteClass = new OpenSiteClass(driver);
        openSiteClass.navigateTo("https://spanx.com/");

    }
    @Then("Check current url")
    public void check_current_url() {
        String currentUrl = driver.getCurrentUrl();
        String exPageUrl = "https://spanx.com/";
        if (currentUrl.equalsIgnoreCase(exPageUrl)) {
            System.out.println(" Url correct");
        } else {
            System.out.println("Url isnt correct" + currentUrl);
        }
    }

    @And("Check title")
    public void check_title() {
        String currentGetTitle = driver.getTitle();
        String exGetTitle = "";
        Assert.assertTrue(exGetTitle.equals(currentGetTitle));

    }
    @And("Close site")
    public void close_site() {
        driver.quit();
    }



}
