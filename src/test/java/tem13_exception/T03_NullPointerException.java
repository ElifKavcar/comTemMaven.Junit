package tem13_exception;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class T03_NullPointerException {

    WebDriver driver;
    Faker faker;
    @Test
    public void nullPointerExceptionTest() {

        driver.get("http://localhost");

    }

    @Test
    public void test2() {
        System.out.println(faker.number());

    }
}
