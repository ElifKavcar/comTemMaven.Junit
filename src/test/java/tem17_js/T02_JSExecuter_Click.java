package tem17_js;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class T02_JSExecuter_Click extends TestBase {

    @Test
    public void test01() {

        //    Techpro education ana sayfasina git
        driver.get("https://www.techproeducation.com");
        waitFor(3);

        //    LMS LOGIN elementine tikla
        //clickByJS metodunu TestBaseden cagirdik
        clickByJS(driver.findElement(By.linkText("LMS")));


        //    Cikan sayfayinin URL inin “https://lms.techproeducation.com/” oldugunu test et
        waitFor(3);
        Assert.assertEquals("lms.techproeducation.com/",driver.getCurrentUrl());

    }
}
