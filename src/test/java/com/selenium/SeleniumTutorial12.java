//Selenium Commands-Navigate commands: 5:48-5:55
//Test case
//1. Open Chrome browser
//2. open https://www.wordpress.com/
//3. maximize the window
//4. click on 'Get Started'
//5. come back to home page
//6. Again go back to 'Get Started' page
//7. Refresh the browser
//8. close the browser
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial12 {
    public static void main(String[] args) throws InterruptedException {
        //Open Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open wordpress
        driver.navigate().to("https://wordpress.com/");
        //Maximize the window
        driver.manage().window().maximize();
        //click on 'Get Started'
        driver.findElement(By.cssSelector("a[title='Get Started']")).click();
        //back to homepage
        Thread.sleep(2000);
        driver.navigate().back();
        //forward
        Thread.sleep(5000);
        driver.navigate().forward();
        //refresh
        Thread.sleep(2000);
        driver.navigate().refresh();
        //close browser
        Thread.sleep(2000);
        driver.close();
    }
}
