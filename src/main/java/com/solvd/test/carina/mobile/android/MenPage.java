package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.MenPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MenPageBase.class)
public class MenPage extends MenPageBase implements IMobileUtils {


    public MenPage(WebDriver driver) {
        super(driver);
    }
}