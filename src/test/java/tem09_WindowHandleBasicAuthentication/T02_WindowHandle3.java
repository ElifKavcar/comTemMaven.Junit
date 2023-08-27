package tem09_WindowHandleBasicAuthentication;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class T02_WindowHandle3 extends TestBase {

    @Test
    public void newWindowHandleTest() {

//1.Techpro education sayfasinin titleinin "Techproeducation" metnini icerdigini test edin.
        driver.get("https://www.techproeducation.com");
        Assert.assertTrue(driver.getTitle().contains("TechPro Education"));
        String techproHandle = driver.getWindowHandle();

        //2. Yeni bir pencerede Amazon sayfasini acip titleinin "Amazon" metnini icerdigini test edin.
        waitFor(3);
        driver.switchTo().newWindow(WindowType.WINDOW);//Yeni pencere olusturur ve oraya gecis yapar.
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getTitle().contains("Amazon"));


        //3. Yeni bir pencerede Linkedin sayfasini acip titlein "Linkedin" metnini icer

        waitFor(3);
        driver.switchTo().newWindow(WindowType.WINDOW);//Yeni pencere olusturur ve oraya gecis yapar.
        driver.get("https://www.linkedin.com");
        Assert.assertTrue(driver.getTitle().contains("LinkedIn"));

        //Driver nerede : En son sayfada Linkedinde
        //Techproeducation sayfasina gitmek icin driver.switchTo().window(techProHandle);

        driver.switchTo().window(techproHandle);
        //Driver nerede : techproda
        Assert.assertTrue(driver.getTitle().contains("TechPro Education"));


    }
}
