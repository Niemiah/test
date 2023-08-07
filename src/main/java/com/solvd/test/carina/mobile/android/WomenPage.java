package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.WomenPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WomenPageBase.class)
public class WomenPage extends WomenPageBase implements IMobileUtils {


    public WomenPage(WebDriver driver) {
        super(driver);
    }




}