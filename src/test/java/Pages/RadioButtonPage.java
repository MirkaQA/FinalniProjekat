package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement radioButtonTitle;
    WebElement yesButton;
    WebElement impressiveButton;
    WebElement yesConfirmationMessage;
    WebElement impressiveConfirmationMessage;

    public WebElement getRadioButtonTitle() {
        return driver.findElement(By.className("main-header"));
    }

    public WebElement getYesButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
    }

    public WebElement getImpressiveButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
    }

    public WebElement getYesConfirmationMessage() {
        return driver.findElement(By.xpath("//span[text()='Yes']"));
    }

    public WebElement getImpressiveConfirmationMessage() {
        return driver.findElement(By.xpath("//span[text()='Impressive']"));
    }

    public RadioButtonPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public void ClickOnYesButton(){
        getYesButton().click();
    }

    public void ClickOnImpressiveButton(){
        getImpressiveButton().click();
    }
}
