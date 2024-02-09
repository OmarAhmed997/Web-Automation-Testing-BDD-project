package org.example.StepDefinitionsByOmar;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.PagesByOmar.P03_HomePage;

public class D07_followUsStepDef {
    P03_HomePage homepage4 = new P03_HomePage();
    //common in every scenario
    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0)
    {
        homepage4.CheckLinkk();
    }

    @Given("user opens facebook link")
    public void userOpensFacebookLink()
    {
        homepage4.OpenFbLink();
    }

    @Given("user opens twitter link")
    public void userOpensTwitterLink()
    {
        homepage4.OpenTwitterLink();
    }

    @Given("user opens rss link")
    public void userOpensRssLink()
    {
        homepage4.OpenRssLink();
    }

    @Given("user opens youtube link")
    public void userOpensYoutubeLink()
    {
        homepage4.OpenYtLink();
    }



}
