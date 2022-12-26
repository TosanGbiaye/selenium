// Find element by Xpath 2:46 - 3:35
//Absolute and Relative xpath
package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial6 {
    public static void main(String[] args) {
        //Open the chrome browser
        WebDriver driver = new ChromeDriver();
        //Maximize the browser
        driver.manage().window().maximize();
        //Navigate to the url
        driver.get("https://www.ebay.com/");
//        //Absolute xpath
//        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("T-Shirts");
//        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();
        //Relative xpath
//        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Shirts for men");
//        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
//        //xpath with multiple attributes
//        //Xpath with OR operator "//tagName[@id='valueOfTheID or @name='nameValue']"
//        driver.findElement(By.xpath("//input[@id='gh-ac' or @name='_nkw']")).sendKeys("Shirts for men");
        //Xpath with AND operator "//tagName[@id='valueOfTheID and @name='nameValue']"
//        driver.findElement(By.xpath("//input[@id='gh-ac' and @name='_nkw']")).sendKeys("Shirts for men");
        //xpath with Contains method: "//tagName[contains(@attribute,'attributePartialValue')]"
//        driver.findElement(By.xpath("//input[contains(@name,'_nk')]")).sendKeys("shirts for kids");
//        //xpath with Starts-with() method  "//tagName[starts-with(@attribute,'attributePartialValue')]"
//        //Starts-with() : is used to locate an element whose attribute changes on refresh or on any operation on
//        // the webpage, i.e the attribute changes dynamically. it can also be used to find static elements
//        driver.findElement(By.xpath("//input[starts-with(@name,'_nk')]")).sendKeys("shirts for women");
        //Xpath with text method: it is used to locate element on a webpage based on the text of a web element
        // the syntax is: //tagName[text()='textValue']
        driver.findElement(By.xpath("//a[text()=' Sell']")).click();
    }

}
