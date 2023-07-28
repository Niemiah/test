package com.solvd.test.carina.gui;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = MenPageBase.class)
public class MenPage extends MenPageBase {

    @FindBy(xpath = "//a[@href='https://www.nike.com/men']")
    private ExtendedWebElement menPagePath;

    public MenPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(menPagePath);
        setPageURL("/men");
    }
}
