package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class orangehrmliveLandingPage {
    private WebDriver driver;


    public orangehrmliveLandingPage(WebDriver aDriver){



        driver = aDriver;
    }


    public void loginOrangehrmlive() throws InterruptedException {

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(5000);

    }
}
