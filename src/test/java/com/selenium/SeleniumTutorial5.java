//To verify the url , Title and source code of a web page : 2:30 - 2:46
//Verify URL : getCurrentUrl()
// Verify Title : getTitle()
// To get the page source code: getPageSource()

package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial5 {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C://Users//hp//Downloads//programs//selenium jar and drivers//drivers/chromedriver.exe");
        //Launch the browser
        WebDriver driver = new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();
        // Navigate to the url
        driver.get("https://www.konga.com/");
        //click on login/signup
        driver.findElement(By.linkText("Login / Signup")).click();
        //Enter valid username
        driver.findElement(By.id("username")).sendKeys("tosangbiaye@gmail.com");
        //Enter valid password
        driver.findElement(By.id("password")).sendKeys("Konga@10");
        //To click on Login
        driver.findElement(By.cssSelector("[class='_0a08a_3czMG _988cf_1aDdJ']")).click();
        //Verify the URL of a web page
        String act_url = driver.getCurrentUrl();
        System.out.println(act_url);
        //Verify the url printed out
        String desired_url = "https://www.konga.com/";
        if (act_url.equals(desired_url)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        //Verify Title on a web page
        String act_title = driver.getTitle();
        System.out.println(act_title);
        //Verify the title printed out
        String desired_title = "Buy Phones, Fashion, Electronics in Nigeria_Konga Online Shopping | Konga Online Shopping";
        if (act_title.equals(desired_title)){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        //To get the page source code
        String ps = driver.getPageSource();
        System.out.println(ps);
        //To close browser
        driver.close();

    }
}
