package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.SignInPageBase;
import com.solvd.test.carina.mobile.common.ShoppingPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SignInPageBase.class)
public class SignInPage extends SignInPageBase implements IMobileUtils {


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.Button[@text='CREATE ACCOUNT']")
    private ExtendedWebElement createAcctBtn;

    @FindBy(xpath = "//android.widget.Button[@text='SIGN IN']")
    private ExtendedWebElement signInBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='CONTINUE AS GUEST']")
    private ExtendedWebElement contAsGuestBtn;

    @FindBy(className = "android.widget.ImageView")
    private ExtendedWebElement helloImage;


    @Override
    public void clickContinueBtn() {
        createAcctBtn.click();
    }

    @Override
    public void clickSignInBtn() {
        signInBtn.click();
    }

    @Override
    public ShoppingPageBase clickContinueAsGuestBtn() {
        contAsGuestBtn.click();
        return initPage(getDriver(), ShoppingPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return helloImage.isPresent();
    }

}