package org.example.PagesByOmar;

import org.example.StepDefinitionsByOmar.TestBaseHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;



public class P02_Login {

    public void LoginPage() {
        TestBaseHooks.driver.findElement(By.className("ico-login")).click();
    }

    public WebElement ValidUser() {
        return TestBaseHooks.driver.findElement(By.className("email"));
    }

    public WebElement ValidPass() {
        return TestBaseHooks.driver.findElement(By.id("Password"));
    }

    public void ClickOnLoginButt() {
        TestBaseHooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
    }

    public void CheckURL() {
        SoftAssert softAssert = new SoftAssert();
        String currentUrl = TestBaseHooks.driver.getCurrentUrl();
        softAssert.assertEquals(currentUrl, "https://demo.nopcommerce.com/");
        softAssert.assertAll();
    }

    public void CheckButton() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(TestBaseHooks.driver.findElement(By.className("ico-account")).isDisplayed());
        softAssert.assertAll();
    }
    public void CheckErrorColor()
    {
        SoftAssert softAssert = new SoftAssert();
        WebElement ErrorColor = TestBaseHooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
        String colorValue = ErrorColor.getCssValue("color");
        String hexColor = Color.fromString(colorValue).asHex();
        String ExpectedC = "#e4434b";
        softAssert.assertEquals(hexColor,ExpectedC );
        softAssert.assertAll();
    }
}