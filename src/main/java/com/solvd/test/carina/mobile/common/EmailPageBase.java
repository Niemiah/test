package com.solvd.test.carina.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class EmailPageBase extends AbstractPage {
    public EmailPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeEmail(String email);

    public abstract boolean isSignInBtnActive();

}