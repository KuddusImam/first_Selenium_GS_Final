package fileHandlings;

import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import javax.xml.transform.sax.SAXSource;
import java.io.FileInputStream;
import java.util.Properties;

public class propertiesFile_Handlings {
    public static void main(String[] args) {

        try {

            //Step one: make the file readable in java. by using FileInputStream
            FileInputStream file = new FileInputStream("info.properties");

            //Step Two: store the file in to it's java type file, by using Properties
            Properties myproFile = new Properties();
            myproFile.load(file);

            String myName = myproFile.getProperty("Name");
            System.out.println(myName);

            String expectedResult = "Kuddus";
            //Assert.assertTrue(myName.equals(expectedResult)); //assertture expects true boolean expression inside the()
            Assert.assertFalse(!myName.equals(expectedResult));
            Assert.assertFalse(false);
            Assert.assertTrue(true); //break statement

            //another verification: SoftAssert
            SoftAssert ast = new SoftAssert(); //continue statement
            ast.assertTrue(false);
            System.out.println("Test Finished");

        }catch (Exception e){

        }
    }




}
