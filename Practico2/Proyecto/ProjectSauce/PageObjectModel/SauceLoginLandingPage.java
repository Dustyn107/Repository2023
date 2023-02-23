package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLoginLandingPage {

    public WebDriver driver;

    public SauceLoginLandingPage(WebDriver aDriver){ //un contructor
        driver = aDriver;
    }

    public void LoginSauce(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();

    }

    public void locked_out_user(){
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
    }

    public void PasswordIncorrect(){
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
    }
}
