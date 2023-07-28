package com.solvd.test.carina.web;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = KidPageBase.class)
public class KidPage extends KidPageBase {

    @FindBy(xpath = "//a[@href='https://www.nike.com/kids']")
    private ExtendedWebElement kidPagePath;

    public KidPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(kidPagePath);
        setPageURL("/kid");
    }
}
