package com.saucedemo.testsuit;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void userShouldLoginSuccessfullyWithValidcredentials() {

        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnSignInButton();
        String expectedMessage = "PRODUCTS";
        Assert.assertEquals(expectedMessage, getTextFromElement(By.xpath("//span[@class='title']")));
    }

    @Test
        public void  verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnSignInButton();

        int expectedProductNumber = 6;
        Assert.assertEquals(loginPage.getProductsError(),expectedProductNumber,"Invalid data matched");
    }
    }






