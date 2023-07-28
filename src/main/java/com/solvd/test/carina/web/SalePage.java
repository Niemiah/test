package com.solvd.test.carina.web;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SalePageBase.class)
public class SalePage extends SalePageBase {

    @FindBy(xpath = "//a[@href='https://www.nike.com/w/sale-3yaep']")
    private ExtendedWebElement salePagePath;

    public SalePage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(salePagePath);
        setPageURL("/sale");
    }
}
