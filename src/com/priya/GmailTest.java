package com.priya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {

    public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver", "exefiles/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.gmail.com");
 //---by id locator
        driver.findElement(By.id("identifierId")).sendKeys("hello");
//----by xpath
        //driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("hello");
 //----by parent to child traversing xpath
        //driver.findElement(By.xpath("//div[@class='aXBtI Wic03c']/div/input")).sendKeys("hello");
    }
}
