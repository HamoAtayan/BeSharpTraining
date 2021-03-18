package tests.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

/**
 * Created by Hmayak Atayan on  18, Feb, 2021
 */
public class Parameteers {

    @Parameters({"username", "password"})
    @Test
    void testik(String userName, String pass) {
        System.out.println("My username " + userName);
        System.out.println("My pass " + pass);
    }
}
