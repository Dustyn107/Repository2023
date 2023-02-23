package TestSauce;

import PageObjectModel.SauceLoginLandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SauceTest {

    private WebDriver driver;
    private SauceLoginLandingPage sauceLoginLandingPage;
    public String URL_SAUCE = ("https://www.saucedemo.com/");
    public String Title_Inventority = "Products";


    @BeforeMethod
    public void Setup() {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Automatizacion\\Automatizacion Selenium\\saucedemo\\ProyectoSauce\\Drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_SAUCE);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        sauceLoginLandingPage = new SauceLoginLandingPage(driver); // inicializa la pagina

    }

    @Test(description = "TC1 | Validacion de pagina de login")
    public void Test() {

        Assert.assertEquals(driver.getCurrentUrl(), URL_SAUCE);
    }

    @Test(description = "TC2 | logeo exitos")
    public void LoginExitoso() {
        sauceLoginLandingPage.LoginSauce();

        //WebElement element = driver.findElement(By.xpath("//*[contains(text(),'product')]"));
        /** es este test utilizo el assert para que me indique si el texto Product es falso**/

        WebElement element = driver.findElement(By.xpath("//div[@class ='header_secondary_container']"));
        String expectedText = "Products";
        String actualText = element.getText();
        Assert.assertFalse(actualText.contains(expectedText));

/*** validacion de la URL actual****/
        String expectaiveUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectaiveUrl));

    }

    @Test(description = "TC3 |locked_out_user")
    public void locked_out() {

        sauceLoginLandingPage.locked_out_user();
/** se valida que el mensaje de testo del error sea verdadero **/

        WebElement Msg_error = driver.findElement(By.xpath("//*[contains(text(),'Epic sadface: Sorry, this user has been locked out.')]"));
        String ExpectedText = "Epic sadface: Sorry, this user has been locked out.";
        String actualError = Msg_error.getText();
        Assert.assertTrue(actualError.contains(ExpectedText));
    }

    @Test(description = "TC4 | PasswordIncorrect")
    /** se valida que el mensaje de testo del error sea verdadero **/
    public void IncorrectPassword() {
        sauceLoginLandingPage.PasswordIncorrect();
        WebElement Msg_error = driver.findElement(By.xpath("//*[contains(text(),'Epic sadface: Username and password do not match any user in this service')]"));
        String ExpectedText = "Epic sadface: Username and password do not match any user in this service";
        String actualError = Msg_error.getText();
        Assert.assertTrue(actualError.contains(ExpectedText));

    }

    @AfterTest
    public void closePage() throws InterruptedException {
        Thread.sleep(4000);
        driver.close();
    }
}