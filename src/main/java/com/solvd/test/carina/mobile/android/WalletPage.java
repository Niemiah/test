package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.WalletPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WalletPageBase.class)
public class WalletPage extends WalletPageBase implements IMobileUtils {


    public WalletPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//android.widget.TextView[@text='Wallet']")
    private ExtendedWebElement walletImage;

    @FindBy(id = "walletRewardsTab")
    private ExtendedWebElement rewardsBtn;

    @FindBy(id = "walletCouponsTab")
    private ExtendedWebElement walletCouponsBtn;

    @FindBy(id = "walletPaymentMethodsTab")
    private ExtendedWebElement walletPaymentMethodsBtn;

    @Override
    public void clickRewardsBtn() {
        rewardsBtn.click();
    }

    @Override
    public void clickWalletCouponBtn() {
        walletCouponsBtn.click();
    }

    @Override
    public void clickPaymentMethodsBtn() {
        walletPaymentMethodsBtn.click();
    }

    @Override
    public boolean isPageOpened() {
        return walletImage.isPresent();
    }


}