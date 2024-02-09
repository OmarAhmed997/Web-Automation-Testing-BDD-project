package org.example.StepDefinitionsByOmar;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PagesByOmar.P03_HomePage;
import org.openqa.selenium.By;
import org.testng.mustache.Value;

public class D08_WishlistStepDef {
    P03_HomePage homePage5 = new P03_HomePage();
    @Given("user adds HTCOneMAndroidLLollipop to wishlist")
    public void userAddsHTCOneMAndroidLLollipopToWishlist()
    {
        homePage5.addM8toWishList();
    }

    @Then("user adds HTCOneMAndroidLLollipop successfully")
    public void userAddsHTCOneMAndroidLLollipopSuccessfully()
    {
    homePage5.Checksuccessmsg();
    homePage5.CheckSuccessColor();
    }

    @When("success message disspears")
    public void successMessageDisspears()
    {
        homePage5.waait();
    }

    @And("user clicks on WishList")
    public void userClicksOnWishList()
    {
        homePage5.ClickOnWishList();
    }

    @Then("user make sure quanity is right")
    public void userMakeSureQuanityIsRight()
    {
        homePage5.QuantityCheck();
    }

}
