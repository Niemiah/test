package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.EmailPageBase;
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
    @FindBy(id = "name")
    private ExtendedWebElement nameInputField;

    @FindBy(className = "android.widget.Button")
    private ExtendedWebElement continueBtn;



    @Override
    public void typeEmail(String email) {
        emailInputField.type(email);
        hideKeyboard();
    }

    @Override
    public CarinaDescriptionPageBase clickContinueBtn() {
        continueBtn.click();
        return initPage(getDriver(), CarinaDescriptionPageBase.class);
    }

    @Override
    public boolean isSignInBtnActive() {
        return Boolean.parseBoolean(signInBtn.getAttribute("enabled"));
    }

}
