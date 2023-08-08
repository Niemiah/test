package com.solvd.test.carina.mobile.oldandroid;

import com.solvd.test.carina.mobile.oldcommon.HomePageBase;
import com.solvd.test.carina.mobile.oldcommon.PasswordPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PasswordPageBase.class)
public class PasswordPage extends PasswordPageBase implements IMobileUtils {

    public PasswordPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "password")
    private ExtendedWebElement passwordInputField;

    @FindBy(xpath = "//android.widget.Button[@text='Sign In']")
    private ExtendedWebElement signInBtn;

    @Override
    public HomePageBase clickSignInBtn() {
        signInBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }

    @Override
    public void typePassword(String password) {
        passwordInputField.type(password);
        hideKeyboard();
    }

}