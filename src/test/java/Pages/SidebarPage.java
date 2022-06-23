package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SidebarPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement textBox;
    WebElement checkBox;
    WebElement radioButton;
    WebElement webTables;
    WebElement buttons;
    WebElement links;
    WebElement brokenLinksImages;
    WebElement uploadAndDownload;
    WebElement elementsTitle;

    public WebElement getRadioButton() {
        return driver.findElement(By.xpath("//span[text()='Radio Button']"));
    }
    public WebElement getElementsTitle() {
        return driver.findElement(By.className("main-header"));
    }

    public SidebarPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getTextBox() {

        return driver.findElement(By.xpath("//span[text()='Text Box']"));
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.xpath("//span[text()='Check Box']"));
    }

    public WebElement getWebTables() {
        return driver.findElement(By.xpath("//span[text()='Web Tables']"));
    }


    public WebElement getButtons() {
        return driver.findElement(By.xpath("//span[text()='Buttons']"));
    }

    public void ClickOnTextBox() {
        getTextBox().click();
    }

    public void ClickOnCheckBox() {
        getCheckBox().click();
    }

    public void ClickOnRadioButton(){
        getRadioButton().click();
    }

    public void ClickOnWebTablesButton(){
        getWebTables().click();
    }

    public void ClickOnButtons(){
        getButtons().click();
    }
}