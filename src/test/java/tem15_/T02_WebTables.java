package tem15_;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class T02_WebTables extends TestBase {

private static Logger logger = LogManager.getLogger(T02_WebTables.class.getName());
    @Test
    public void table1Print() {

      //  https://the-internet.herokuapp.com/tables
        driver.get("https://the-internet.herokuapp.com/tables");

      //  Create a class: WebTables
      //  Task 1 : Table1’i print edin
        String table1 = driver.findElement(By.xpath("//table[@id='table1']")).getText();
       // System.out.println("Table1 VERILERI");
        logger.info("TABLE 1 VERILERI");
        System.out.println(table1);

        List<WebElement> tumVeriler = driver.findElements(By.xpath("//table[@id='table1']//td"));
        //     tumVeriler.forEach(t -> System.out.println(t.getText()));   -> LAMBDA
        for(WebElement veri : tumVeriler){
            System.out.println(veri.getText());
        }
    }
    @Test
    public void row3Print(){
        //  Task 2 : 3. Row’ datalarını print edin
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> row3Elements = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[3]//td"));
        row3Elements.forEach(veri-> System.out.println(veri.getText()));
    }

    @Test
    public void sonSatirVerileri() {
        //  Task 3 : Son row daki dataları print edin
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> sonSutun = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr[last()]//td"));
        sonSutun.forEach(veri-> System.out.println(veri.getText()));
    }

    @Test
    public void sutun5Test() {
        //  Task 4 : 5. Column datalarini print edin
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> sonSutun = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[5]"));
        sonSutun.forEach(veri -> System.out.println(veri.getText()));
    }


    public void printData(int satir,int sutun) {
        //  Task 5 : Iki parametreli bir Java metot oluşturalım: printData
        //  Parameter 1 = row numarasi
        //  Parameter 2 = column numarasi
        //  printData(2,3); => 2nd satir, 3rd sutun daki datayı print etsin
        driver.get("https://the-internet.herokuapp.com/tables");
        String myXpath = "//table[@id='table1']//tbody//tr["+satir+"]//td["+sutun+"]";
        System.out.println(driver.findElement(By.xpath(myXpath)).getText());
        }
        @Test
        public void printDataTest(){
        printData(2,3);

    }
    }

