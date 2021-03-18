package tests.tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

/**
 * Created by Hmayak Atayan on  10, Feb, 2021
 */
public class BeforeAfter {

    @Test
    public void testik() {
        System.out.println("I'm in testik");
    }

    @BeforeTest
    public void testik2() {
        System.out.println("I'm in before test");
    }

    @BeforeMethod
    public void testik3() {
        System.out.println("I'm in beforeMethod");
    }

    @BeforeClass
    public void testik4() {
        System.out.println("I'm in before class");
    }

    @Test
    public void testik5() {
        System.out.println("I'm in testik 5");
    }

    @Test
    public void testik6() {
        System.out.println("I'm in testik 6");
    }

    @AfterMethod
    public void esiminch(){
        System.out.println("i'm after method ");
    }


}
