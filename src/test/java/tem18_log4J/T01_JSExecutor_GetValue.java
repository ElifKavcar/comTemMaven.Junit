package tem18_log4J;

import org.junit.Test;
import utilities.TestBase;

public class T01_JSExecutor_GetValue extends TestBase {

    @Test
    public void getValueTest() {

//  1)getValueTest metotu olustur
//	2)https://www.priceline.com/ a git
//  3)Tarih kısmındaki Yazili metinleri al ve yazdır


//  1)getValueTest metotu olustur
//	2)https://www.priceline.com/ a git
        driver.get("https://www.priceline.com/");

//  3)Tarih kısmındaki Yazili metinleri al ve yazdır
        getValueByJS("hotelDates");



    }
}
