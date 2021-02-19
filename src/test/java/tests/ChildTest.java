package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Hmayak Atayan on  14, Feb, 2021
 */
public class ChildTest extends BaseTest {

    @Test
    void testik() throws InterruptedException {
        getDriver().get("https://www.google.com/");
        Thread.sleep(1000);
        Assert.assertEquals(getDriver().getTitle(), "gulugulu");

    }
}
