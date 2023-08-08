package com.solvd.test.carina.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class WalletPageBase extends AbstractPage {
    public WalletPageBase(WebDriver driver) {
        super(driver);
    }


    public abstract void clickRewardsBtn();

    public abstract void clickWalletCouponBtn();

    public abstract void clickPaymentMethodsBtn();
}