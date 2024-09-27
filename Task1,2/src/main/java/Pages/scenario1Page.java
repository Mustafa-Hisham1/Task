package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class scenario1Page extends base{
    private final By searchBoxLocator = By.id("twotabsearchtextbox");
    private final By searchBoxSubmitLocator = By.id("nav-search-submit-button");
    private final By firstItemLocator = By.xpath("//div[@class=\"_bXVsd_gridColumn_29_ls\"][1]");
    private final By addToCartButtonLocator = By.id("add-to-cart-button");
    private final By cartPageLocator = By.id("nav-cart");
    private final By itemInCartLocator = By.xpath("//div[@data-csa-c-posx=\"1\"]");




    public scenario1Page(WebDriver driver) {
        super(driver);
    }
    public void searchAboutItem(String text){
        sendKeys(searchBoxLocator,text);
        click(searchBoxSubmitLocator);
    }
    public void addItemToCart(){
        click(firstItemLocator);
        click(addToCartButtonLocator);
    }
    public void goToCartPage(){
        click(cartPageLocator);
    }
    public boolean checkItemInCart(){
    return driver.findElement(itemInCartLocator).isDisplayed();
    }
}
