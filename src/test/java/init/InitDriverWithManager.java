package init;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Hmayak Atayan on  29, Jan, 2021
 */
public class InitDriverWithManager {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
        driver.get("https://www.sas.am/");
        Thread.sleep(2000);
        String text = driver.findElement(By.cssSelector("[class='item-menu__link item-menu_2 item-menu_id_ ']")).getAttribute("style");
        System.out.println(text);
    }
}
