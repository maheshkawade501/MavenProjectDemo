package mavendemo;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class FirstMavenDemo {
    public static void main(String[] args) throws IOException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("D:\\Drivers\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();

        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;

        File file=(takesScreenshot).getScreenshotAs(OutputType.FILE);

        FileHandler.copy(file, new File("D:\\TestScrinshot\\abhbusfrommavenproject.png"));

       //removed the comment

        driver.close();
    }
}
