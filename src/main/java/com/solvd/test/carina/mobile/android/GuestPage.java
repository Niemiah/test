package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.GuestPageBase;
import com.solvd.test.carina.mobile.common.CategoriesPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GuestPageBase.class)
public class GuestPage extends CategoriesPageBase implements IMobileUtils {


    public GuestPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='My Orders']")
    private ExtendedWebElement myOrdersBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Settings']")
    private ExtendedWebElement settingsBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='My Lists']")
    private ExtendedWebElement myListsBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='JCPenney Credit Card']")
    private ExtendedWebElement jcPennyCardBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Customer Service']")
    private ExtendedWebElement customerServiceBtn;

    public void clickMyOrdersBtn() {
        myOrdersBtn.click();
    }

    @Override
    public void clickSettingsBtn() {
        settingsBtn.click();
    }

    @Override
    public void clickMyListsBtn() {
        myListsBtn.click();
    }

    @Override
    public void clickJCCreditCardBtn() {
        jcPennyCardBtn.click();
    }

    @Override
    public void clickCustomerServiceBtn() {
        customerServiceBtn.click();
    }





}