//Advanced xpath method with Axes 3:40 - 4:21
//Xpath Axes method are mainly used when the web element is not identified with the help of ID, Name, Class name,
// link text, css selector etc
//the syntax is: //tagName/axes::target element
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTutorial7 {
    public static void main(String[] args) {
        //Open the chrome browser
        WebDriver driver = new ChromeDriver();
        //Navigate to the url
        driver.get("https://money.rediff.com/gainers");
        //Maximize the window
        driver.manage().window().maximize();
        // Xpath Axes
        //Self node    //tagName[contains(., 'textValue')]/self::tagName
        String self_node = driver.findElement(By.xpath("//a[contains(., 'Raj Packaging In')]/self::a")).getText();
        System.out.println("The self node is "+self_node);
        //parent node   //tagName[contains(., 'textValue')]/parent::parentTagName
        String parent_node = driver.findElement(By.xpath("//a[contains(., 'Raj Packaging In')]/parent::td")).getText();
        System.out.println("The parent node is "+parent_node);
        //child nodes  //tagName[contains(., 'textValue')]/ancestor::ancestorTagName/child::*
        List<WebElement> child_nodes = driver.findElements(By.xpath("//a[contains(., 'Raj Packaging In')]/ancestor::tr/child::*"));
        System.out.println("The number of child nodes are "+child_nodes.size());
        //Ancestor node  //tagName[contains(., 'textValue')]/ancestor::ancestorTagName
        String ancestor_node = driver.findElement(By.xpath("//a[contains(., 'Raj Packaging In')]/ancestor::tr")).getText();
        System.out.println("The ancestor node is "+ancestor_node);
        //Following nodes  //tagName[contains(., 'textValue')]/following::*
        List<WebElement> following_tag = driver.findElements(By.xpath("//a[contains(., 'Raj Packaging In')]/following::*"));
        System.out.println("The no of following elements from the current HTML tag is "+following_tag.size());
        //Following-sibling  //tagName[contains(., 'textValue')]/ancestor::tr/following-sibling::*
        List<WebElement> following_siblings = driver.findElements(By.xpath("//a[contains(., 'Raj Packaging In')]/ancestor::tr/following-sibling::*"));
        System.out.println("The no of the following siblings from the current HTML tag is "+following_siblings.size());
        //preceding  //tagName[contains(., 'textValue')]/preceding::*
        List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(., 'Raj Packaging In')]/preceding::*"));
        System.out.println("The no of preceding nodes from the current HTML tag is "+preceding.size());
        //preceding siblings  //tagName[contains(., 'textValue')]/ancestor::tr/preceding-sibling::*
        List<WebElement> preceding_siblings = driver.findElements(By.xpath("//a[contains(., 'Raj Packaging In')]/ancestor::tr/preceding-sibling::*"));
        System.out.println("The no of preceding siblings are "+preceding_siblings.size());
        driver.close();



    }
}
