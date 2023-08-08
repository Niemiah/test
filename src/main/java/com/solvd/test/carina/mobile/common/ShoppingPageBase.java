package com.solvd.test.carina.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ShoppingPageBase extends AbstractPage {
    public ShoppingPageBase(WebDriver driver) {
        super(driver);
    }


    public abstract void clickDntAllowBtn2();

    public abstract CategoriesPageBase clickShopBtn();

    public abstract GuestPageBase clickGuestBtn();
}