package com.solvd.test.carina.mobile.android;

import com.solvd.test.carina.mobile.common.CategoriesPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CategoriesPageBase.class)
public class CategoriesPage extends CategoriesPageBase implements IMobileUtils {


    public CategoriesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Shop']")
    private ExtendedWebElement shopCategoryBtn;





}