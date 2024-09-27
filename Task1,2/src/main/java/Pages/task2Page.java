package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class task2Page extends base{
    private final By leavingFromFieldLocator = By.id("fromCity_chosen");
    private final By selectCityFromLocator = By.xpath("(//li[contains(text(), 'Chikkamagaluru')])[1]");
    private final By goingToFieldLocator = By.id("toCity_chosen");
    private final By selectCityToLocator = By.xpath("(//li[contains(text(), 'Bengaluru')])[1]");
    private final By dateOfDepartureFieldLocator = By.id("departDate");
    private final By selectDateOfGoingLocator = By.xpath("//a[normalize-space()='10']");
    private final By searchBussesButtonLocator = By.id("submitSearch");
    private final By selectSeatButtonLocator = By.xpath("//div[@class=\"srch-card\"][1]//div[@class=\"selectbutton\"]");
    private final By seatLocator = By.xpath("//div[@style=\"position: relative; display: flex; height: 40px;\"][1]/div[9]");
    private final By BoardingPointFieldLocator = By.xpath("//div[@class=\"points\"]//div[@tabindex=\"0\"]");
    private final By selectBoardingLocator = By.className("pick--val");
    private final By selectDroppingPointFieldLocator = By.xpath("//div[@class=\"points\"]//div[@tabindex=\"1\"]");
    private final By selectDroppingLocator = By.className("drop--val");
     private final By providePassengerDetailsButton = By.className("btnPassDetails");

    // Customer Locators
    private final By mobileNumberFieldLocator = By.name("mobileNo");
    private final By emailFieldLocator = By.name("email");
    private final By proceedToPassengerButtonLocator = By.xpath("//div[@tabindex=\"1003\"]");

    // passenger Locators
    private final By providePassengerButton = By.className("btnPassDetails");
    private final By nameFieldLocator = By.name("paxName[0]");
    private final By genderFieldLocator = By.name("paxGender[0]");
    private final By selectGenderMaleLocator = By.xpath("//div[@class=\"ddn\"][1]");
    private final By ageFieldLocator = By.name("paxAge[0]");
    private final By concessionFieldLocator = By.name("paxConcessionType[0]");
    private final By selectConcessionLocator = By.name("ddn");
    private final By idCardFieldLocator = By.name("paxIDCardType[0]");
    private final By selectIdCardLocator = By.xpath("//div[@class=\"ddn\"][1]");
    private final By idCardNumberFieldLocator = By.name("paxIDCardType[0]");
    private final By countryFieldLocator = By.name("paxNationality[0]");
    private final By proceedToCheckoutButtonLocator = By.xpath("//div[@tabindex=\"14\"]");

    // review booking page Locators
    private final By agreeCheckboxLocator = By.className("checkbox");
    private final By proceedToPayButtonLocator = By.xpath("//div[@tabindex=\"15\"]");

    // Payment Locators
    private final By cardFieldLocator = By.xpath("//button[@method=\"card\"]");
    private final By cardNumberFieldLocator = By.id("card_number");
    private final By expiryFieldLocator = By.id("card_expiry");
    private final By cvvFieldLocator = By.id("card_cvv");
    private final By saveCardCheckboxLocator = By.id("save");


    public task2Page(WebDriver driver) {
        super(driver);
    }
    public void fillFirstPage()  {
        click(leavingFromFieldLocator);
       click(selectCityFromLocator);
        click(goingToFieldLocator);
        click(selectCityToLocator);
        click(dateOfDepartureFieldLocator);
        click(selectDateOfGoingLocator);
        click(searchBussesButtonLocator);



    }
    public void selectSeat() {
        click(selectSeatButtonLocator);
        click(seatLocator);
        click(selectBoardingLocator);
        click(selectDroppingPointFieldLocator);
        click(selectDroppingLocator);
        click(providePassengerDetailsButton);

    }
    public void fillCustomerFields(String mobileNumber , String email){
        sendKeys(mobileNumberFieldLocator , mobileNumber);
        sendKeys(emailFieldLocator , email);
        click(proceedToPassengerButtonLocator);
    }
    public void fillPassengerDetails(String name , String age , String idCardNumber){
        sendKeys(nameFieldLocator,name);
        click(genderFieldLocator);
        click(selectGenderMaleLocator);
        sendKeys(ageFieldLocator, age);
        click(concessionFieldLocator);
        click(selectConcessionLocator);
        click(idCardFieldLocator);
        click(selectIdCardLocator);
        sendKeys(idCardNumberFieldLocator,idCardNumber);
        click(proceedToCheckoutButtonLocator);
    }
    public void reviewBookingPage(){
        click(agreeCheckboxLocator);
        click(proceedToPayButtonLocator);
    }
    public void fillPaymentDetails(String cardNumber , String expiryNumber , String cvvNumber){
        click(cardFieldLocator);
        sendKeys(cardNumberFieldLocator , cardNumber);
        sendKeys(expiryFieldLocator , expiryNumber);
        sendKeys(cvvFieldLocator , cvvNumber);
        click(saveCardCheckboxLocator);
    }



}
