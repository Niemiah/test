package com.solvd.test.carina.mobile.oldandroid;

import com.solvd.test.carina.mobile.oldcommon.WomenPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WomenPageBase.class)
public class WomenPage extends WomenPageBase implements IMobileUtils {


    public WomenPage(WebDriver driver) {
        super(driver);
    }




}