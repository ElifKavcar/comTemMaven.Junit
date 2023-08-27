package practise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class P08_DropDown extends TestBase {

    @Test
    public void test01(){

        //https://amazon.com adresine gidelim
        //Dropdown menuden baby secelim
        //arama bolumunden milk aratalim

        driver.get("https://amazon.com");


        WebElement ddm = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select option = new Select(ddm);
        option.selectByVisibleText("Baby");

        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Milk", Keys.ENTER);

//Baska ve daha kisa cözümü  TEK SATIRDA SELECT OBJESİNİ KULLANMADAN
        /*driver.findElement(By.xpath("//*[@id='searchDropdownBox']")).sendKeys("Baby", Keys.Tab,"Milk",Keys.ENTER);
         */
//Dropdown menuyu yazdiralim.
       // WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));

       //for (WebElement w:option.getOptions()) {
       //    System.out.println(w.getText());
        //}
              {

        }







    }






}
