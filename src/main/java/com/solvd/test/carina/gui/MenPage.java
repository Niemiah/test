package com.solvd.test.carina.gui;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = MenPageBase.class)
public class MenPage extends MenPageBase {

    @FindBy(xpath = "//h1[text()='Men']")
    private ExtendedWebElement menPageTitle;

    public MenPage(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(menPageTitle);
        setPageURL("/men");
    }
}
