package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement clickMeButton;
    WebElement confirmationMessageForOneClick;

    public WebElement getConfirmationMessageForOneClick() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }

    public WebElement getClickMeButton() {
        return driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']/div[2]/div[3]"));
    }

    public ButtonsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
}
