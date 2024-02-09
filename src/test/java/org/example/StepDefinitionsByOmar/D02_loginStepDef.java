package org.example.StepDefinitionsByOmar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PagesByOmar.P02_Login;

public class D02_loginStepDef {
    P02_Login Login = new P02_Login();

    @Given("user go to login page")
    public void userGoToLoginPage()
    {
        Login.LoginPage();
    }


    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String Usernam, String Passwor)
    {
        Login.ValidUser().sendKeys(Usernam);
        Login.ValidPass().sendKeys(Passwor);
    }

    @And("user press on login button")
    public void userPressOnLoginButton(){
        Login.ClickOnLoginButt();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        Login.CheckURL();
        Login.CheckButton();
    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String WrongUser, String WrongPass) {
        Login.ValidUser().sendKeys(WrongUser);
        Login.ValidPass().sendKeys(WrongPass);
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        Login.CheckErrorColor();
    }



}
