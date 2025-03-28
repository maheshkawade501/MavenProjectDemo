package testng.parameterizationdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisationDemo {

    //This isrun through testngparameterisation.xml (not through classs run)

    @Parameters({"courseName","cityName"})
    @Test
    public void searchOnlineClasses(String courseName,String cityName) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("D:\\Drivers\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://www.google.com/");

       // WebElement searchBox=driver.findElement(By.xpath("//textarea[@title='Search']"));

        WebElement searchBox=driver.findElement(By.xpath("//textarea[@title='Search']"));
       // searchBox.sendKeys("Selenium"+"Pune");//Test Data--We never add the test data in test script
        searchBox.sendKeys(courseName + cityName);
        Thread.sleep(1000);

        searchBox.sendKeys(Keys.ENTER);

        driver.manage().window().maximize();

    }
}
