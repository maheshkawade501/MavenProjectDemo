package testng.parameterizationdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotationExample {
//This is run the testngdataprovider.xml (not through class)
    //if we are using the Dataprovder then we need to create the function

    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun() {       //need to add the 2D object  3rows then browser open 3 times

        return new Object[][]{                  //Return the 2D object--as two fields value we are putting(coursename and Cityname)
                {"Selenium", "Pune"},
                {"Java", "Mumbai"},
                {"Cypress", "Banglore"}         //above used comma but here no comma
        };                                      //semi coloun to close the return object
    }

    @Test(dataProvider = "test-data")
    public void searchOnlineClasses(String courseName, String cityName) throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("D:\\Drivers\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://www.google.com/");

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@title='Search']"));

        searchBox.sendKeys(courseName + " " + cityName);
        Thread.sleep(1000);

        searchBox.sendKeys(Keys.ENTER);

        driver.manage().window().maximize();

    }
}
