package tem07_testbaseAlert;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class T01_TestBaseDemo extends TestBase {
    /*
    UTILITIES:
    -Tekrar tekrar kullanacaginiz classlar ve methodlarin adidir.
        -TestBase -> Bugün
        -Driver -> Sonra
        -ExcelUtil -> Sonra
        -Configuration -> Sonra
- Utilities paketinde Test Case ler yailmaz.
- Sadece tekrar kullanilabilecek destek siniflari(support class) olusturulur.
- Bu support class lar test case lerin yazilmasini hizlandirir.
- Support class lar @Test icermeyen
     */
@Test
    public void test1(){
   //techproeducation ana sayfasina git ve
    // title in Bootcamps kelimesini icerdigini test edelim

    driver.get("https://www.techproeducation.com");
    String pageTitle = driver.getTitle();
    Assert.assertTrue(pageTitle.contains("Bootcamps"));





}







}
