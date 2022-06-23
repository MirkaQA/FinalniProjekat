package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseDemoqa {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public JavascriptExecutor js;
    public HomePage homePage;
    public SidebarPage sidebarPage;
    public ElementsPage elementsPage;
    public ExcelReader excelReader;
    public String homePageURL;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public ButtonsPage buttonsPage;


    @BeforeClass
    public void Setup() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver, wdwait);
        sidebarPage = new SidebarPage(driver, wdwait);
        elementsPage = new ElementsPage(driver, wdwait);
        excelReader = new ExcelReader("C:\\Users\\Stevan\\Desktop\\IT Boot Camp\\PodaciZaProjekat.xlsx");
        js = (JavascriptExecutor) driver;
        homePageURL = excelReader.getStringData("DataFinalProject", 1,0);
        textBoxPage = new TextBoxPage(driver, wdwait);
        checkBoxPage = new CheckBoxPage(driver,wdwait);
        radioButtonPage = new RadioButtonPage(driver,wdwait);
        webTablesPage = new WebTablesPage(driver,wdwait);
        buttonsPage = new ButtonsPage(driver, wdwait);
    }


    public void VisibilitWait(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void Scroll(WebElement element){
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void VisibilityWait(WebElement element){wdwait.until(ExpectedConditions.visibilityOf(element));}

    @AfterClass
    public void TearDown(){
        driver.close();
        driver.quit();
    }
}
