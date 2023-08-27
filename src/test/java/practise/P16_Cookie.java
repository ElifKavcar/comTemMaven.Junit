package practise;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class P16_Cookie extends TestBase {

    @Test
    public void cookieTest() {

        //Techproeducation adresine gidiniz.
        driver.get("https://www.techproeducation.com");
        waitFor(5);

        //Sayfadaki cookie lerin sayisini yazdiriniz.
        Set<Cookie> cookies =driver.manage().getCookies();
        System.out.println("cookies = " + cookies.size());

        //Sayfadaki cookie lerin isim ve degerlerini yazdiriniz
        for (Cookie c : cookies) {
            System.out.println(c.getName() + "=" + c.getValue());
        }
        //Yeni bir cookie ekleyiniz.
        Cookie myCookie = new Cookie("myCookie","123456789");
        driver.manage().addCookie(myCookie);

        //Yeni cookie eklendikten sonra cookie sayisini ve isimlerini yazdiriniz
        Set<Cookie> cookies2 = driver.manage().getCookies();
        System.out.println("Cookie lerin Sayisi = " + cookies.size());
        for (Cookie w:cookies2) {
            System.out.println( w.getName()+":"+w.getValue());
        }
        //Olusturdugunuz cookie silelim
        driver.manage().deleteCookie(myCookie);

        //Tum cookie leri silelim
        driver.manage().deleteAllCookies();
        Set<Cookie> cookies3 = driver.manage().getCookies();
        System.out.println(cookies3.size());




    }
}
