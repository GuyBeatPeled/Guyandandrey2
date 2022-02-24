package tests;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.InitializePage;
import pages.SearchPageResult;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class FirstTest extends InitializePage {

    @BeforeTest
    public void setUp(){
        super.setUp();
    }

    @Test (priority = 1)
    public void exceptAllCokicks(){
        homePage.exceptAllCokicks();
        WebElement e = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/button[2]"));
        Assert.assertEquals(searchPage.exceptAllCokicks(),e);
        //assertNotNull(utilities.waitForElement(searchPage.searchFlagLogo(), 20));
    }
    @Test (priority = 2)
    public void searchBeatHackers() {

        homePage.searchBeatHackers("beat hackers");
        WebElement e = driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/form[1]/input[1]"));
        Assert.assertEquals(searchPage.searchBeatHackers(), e);
    }

    @Test (priority = 3)
    public void clickOnTracks() {

        homePage.clickOnBeatHackers();
        WebElement e = driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/h2[1]/a[1]"));
        Assert.assertEquals(searchPage.clickOnBeatHackers(), e);

    }

    @Test (priority = 4)
    public void clickPlay() {

        homePage.clickPlay();
        WebElement e = driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]"));
        Assert.assertEquals(searchPage.clickPlay(), e);
    }

    @Test (priority = 5)
    public void clickPause() {

        homePage.clickMute();
        WebElement e = driver.findElement(By.xpath("//button[contains(text(),'Toggle mute')]"));
        Assert.assertEquals(searchPage.clickMute(), e);
    }
    @Test (priority = 6)
    public void PopularTracks() {

        homePage.PopularTracks();
        WebElement e = driver.findElement(By.xpath("//a[contains(text(),'Popular tracks')]"));
        Assert.assertEquals(searchPage.PopularTracks(), e);
    }

    @Test (priority = 7)
    public void SearchNewArtist() {

        homePage.SearchNewArtist("bob dylan");
        WebElement e = driver.findElement(By.xpath("//header/div[1]/div[2]/div[1]/form[1]/input[1]"));
        Assert.assertEquals(searchPage.SerchNewArtist(), e);

    }
    @Test (priority = 8)
    public void People() {

        homePage.ClickOnPeople();
        WebElement e = driver.findElement(By.xpath("//a[contains(text(),'People')]"));
        Assert.assertEquals(searchPage.ClickOnPeople(), e);
    }

    @Test (priority = 9)
    public void FilterByLocation() {

        homePage.FilterByLocation();
        WebElement e = driver.findElement(By.xpath(" //div[contains(text(),'London')]"));
        Assert.assertEquals(searchPage.FilterByLocation(), e);
    }
    @Test (priority = 10)
    public void Library() {

        homePage.Library();
        WebElement e = driver.findElement(By.xpath(" //a[contains(text(),'Library')]"));
        Assert.assertEquals(searchPage.Library(), e);

    }






















    public void tearDown() throws IOException {
        // utilities.screenshot();
        super.tearDown();
    }
}



//assertNotNull(utilities.waitForElement(searchPage.searchFlagLogo(), 20));*/
