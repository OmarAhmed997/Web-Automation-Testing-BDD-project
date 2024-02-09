package org.example.StepDefinitionsByOmar;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.PagesByOmar.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class D04_SearchStepDef {
    P03_HomePage homepage3 = new P03_HomePage();


    @When("url contains {string}")
    public void urlContains(String URL)
    {
       boolean Url=  homepage3.ActualURL().contains(URL);     // returns a boolean value (true or false).
        Assert.assertTrue(Url);
    }

    @And("user search by {string} and use search button And shows number of search results")
    public void userSearchByAndClickSearchButton(String ItemName) {
        homepage3.SearchBox().sendKeys(ItemName);
        homepage3.SearchBox().sendKeys(Keys.ENTER);
        System.out.println("No. Of Results IS "+homepage3.SizeOfItem());
    }

    @And("user search by {string} and press enter")
    public void userSearchBy(String ItemSKU)  {
        homepage3.SearchBox().sendKeys(ItemSKU);
        homepage3.SearchBox().sendKeys(Keys.ENTER);
    }

    @And("user clicks on product appeared in search")
    public void userClicksOnProductAppearedInSearch()  {
        homepage3.ClickOnResult();
    }

    @Then("users ProductSKU is successfully is the same of searched {string}")
    public void usersProductSKUIsSuccessfullyIsTheSameOfSearched(String ItemSKUU) {
        boolean SKUCheck = homepage3.CheckSKU().contains(ItemSKUU);
        // System.out.println("this is real       " +ItemSKUU);
        // System.out.println("this is check      " +homepage3.CheckSKU());
        Assert.assertTrue(SKUCheck);
    }




    /*@Then("Verify searched item name is in result searched items")
    public void verifySearchedItemNameIsInResultSearchedItems() {
        List<WebElement> Results = TestBaseHooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div[1]"));
        for ()
    }

     */
}

