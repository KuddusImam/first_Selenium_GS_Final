package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Mylibrary {
    public static Actions act;

    public static void sleep(double a) {
        try {
            Thread.sleep((int) (a * 1000));
        } catch (InterruptedException e) {

        }
    }

//    public static void ClickDynamic(WebDriver driver, String condition){
//        List<WebElement> allclickable=driver.findElements(By.tagName("a"));
//        for(WebElement each:allclickable) {
//             if (each.getText().contains(condition)) {
//                each.click();
//                Mylibrary.sleep(3);
//                break;
//            }
//        }
//    }

    public static WebElement DynamicElement(WebDriver driver, String tagname, String condition) { //
        List<WebElement> allclickable = driver.findElements(By.tagName(tagname));
        for (WebElement each : allclickable) {
            if (each.getText().toLowerCase().contains(condition.toLowerCase())) {
                return each;
            }
        }
        return null;
    }

    public static void takeScreenShot(WebDriver driver, String saveAs){
        TakesScreenshot screenShot = (TakesScreenshot)driver;
        File myfile = screenShot.getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(myfile, new File("src/test/captures/"+saveAs+".jpg"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void scrollPlease(WebDriver driver, int y){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scroll(0,"+y+")");
    }

    public static void waitTitle(WebDriverWait wait, String title){
        wait.until(ExpectedConditions.titleContains(title));
    }



}
