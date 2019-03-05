package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Review_Action {

    WebDriver driver;
    //all the external execution
    Actions act = new Actions(driver);

    public void example(){
        WebElement xx = null;
        act.moveToElement(xx); //any actions without perform command, won't be excuted.
        act.moveToElement(xx).perform(); //you must put the perform in order to execute.

        act.moveToElement(xx).click().sendKeys("xxx").sendKeys(Keys.ENTER).perform();

        act.pause(3000).perform(); //.pause method: sleeps the webbrowser
                                    //Thread.sleep();--> sleeps the java.
    }

    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));

        search.sendKeys("asdkjkjf");
        Mylibrary.sleep(3);
        search.sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);




    }


}
