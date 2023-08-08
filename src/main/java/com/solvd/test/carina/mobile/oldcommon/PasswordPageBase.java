package com.solvd.test.carina.mobile.oldcommon;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PasswordPageBase extends AbstractPage {
    public PasswordPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract HomePageBase clickSignInBtn();

    public abstract void typePassword(String password);
}