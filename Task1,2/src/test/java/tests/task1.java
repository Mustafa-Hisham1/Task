package tests;

import Pages.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class task1 extends testBase{
    scenario1Page Task1;
    scenario2Page scenario2;
    SoftAssert soft;

    @Test(priority = 1)
    public void scenario1(){
        Task1 = new scenario1Page(driver);
        soft = new SoftAssert();

        Task1.searchAboutItem("car accessories");

        Task1.addItemToCart();

        Task1.goToCartPage();

        Task1.checkItemInCart();

        soft.assertTrue(Task1.checkItemInCart());

        soft.assertAll();


    }


    @Test(priority = 2)
    public void Scenario2(){
        scenario2 = new scenario2Page(driver);


        scenario2.goToTodayDeals();

        scenario2.filter();

        scenario2.scrollDown();

        scenario2.addProductToCart();
    }

}
