package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement fullNameField;
    WebElement emailField;
    WebElement currentAddressField;
    WebElement permanentAddressField;
    WebElement submitButton;
    WebElement correctCredentials;
    WebElement redEmailField;

    public WebElement getRedEmailField() {
        return driver.findElement(By.cssSelector(".mr-sm-2.field-error.form-control"));
    }
    public WebElement getCorrectCredentials() {
        return driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12"));
    }
    public TextBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullNameField() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//*[@id='userEmail']"));
    }

    public WebElement getCurrentAddressField() {
        return driver.findElement(By.xpath("//*[@id='currentAddress']"));
    }

    public WebElement getPermanentAddressField() {
        return driver.findElement(By.xpath("//*[@id='permanentAddress']"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.xpath("//*[@id='submit']"));
    }
}
