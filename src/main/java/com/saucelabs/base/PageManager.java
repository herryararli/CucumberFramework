package com.saucelabs.base;

import com.saucelabs.pages.*;

public class PageManager {


    public static LoginPage loginPage;
    public static ItemPage itemPage;
    public static CheckOutStepOne checkOutStepOne;
    public static CheckOutStepTwo checkOutStepTwo;
    public static CheckoutStep3 checkOutPage;
    public static HomePage homePage;

    public static  void initialize(){
        // initialize pages
        loginPage = new LoginPage();
        itemPage = new ItemPage();
        checkOutPage = new CheckoutStep3();
        checkOutStepOne = new CheckOutStepOne();
        checkOutStepTwo = new CheckOutStepTwo();
        homePage = new HomePage();

    }




}
