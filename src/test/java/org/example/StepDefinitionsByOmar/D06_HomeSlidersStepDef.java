package org.example.StepDefinitionsByOmar;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PagesByOmar.P03_HomePage;

public class D06_HomeSlidersStepDef {
P03_HomePage homePage4 = new P03_HomePage();
    @Given("user go to main page")
    public void userGoToMainPage() {
        homePage4.Get();
    }

    //    @When("user clicks on first slider")
    //    public void userClicksOnFirstSlider() {
    //
    //    }
    //
    //    @Then("user goes to lumia phone webpage")
    //    public void userGoesToLumiaPhoneWebpage() {
    //    }


    @When("user clicks on  second slider")
    public void userClicksOnSecondSlider() {
        homePage4.ClickOnSlideriphone6();
    }

    @Then("user goes to iphone page")
    public void userGoesToIphonePage() {
        homePage4.CheckSlidderiphone();
    }

    @When("user clicks on first slider")
    public void userClicksOnFirstSlider() {homePage4.ClickSliderLumia();
    }

    @Then("user goes to lumia phone webpage")
    public void userGoesToLumiaPhoneWebpage() {homePage4.CheckSliderLumia();
    }
}
