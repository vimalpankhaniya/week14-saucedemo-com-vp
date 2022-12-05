package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {

    By username = By.id("user-name");
    By password = By.xpath("//input[@id='password']");
    By LoginText = By.xpath("//input[@type='submit']");
    By verifyMessage=By.xpath("//span[@class='title']");

    By errorProductNumber = By.className("inventory_item");

    public void enterUserName(String username2) {
        sendTextToElement(username, username2);
    }

    public void enterPassword(String password1) {
        sendTextToElement(password, password1);
    }
    public void clickOnSignInButton() {
        clickOnElement(LoginText);
    }

    public String verifyText() {
        return getTextFromElement(verifyMessage);

    }
    public int getProductsError(){
        List<WebElement> list = driver.findElements(errorProductNumber);
        int actualNumber = list.size();
        return actualNumber;
    }

   }



