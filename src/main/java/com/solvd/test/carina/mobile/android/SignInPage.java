package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.SignInPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SignInPageBase.class)
public class SignInPage extends SignInPageBase implements IMobileUtils {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    private ExtendedWebElement emailInputField;
    @FindBy(id = "name")
    private ExtendedWebElement nameInputField;

    @FindBy(id = "android.widget.Button")
    private ExtendedWebElement continueBtn;



    @Override
    public void typeName(String name) {
        nameInputField.type(name);
        hideKeyboard();
    }

    @Override
    public void typeEmail(String email) {
        emailInputField.type(email);
        hideKeyboard();
    }

}
