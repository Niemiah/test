package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.EmailPageBase;
import com.solvd.test.carina.mobile.common.HomePageBase;
import import com.solvd.test.carina.mobile.common.SignInPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = EmailPageBase.class)
public class EmailPage extends EmailPageBase implements IMobileUtils {
    public EmailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    private ExtendedWebElement emailInputField;

    @FindBy(id = "password")
    private ExtendedWebElement passwordInputField;

    @FindBy(className = "android.widget.Button")
    private ExtendedWebElement continueBtn;

    @FindBy(xpath = "//android.widget.Button[@text='Sign In']")
    private ExtendedWebElement signInButton;



    @Override
    public void typeEmail(String email) {
        emailInputField.type(email);
        hideKeyboard();
    }

    @Override
    public HomePageBase clickContinueBtn() {
        continueBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }

    @Override
    public void typePassword(String password) {
        passwordInputField.type(password);
    }

    @Override
    public boolean isContinueBtnActive() {
        return Boolean.parseBoolean(continueBtn.getAttribute("enabled"));
    }

}
