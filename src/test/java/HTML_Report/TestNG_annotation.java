package HTML_Report;

import org.testng.annotations.*;

public class TestNG_annotation {

    @BeforeMethod
    public void X1(){
        System.out.println("Before Methods comes before every single test");
    }

    @BeforeClass
    public void X2(){
        System.out.println("Before Class comes third. Only executes once");
        //only looks at one class and executes once only
    }

    @BeforeTest
    public void X3(){
        System.out.println("Before Test comes second. Only executes once");
        //it includes multiple classes to execute the test and which are any classes it extends TestBase
        //creates only one html report
    }

    @BeforeSuite
    public void X4(){
        System.out.println("Before Suite comes first. Only executes once");
        //multiple before test(different packages(classes inside package) which extends TestBase)
    }

    @Test
    public void DD(){
        System.out.println("Test 1");
    }

    @Test
    public void ZZ(){
        System.out.println("Test 2");
    }

    @AfterMethod
    public void y1(){
        System.out.println("After Methods comes after every single test");
    }

    @AfterClass
    public void y2(){
        System.out.println("After Class comes third. Only executes once");
    }

    @AfterTest
    public void y3(){
        System.out.println("After Test comes second. Only executes once");
    }

    @AfterSuite
    public void y4(){
        System.out.println("After Suite comes first. Only executes once");
    }


}
