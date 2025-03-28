package testng.assersion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    public static WebDriver driver;

    @Test
    public void hardAssertExample(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("D:\\Drivers\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        String title=driver.getTitle();

        //No need to create the object of hard assert
        Assert.assertEquals(title,"Rediffmail - Free Email for Login with Secure Access","Rediffmail title should match");

        //if above hard assertion failed then other assersion below it will not be executed

        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='login']")).isEnabled(),"Login testbox is enabled");


        driver.close();
    }
}
