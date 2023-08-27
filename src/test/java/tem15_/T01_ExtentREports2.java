package tem15_;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import utilities.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class T01_ExtentREports2 extends TestBase {

    //HATIRLAMAMIZ GEREKEN 3 CLASS
    protected static ExtentReports extentReports;
    protected static ExtentHtmlReporter extentHtmlReporter;
    protected static ExtentTest extentTest;


    @BeforeClass
    public static void extentReportsSetUp() {

        //  REPORT PATH
        String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir") + "/test-output/reports/" + currentTime + "html.report.html";

        //creating HTML report in the path
        extentHtmlReporter = new ExtentHtmlReporter(path);

        //creating extent reports object for generating the Entire reports with configuration
        extentReports = new ExtentReports();

        //**********************RAPORU CUSTOMIZE EDEBILIRIZ***************************

        extentReports.setSystemInfo("Test Environment", "Regression");
        extentReports.setSystemInfo("Application", "Techpro Education");
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.setSystemInfo("QA", "Elif");

        //*****************************************EXTRA RAPOR ISMI VE DOCUMAN ISMI EKLEYEBILIRIZ*********************************************
        extentHtmlReporter.config().setDocumentTitle("Techpro Extent Reports");
        extentHtmlReporter.config().setReportName("Regression Test Sonucu");

        //*****************************************RAPOR AYARLARI BITTI**************************************

        //   Raporu projeme ekliyorum
        extentReports.attachReporter(extentHtmlReporter);

        //   Extent test objesini olustur
        extentTest = extentReports.createTest("Extent report login Test", "Smoke Test Raporu");
    }

    @Test
    public void extentReportsTest() {
        extentTest.pass("PASS");
        extentTest.info("BILGILENDIRME NOTU");
        extentTest.fail("FAİLED");
        extentTest.warning("UYARI MESAJI");
        extentTest.skip("ATLAMA MESAJI");
        extentTest.fatal("COKUS HATASI");
    }

    @AfterClass
    public static void extentReportsTearDown()  {
        extentReports.flush();

    }
}