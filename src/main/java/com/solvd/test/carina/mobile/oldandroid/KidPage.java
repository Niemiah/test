package com.solvd.test.carina.mobile.oldandroid;

import com.solvd.test.carina.mobile.oldcommon.KidPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = KidPageBase.class)
public class KidPage extends KidPageBase implements IMobileUtils {


    public KidPage(WebDriver driver) {
        super(driver);
    }
}