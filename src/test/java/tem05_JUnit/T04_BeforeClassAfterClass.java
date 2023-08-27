package tem05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T04_BeforeClassAfterClass {
    @BeforeClass
    public static void setup(){
        System.out.println("Bütün testlerden once calisti.");
    }

@AfterClass
    public static void tearDown(){
    System.out.println("Butun testlerden sonra calisti.");
}

@Before
public void setup01(){
    System.out.println("Her testten önce calisir.");
}
@After
public void tearDown01(){
    System.out.println("Her testten sonra calisir.");
}
@Test
    public void test01(){
    System.out.println("İlk test");

    }
@Test
    public void test02(){
    System.out.println("İkinci test");
}
@Test
@Ignore
    public void test03(){
    System.out.println("Ücüncü test");
}

}
