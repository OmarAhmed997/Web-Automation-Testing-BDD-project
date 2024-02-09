package org.example.StepDefinitionsByOmar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PagesByOmar.P03_HomePage;

public class D05_hoverCategoriesStepDef {
    P03_HomePage homepage3 = new P03_HomePage();

    @Given("user select a category")
    public void userSelectRandomCategory()
    {
        homepage3.selectRandomCategory();
    }

    @When("user hoover over a category")
        public void userHoover()
        {
            homepage3.HoveringOverSelectedMainCat();
        }

    @And("user select sub category RANDOM")
    public void userSelectSubCategory()
    {
        homepage3.selectRandomSUBCategory();
    }

    @Then("Check if chosen SubCat equals Actual SubCat")
    public void checkIfChoosedSubCatEqualsActualSubCat()
    {
        homepage3.CheckPageTitleToSelectedSubCAT();
    }


}
