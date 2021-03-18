package tests.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Hmayak Atayan on  14, Feb, 2021
 */
public class DataProviderTest {

    @Test(dataProvider = "getData")
    void testik(String userNAME, String password){
        System.out.println(userNAME);
        System.out.println(password);

    }

    @Test(dataProvider = "getData2")
    private void testDataProvider(String numbers){
        System.out.println(numbers);
    }

    @DataProvider(name = "getData")
    private Object[] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "userName1";
        data[0][1] = "pvd";

        data[1][0] = "userName2";
        data[1][1] = "pvd2";

        data[2][0] = "userName3";
        data[2][1] = "pvd3";

        return data;
    }

    @DataProvider(name = "getData2")
    private Object[] getData2() {
        Object[] data = new Object[5];
        data[0] = "1";
        data[1] = "2";
        data[2]= "3";
        data[3]= "4";
        data[4]= "5";

        return data;
    }

}
