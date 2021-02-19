package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Hmayak Atayan on  10, Feb, 2021
 */
public class SimpleTest {
    @Test(priority = 1)
    void firstTest() {
        System.out.println("first test");
    }

    @Test()
    void secondTest() {
        System.out.println("second test");
        Assert.assertEquals(10,10,"tvery havasar chen");
    }
}
