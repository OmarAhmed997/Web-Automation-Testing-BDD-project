package org.example.StepDefinitionsByOmar;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

public class TestBaseHooks {
    public static WebDriver driver;
    @Before
    public static void OpenBrowser()
    {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.navigate().to("https://demo.nopcommerce.com/");
        driver.get("https://demo.nopcommerce.com/");
    }

    @After
    public static void quitDriver()
            throws InterruptedException {
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.quit();
    }
}
