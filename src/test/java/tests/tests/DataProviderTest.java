package tests.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Hmayak Atayan on  14, Feb, 2021
 */
public class DataProviderTest {

    @Test(dataProvider = "getData")
    void testik(String userNAME, String password) {
        System.out.println(userNAME);
        System.out.println(password);

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

    @Test(dataProvider = "getData2")
    private void testDataProvider(String tver) {
        System.out.println(tver);
    }

    @DataProvider(name = "getData2")
    private Object[] getData2() {
        Object[] data = new Object[5];
        data[0] = "1";
        data[1] = "2";
        data[2] = "3";
        data[3] = "4";
        data[4] = "5";

        return data;
    }

    @DataProvider(name = "getData3")
    private Object[] getData3() {
        Object[][] data = new Object[3][2];
        data[0][0] = 1;
        data[0][1] = 2;

        data[1][0] = 2;
        data[1][1] = 4;

        data[2][0] = 3;
        data[2][1] = 5;

        return data;

    }

    public int sum(int tiv1, int tiv2) {
        return tiv1 + tiv2;
    }

    @Test(dataProvider = "getData3")
    public void testingSum(int number1, int number2) {
        System.out.println(sum(number1, number2));
    }


}
