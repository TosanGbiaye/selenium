//find elements byy tagName
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTutorial4 {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C://Users//hp//Downloads//programs//selenium jar and drivers//drivers/chromedriver.exe");
        //Launch the browser
        WebDriver driver = new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();
        // Navigate to the url
        //driver.get("https://www.flipkart.com");
        driver.get("https://www.google.com");
        //Find elements by tagName (tagName is used to find multiple links element
        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println(link.size());
        //To print out (text) name of links we use for loop
        for (WebElement l :link)
        {
            System.out.println(l.getText());
            //driver.close();
        }

    }
}
