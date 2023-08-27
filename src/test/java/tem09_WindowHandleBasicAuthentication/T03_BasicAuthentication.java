package tem09_WindowHandleBasicAuthentication;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class T03_BasicAuthentication extends TestBase {
    @Test
    public void test01() {
        //https://the-internet.herokuapp.com/basic_auth sayfasina gidin.


        //asagidaki yontem ve test datalarini kullanarak authentication i yapin.


        //URL  : https://username:password@URL
        //Username : admin
        //Password : admin

    //Authentıcatıon url ınız : https://admin:admin@https://the-internet.herokuapp.com/basic_auth
    //                          https://the-internet.herokuapp.com/basic_auth sayfasina gidin.

    //URL DE ADRES ONCESİNE USERNAME VE PASSWORD GOMULUR.

        //driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        waitFor(3);

//Basarili sekilde sayfaya gidin ve "Congratulations'" yazisini dogrulayin.
        String actualText = driver.findElement(By.xpath("//p")).getText();
        Assert.assertTrue(actualText.contains("Congratulations"));

    }
}
