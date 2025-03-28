package testng.assersion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {


    public static WebDriver driver;

    @Test
    public void softAssertExample1() {
        SoftAssert softAssert = new SoftAssert();//We need to create the object of soft assert
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("D:\\Drivers\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver(chromeOptions);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        softAssert.assertEquals(title, "Rediffmail - Free Email for Login with Secure Access", "Rediffmail title should match");
        //Although above assertsion failed still we next steps of assersion runs--this is becouse softassert


        softAssert.assertTrue(driver.findElement(By.xpath("//input[@name='login']")).isEnabled(), "Login testbox is enabled");

        WebElement rememberElement = driver.findElement(By.xpath("//input[@name='remember']"));

        rememberElement.click();

        softAssert.assertFalse(rememberElement.isSelected(), "Remember checkbox is not selected");

        softAssert.assertAll();//to print the failed steps of assertion in console(test steps are nothing but the assersions added)

        driver.close();
    }

        //Following test are for parallel execution example check testngparallelexecution.xml

        @Test
        public void softAssertExample2() {
            ChromeOptions chromeOptions = new ChromeOptions();

            chromeOptions.setBinary("C:\\Users\\Zen\\Downloads\\chrome-win64\\chrome.exe");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zen\\Downloads\\chromedriver-win64\\chromedriver.exe");

            driver = new ChromeDriver(chromeOptions);
            driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
            driver.manage().window().maximize();


            driver.close();
        }

            @Test
            public void softAssertExample3() {
                ChromeOptions chromeOptions = new ChromeOptions();

                chromeOptions.setBinary("C:\\Users\\Zen\\Downloads\\chrome-win64\\chrome.exe");
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zen\\Downloads\\chromedriver-win64\\chromedriver.exe");

                driver = new ChromeDriver(chromeOptions);
                driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
                driver.manage().window().maximize();

                driver.close();
    }
}