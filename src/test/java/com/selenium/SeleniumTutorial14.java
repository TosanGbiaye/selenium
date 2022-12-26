// Selenium Commands- WebElements commands(click command and submit button) 6:03-
//difference between click command and submit button:
//The submit command works for buttons inside the form tag , it is not applicable to elements with
//buttons outside the form tag while the click command is applicable to all elements that have a button anywhere
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial14 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //click
        //driver.findElement(By.cssSelector("[type='submit']")).click();
        //submit
        driver.findElement(By.cssSelector("[type='submit']")).submit();

    }
}
