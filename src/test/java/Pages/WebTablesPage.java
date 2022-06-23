package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement aldenName;
    WebElement webTablesTitle;
    WebElement editButton;
    WebElement deleteButton;
    WebElement nameField;
    WebElement submitButton;


    public WebElement getSubmitButton() {
        return driver.findElement(By.cssSelector(".text-right.col-md-2.col-sm-12"));
    }
    public WebElement getNameField() {
        return driver.findElement(By.id("firstName"));
    }
    public WebElement getEditButton() {
        return driver.findElement(By.id("edit-record-1"));
    }

    public WebElement getDeleteButton() {
        return driver.findElement(By.id("delete-record-1"));
    }
    public WebElement getWebTablesTitle() {
        return driver.findElement(By.xpath("//div[@class='main-header']"));
    }

    public WebElement getAldenName() {
        return driver.findElement(By.xpath("//div[text()='Alden']"));
    }


    public WebTablesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public void ClickOnDeleteButton(){
        getDeleteButton().click();
    }

    public void ClickOnEditButton(){
        getEditButton().click();
    }

    public void ClickOnSubmitButton(){
        getSubmitButton().click();
    }
}
