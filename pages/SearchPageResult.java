package pages;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageResult extends BasePage {

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
    WebElement SerchNewArtist;

    @FindBy(xpath = "//a[contains(text(),'People')]")
    WebElement ClickOnPeople;

    @FindBy(xpath = " //div[contains(text(),'London')]")
    WebElement FilterByLocation;

    @FindBy(xpath = "//a[contains(text(),'Library')]")
    WebElement Library;





    public SearchPageResult(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement exceptAllCokicks() {
        return exceptAllCokicks;
    }

    public WebElement searchBeatHackers() {
        return searchBeatHackers;
    }

    public WebElement clickOnBeatHackers() {
        return clickOnBeatHackers;

    }

    public WebElement clickPlay() {
        return clickPlay;


    }

    public WebElement clickMute() {
        return clickMute;
    }

    public WebElement PopularTracks() {
        return PopularTracks;
    }

    public WebElement SerchNewArtist() {
        return SerchNewArtist;
    }

    public WebElement ClickOnPeople() {
        return ClickOnPeople;

    }

    public WebElement FilterByLocation() {
        return FilterByLocation;
    }

    public WebElement Library() {
        return Library;


    }
    }

