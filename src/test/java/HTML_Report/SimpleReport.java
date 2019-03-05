package HTML_Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SimpleReport {

    public static void main(String[] args) {

        //as soon as we create a html reporter we will need to write file location and file name,
        //Report01 file will automatically create after executing the code
        ExtentHtmlReporter HReport = new ExtentHtmlReporter("Reports/Report01.html");

        //it's the one it generated the report.
        //we are creating a report document and we are attaching the file to it
        ExtentReports myReports = new ExtentReports();//ExtentReports only reports ExtentTest
        myReports.attachReporter(HReport);

        ExtentTest myTest1 = myReports.createTest("LogIn functionality");
        myTest1.log(Status.INFO, "Using Sysout to print my name"); //Step definition
        System.out.println("Kuddus Imam");

        //those line are Step definition example
        myTest1.log(Status.FAIL,"Invalid Website");
        myTest1.log(Status.SKIP,"Previous test failed");
        myTest1.log(Status.ERROR,"There has been erros");
        myTest1.log(Status.PASS,"This test passed");

        myReports.setSystemInfo("Browser","www.yahoo.com"); //it allows us to give the information to dashboard
        myReports.setSystemInfo("UserName","tester");
        myReports.setSystemInfo("Password","admin");
        myReports.setSystemInfo("Address","Virginia");
        myReports.flush(); //WE MUST refresh my report, else it will not give html file

        ExtentTest myTest2 = myReports.createTest("Log Off Functionality");
        myTest2.log(Status.INFO,"Logging in");//Step definition
        System.out.println("logen in");
        myTest2.log(Status.INFO,"Logging out");
        System.out.println("logen out");
        myTest2.log(Status.INFO,"Quit the browser");
        System.out.println("Close the browser");

        myReports.setSystemInfo("Website for test2","www.facebook.com");
        myReports.setSystemInfo("Facebook user name","Tester");
        myReports.setSystemInfo("Facebook password","password");

        //myTest2.createNode("Can you take a look at yourself");

        myReports.flush(); //WE MUST refresh my report, else it will not give html file



    }
}
