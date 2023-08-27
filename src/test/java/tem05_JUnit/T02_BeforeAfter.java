package tem05_JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class T02_BeforeAfter {
    @Before
    public void setup(){
        System.out.println("Her test metodundan once calisir.");

    }
    @After
    public void teardown(){
        System.out.println("Her test metodundan sonra calisir.");
    }
    @Test
    public void test01(){
        System.out.println("İlk test");
    }
    @Test
    public void test02(){
    System.out.println("İkinci test");
}
}
