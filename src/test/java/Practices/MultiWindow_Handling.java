package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MultiWindow_Handling {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.amazon.com");

        //open New Tab
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.open()");
        Mylibrary.sleep(5);
        //driver.navigate().to("https://www.facebook.com");

        //Switch between tabs
        Collection<String > allwidows = driver.getWindowHandles();
        Iterator<String> it = allwidows.iterator();
        String window1 = it.next();
        String window2 = it.next();
        driver.switchTo().window(window2);
        driver.get("https://www.facebook.com");

        driver.switchTo().window(window1);
        Mylibrary.sleep(3);
        driver.switchTo().window(window2);

    }

    /*
    Bestbuy, amazon, ebay
    1. search your favorie item on all of them.
    2. take screen shot. (do not use the custom method in MyLibrary)
     */



}
