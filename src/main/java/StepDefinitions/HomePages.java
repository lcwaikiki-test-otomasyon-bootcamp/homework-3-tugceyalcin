package StepDefinitions;

import Pages.HomePage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class HomePages {


    DriverFactory driverFactory=new DriverFactory();
    WebDriver driver =driverFactory.GetDriver();

    HomePage homePage=new HomePage(driver);
    @Given("Uygulama açılır")
    public void uygulamaAçılır() {
        homePage.setDefaultSettings(10);

            }
    @When("Kadın tabına basılır")
    public void Clickwomen() {
        homePage.setDefaultSettings(10);
        homePage.ClickWomen();


    }
    @When("Tişört' e tıklanır.")
    public void ClickTshirt() {
        homePage.setDefaultSettings(10);
        homePage.ClickTshirt();
    }

    @Then("Tişört sayfasının geldiği kontrol edilir.")

    public void CheckTshirtPage(){

        homePage.setDefaultSettings(10);
        homePage.checksLogoTshirtPage();
    }

    @When("1. siradaki üründe bulunan favorilere ekle ikonuna tıklanır.")
    public void ClickFavorite() {
        homePage.setDefaultSettings(10);
        homePage.clickFirstTshirtFavoriteButton();

    }


    @When("Favorilerime gidilir.")
    public void ClickFavoritePage() {
        homePage.setDefaultSettings(10);
        homePage.ClickFavoritesPage();

    }


    @Then("Urunun favorilere eklendiği kontrol edilir.")

    public void CheckTshirtinFavorite(){

        homePage.setDefaultSettings(10);
        homePage.CheckProduct();
    }


}
