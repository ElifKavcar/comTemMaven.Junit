package practise;

import org.junit.Test;
import utilities.TestBase;

public class P15_BasicAut extends TestBase {


    @Test
    public void test01() {
        //https://httpbin.org/basic-auth/foo/bar adresine gidiniz
        driver.get("https://httpbin.org/basic-auth/foo/bar");
        waitFor(5);
        //Username : foo
        //Password : bar

        //Yukarıdaki verileri kullanarak güvenliği geçin
        driver.get("https://foo:bar@httpbin.org/basic-auth/foo/bar");








    }
}
