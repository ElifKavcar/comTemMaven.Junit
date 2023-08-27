package tem10_Actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class T02_Actions2 extends TestBase {
    @Test
    public void hoverOverTest() {
       //Amazon a gidelim https://www.amazon.com/
       //Sag ust bolumde bulunan "Account&Lists" menusune git
       //"Account" secenegine tıkla
       //Acilan sayfanin Title in "Your Accounté icerdigini dogrula


                //Amazon a gidelim https://www.amazon.com/
        driver.get("https://www.amazon.com/");

                //Sag ust bolumde bulunan "Account&Lists" menusune git
        /*
        MANUEL:
        Amazon sayfasina git
        Account&List e uzerinde bekle  --mouse over--  --hover over--
        Acilan pencerede Account Linkine tikla
        Acilan sayfanin title inin Your Account oldugunu dogrula
         */
        Actions actions = new Actions(driver);

        WebElement accountList = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
        waitFor(3);
        actions.moveToElement(accountList).perform();
        waitFor(3);

        //"Account" secenegine tıkla
        driver.findElement(By.linkText("Account")).click();

        //Acilan sayfanin Title in "Your Account" icerdigini dogrula
        Assert.assertTrue(driver.getTitle().contains("Your Account"));

    }
}
