package page;

import helpers.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Hmayak Atayan on  21, Feb, 2021
 */
public class SimpleFormDemoPage extends BasePage<SimpleFormDemoPage> {

    @FindBy(css = "div.form-group #user-message")
    private WebElement messageInput;

    @FindBy(id = "get-input")
    private WebElement input;

    public SimpleFormDemoPage(WebDriver driver, String serverUrl) {
        super(driver, serverUrl, "/test/basic-first-form-demo.html");
    }

    public void setMessageInput(String message) {
        messageInput.sendKeys(message);
    }

    public void clickMessageInput() {
        WaitHelper.waitForElementToBeClickable(getDriver(), messageInput);
        messageInput.click();
        switchFocusOnNewTab();
    }

    public String getID() {
        WaitHelper.waitForVisibilityOfElement(getDriver(), input);
        return input.getAttribute("method");
    }

    public void setLogin(String input) {
        WaitHelper.waitForVisibilityOfElement(getDriver(), this.input);
        this.input.sendKeys(input);
    }
}
