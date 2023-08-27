package tem06_Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class T01_Dropdown {
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void selectByIndexTest() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

        Select yearDropdown = new Select(year);

        //Select objesi kullanarak 3 farkli sekilde secim yapabilirim.

        yearDropdown.selectByIndex(23);//Secenek sırası 0 dan baslar.

        //selectByValue
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select monthDropdown = new Select(month);
        monthDropdown.selectByValue("0");

        //selectByVisibleText  en çok kullanilani ne cıkmasini istiyorsaniz onu yaziyorsunuz
        WebElement gun = driver.findElement(By.xpath("//select[@id='day']"));
        Select gunDropdown = new Select(gun);
        gunDropdown.selectByVisibleText("10");


    }

    @Test
    public void printAllTest() {

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
//Tüm eyalet isimlerini print edelim
        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateDropdown = new Select(state);
        List<WebElement> statelist = stateDropdown.getOptions();
        for (WebElement eachstate : statelist) {
            System.out.println(eachstate.getText());

            //Lambda ile yazabilirsiniz  statelist.stream().forEach(t -> System.out.println(t.getText()));

        }

    }

    @Test
    public void getSelectedOptionsTest() {

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
        //  State dropdownindaki varsayilan secili secenegin 'Select a state' oldugunu verify edelim

        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        Select stateDropdown = new Select(state);

        String varsayilanText = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals("Select a State", varsayilanText);

    }
    @After
    public void tearDown()  {
        driver.close();
    }

}