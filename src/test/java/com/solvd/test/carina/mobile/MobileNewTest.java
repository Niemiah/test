package com.solvd.test.carina.mobile;

import com.solvd.test.carina.mobile.common.SignInPageBase;
import com.solvd.test.carina.mobile.common.StartPageBase;
import com.solvd.test.carina.mobile.common.ShoppingPageBase;
import com.solvd.test.carina.mobile.common.CategoriesPageBase;
import com.solvd.test.carina.mobile.oldcommon.PasswordPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.report.testrail.TestRailCases;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

@MethodOwner(owner = "Niemiah")
public class MobileNewTest implements IAbstractTest, IMobileUtils {

    @Test()
    @MethodOwner(owner = "Niemiah")
    public void testNavToCategoriesPage() {
        StartPageBase startPage = initPage(getDriver(), StartPageBase.class);
        Assert.assertTrue(startPage.isPageOpened(), "Start page isn't opened");
        startPage.clickNextBtn();
        SignInPageBase signInPage = startPage.clickDntAllow();
        Assert.assertTrue(signInPage.isPageOpened(), "Start page isn't opened");
        ShoppingPageBase shoppingPage = signInPage.clickContinueAsGuestBtn();
        shoppingPage.clickDntAllowBtn2();
        Assert.assertTrue(shoppingPage.isPageOpened(), "Shopping page isn't opened");

    }

    @Test()
    @MethodOwner(owner = "Niemiah")
    public void testNavToShopCategoryPage() {
        StartPageBase startPage = initPage(getDriver(), StartPageBase.class);
        Assert.assertTrue(startPage.isPageOpened(), "Start page isn't opened");
        startPage.clickNextBtn();
        SignInPageBase signInPage = startPage.clickDntAllow();
        Assert.assertTrue(signInPage.isPageOpened(), "Start page isn't opened");
        ShoppingPageBase shoppingPage = signInPage.clickContinueAsGuestBtn();
        shoppingPage.clickDntAllowBtn2();
        Assert.assertTrue(shoppingPage.isPageOpened(), "Shopping page isn't opened");
        CategoriesPageBase categoriesPage = shoppingPage.clickShopBtn();

    }
}
