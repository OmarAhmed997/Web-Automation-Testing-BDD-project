package org.example.PagesByOmar;
import org.example.StepDefinitionsByOmar.TestBaseHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;



public class    P01_Register {
    public void RegisterLink()
    {
        TestBaseHooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
    }

    public void SelectGenderMale()
    {
        TestBaseHooks.driver.findElement(By.className("forcheckbox")).click();
    }
    public WebElement UserName()
    {
       return TestBaseHooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement LastName()
    {
        return TestBaseHooks.driver.findElement(By.id("LastName"));
    }

    public WebElement Email()
    {
        return TestBaseHooks.driver.findElement(By.id("Email"));
    }
    public WebElement passw1()
    {
        return TestBaseHooks.driver.findElement(By.id("Password"));
    }
    public WebElement passw2()
    {
        return TestBaseHooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public void RegButt()
    {
        TestBaseHooks.driver.findElement(By.id("register-button")).click();
    }
    public void Assertion()
    {
        WebElement element = TestBaseHooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
        String textColor = element.getCssValue("color");
        String expectedColor = "rgba(76, 177, 124, 1)";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(textColor, expectedColor);
        softAssert.assertAll();
    }

}