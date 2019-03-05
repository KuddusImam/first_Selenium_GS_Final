package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class BestAmaEbay {

    public static void main(String[]args){

        //setup driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("http://www.amazon.com");
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("soccer jersey"+ Keys.ENTER);
        Mylibrary.takeScreenShot(driver,"Amazon Search");

        JavascriptExecutor newTab = (JavascriptExecutor) driver;
        newTab.executeScript("window.open()");
        Mylibrary.sleep(3);
        //driver.navigate().to("https://www.bestbuy.com");

        Collection<String > allwidows = driver.getWindowHandles();
        Iterator<String> it = allwidows.iterator(); //
        String window1 = it.next();
        String window2 = it.next();
        driver.switchTo().window(window2);
//        driver.get("https://www.bestbuy.com");
        driver.get("https://www.ebay.com");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement close = driver.findElement(By.xpath(""));
//        close.click();

//        allwidows.clear();
//        newTab.executeScript("window.open()");
//        Mylibrary.sleep(3);
//        String window3=it.next();
//        driver.switchTo().window(window3);
//        driver.navigate().to("https://www.facebook.com");







    }
}
