package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.tools.ant.taskdefs.Sync;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class PopUpWindow_Handlings {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.bestbuy.com");
        Mylibrary.sleep(3);

        Actions act = new Actions(driver);
        act.click().perform();
        //new Actions(driver).click().perform(); //we can use Actions without assign reference


    }
}
