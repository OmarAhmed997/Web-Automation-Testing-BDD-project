package org.example.PagesByOmar;
import org.example.StepDefinitionsByOmar.TestBaseHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.util.List;
import java.util.Random;



public class P03_HomePage {
    String ExpectedSecondSliderURL;
    String ActualSecondSliderURL;
    String ActualFirstSliderURL;
    String ExpectedFirstSliderURL;
    public void Get()
    {
        TestBaseHooks.driver.get("https://demo.nopcommerce.com/");
    }
    public WebElement SelectCurrency() {
        return TestBaseHooks.driver.findElement(By.id("customerCurrency"));
    }

    public void assertionCurrencyCheck() {
        Assert.assertEquals("Euro", TestBaseHooks.driver.findElement(By.xpath("//*[@id=\"customerCurrency\"]/option[2]")).getText());
    }


    public String ActualURL() {
        String ActualURL = TestBaseHooks.driver.getCurrentUrl();
        return ActualURL;
    }

    public WebElement SearchBox() {
        return TestBaseHooks.driver.findElement(By.id("small-searchterms"));
    }

    public int SizeOfItem() {
        int NoOFElements = TestBaseHooks.driver.findElements(By.className("product-item")).size();
        return NoOFElements;
    }

    public void ClickOnResult() {
        TestBaseHooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div")).click();
    }

    public String CheckSKU() {
        String GetSearchedSKU = TestBaseHooks.driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]")).getText();
        //System.out.println(GetSearchedSKU);
        return GetSearchedSKU;
    }

    //feature 4.
    //Hoovering.
    // Method to select a random category.
    public WebElement selectRandomCategory()
    {
        WebElement x = TestBaseHooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        return x;
    }

    public void HoveringOverSelectedMainCat()
    {
        Actions action = new Actions(TestBaseHooks.driver);
        action.moveToElement(selectRandomCategory()).perform();
        action.pause(5000);
    }

    //In Selenium WebDriver, you can perform hover actions using the Actions class.
    // The Actions class provides a method called moveToElement(WebElement element) which moves the mouse cursor to the specified element on the web page without clicking it.
    // After performing the desired actions, you can use the ~perform() method to execute the action sequence
    public void selectRandomSUBCategory() {
        List<WebElement> SUBCatElements = TestBaseHooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li"));
        Random randomX = new Random();
        int SUBrandomNumber = randomX.nextInt(SUBCatElements.size());
        WebElement selectedSUBRandomCategoryy = SUBCatElements.get(SUBrandomNumber);
        selectedSUBRandomCategoryy.click();
    }
    public String Choosen()
    {
        String ChoosedName = TestBaseHooks.driver.findElement(By.className("page-title")).getText().toLowerCase();
        System.out.println(ChoosedName);
        return ChoosedName;
    }
    public String CurrentItem()
    {
        String Current = TestBaseHooks.driver.findElement(By.className("current-item")).getText().toLowerCase();
        System.out.println(Current);
        return Current;
    }




    public void CheckPageTitleToSelectedSubCAT()
    {
        Assert.assertEquals(CurrentItem(),Choosen(),"wtffff");
    }
    //Sliders
    public void ClickSliderLumia()
    {
        WebElement firstSlider = TestBaseHooks.driver.findElement(By.cssSelector("#nivo-slider > a:nth-child(1)"));
        firstSlider.click();
        ExpectedFirstSliderURL = "https://demo.nopcommerce.com/nokia-lumia-1020";
        ActualFirstSliderURL = TestBaseHooks.driver.getCurrentUrl();
        System.out.println("Acutal " +ActualFirstSliderURL);
        System.out.println("Expected " +ExpectedFirstSliderURL);
    }

    public void CheckSliderLumia()
    {
        Assert.assertEquals(ActualFirstSliderURL,ExpectedFirstSliderURL, "Failed");
    }



    public void ClickOnSlideriphone6()
    {
        WebElement SecondSlider = TestBaseHooks.driver.findElement(By.cssSelector("#nivo-slider > a:nth-child(2)"));
        SecondSlider.click();
        ExpectedSecondSliderURL = "https://demo.nopcommerce.com/iphone-6";
        ActualSecondSliderURL = TestBaseHooks.driver.getCurrentUrl();
        System.out.println("Acutal " +ActualSecondSliderURL);
        System.out.println("Expected " +ExpectedSecondSliderURL);
    }

    public void CheckSlidderiphone()
    {
        Assert.assertEquals(ActualSecondSliderURL,ExpectedSecondSliderURL, "Failed2");
    }

    //FollowUS//
    public void OpenFbLink()
    {
        TestBaseHooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a")).click();
    }
    public void OpenTwitterLink()
    {
        TestBaseHooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a")).click();
    }
    public void OpenRssLink() {
        TestBaseHooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a")).click();
    }
    public void OpenYtLink() {
        TestBaseHooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a")).click();
    }
    public void CheckLinkk()
    {
        String ActialLink = "https://demo.nopcommerce.com/";
        String CurrentLink = TestBaseHooks.driver.getCurrentUrl();
        Assert.assertEquals(ActialLink,CurrentLink);
    }

    //WishList
    public void addM8toWishList()
    {
//        TestBaseHooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")).click();
        WebElement element = TestBaseHooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        element.click();

    }
    public void Checksuccessmsg()
    {
        String ActualMsgText = TestBaseHooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).getText();
        SoftAssert softAssertt = new SoftAssert();
        softAssertt.assertTrue(ActualMsgText.contains("product"));
        softAssertt.assertAll();
    }
    public void CheckSuccessColor()
    {
        SoftAssert softAsserttt = new SoftAssert();
        WebElement SuccessMsgColor = TestBaseHooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p"));
        String SuccessColor = SuccessMsgColor.getCssValue("color");
        String SuccessHex = Color.fromString(SuccessColor).asHex();
        String ExpectedHex = "#54b481";
        softAsserttt.assertEquals(SuccessHex,ExpectedHex );
    }
    public void waait()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
    public void ClickOnWishList()
    {
        TestBaseHooks.driver.findElement(By.className("wishlist-label")).click();
    }
    public void QuantityCheck()
    {
        WebElement quantityElement = TestBaseHooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input"));
        String quantityText = quantityElement.getAttribute("value");
        int quantityValue = Integer.parseInt(quantityText);
        if (quantityValue  > 0) {
            System.out.println("Quantity is greater than 0: equals " + quantityValue );
        } else {
            System.out.println("Quantity is not greater than 0: equals " + quantityValue );
        }
    }
}
