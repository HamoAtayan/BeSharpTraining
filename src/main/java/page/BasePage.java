package page;

import helpers.ComponentHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

/**
 * Created by Hmayak Atayan on  18, Feb, 2021
 */
public abstract class BasePage<T extends LoadableComponent<T>> extends LoadableComponent<T> implements ComponentHelper {
    private final String serverUrl;
    private final WebDriver driver;
    private final String pagePath;


    protected Logger log = LoggerFactory.getLogger(BasePage.class);

    protected BasePage(WebDriver driver, String serverUrl, String pagePath) {
        this.driver = driver;
        this.serverUrl = serverUrl;
        this.pagePath = pagePath;

        PageFactory.initElements(driver, this);
    }

    @Override
    protected void load() {
        driver.get(serverUrl + pagePath);
    }

    @Override
    protected void isLoaded() throws Error {
        Assert.assertTrue(isOnPage());
    }

    private boolean isOnPage() {
        return driver.getCurrentUrl().equals(serverUrl + pagePath);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public String getPagePath() {
        return pagePath;
    }

    public Logger getLog() {
        return log;
    }
}
