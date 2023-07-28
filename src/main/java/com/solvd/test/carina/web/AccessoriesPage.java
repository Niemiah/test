package com.solvd.test.carina.web;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = AccessoriesPageBase.class)
public class AccessoriesPage extends AccessoriesPageBase {

    @FindBy(xpath = "//a[@href='https://www.nike.com/w/accessories-equipment-awwpw']")
    private ExtendedWebElement accessoriesPagePath;

    public AccessoriesPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(accessoriesPagePath);
        setPageURL("/accessories");
    }
}
