package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class base {
    protected WebDriver driver;

    public base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);


    }

    protected void click(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    protected void click(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

    }

    protected void sendKeys(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    protected void sendKeys(By by, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).sendKeys(text);
    }

    protected void select(By by, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Select element = new Select(driver.findElement(by));
        element.selectByVisibleText(text);

    }

    protected void select(By by, int number) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Select element = new Select(driver.findElement(by));
        element.selectByIndex(number);

    }

    protected void selectByValue(By by, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Select element = new Select(driver.findElement(by));
        element.selectByValue(text);

    }

    protected void scrollDown(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(by));

    }

    protected void scrollDown(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    protected void scrollDownBy(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")");

    }

    protected void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    protected void hover(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    protected void hover(By by) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(by)).perform();

    }

    protected void waitUntilElementToBeVisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    protected void waitUntilElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void hoverAndClick(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();
    }
    protected void hoverAndClick(By by){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(by)).click().perform();
    }
    protected void clear (By by){
        driver.findElement(by).clear();
    }
}
