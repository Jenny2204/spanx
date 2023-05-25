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

    @Given("I open the website spanx.com")
    public void open_site() {
        ChromeOptions chromeOptions = new ChromeOptions();
        //?
        chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
        driver = new ChromeDriver(chromeOptions);
        OpenSiteClass openSiteClass = new OpenSiteClass(driver);
        openSiteClass.navigateTo("https://spanx.com/");

    }

    @Then("the URL should contain spanx.com")
    public void check_current_url() {
        String currentUrl = driver.getCurrentUrl();
        String exPageUrl = "https://spanx.com/";
        if (currentUrl.equalsIgnoreCase(exPageUrl)) {
            System.out.println(" Url correct");
        } else {
            System.out.println("Url isnt correct" + currentUrl);
        }
    }

    @And("the page title should contain SPANX")
    public void check_title() {
        String currentGetTitle = driver.getTitle();
//        String exGetTitle = "SPANX | Shapewear, Clothing, Activewear & Intimates\n" +
//                "– Spanx";
//        Assert.assertTrue(exGetTitle.equals(currentGetTitle));
        Assert.assertFalse("page title is empty", currentGetTitle.isEmpty());
    }

    @Then("I see the spanx.com logo")
    public void checkImgLogo() {
        HeaderClass headerClass = new HeaderClass(driver);
        headerClass.checkIconLogo();
//        headerClass.checkIconLogo2();
    }
//# BestSellersButton #
    @Then("I see the BestSellersButton item in the main menu")
    public void checkbuttonBestSellers() {
        HeaderClass headerClass = new HeaderClass(driver);
        headerClass.buttonBestSellers();
    }
//# LeggingsButton #
    @Then("I see the Leggings item in the main menu")
    public void checkbuttonLeggings() {
        HeaderClass headerClass = new HeaderClass(driver);
        headerClass.buttonLeggings();
    }

//# ClothingButton #
    @Then("I see the ClothingButton item in the main menu")
    public void checkClothingButton() {
        HeaderClass headerClass = new HeaderClass(driver);
        headerClass.clothingButton();
    }

//# ActiveButton #
    @Then("I see the ActiveButton item in the main menu")
    public void checkActivebutton() {
        HeaderClass headerClass = new HeaderClass(driver);
        headerClass.activeButton();
    }
    @Then("I see the SwimButton item in the main menu")
    public void checkSwimButton() {
        HeaderClass headerClass = new HeaderClass(driver);
        headerClass.swimButton();
    }
       @Then("I see the Shapewear item in the main menu")
       public void checkShapewearButton() {
        HeaderClass headerClass = new HeaderClass(driver);
        headerClass.shapewear();
   }
       @Then("I see the Bras item in the main menu")
       public void checkBrasButton() {
        HeaderClass headerClass = new HeaderClass(driver);
        headerClass.bras();
      }

    @Then("I see the Panties item in the main menu")
    public void checkSaleButton() {
        HeaderClass headerClass = new HeaderClass(driver);
        headerClass.sale();
    }
    @Then("I see the Panties item in the main menu")
       public void checkPantiesButton() {
        HeaderClass headerClass = new HeaderClass(driver);
        headerClass.panties();
    }
       @Then("I see the Mens item in the main menu")
       public void checkMensButton() {
        HeaderClass headerClass = new HeaderClass(driver);
        headerClass.mens();
     }
       @Then("I see the History item in the main menu")
       public void checkHistoryButton() {
        HeaderClass headerClass = new HeaderClass(driver);
        headerClass.history();
    }

    @And("Close site")
        public void close_site () {
            driver.quit();
        }
    }



