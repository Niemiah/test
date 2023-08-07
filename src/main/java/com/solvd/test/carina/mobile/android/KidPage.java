package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.KidPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = KidPageBase.class)
public class KidPage extends KidPageBase implements IMobileUtils {


    public KidPage(WebDriver driver) {
        super(driver);
    }
}