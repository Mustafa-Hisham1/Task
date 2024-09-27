package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class scenario2Page extends base {
    private final By todayOfferLocator = By.xpath("//div[@id=\"nav-xshop\"]//a[1]");
    private final By seeMoreLocator = By.xpath("//a[@aria-labelledby=\"see-more-departments-label\"]");
    private final By groceryLocator = By.xpath("//div[@aria-labelledby=\"departments\"]//div[@data-csa-c-element-id=\"filter-departments-السوبر ماركت\"]");
    private final By tenPercentageLocator = By.xpath("//div[@aria-labelledby=\"percentOff\"]//span[2]");
    private final By loadMoreLocator = By.xpath("//div[@data-testid=\"load-more-footer\"]");
    private final By productLocator = By.xpath("//div[@data-test-index=\"130\"]");
    private final By addToCardButtonLocator = By.id("add-to-cart-button");

    public scenario2Page(WebDriver driver) {
        super(driver);
    }
    public void goToTodayDeals(){
        click(todayOfferLocator);
    }

    public void filter(){
        click(seeMoreLocator);
        click(groceryLocator);
        scrollDown(tenPercentageLocator);
        click(tenPercentageLocator);


    }

    public void scrollDown() {

        for (int i = 0; i <= 2; i++) {
            scrollDown(loadMoreLocator);


        }
    }
    public void addProductToCart() {
        click(productLocator);
        click(addToCardButtonLocator);
    }
}
