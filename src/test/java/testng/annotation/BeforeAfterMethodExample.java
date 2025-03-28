package testng.annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class BeforeAfterMethodExample {


    //Before method execute first then test1 method then after method ,like for rest of test method each times.
    //Before Class run before all the test only once and After Class run after all the test in the last onl once



    public static WebDriver driver;

    @BeforeClass
    public void beforeClassMethod(){

        System.out.println("before Class Method");
    }


    @BeforeMethod
    public  void beforeMethodExample(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("D:\\Drivers\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver.exe");
         driver = new ChromeDriver(chromeOptions);
        System.out.println("Before Method");
    }

    @Test
    public void testNGDemoMethod1() {
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        System.out.println("Test1 Method");

    }


    @Test
    public void testNGDemoMethod2() {
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        System.out.println("Test2 Method");

    }
    @Test
    public void testNGDemoMethod3() {
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        System.out.println("Test3 Method");
           }

    @AfterMethod
    public void afterTestMethod(){
        driver.close();
        System.out.println("After test Method");
    }

    @AfterClass
    public void afterClassMethod(){

        System.out.println("After Class Method");
    }
}
