package com.solvd.test.carina.gui;

import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
public abstract class HomePageBase extends AbstractPage {
    public HomePageBase(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
    }

    public abstract MenPageBase openMenPage();

    public abstract WomenPageBase openWomenPage();

    public abstract AccessoriesPageBase openAccessoriesPage();

    public abstract KidPageBase openKidPage();

}
