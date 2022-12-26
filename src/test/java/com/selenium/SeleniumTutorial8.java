//Advanced xpath Axes 4:21-4:38
//Shadow DOM elements
//Shadow DOM does not support xpath, we use CSS Selector to locate shadow DOM elements
//Also we use JavascriptExecutor to locate Shadow DOM elements
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTutorial8 {
    public static void main(String[] args) {
        //open the browser
        WebDriver driver = new ChromeDriver();
        //Navigate to the url
        driver.get("https://developer.salesforce.com/signup");
        //maximize the window
        driver.manage().window().maximize();
        //host
        WebElement host = driver.findElement(By.tagName("dw-de-signup-form"));
        //shadow dom
        JavascriptExecutor j =(JavascriptExecutor) driver;
        WebElement shadowDom = (WebElement) j.executeScript("return arguments[0].shadow-root",host);
        //Xpath axes
        //self node
        driver.findElement(By.xpath("//input[@name='company']/self::input")).sendKeys("lakeView");
        //Parent node
        String parent = driver.findElement(By.xpath("//input[@name='company']/parent::*")).getText();
        System.out.println("The parent value is "+parent);
        //child nodes: //tagName[@variable='variableValue']/parent::parentTag/child::*
        List<WebElement> child_nodes = driver.findElements(By.xpath("//input[@name='company']/parent::form/child::*"));
        System.out.println("The no of child nodes is "+child_nodes.size());
        //following nodes
        List<WebElement> following = driver.findElements(By.xpath("//input[@name='company']/following::*"));
        System.out.println("The no of following nodes is "+following.size());
        //following siblings
        List<WebElement> following_siblings = driver.findElements(By.xpath("//input[@name='company']/following-sibling::*"));
        System.out.println("The no of following nodes is "+following_siblings.size());
        //preceding nodes
        List<WebElement> preceding = driver.findElements(By.xpath("//input[@name='company']/preceding::*"));
        System.out.println("The no of preceding nodes is "+preceding.size());
        //preceding sibling
        List<WebElement> preceding_sibling = driver.findElements(By.xpath("//input[@name='company']/preceding-sibling::*"));
        System.out.println("The no of preceding nodes is "+preceding_sibling.size());



    }
}
