package com.priya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VodafoneTest {

    WebDriver webDriver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "exefiles/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("http://www.vodafone.in");
    }

    @AfterMethod
    public void tearDown() {
        webDriver.close();
        System.out.println("Closing driver");
    }

    @Test
    @Ignore
    public void shouldHaveExpectedTitle() {
        Assert.assertEquals(webDriver.getTitle(), "Vodafone India - Prepaid | Postpaid | Callertunes | " +
                "Buy New Connection | Mobile Services");
    }

    @Test
    public void shouldNotAllowNonVodafoneNumber() {
        feedPhoneNumberAndWait(webDriver, "9234567899");

        defaultWait(webDriver).until(ExpectedConditions.visibilityOf(webDriver.findElement(By.xpath("//*[@id=\"vfid_body\"]/div/div[4]/div[9]/p"))));

        Assert.assertEquals(webDriver.findElement(By.xpath("//*[@id=\"vfid_body\"]/div/div[4]/div[9]/p")).getText(),
                "Seems like you have entered a non Vodafone number. Looking for a new " +
                        "" +
                        "connection ? Join Vodafone");
    }

    @Test
    public void shouldAllowVodafoneNumber() {
        feedPhoneNumberAndWait(webDriver, "9654944060");
        defaultWait(webDriver).until(ExpectedConditions.visibilityOf(webDriver.findElement(By.className("mobile_class"))));
        Assert.assertTrue(webDriver.findElement(By.className("mobile_class")).isDisplayed());

    }

    @Test
    public void shouldNotAllowNegativeBillAmount() {
        feedPhoneNumberAndWait(webDriver, "9654944060");
        webDriver.findElement(By.id("bill_amt")).sendKeys("-");
        //defaultWait();
        Assert.assertFalse(webDriver.findElement(By.id("pay")).isEnabled());

    }

    @Test
    public void shouldRouteToPaymentGatewayForCorrectBillAmount() {
        feedPhoneNumberAndWait(webDriver, "9654944060");
        webDriver.findElement(By.id("bill_amt")).sendKeys("10");
        //defaultWait();
        webDriver.findElement(By.id("pay")).click();
        //defaultWait();
        Assert.assertEquals(webDriver.getTitle(), "Vodafone India - Payment Gateway");

    }

    private static FluentWait<WebDriver> defaultWait(WebDriver webDriver) {
        return new FluentWait<>(webDriver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(200, TimeUnit.MILLISECONDS)
                .ignoring(Exception.class);
    }


    private static void feedPhoneNumberAndWait(WebDriver webDriver, String phoneNumber) {
        webDriver.findElement(By.id("msisdn")).sendKeys(phoneNumber);
        webDriver.findElement(By.id("nxt")).click();
        //defaultWait();
    }
}
