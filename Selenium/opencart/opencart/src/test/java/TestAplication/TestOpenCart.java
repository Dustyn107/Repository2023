package TestAplication;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestOpenCart {

    WebDriver driver;

    public String URL_OPENCART = ("https://opencart.abstracta.us/");
    public String Title_Phones = "Phones & PDAs";
    public String Title_Cameras = "Cameras";
    public String Name_Phone = "HTC Touch HD";
    public String Product_Two = "Nikon D300";
    public String Success = "HTC Touch HD";
    public String Success_2 = "Nikon D300";
    public String Success_3 = "Checkout";



    @BeforeMethod
    public void Setup() {
        System.setProperty("webdriver.chrome.driver",
                "..\\opencart\\Drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_OPENCART);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
@Description("pruebas E2E")
    @Test(description = "TC1 | pruebas E2E")
    public void Test() throws InterruptedException {

        Assert.assertEquals(driver.getCurrentUrl(), URL_OPENCART);

        Thread.sleep(3000);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.xpath("//a[normalize-space()='Phones & PDAs']")).click();
        Thread.sleep(2000);
        //jse.executeScript("window.scrollBy(0,200)");

        //producto 1
        Assert.assertEquals(driver.getTitle(), Title_Phones);// validar titulo de la pagina de celeulares
        driver.findElement(By.xpath("//img[@title='HTC Touch HD']")).click();
        Assert.assertEquals(driver.getTitle(), Name_Phone);

        Thread.sleep(3000);
        //jse.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.id("button-cart")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle(), Success);

        //producto2
        driver.findElement(By.xpath("//a[normalize-space()='Cameras']")).click();
        Assert.assertEquals(driver.getTitle(), Title_Cameras);
        driver.findElement(By.xpath("//a[normalize-space()='Nikon D300']")).click();
        Assert.assertEquals(driver.getTitle(), Product_Two);

        jse.executeScript("window.scrollBy(0,200)");
        Thread.sleep(2000);
        driver.findElement(By.id("button-cart")).click();
        Assert.assertEquals(driver.getTitle(), Success_2);

        //ver el carrito de compras con los productos

        driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")).click();
        driver.findElement(By.xpath("//strong[normalize-space()='View Cart']")).click();

        Thread.sleep(1000);
        jse.executeScript("window.scrollBy(0,400)");
        driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

        /***checkout diligenciamiento de formulario***/

        driver.findElement(By.xpath("//input[@value='guest']")).click();
        driver.findElement(By.id("button-account")).click();
        driver.findElement(By.id("input-payment-firstname")).sendKeys("Carlos");
        driver.findElement(By.id("input-payment-lastname")).sendKeys("Herrera");
        driver.findElement(By.id("input-payment-address-1")).sendKeys("San juan 23, San pedro");
        driver.findElement(By.id("input-payment-email")).sendKeys("test@test.com");
        driver.findElement(By.id("input-payment-telephone")).sendKeys("2678976");
        driver.findElement(By.id("input-payment-city")).sendKeys("Quito");
        driver.findElement(By.id("input-payment-postcode")).sendKeys("123098");

        /***seleccion de pais y ciudad***/
        WebElement contry = driver.findElement(By.id("input-payment-country"));
        Select select = new Select(contry);
        select.selectByValue("47");
        select.selectByVisibleText("Colombia");

        WebElement state = driver.findElement(By.id("input-payment-zone"));
        Select State = new Select(state);
        State.selectByValue("724");
        State.selectByVisibleText("Bogota D.C.");


        driver.findElement(By.id("button-guest")).click();

        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("test");
        driver.findElement(By.id("button-shipping-method")).click();
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.id("button-payment-method")).click();
        driver.findElement(By.id("button-confirm")).click();

        Assert.assertEquals(driver.getTitle(), Success_3);
        driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
        driver.close();

    }


}
