package tests;

import Pages.*;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class task2 {
    protected WebDriver driver;
    task2Page task2;
    Faker fake;

    @BeforeMethod
    public void beforeMethod() {
       // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
    }
    @Test
    public void task2(){
        task2 = new task2Page(driver);
        fake = new Faker();
        String email = fake.internet().safeEmailAddress();
        String name = fake.name().firstName();
        String cardNumber = fake.business().creditCardNumber();
        String expiry = fake.business().creditCardExpiry();


        task2.fillFirstPage();

        task2.selectSeat();

        task2.fillCustomerFields("6789125987", email);

        task2.fillPassengerDetails(name,"22","122");

        task2.reviewBookingPage();

        task2.fillPaymentDetails(cardNumber,expiry,"157");

    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(1500);
        driver.quit();
    }
}
