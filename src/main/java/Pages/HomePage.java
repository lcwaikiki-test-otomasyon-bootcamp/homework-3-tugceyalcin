package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {

    By women =By.cssSelector("##header__container > header > div.header__bottom > nav > ul > li:nth-child(1) > a");
    By tshirt =By.cssSelector("#header__container > header > div.header__bottom > nav > ul > li:nth-child(1) > div > div.flex-row > div.flex-col.flex-col--zone-items > ul > li:nth-child(2) > a");
    By logo=By.cssSelector("#root > div > div.product-list-container > div.product-list > div.container-fluid.quick-filters > div:nth-child(2) > div > a:nth-child(1)");
    By favoriteButton=By.cssSelector(".#icon-not-liked > path");
    By favoritepage=By.cssSelector("#header__container > div > div.mh__middle > div > div.main__right > div > div:nth-child(2) > a > svg");
    By checkproduct=By.cssSelector(" #model_2371934_5818713 > div.picture-box > img.product-lazy-image.ls-is-cached.lazyloaded");

    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;


    }
    public void  setDefaultSettings(int time){
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
    }

    public void ClickWomen(){
        driver.findElement(women).click();

    }

    public void ClickTshirt(){
        driver.findElement(tshirt).click();

    }


    public void  checksLogoTshirtPage(){

        driver.findElement(logo);
    }


    public void clickFirstTshirtFavoriteButton(){

        driver.findElement(favoriteButton).click();
    }



    public void  ClickFavoritesPage(){

        driver.findElement(favoritepage);
    }

    public void CheckProduct() {

        driver.findElement(checkproduct);
    }
}

