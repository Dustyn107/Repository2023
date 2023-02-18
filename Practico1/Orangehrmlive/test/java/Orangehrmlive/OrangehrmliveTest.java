package Orangehrmlive;


import PageObjects.orangehrmliveLandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OrangehrmliveTest {

    private WebDriver driver;
    public  String Title_Page = "Login";
    private orangehrmliveLandingPage orangehrmliveLandingPage;
    public String URL_OPENSOURCE = ("https://opensource-demo.orangehrmlive.com/");

    @BeforeMethod
    public void Setup() {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Dustyn\\Documents\\Automatizacion\\INTELLIJ\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_OPENSOURCE);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        orangehrmliveLandingPage = new orangehrmliveLandingPage(driver);

    }

    @Test(description = "TC1 | Login text validation")
    public void LoginHomeText() {
        Assert.assertEquals(driver.getTitle(), Title_Page);

    }

    @Test (description = "TC2 | Verify Url Login Home")

    public void VerifyUrlOrangeHRM(){
        Assert.assertEquals(driver.getCurrentUrl(),URL_OPENSOURCE);
    }


    @Test(description = "TC3 | Login de ingreso")

    public void Orangehrmlivetest() throws InterruptedException {

        orangehrmliveLandingPage.loginOrangehrmlive();
        Assert.assertEquals("Dashboard", "Dashboard");

    }


    @AfterTest
    public void closePage() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
