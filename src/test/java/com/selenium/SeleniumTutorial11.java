//Selenium Commands - Navigation commands: 5:37-
//Test case:
//1. Launch the Chrome browser
//2. Open https://www.amazon.com/
//3. maximize the window
//4. Navigate to the URL (https://www.ebay.com/)
//5. Enter some values in the text boxes
//6. Refresh the page
//7. Navigate back to amazon
//8. Navigate forward to ebay
//9. close the browser

package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial11 {
    public static void main(String[] args) throws InterruptedException {
        //Open Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open the Amazon page
        driver.get("https://www.amazon.com/");
        System.out.println("Opening the amazon page through driver.get()");
        //maximize window
        driver.manage().window().maximize();
        //Navigate to ebay page
        driver.navigate().to("https://www.ebay.com/");
        System.out.println("Navigated the ebay page through driver.navigate.to()");
        //enter some values
        driver.findElement(By.cssSelector("input#gh-ac")).sendKeys("T-Shirt for men");
        //refresh the browser
        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Refresh the browser");
        //Navigate back to Amazon
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("The page is navigated back to amazon");
        //Navigate forward to ebay
        Thread.sleep(2000);
        driver.navigate().forward();
        System.out.println("The page is navigated forward to ebay");
        //Close the browser
        Thread.sleep(2000);
        driver.close();
    }
}
