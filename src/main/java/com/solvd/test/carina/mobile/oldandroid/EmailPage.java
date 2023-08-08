package com.solvd.test.carina.mobile.oldandroid;

import com.solvd.test.carina.mobile.oldcommon.EmailPageBase;
import com.solvd.test.carina.mobile.oldcommon.HomePageBase;
import com.solvd.test.carina.mobile.oldcommon.PasswordPageBase;
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


    @FindBy(xpath = "//android.widget.Button[@text='continue]")
    private ExtendedWebElement continueBtn;

    @FindBy(id = "get_started_button")
    private ExtendedWebElement startedBtn;

    @FindBy(id = "allow_button")
    private ExtendedWebElement allowBtn;



    @Override
    public void typeEmail(String email) {
        emailInputField.type(email);
        hideKeyboard();
    }

    @Override
    public PasswordPageBase clickContinueBtn() {
        continueBtn.click();
        return initPage(getDriver(), PasswordPageBase.class);
    }

    @Override
    public boolean isContinueBtnActive() {
        return Boolean.parseBoolean(continueBtn.getAttribute("enabled"));
    }

    @Override
    public HomePageBase clickStartedBtn() {
        startedBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }

    @Override
    public HomePageBase clickAllowBtn() {
        allowBtn.click();
        return initPage(getDriver(), HomePageBase.class);
    }

}
