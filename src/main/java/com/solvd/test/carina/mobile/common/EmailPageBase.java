package com.solvd.test.carina.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class EmailPageBase extends AbstractPage {
    public EmailPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeEmail(String email);

    public abstract PasswordPageBase clickContinueBtn();

    public abstract HomePageBase clickLoginBtn();

    public abstract HomePageBase clickStartedBtn();

    public abstract void typePassword(String password);

    public abstract boolean isContinueBtnActive();


    public abstract HomePageBase clickAllowBtn();
}