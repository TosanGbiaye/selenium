//Shadow DOM elements 4:38-5:07
//Shadow DOM does not support xpath, we use CSS Selector to locate shadow DOM elements
//Also we use JavascriptExecutor to locate Shadow DOM elements
//Practise more on shadow DOM using this website: https://shop.polymer-project.org/
package com.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial9 {
    public static void main(String[] args) {
        //Open the Chrome browser
        WebDriver driver = new ChromeDriver();
        //Navigate to the URL
        driver.get("https://books-pwakit.appspot.com/");
        //Maximize the browser
        driver.manage().window().maximize();
        //To inspect a shadow DOM use the JavascriptExecutor below:
        JavascriptExecutor j =(JavascriptExecutor) driver;
        //right-click on the element you want to inspect>click on inspect>click on copy>click on copy JS Path
        String str = "return document.querySelector('body > book-app').shadowRoot.querySelector('#input')";
        WebElement input = (WebElement) j.executeScript(str);
        input.sendKeys("selenium webdriver");


    }
}
