package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By amazonFilter = By.xpath("//li[@id='p_98/21345978031']//i[@class='a-icon a-icon-checkbox']");
    static By appleFilter = By.cssSelector("body > div:nth-child(1) > div:nth-child(28) > div:nth-child(9) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > ul:nth-child(2) > span:nth-child(1) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > div:nth-child(1) > label:nth-child(1) > i:nth-child(2)");
    static By firstProduct =By.cssSelector("img[alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu']");
    static By add = By.id("add-to-cart-button");
    static By back = By.id("attach-close_sideSheet-link");
    static By cart = By.cssSelector("#nav-cart-count");
    static By check = By.cssSelector(".a-truncate-cut");



    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {
    }

    public static void acceptCookie() {
        elementHelper.click(accept);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void clickSearch() {
        elementHelper.click(search);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeProduct() {
        elementHelper.sendKey(search,"airpods");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void searchButton() {
        elementHelper.click(searchButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void filterAmazon() {
        elementHelper.click(amazonFilter);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void filterApple() {
        elementHelper.click(appleFilter);

    }
    public static void firstProduct() {
        elementHelper.click(firstProduct);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void addCart() {
        elementHelper.click(add);
        //elementHelper.click(back);
        elementHelper.click(cart);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void checkCart() {
        elementHelper.checkVisible(check);
    }
}