package tem06_Dropdown;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class E01_Dropdown extends TestBase {

    @Test
    public void dropdownTest() {
driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

//             Yil, ay, gun dropdown menulari locate ediniz
        WebElement yil = driver.findElement(By.xpath("//select[2]"));
        WebElement ay = driver.findElement(By.xpath("//select[3]"));
        WebElement gun = driver.findElement(By.xpath("//select[4]"));


//            Select objesi olustur.
        Select selectYil = new Select(yil);
        Select selectAy = new Select(ay);
        Select selectGun = new Select(gun);

//           Select objesi kullanarak 3 farkli sekilde secim yapiniz
        selectYil.selectByIndex(5);
        selectAy.selectByVisibleText("May");
        selectGun.selectByValue("6");

//            Tum eyaletleri yazdiralim
        WebElement eyaletler = driver.findElement(By.cssSelector("select#state"));
        Select selectEyaletler = new Select(eyaletler);
        List<WebElement> eyaletList = selectEyaletler.getOptions();
        //eyaletList.forEach(t-> System.out.println(t.getText()));
        for (WebElement each:eyaletList) {
            System.out.println(each.getText());
        }


    }
// State dropdown undaki varsayilan secili secenegin "Select a State" oldugunu verify edelim
    @Test
    public void test03() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        WebElement eyaletILk = driver.findElement(By.cssSelector("select#state"));
        Select select = new Select(eyaletILk);
        System.out.println(select.getFirstSelectedOption().getText());
        Assert.assertEquals("Select a State",select.getFirstSelectedOption().getText());

    }
}
