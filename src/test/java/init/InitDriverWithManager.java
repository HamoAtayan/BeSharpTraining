package init;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Hmayak Atayan on  29, Jan, 2021
 */
public class InitDriverWithManager {
    @Test
    public void testik() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
        driver.get("https://auto.am//");
        Thread.sleep(1000);
        WebElement chooseCars = driver.findElement(By.id("filter-make"));
        selectCarModel(chooseCars, Cars.TOYOTA);

        Assert.assertEquals("webelemt.getText()", ErrorMessage.LOGIN_ERROR);
    }

    public void selectCarModel(WebElement element, Cars car) {
        Select select = new Select(element);
        select.selectByVisibleText(car.name());
    }


    public enum Cars {
        BMW,
        TOYOTA,
        HYUNDAI
    }
}
