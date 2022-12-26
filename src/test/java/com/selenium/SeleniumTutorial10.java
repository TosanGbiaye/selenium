//Selenium Commands - Browser commands: 5:07-5:36
//Test case:
//1. Open the Chrome browser
//2. Navigate to the URL: https://demoqa.com/browser-windows
//3. Maximize the window
//4. Verify the current URL of the page
//5. Verify the title of the page
//6. print the length of the title of the page
//7 print the pageSource of the page
//8. print the length of the pageSource of the page
//9. click on new tab
//10. close the browser
//11. quit the browser

package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial10 {
    public static void main(String[] args) throws InterruptedException {
        //Open the Chrome browser
        WebDriver driver = new ChromeDriver();
        //Navigate to the URL
        driver.get("https://demoqa.com/browser-windows");
        //Maximize the browser
        driver.manage().window().maximize();
        //URL of the page
        String urlOfPage = driver.getCurrentUrl();
        System.out.println("The URL of the page is "+urlOfPage);
        //Verify the URL
        if (urlOfPage.equals("https://demoqa.com/browser-windows")){
            System.out.println("The URL is verified");
        }else {
            System.out.println("The URL is not verified");
        }
        //Title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is "+title);
        //Title of the page
        if (title.equals("ToolsQA")){
            System.out.println("The title is Verified");
        }else {
            System.out.println("The title is not verified");
        }
        //Length of the title of the page
        int titleLength = driver.getTitle().length();
        System.out.println("The length of the title of the page is "+titleLength);
        //Page source
        String pageSource = driver.getPageSource();
        System.out.println("The page source is "+pageSource);
        //Page source length
        int psLength = driver.getPageSource().length();
        System.out.println("The page source length is "+psLength);
        //click on new tab
        driver.findElement(By.cssSelector("button#tabButton")).click();
//        //close
//        Thread.sleep(5000);
//        driver.close();
        
        //quit
        Thread.sleep(5000);
        driver.quit();




    }
}
