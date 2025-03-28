package testng.firstexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestNGExample {

    @Test       //@Test annotation we convert the method to test mthod and run option gets
    public void testNGDemoMethod1() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("D:\\Drivers\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.close();

    }

        //we can define multiple test method and ru at a time

         //@Test annotation we convert the method to test mthod and run option gets
        @Test
        public void testNGDemoMethod2() {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setBinary("D:\\Drivers\\chrome-win64\\chrome.exe");
            System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver.exe");

            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.get("https://www.abhibus.com/");
            driver.manage().window().maximize();
            driver.close();

        }
            @Test       //@Test annotation we convert the method to test mthod and run option gets
            public void testNGDemoMethod3() {

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setBinary("D:\\Drivers\\chrome-win64\\chrome.exe");
                System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver.exe");

                WebDriver driver = new ChromeDriver(chromeOptions);
                driver.get("https://www.abhibus.com/");
                driver.manage().window().maximize();
                driver.close();
            }
    }

