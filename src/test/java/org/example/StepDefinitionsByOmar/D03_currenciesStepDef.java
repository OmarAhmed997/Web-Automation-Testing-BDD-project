package org.example.StepDefinitionsByOmar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.PagesByOmar.P03_HomePage;
import org.openqa.selenium.support.ui.Select;


public class D03_currenciesStepDef {
    P03_HomePage HomePage = new P03_HomePage();

    @And("user select {string} currency from the dropdown list")
    public void userSelectCurrencyFromTheDropdownList(String Euro)
    {
        Select ff = new Select(HomePage.SelectCurrency());
        ff.selectByVisibleText(Euro);
    }

    @Then("user choose € currency successfully")
    public void userChoose€CurrencySuccessfully()
    {
        HomePage.assertionCurrencyCheck();
    }



}

