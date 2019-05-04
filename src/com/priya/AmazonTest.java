package com.priya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonTest {

    WebDriver driver;
    WebDriverWait wait;


    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "exefiles/chromedriver.exe");
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait=new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.amazon.co.in");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        System.out.println("Closing driver");
    }

    /*@Test
    public void hoverOnShopByCategory()
    {
        Actions action=new Actions(driver);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        action.moveToElement(driver.findElement(By.className("nav-line-2"))).build().perform();
        //Assert.assertEquals(driver.);
    }*/
    /*@Test
    public void signIn(){
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[2]/div/a[1]/span[1]")))
                .click().build().perform();
        driver.findElement(By.id("ap_email")).sendKeys("sinha.abhinav1991@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Password123@");
        driver.findElement(By.id("signInSubmit")).click();

    }
*/
    @Test
    public void hoverOnShopByCategory() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-shopall']"))).perform();
        WebElement webElement=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[2]/span[6]/span"))));
        //Assert.assertEquals(webElement.getText(),"Mobiles, Computers");
        Assert.assertTrue(webElement.getText().equals("Mobiles, Computers"));

        action.moveToElement(webElement).perform();
        WebElement all_mobile_phones = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("All Mobile Phones"))));
        System.out.println(all_mobile_phones.getText());
        Assert.assertEquals(all_mobile_phones.getText(), "All Mobile Phones");
        action.click(all_mobile_phones).perform();


    }

    }







