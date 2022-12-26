//Selenium commands- WebElements commands: 5:55-6:27
//The WebElements commands are the list of actions that can be performed on a Web element. examples:
//sendKeys, clear(), getText(), getLocation(),getTagName, getSize() command, isDisplayed, isEnabled, isSelected
//Test case:
//1. Launch the Chrome browser
//2. pen the URL
//3. Enter the username and password
//4. Clear username and password
//5. click submit button
//6. Get Text
//7. Get Location
//8. Get Size
//9. Get tag name
//10. print the no of links present on the web page
//11. check if the login button is displayed
//12. check if the login button is enabled
//13. check if the login button is selected
package com.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTutorial13 {
    public static void main(String[] args) throws InterruptedException {
        //Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        //open the URL
        driver.get("https://www.facebook.com/");
        //maximize the window
        driver.manage().window().maximize();
        //Enter username and password
        driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
        driver.findElement(By.id("pass")) .sendKeys("admin123");
        //clear the username and password
        Thread.sleep(4000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(4000);
        driver.findElement(By.id("pass")).clear();
        //click on login button
        //driver.findElement(By.cssSelector("[type='submit']")).click();
        //getText() method
        String getText = driver.findElement(By.linkText("Forgotten password?")).getText();
        System.out.println("The text is "+getText);
        //getLocation
        WebElement element = driver.findElement(By.id("email"));
        Point point = element.getLocation();
        System.out.println("The X coordinate location is "+point.x);
        System.out.println("The y coordinate location is "+point.y);
        //getSize()
        WebElement element1 = driver.findElement(By.id("email"));
        Dimension dim = element1.getSize();
        System.out.println("The Height is "+dim.height);
        System.out.println("The Width is "+dim.width);
        //getTagName
        String tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println("The tagName is "+tagName);
        //To print the no of links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        //To print out (text) name of links we use for loop
        for (WebElement l :links)
        {
            System.out.println(l.getText());
        }
        //To check if the login button is displayed
        //we use the element visiblity method which include the following: isDisplayed, isSelected and isEnabled
        //isSelected is used for radio buttons and checkboxes
        //is displayed  and isEnabled method is used for all types of web elements present on the webpage
        Boolean loginButtonD = driver.findElement(By.cssSelector("[type='submit']")).isDisplayed();
        System.out.println(loginButtonD);
        //To check if the login button is Enabled
        Boolean loginButtonE = driver.findElement(By.cssSelector("[type='submit']")).isEnabled();
        System.out.println(loginButtonE);
        //To check if the login button is selected
        Boolean loginButtonS = driver.findElement(By.cssSelector("[type='submit']")).isSelected();
        System.out.println(loginButtonS);

    }
}
