package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.CategoriesPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CategoriesPageBase.class)
public class CategoriesPage extends CategoriesPageBase implements IMobileUtils {


    public CategoriesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "search_button")
    private ExtendedWebElement searchBtn;

    @FindBy(id = "inbox_icon")
    private ExtendedWebElement inboxBtn;

    @FindBy(id = "cart_icon")
    private ExtendedWebElement cartBtn;

    public void clickSearchBtn() {
        searchBtn.click();
    }

    public void clickInboxBtn() {
        inboxBtn.click();
    }

    public void clickCartBtn() {
        cartBtn.click();
    }

    @Override
    public boolean isPageOpened() {
        return searchBtn.isPresent();
    }

}