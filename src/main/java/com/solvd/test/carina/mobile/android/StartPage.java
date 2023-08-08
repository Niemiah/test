package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.StartPageBase;
import com.solvd.test.carina.mobile.common.SignInPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = StartPageBase.class)
public class StartPage extends StartPageBase implements IMobileUtils {


    public StartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.Button[@text='NEXT']")
    private ExtendedWebElement nextBtn;

    @FindBy(xpath = "//android.widget.Button[@text='Don’t allow']")
    private ExtendedWebElement dntAllowBtn;

    @FindBy(className = "android.widget.ImageView")
    private ExtendedWebElement headerImage;

    @Override
    public void clickNextBtn() {
        nextBtn.click();
        hideKeyboard();
    }

    @Override
    public SignInPageBase clickDntAllow() {
        dntAllowBtn.click();
        hideKeyboard();
        return initPage(getDriver(), SignInPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return headerImage.isPresent();
    }



}