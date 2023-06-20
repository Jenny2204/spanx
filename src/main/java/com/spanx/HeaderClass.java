package com.spanx;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.fail;

public class HeaderClass {

    private WebDriver driver;
    By signUpIcon = By.xpath("//header/div[4]/ul[1]/li[2]/div[1]/button[1]/*[1]");
    By buttonCreateAccount = By.xpath("//a[contains(text(),'Create An Account')]");
    By iconLogo = By.xpath("//header/div[2]/div[1]/h1[1]/a[1]/img[1]");//header/div[2]/div[1]/h1[1]/a[1]/img[1]
    By BestSellersButton = By.xpath("//div[contains(text(),'Best Sellers')]");
    By LeggingsButton = By.xpath("//div[contains(text(),'Leggings')]");
    By ClothingButton = By.xpath("//div[contains(text(),'Clothing')]");
    By Active = By.xpath("//div[contains(text(),'Active')]");
    By SwimButton = By.xpath("//a[contains(text(),'Swim')]");
    By Shapewear = By.xpath("//div[contains(text(),'Shapewear')]");
    By Bras = By.xpath("//div[contains(text(),'Bras')]");
    By Panties = By.xpath("//div[contains(text(),'Panties')]");
    By Mens = By.xpath("//div[contains(text(),'Mens')]");
    By Sale = By.xpath("//div[contains(text(),'Sale')]");
    By History = By.xpath("//div[contains(text(),'History')]");

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

    public void checkCreateAccountLink() {
        if (driver.findElement(buttonCreateAccount).isDisplayed()) {
            driver.findElement(buttonCreateAccount).getAttribute("href");
            driver.findElement(buttonCreateAccount).getAttribute("class");
        } else {
            System.out.println("not found Create An Account link");
        }
    }

    public void checkIconLogo() {
        if (driver.findElement(iconLogo).isDisplayed()) {
            driver.findElement(iconLogo).getAttribute("href");
            driver.findElement(iconLogo).getAttribute("class");
        } else {
            System.out.println("not found iconLogo");
        }

    }

    public void checkIconLogo2() {
        WebElement iconImglogo = driver.findElement(iconLogo);
        Assert.assertTrue("Logo is not displayed", iconImglogo.isDisplayed());

        // Проверка атрибутов логотипа
        String logoSrc = iconImglogo.getAttribute("src");
        String logoAlt = iconImglogo.getAttribute("alt");

        // Проверка, что атрибуты не пустые
        Assert.assertFalse("Logo src attribute is empty", logoSrc.isEmpty());
        Assert.assertFalse("Logo alt attribute is empty", logoAlt.isEmpty());
        fail("This test should fail");
    }


    public void buttonBestSellers() {
        if (driver.findElement(BestSellersButton).isDisplayed()) {
            driver.findElement(BestSellersButton).getAttribute("href");
            driver.findElement(BestSellersButton).getAttribute("class");
        } else {
            System.out.println("not found iconLogo");
        }
    }

    public void buttonLeggings() {
        if (driver.findElement(LeggingsButton).isDisplayed()) {
            driver.findElement(LeggingsButton).getAttribute("href");
            driver.findElement(LeggingsButton).getAttribute("class");
        } else {
            System.out.println("not found iconLogo");
        }
    }

    public void clothingButton() {
        if (driver.findElement(ClothingButton).isDisplayed()) {
            driver.findElement(ClothingButton).getAttribute("href");
            driver.findElement(ClothingButton).getAttribute("class");
        } else {
            System.out.println("not found iconLogo");

        }

    }

    public void activeButton() {
        if (driver.findElement(Active).isDisplayed()) {
            driver.findElement(Active).getAttribute("href");
            driver.findElement(Active).getAttribute("class");
        } else {
            System.out.println("not found iconLogo");

        }

    }

    public void swimButton() {
        if (driver.findElement(SwimButton).isDisplayed()) {
            driver.findElement(SwimButton).getAttribute("href");
            driver.findElement(SwimButton).getAttribute("class");
        } else {
            System.out.println("not found iconLogo");
        }
    }

    public void shapewear() {
        if (driver.findElement(Shapewear).isDisplayed()) {
            driver.findElement(Shapewear).getAttribute("href");
            driver.findElement(Shapewear).getAttribute("class");
        } else {
            System.out.println("not found iconLogo");
        }
    }

    public void bras() {
        if (driver.findElement(Bras).isDisplayed()) {
            driver.findElement(Bras).getAttribute("href");
            driver.findElement(Bras).getAttribute("class");
        } else {
            System.out.println("not found iconLogo");
        }
    }


    public void panties() {
        if (driver.findElement(Panties).isDisplayed()) {
            driver.findElement(Panties).getAttribute("href");
            driver.findElement(Panties).getAttribute("class");
        } else {
            System.out.println("not found iconLogo");
        }

    }


    public void mens() {
        if (driver.findElement(Mens).isDisplayed()) {
            driver.findElement(Mens).getAttribute("href");
            driver.findElement(Mens).getAttribute("class");
        } else {
            System.out.println("not found iconLogo");
        }


    }

    public void sale() {
        if (driver.findElement(Sale).isDisplayed()) {
            driver.findElement(Sale).getAttribute("href");
            driver.findElement(Sale).getAttribute("class");
        } else {
            System.out.println("not found iconLogo");
        }

    }

//    public void history() {
//        if (driver.findElement(History).isDisplayed()) {
//            driver.findElement(History).getAttribute("href");
//            driver.findElement(History).getAttribute("class");
//        } else {
//            System.out.println("not found iconLogo");
//        }
//    }

        public void history() {
        WebElement check = driver.findElement(History);
        boolean isVisible = check.isDisplayed();
        }
    }


