package tests.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by Hmayak Atayan on  18, Feb, 2021
 */
public class GetGoogle extends BaseTest {
    @Test
    void getGooglePage()  {
        getDriver().get("https://www.google.com/");
        getDriver().findElement(By.cssSelector("input[title='Search']")).sendKeys("Java Shildt", Keys.ENTER);
//        scrollDown();
//        scrollUp();
    }


}
