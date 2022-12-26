package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeDashboard {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Navigate to the URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //Enter valid username
        driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("Admin");
    }
}
