package com.solvd.test.carina.mobile.oldandroid;

import com.solvd.test.carina.mobile.oldcommon.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase implements IMobileUtils {

    public HomePage(WebDriver driver) {
        super(driver);
    }

}