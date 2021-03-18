package tests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.SimpleFormDemoPage;

/**
 * Created by Hmayak Atayan on  10, Feb, 2021
 */
public class SimpleTest extends BaseTest {
    @Test(priority = 1)
    void firstTest() {
        System.out.println("first test");
    }

    @Test()
    void secondTest() {
        SimpleFormDemoPage sm = new SimpleFormDemoPage(getDriver(), "aaaa");
        System.out.println("second test");
        Assert.assertEquals(10, 10, "tvery havasar chen");
    }
}
