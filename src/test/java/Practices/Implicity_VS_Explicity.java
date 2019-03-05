package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Implicity_VS_Explicity {

    //Implicity wait: timeouts for HTML codes to be uploaded properly so that the webelement can be found
    //only applies to: find webElement(s).
    // because findElement(s) is the only way make the webelement out from the browser,
    // in order to create the element YOU MUST need HTML.

    public void method1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // setUp type implicity wait:
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // tiemouts for elements to be found

    }

    public void method2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://www.facebook.com");

        // Explicity wait declaration:
        WebDriverWait wait = new WebDriverWait(driver, 20);
        //the belows saveral ways of Explicity wait
        wait.until(ExpectedConditions.titleContains("Facebook"));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("xxx"))));
        wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));






    }
}