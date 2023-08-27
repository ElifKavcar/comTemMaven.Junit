package tem09_WindowHandleBasicAuthentication;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class T04_Cookies extends TestBase {

    @Test
    public void test01() {

        //Methos : handleCookies

               //Amazona git
        driver.get("https://www.amazon.com");

               //Toplam cookie sayisini bul
        Set<Cookie> cookies = driver.manage().getCookies();//toplam cerez sayisi
        int cookieSayisi = cookies.size();
        System.out.println("Sayfada " + cookieSayisi + " adet cookie vardir.");
        
                //Tum cookieleri yazdir.
        for (Cookie eachcookie : cookies) {
            System.out.println("COOKİE : " + eachcookie);
            System.out.println("COOKİE İSİMLERİ :" +eachcookie.getName());
        }
                //Bir Cookie yi ismiyle bul
        System.out.println("COOKİEYİ İSMİYLE CAGİRİYORUM : " +driver.manage().getCookieNamed("sp-cdn"));

        //Yeni bir Cookie ekle
        Cookie favoriCookie = new Cookie("cikolatam","antep_fistikli_cikolata");
        driver.manage().addCookie(favoriCookie);
        System.out.println("YENİ COOKİEM :" +driver.manage().getCookies().size());
        
        //Bir cookie yi ismiyle sil
        driver.manage().deleteCookieNamed("session-id");
        waitFor(5);


        //Tün cookie leri sil
        driver.manage().deleteAllCookies();
        waitFor(5);
        System.out.println("TUM COOKİELERİ SİLDİM : "+ driver.manage().getCookies().size());











    }
}
