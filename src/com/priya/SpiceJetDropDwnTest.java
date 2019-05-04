package com.priya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SpiceJetDropDwnTest
{
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "exefiles/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.spicejet.com");
    }
    @AfterMethod
    public void tearDown() {
        driver.close();
        System.out.println("Closing driver");
    }
    @Test
    @Ignore
    public void shouldSelectFromDropdown()

    {
        Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
        s.selectByValue("INR");
        s.selectByIndex(3);
        s.selectByVisibleText("USD");
    }
    @Test
    @Ignore
     public void shouldSelectFromDynamicDropdown() {
        driver.findElement(By.cssSelector(".select_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='PNQ']")).click();

        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT"));
        driver.findElement(By.xpath("(//a[@value='PNY'])-[2]")).click();
    }

    @Test
    @Ignore
    public void checkboxShouldBeCheckedAndValidate(){
        System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());
        driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
        System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).isSelected());

    }
    @Test
    public void roundTripRadioButtonShouldBeEnabled(){
        System.out.println(driver.findElement(By.xpath("//input[@value='RoundTrip']")).isEnabled());
        driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@value='RoundTrip']")).isEnabled());

    }
}
