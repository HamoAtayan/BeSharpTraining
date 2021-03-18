package mypackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Hmayak Atayan on  18, Feb, 2021
 */
public class Singltone {
    private static Singltone singltone;
   private WebDriver driver;

    private Singltone() {
        getDriver();
    }

    public static Singltone getInstance() {
        if (singltone == null) {
            singltone = new Singltone();
        }
        return singltone;
    }

    public WebDriver getDriver() {
        if (null == driver) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
        }
        return driver;
    }
}