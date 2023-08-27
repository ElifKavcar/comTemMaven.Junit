package tem06_Dropdown;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class Homework extends TestBase {
/*
    @Test
    public void test01() {

        //https://the-internet.herokuapp.com/dropdown adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dropdown");


        //.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        WebElement option1 = driver.findElement(By.xpath("//*[@id='dropdown']"));
        Select select = new Select(option1);
        select.selectByIndex(1);
        waitFor(5);
        //.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın

        select.selectByValue("2");

        //.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        select.selectByVisibleText("Option 1");

        //.Tüm dropdown değerleri(value) yazdırın
        List<WebElement>  options = driver.findElements(By.xpath("//*[@id='dropdown']"));
        for (WebElement each: options) {
            System.out.println(each.getText());*/

            @Test
            public void test01() {
                driver.get("https://the-internet.herokuapp.com/dropdown");
                WebElement option=driver.findElement(By.xpath("//select"));
                Select optionsecim=new Select(option);
                optionsecim.selectByIndex(1);
                WebElement option1=optionsecim.getFirstSelectedOption();
                System.out.println(option1.getText());


                optionsecim.selectByValue("2");
                WebElement option2=optionsecim.getFirstSelectedOption();
                System.out.println(option2.getText());

                optionsecim.selectByVisibleText("Option 1");
                WebElement textOption1=optionsecim.getFirstSelectedOption();
                System.out.println(textOption1.getText());

                optionsecim.getOptions().forEach(t-> System.out.println(t.getText()));


                int ogeSayisi =optionsecim.getOptions().size();
                boolean sonuc= ogeSayisi==4;
                System.out.println(sonuc);
                //.Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True , degilse
                //False yazdırın.

            }

        }














