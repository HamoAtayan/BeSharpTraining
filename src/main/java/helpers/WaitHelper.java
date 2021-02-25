package helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

/**
 * Created by Hmayak Atayan on  17, Feb, 2021
 */
public class WaitHelper {
    private static final int TIMEOUT = 30;
    private static final Logger LOG = LoggerFactory.getLogger(WaitHelper.class);

    public static void waitForElementToBeClickable(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(elementToBeClickable(element));
    }

    public static void waitForVisibilityOfElement(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        wait.until(visibilityOf(element));
    }

    private static void waitUntilJSReady(WebDriver driver) {
        try {
            String readyState = "return document.readyState";
            boolean jsReady = ((JavascriptExecutor) driver).executeScript(readyState).toString().equals("complete");
            if (!jsReady) {
                WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
                ExpectedCondition<Boolean> jsLoad = webDriver -> ((JavascriptExecutor) driver)
                        .executeScript(readyState).toString().equals("complete");
                wait.until(jsLoad);
            }
        } catch (WebDriverException ex) {
            LOG.info(ex.getMessage());
        }
    }

    public static void waitForFieldToBeSelected(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(webDriver -> {
            if (!element.equals(driver.switchTo().activeElement())) {
                element.click();
                return false;
            } else {
                return true;
            }
        });
    }
}
