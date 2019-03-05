package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.sun.jmx.snmp.ThreadContext.contains;

public class RadioButton_CheckBox_Handlings {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.etsy.com/");

        WebElement searchbox=driver.findElement(By.xpath(".//input[@id='search-query']"));
        searchbox.sendKeys("Wooden Spoon" + Keys.ENTER);
        driver.manage().window().maximize();
        // Implicity wait:
        // makes time out for HTML codes to be fully uploaded so that findElements will work properly

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement Onsale = Mylibrary.DynamicElement(driver,"a","On sale");
        Onsale.click();
        WebElement Freeshipping = Mylibrary.DynamicElement(driver, "a","Free ship");
        Freeshipping.click();

        Mylibrary.takeScreenShot(driver, "NewPicture");

//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("scroll(0,2000)");
//        Mylibrary.sleep(4);
//        js.executeScript("scroll(0,4000)");
//        Mylibrary.sleep(4);
//        js.executeScript("scroll(0,0)");

        Mylibrary.scrollPlease(driver,2000);



        //driver.close();


    }
}
