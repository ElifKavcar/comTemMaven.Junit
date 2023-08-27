package tem10_Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class T04_Actions4 extends TestBase {

    @Test
    public void dragAndDropTest() {

                //Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

                //And user moves the target element(Drag me to my target) in to destination(Drop here)
        driver.switchTo().frame(0);
        WebElement kaynak = driver.findElement(By.id("draggable"));
        WebElement hedef = driver.findElement(By.id("droppable"));

                //dragAndDrop() surukleme işlemi gerçekleştirir. bir kaynağı alıp hedefe götürür.
        Actions actions = new Actions(driver);
        actions.dragAndDrop(kaynak,hedef).perform();
        waitFor(5);
    }

    @Test
    public void clickAndHoldTest() {
                //Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

                //And user moves the target element(Drag me to my target) in to destination(Drop here)
        driver.switchTo().frame(0);
        WebElement kaynak = driver.findElement(By.id("draggable"));
        WebElement hedef = driver.findElement(By.id("droppable"));

                //dragAndDrop() surukleme işlemi gerçekleştirir. bir kaynağı alıp hedefe götürür.
        Actions actions = new Actions(driver);
        actions.
        clickAndHold(kaynak). //kaynagi tut
        moveToElement(hedef).  //hedefe koy
                release().      //kaynagi bırak
                build().        //onceki methodlarin iliskisini kur/guclendir. KULLANILMASI TERCİH EDİLİR.
                perform();       //calistir
        waitFor(5);
    }

    @Test
    public void moveByOffTest() {

        //Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        //And user moves the target element(Drag me to my target) in to destination(Drop here)
        driver.switchTo().frame(0);
        WebElement kaynak = driver.findElement(By.id("draggable"));

        //dragAndDrop() surukleme işlemi gerçekleştirir. bir kaynağı alıp hedefe götürür.
        Actions actions = new Actions(driver);
        actions.clickAndHold(kaynak).
                moveByOffset(430,30).
                build().
                perform();



    }
}
