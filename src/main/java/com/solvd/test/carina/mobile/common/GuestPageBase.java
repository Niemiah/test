package com.solvd.test.carina.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class GuestPageBase extends AbstractPage {
    public GuestPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickMyOrdersBtn();

    public abstract void clickSettingsBtn();

    public abstract void clickMyListsBtn();

    public abstract void clickJCCreditCardBtn();

    public abstract void clickCustomerServiceBtn();


}