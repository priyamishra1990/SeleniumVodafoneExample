package com.priya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SbiAlertsHandling {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "exefiles/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
    }
    /*@AfterMethod
    public void tearDown() {
        driver.close();
        System.out.println("Closing driver");
    }*/

    @Test
    public void shouldClickOnConfirmationAlertAndHandleJavaScriptPopUp(){
        driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
         String text=driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().accept();
    }
}
