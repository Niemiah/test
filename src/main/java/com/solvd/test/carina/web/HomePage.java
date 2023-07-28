package com.solvd.test.carina.web;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//a[@href='/men']")

    private ExtendedWebElement menMenu;

    @FindBy(xpath = "//a[@href='/women']")

    private ExtendedWebElement womenMenu;

    @FindBy(xpath = "//a[@href='/accessories']")

    private ExtendedWebElement accessoriesMenu;

    @FindBy(xpath = "//a[@href='/kid']")

    private ExtendedWebElement kidMenu;


    public HomePage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
    }

    @Override
    public MenPageBase openMenPage(){
        menMenu.click();
        return initPage(driver, MenPageBase.class);
    }

    @Override
    public WomenPageBase openWomenPage(){
        womenMenu.click();
        return initPage(driver, WomenPageBase.class);
    }

    @Override
    public AccessoriesPageBase openAccessoriesPage(){
        accessoriesMenu.click();
        return initPage(driver, AccessoriesPageBase.class);
    }

    @Override
    public KidPageBase openKidPage(){
        kidMenu.click();
        return initPage(driver, KidPageBase.class);
    }

}
