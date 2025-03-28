package testng.parameterizationdemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {

    // This class will be run by testngdataproviderwithexcel.xml

    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun() throws IOException {
        // Retrieve the data from the Excel file
        return getExcelData("D:\\DataProviderthroughExcel\\DataProvider.xlsx", "testCase1");
    }

    public String[][] getExcelData(String fileName, String sheetName) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(fileName);  // File Access
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);    // Excel workbook
        XSSFSheet sheet = xssfWorkbook.getSheet(sheetName);               // Sheet Access

        int noOfRows = sheet.getPhysicalNumberOfRows();                   // Number of rows
        int nofCols = sheet.getRow(0).getLastCellNum();                   // Number of columns

        // Initialize data array to hold the test data
        String[][] data = new String[noOfRows - 1][nofCols];  // excluding header row

        for (int i = 1; i < noOfRows; i++) { // Start from 1 to skip the header row
            Row row = sheet.getRow(i);

            for (int j = 0; j < nofCols; j++) {
                Cell cell = row.getCell(j);
                if (cell != null) {
                    data[i - 1][j] = cell.getStringCellValue();  // Fetch the data from Excel cell
                }
            }
        }

        xssfWorkbook.close(); // Close the workbook
        fileInputStream.close(); // Close the FileInputStream

        return data;
    }

    @Test(dataProvider = "test-data")
    public void searchOnlineClasses(String courseName, String cityName) throws InterruptedException {

        // Setup ChromeDriver
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("D:\\Drivers\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://www.google.com/");

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@title='Search']"));

        searchBox.sendKeys(courseName + " " + cityName);
        Thread.sleep(1000);  // Just to make sure the query is entered before hitting ENTER
        searchBox.sendKeys(Keys.ENTER);

        driver.manage().window().maximize();  // Maximize the browser window

        // Add a wait if needed to ensure the page loads before closing (Optional)
        Thread.sleep(2000);

        driver.quit();  // Close the browser after the search
    }
}
