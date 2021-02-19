package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by Hmayak Atayan on  18, Feb, 2021
 */
public class GetGoogle extends BaseTest {
    @Test
    void getGooglePage() throws InterruptedException {
        getDriver().get("https://www.google.com/");
        Thread.sleep(2000);
        getDriver().findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).sendKeys("Java Shildt", Keys.ENTER);
        Thread.sleep(3000);
        scrollDown();
        Thread.sleep(3000);
        scrollUp();
        Thread.sleep(3000);
    }

    void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, Math.max(document.documentElement.scrollHeight));");
    }

    void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollTo(0, -Math.max(document.documentElement.scrollHeight));");
    }
}