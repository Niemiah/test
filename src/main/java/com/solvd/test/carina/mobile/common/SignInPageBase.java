package com.solvd.test.carina.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SignInPageBase extends AbstractPage {
    public SignInPageBase(WebDriver driver) {
        super(driver);
    }


    public abstract void clickContinueBtn();

    public abstract void clickSignInBtn();

    public abstract ShoppingPageBase clickContinueAsGuestBtn();
}