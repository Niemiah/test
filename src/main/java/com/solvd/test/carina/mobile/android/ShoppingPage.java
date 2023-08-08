package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.GuestPageBase;
import com.solvd.test.carina.mobile.common.ShoppingPageBase;
import com.solvd.test.carina.mobile.common.CategoriesPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ShoppingPageBase.class)
public class ShoppingPage extends ShoppingPageBase implements IMobileUtils {


    public ShoppingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Shop']")
    private ExtendedWebElement shopBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Guest']")
    private ExtendedWebElement guestBtn;

    @FindBy(xpath = "//android.widget.Button[@text='Don’t allow']")
    private ExtendedWebElement dntAllowBtn2;

    @FindBy(id = "jcp_logo")
    private ExtendedWebElement jcpImage;


    @Override
    public void clickDntAllowBtn2() {
        dntAllowBtn2.click();
        hideKeyboard();
    }

    @Override
    public CategoriesPageBase clickShopBtn() {
        shopBtn.click();
        return initPage(getDriver(), CategoriesPageBase.class);
    }

    @Override
    public GuestPageBase clickGuestBtn() {
        guestBtn.click();
        return initPage(getDriver(), GuestPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return jcpImage.isPresent();
    }


}