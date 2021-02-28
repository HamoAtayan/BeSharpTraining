package helpers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Config;

/**
 * Created by Hmayak Atayan on  17, Jan, 2021
 */
public class DriverSetup {
    private WebDriver driver;

    public WebDriver initDriver() {
        String browser = Config.get("driver");
        switch (browser) {
            case "chrome": {
                if (null == driver) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
                    break;
                }
            }
            case "firefox": {
                if (null == driver) {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    break;
                }
            }
            default: {
                if (null == driver) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
                    break;
                }
            }
        }
        return driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
