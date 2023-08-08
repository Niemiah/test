package com.solvd.test.carina.mobile.oldandroid;

import com.solvd.test.carina.mobile.oldcommon.MenPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MenPageBase.class)
public class MenPage extends MenPageBase implements IMobileUtils {


    public MenPage(WebDriver driver) {
        super(driver);
    }
}