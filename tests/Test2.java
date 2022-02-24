/*
package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.InitializePage;

import java.io.IOException;

public class Test2 extends InitializePage {

    @BeforeTest
    public void setUp(){
        super.setUp();
    }

    @Test (priority = 2)
    public void searchArtistName() {
        homePage.searchInput("beat hackers");
        WebElement e = driver.findElement(By.xpath("//button[contains(text(),'View your Insights')]"));
        Assert.assertEquals(searchPage.ViewYourInsights(),e);
        //assertNotNull(utilities.waitForElement(searchPage.searchFlagLogo(), 20));



        if (searchPage.EnterArtistName() == e);
        System.out.println("Test Enter Beat Hackers in The Search Box Has Pass!!!!");

    }

    public void tearDown() throws IOException {
        // utilities.screenshot();
        super.tearDown();
    }
}*/
