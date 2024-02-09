package org.example.StepDefinitionsByOmar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PagesByOmar.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;



public class D01_RegStepDefiniton {
    P01_Register register = new P01_Register();

    @Given("user go to register page")
    public void goRegisterPage() {
        register.RegisterLink();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        register.SelectGenderMale();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String username, String lastname) {
        register.UserName().sendKeys(username);
        register.LastName().sendKeys(lastname);
    }


    @And("user enter date of birth day{string} And month{string} And year {string}")
    public void userEnterDateOfBirthDayAndMonthAndYear(String position1, String position2, String position3) {
        Select se = new Select(TestBaseHooks.driver.findElement(By.name("DateOfBirthDay")));
        se.selectByValue(position1);
        Select xe = new Select(TestBaseHooks.driver.findElement(By.name("DateOfBirthMonth")));
        xe.selectByValue(position2);
        Select ee = new Select(TestBaseHooks.driver.findElement(By.name("DateOfBirthYear")));
        ee.selectByValue(position3);
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String emailX) {
        register.Email().sendKeys(emailX);
    }


    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String pass1, String pass2) {
        register.passw1().sendKeys(pass1);
        register.passw2().sendKeys(pass2);

    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton()
    {
        register.RegButt();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed()
    {
        register.Assertion();
    }

}







