package tests.pom;

import org.testng.annotations.Test;
import page.SimpleFormDemoPage;
import tests.BaseTest;

/**
 * Created by Hmayak Atayan on  21, Feb, 2021
 */
public class SimpleTest extends BaseTest {

    @Test
    public void getSimpleFormDemoPage() throws InterruptedException {
        SimpleFormDemoPage simpleFormDemoPage = new SimpleFormDemoPage(getDriver(), "https://www.seleniumeasy.com");
        simpleFormDemoPage.get();
        simpleFormDemoPage.setMessageInput("barev es text em ");
    }
}
