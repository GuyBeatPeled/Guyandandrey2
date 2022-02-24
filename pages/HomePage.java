package pages;

import Utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/button[2]")
    WebElement exceptAllCokicks;

    @FindBy(xpath = "//header/div[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement searchBeatHackers;

    @FindBy(xpath = "//body/div[@id='app']/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement clickOnBeatHackers;

    @FindBy(xpath = "//body/div[@id='app']/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement clickPlay;

    @FindBy(xpath = "//button[contains(text(),'Toggle mute')]")
    WebElement clickMute;

    @FindBy(xpath = "//a[contains(text(),'Popular tracks')]")
    WebElement PopularTracks;

    @FindBy(xpath = "//header/div[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement SearchNewArtist;

    @FindBy(xpath = "//a[contains(text(),'People')]")
    WebElement ClickOnPeople;

    @FindBy(xpath = " //div[contains(text(),'London')]")
    WebElement FilterByLocation;

    @FindBy(xpath = "//a[contains(text(),'Settings and more')]")
    WebElement SettingsAndMore;

    @FindBy(xpath = "//a[contains(text(),'Library')]")
    WebElement Library;




    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void exceptAllCokicks() {
        exceptAllCokicks.click();

    }

    public void searchBeatHackers(String item) {
        searchBeatHackers.sendKeys(item);
        searchBeatHackers.submit();
    }

    public void clickOnBeatHackers() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnBeatHackers.click();
    }

    public void clickPlay() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickPlay.click();
    }

    public void clickMute() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickMute.click();
    }

    public void PopularTracks() {
        PopularTracks.click();
    }

    public void SearchNewArtist(String item) {
        SearchNewArtist.click();
        SearchNewArtist.sendKeys(item);
        SearchNewArtist.submit();
    }

    public void ClickOnPeople() {
        ClickOnPeople.click();

    }

    public void FilterByLocation() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        FilterByLocation.click();
    }


   /* public void Library() {
        Library.click();*/
    }
    