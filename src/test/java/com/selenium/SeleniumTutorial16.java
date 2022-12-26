//Dropdown Menu : 6:52-
//We inspect the dropdown menu using the select class.
//the syntax is:  Select select = new Select(WebElement)
//Select class methods include: selectByIndex, selectByValue, selectByVisibleText, deSelectByIndex, deSelectByValue
//deSelectByVisibleText, getOptions, getAllSelectedOptions, getFirstSelectedOptions
package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial16 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //open
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        driver.manage().window().maximize();
    }
}
