package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial1 {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C://Users//hp//Downloads//programs//selenium jar and drivers//drivers/chromedriver.exe");
        //Launch the browser
        WebDriver driver = new ChromeDriver();
        // Navigate to the url
        driver.get("https://www.google.com");
        // close the browser
        driver.close();
        //System.setProperty("webdriver.gecko.driver", "C://Users//hp//Documents//TAS//Web_Drivers//geckodriver-v0.32.0-win64/geckodriver.exe");
        //Launch the browser
        //WebDriver driver = new FirefoxDriver();
        // Navigate to the url
        //driver.get("https://www.google.com");
        // close the browser
        //driver.close();


    }
}
