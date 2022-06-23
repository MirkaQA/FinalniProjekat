package Test;

import Base.BaseDemoqa;
import Pages.WebTablesPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing extends BaseDemoqa {

    @BeforeMethod
    public void SetupPage() throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to(homePageURL);
        Thread.sleep(5000);
    }

    //Prvi test - Text Box: unos ispravnih kredencijala
    @Test(priority = 10)
    public void ElementsTextBox1() throws InterruptedException {
        Assert.assertTrue(homePage.getToolsQAPicture().isDisplayed());
        Assert.assertEquals(excelReader.getStringData("DataFinalProject", 1, 0), driver.getCurrentUrl());
        Scroll(homePage.getElementsButton());
        homePage.ClickOnElementsButton();
        VisibilitWait(sidebarPage.getTextBox());
        Assert.assertTrue(sidebarPage.getElementsTitle().isDisplayed());
        sidebarPage.ClickOnTextBox();
        Thread.sleep(3000);
        textBoxPage.getFullNameField().sendKeys("Mira iz krompira");
        textBoxPage.getEmailField().sendKeys("perakosmos@gmail.com");
        textBoxPage.getCurrentAddressField().sendKeys("Na kraju Galaksije");
        textBoxPage.getPermanentAddressField().sendKeys("Ni na nebu ni na zemlji");
        Scroll(textBoxPage.getSubmitButton());
        textBoxPage.getSubmitButton().click();
        Assert.assertTrue(textBoxPage.getCorrectCredentials().isDisplayed());
        Thread.sleep(3000);
    }

    //Drugi test - Text Box: unos pogrešnog formata za mejl
    @Test(priority = 20)
    public void ElementsTextBox2() throws InterruptedException {
        Assert.assertTrue(homePage.getToolsQAPicture().isDisplayed());
        Assert.assertEquals(excelReader.getStringData("DataFinalProject", 1, 0), driver.getCurrentUrl());
        Scroll(homePage.getElementsButton());
        homePage.ClickOnElementsButton();
        VisibilitWait(sidebarPage.getTextBox());
        Assert.assertTrue(sidebarPage.getElementsTitle().isDisplayed());
        sidebarPage.ClickOnTextBox();
        Thread.sleep(3000);
        textBoxPage.getFullNameField().sendKeys("Mira iz krompira");
        textBoxPage.getEmailField().sendKeys("perakosmos@izdalekog.svemira");
        textBoxPage.getCurrentAddressField().sendKeys("Na kraju Galaksije");
        textBoxPage.getPermanentAddressField().sendKeys("Ni na nebu ni na zemlji");
        Scroll(textBoxPage.getSubmitButton());
        textBoxPage.getSubmitButton().click();
        Assert.assertTrue(textBoxPage.getRedEmailField().isDisplayed());
    }


    //Test 3 - Elements: kliknuti Check Box u sidebar-u, pa kliknuti check box na stranici
    @Test(priority = 30)
    public void ElementsCheckBox3() {
        Assert.assertTrue(homePage.getToolsQAPicture().isDisplayed());
        Assert.assertEquals(excelReader.getStringData("DataFinalProject", 1, 0), driver.getCurrentUrl());
        Scroll(homePage.getElementsButton());
        homePage.ClickOnElementsButton();
        VisibilitWait(sidebarPage.getTextBox());
        Assert.assertTrue(sidebarPage.getElementsTitle().isDisplayed());
        sidebarPage.ClickOnCheckBox();
        VisibilitWait(checkBoxPage.getHomeTitle());
        Assert.assertTrue(checkBoxPage.getCheckBoxTitle().isDisplayed());
        checkBoxPage.ClickOnCheckBoxField();
        Assert.assertTrue(checkBoxPage.getConfirmationText().isDisplayed());
    }


    //Test 4 -Elements: kliknuti Radio button u sidebar-u, pa kliknuti yes radio button
    @Test(priority = 40)
    public void ElementsRadioButtonYes() {
        Assert.assertTrue(homePage.getToolsQAPicture().isDisplayed());
        Assert.assertEquals(excelReader.getStringData("DataFinalProject", 1, 0), driver.getCurrentUrl());
        Scroll(homePage.getElementsButton());
        homePage.ClickOnElementsButton();
        VisibilitWait(sidebarPage.getRadioButton());
        Assert.assertTrue(radioButtonPage.getRadioButtonTitle().isDisplayed());
        sidebarPage.ClickOnRadioButton();
        wdwait.until(ExpectedConditions.visibilityOf(radioButtonPage.getRadioButtonTitle()));
        radioButtonPage.ClickOnYesButton();
        Assert.assertTrue(radioButtonPage.getYesConfirmationMessage().isDisplayed());
    }


    //Test 5 - Elements: kliknuti Radio button u sidebar - u, pa kliknuti Impressive radio button

    @Test(priority = 50)
    public void ElementsRadioButtonImpressive() {
        Assert.assertTrue(homePage.getToolsQAPicture().isDisplayed());
        Assert.assertEquals(excelReader.getStringData("DataFinalProject", 1, 0), driver.getCurrentUrl());
        Scroll(homePage.getElementsButton());
        homePage.ClickOnElementsButton();
        wdwait.until(ExpectedConditions.visibilityOf(radioButtonPage.getRadioButtonTitle()));
        Assert.assertTrue(sidebarPage.getRadioButton().isDisplayed());
        sidebarPage.ClickOnRadioButton();
        VisibilitWait(radioButtonPage.getRadioButtonTitle());
        radioButtonPage.ClickOnImpressiveButton();
        Assert.assertTrue(radioButtonPage.getImpressiveConfirmationMessage().isDisplayed());
    }

    //Test 6 - Elements - Web Tables: obrisati prvi red iz tabele
    @Test(priority = 60)
    public void DeleteFirstRowFromWebTables() {
        Assert.assertTrue(homePage.getToolsQAPicture().isDisplayed());
        Assert.assertEquals(excelReader.getStringData("DataFinalProject", 1, 0), driver.getCurrentUrl());
        Scroll(homePage.getElementsButton());
        homePage.ClickOnElementsButton();
        VisibilitWait(sidebarPage.getWebTables());
        Assert.assertTrue(sidebarPage.getWebTables().isDisplayed());
        sidebarPage.ClickOnWebTablesButton();
        VisibilitWait(webTablesPage.getWebTablesTitle());
        webTablesPage.ClickOnDeleteButton();
        boolean check = false;
        try {
            check = webTablesPage.getDeleteButton().isDisplayed();
        } catch (Exception e) {
        }
        Assert.assertFalse(check);
    }

        //Test 7 - Elements - Web Tables: Izmeniti ime u prvom redu tabele
        @Test
        public void EditNameInTheFirstRow(){
        Assert.assertTrue(homePage.getToolsQAPicture().isDisplayed());
        Assert.assertEquals(excelReader.getStringData("DataFinalProject", 1, 0), driver.getCurrentUrl());
        Scroll(homePage.getElementsButton());
        homePage.ClickOnElementsButton();
        VisibilitWait(sidebarPage.getWebTables());
        Assert.assertTrue(sidebarPage.getWebTables().isDisplayed());
        sidebarPage.ClickOnWebTablesButton();
        VisibilitWait(webTablesPage.getWebTablesTitle());
        webTablesPage.ClickOnEditButton();
        wdwait.until(ExpectedConditions.visibilityOf(webTablesPage.getNameField()));
        webTablesPage.getNameField().clear();
        webTablesPage.getNameField().sendKeys("WagaWaga");
        webTablesPage.ClickOnSubmitButton();
        }


        //Test 8 - Elements - Buttons: kliknuti na Click Me dugme
        @Test (priority = 80)
        public void ClickingOnClickMeButton() throws InterruptedException {
        Assert.assertTrue(homePage.getToolsQAPicture().isDisplayed());
        Assert.assertEquals(excelReader.getStringData("DataFinalProject", 1, 0), driver.getCurrentUrl());
        Scroll(homePage.getElementsButton());
        homePage.ClickOnElementsButton();
        VisibilitWait(sidebarPage.getButtons());
        Assert.assertTrue(sidebarPage.getButtons().isDisplayed());
        Scroll(sidebarPage.getButtons());
        sidebarPage.ClickOnButtons();
        Thread.sleep(1500);
        VisibilitWait(buttonsPage.getClickMeButton());
        buttonsPage.getClickMeButton().click();
        Thread.sleep(1500);
        Assert.assertTrue(buttonsPage.getConfirmationMessageForOneClick().isDisplayed());

        }
}