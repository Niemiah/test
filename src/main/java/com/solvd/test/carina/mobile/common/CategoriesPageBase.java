package com.solvd.test.carina.mobile.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CategoriesPageBase extends AbstractPage {
    public CategoriesPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickSearchBtn();
    public abstract void clickInboxBtn();
    public abstract void clickCartBtn();

}