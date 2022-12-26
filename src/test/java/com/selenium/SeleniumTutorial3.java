//LinkText and PartialLintText
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial3 {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "C://Users//hp//Downloads//programs//selenium jar and drivers//drivers/chromedriver.exe");
        //Launch the browser
        WebDriver driver = new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();
        // Navigate to the url
        driver.get("https://www.flipkart.com");
        //Find element by linkText
        driver.findElement(By.linkText("Facebook")).click();
        //Find element by partialLinkText
        //driver.findElement(By.partialLinkText("Face")).click();

    }
}
