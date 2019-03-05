package fileHandlings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.FileInputStream;

public class ExcelPractice {

    public static void main(String[] args) throws Exception {

        String excelLocation = "src/test/java/fileHandlings/ExcelPractice.xlsx";

        FileInputStream excelFile = new FileInputStream(excelLocation);
        XSSFWorkbook ExcelPractice = new XSSFWorkbook(excelFile); //in java XSSFWorkbook is the Excel version

        //in order to access to the cell values, first we must indicate the sheet name.
        XSSFSheet firstSheet = ExcelPractice.getSheet("Sheet1");

        //in order to extract Excel datas:
        String data1 = firstSheet.getRow(0).getCell(1).getStringCellValue();

        String ExpectedResult = "https://www.youtube.com/";
        Assert.assertEquals(data1,ExpectedResult);
        System.out.println("Test Completed");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(data1);
        //Assert.assertTrue(driver.getTitle().contains("YouTube"));

        //verify by URL:
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.equals(data1));
        System.out.println("Final Test");

    }
}
