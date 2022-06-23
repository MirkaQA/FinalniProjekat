package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement checkBoxTitle;
    WebElement homeTitle;
    WebElement checkBoxField;
    WebElement confirmationText;



    public WebElement getConfirmationText() {
        return driver.findElement(By.id("result"));
    }
    public WebElement getCheckBoxField() {
        return driver.findElement(By.className("rct-checkbox"));
    }

    public WebElement getHomeTitle() {
        return driver.findElement(By.className("rct-title"));
    }
    public WebElement getCheckBoxTitle() {
        return driver.findElement(By.className("main-header"));
    }

    public CheckBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public void ClickOnCheckBoxField(){
        getCheckBoxField().click();
    }
}
