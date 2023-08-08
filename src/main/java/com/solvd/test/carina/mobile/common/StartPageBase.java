package com.solvd.test.carina.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class StartPageBase extends AbstractPage {
    public StartPageBase(WebDriver driver) {
        super(driver);
    }


    public abstract void clickNextBtn();

    public abstract SignInPageBase clickDntAllow();
}