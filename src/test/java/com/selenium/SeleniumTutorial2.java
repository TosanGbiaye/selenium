//WebElement Locators
//By ID and Name
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial2 {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C://Users//hp//Downloads//programs//selenium jar and drivers//drivers/chromedriver.exe");
        //Launch the browser
        WebDriver driver = new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();
        // Navigate to the url
        driver.get("https://www.amazon.com/");
        // to enter an item in the search box field
        //by id
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
        //by id alternative method
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Phones");

        // close the browser
        //driver.close();

    }
}
