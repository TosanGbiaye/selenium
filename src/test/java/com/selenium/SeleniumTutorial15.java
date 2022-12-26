//How to Handle Multiple Windows 6:27-6:52
//Methods for handling multiple window:
// getWindowHandle() :used for retrieving the window id of currently focused window
// getWindowHandles() :used for retrieving the window id of multiple opened windows
//switchTo() :Helps us in switching
//window() :used along with switchTo and takes window id as input
package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SeleniumTutorial15 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //open url
        driver.get("https://demoqa.com/browser-windows");
        //max window
        driver.manage().window().maximize();
        //print parent window handle
        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);
        //click on the New Window button 3 times
        for(int i=1; i<=3; i++){
            driver.findElement(By.cssSelector("#windowButton")).click();
            Thread.sleep(3000);
        }
        //print the window handles
        Set<String> windowHandles = driver.getWindowHandles();
        String lastWindowHandle = "";
        for (String handle: windowHandles){
            System.out.println("The window handles are: "+handle);
            //Switching windows
            System.out.println("Swtching windows "+handle);
            driver.switchTo().window(handle);
            //Navigating to google
            Thread.sleep(3000);
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
        }
        //close parent window
        Thread.sleep(2000);
        driver.switchTo().window(parentWindowHandle);
        driver.close();
        //To switch to the other windows
        Thread.sleep(2000);
        driver.switchTo().window(lastWindowHandle);
        Thread.sleep(2000);
        driver.quit();

    }
}
