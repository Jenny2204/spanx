package com.spanx;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HeaderClass {

    private WebDriver driver;
    By signUpIcon = By.xpath("//header/div[4]/ul[1]/li[2]/div[1]/button[1]/*[1]");
    By buttonCreateAccount = By.xpath("//a[contains(text(),'Create An Account')]");
    By iconLogo = By.xpath("//header/div[2]/div[1]/h1[1]/a[1]/img[1]");

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

        public void checkIconLogo(){
            if (driver.findElement(iconLogo).isDisplayed()) {
                driver.findElement(iconLogo).getAttribute("href");
                driver.findElement(iconLogo).getAttribute("class");
            } else {
                System.out.println("not found iconLogo");
            }

        }
        public void checkIconLogo2(){
            WebElement iconImglogo = driver.findElement(iconLogo);
            Assert.assertTrue("Logo is not displayed", iconImglogo.isDisplayed());

            // Проверка атрибутов логотипа
            String logoSrc = iconImglogo.getAttribute("src");
            String logoAlt = iconImglogo .getAttribute("alt");

            // Проверка, что атрибуты не пустые
            Assert.assertFalse("Logo src attribute is empty", logoSrc.isEmpty());
            Assert.assertFalse("Logo alt attribute is empty", logoAlt.isEmpty());
        }

    }
