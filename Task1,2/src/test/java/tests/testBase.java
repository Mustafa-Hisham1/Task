package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class testBase {
    protected WebDriver driver;
    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        //driver.manage().window().setSize(new Dimension(1024,768));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.eg/");
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(1500);
        driver.quit();
    }
}
