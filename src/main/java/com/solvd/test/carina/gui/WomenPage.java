package com.solvd.test.carina.gui;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = WomenPageBase.class)
public class WomenPage extends WomenPageBase {

    @FindBy(xpath = "//a[@href='https://www.nike.com/women']")
    private ExtendedWebElement womenPageTitle;

    public WomenPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(womenPageTitle);
        setPageURL("/women");
    }
}
