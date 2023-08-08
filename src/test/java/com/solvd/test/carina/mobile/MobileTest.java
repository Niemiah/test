package com.solvd.test.carina.mobile;

import com.solvd.test.carina.mobile.common.SignInPageBase;
import com.solvd.test.carina.mobile.common.StartPageBase;
import com.solvd.test.carina.mobile.common.ShoppingPageBase;
import com.solvd.test.carina.mobile.common.CategoriesPageBase;
import com.solvd.test.carina.mobile.common.GuestPageBase;
import com.solvd.test.carina.mobile.common.WalletPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.report.testrail.TestRailCases;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

@MethodOwner(owner = "Niemiah")
public class MobileTest implements IAbstractTest, IMobileUtils {

    @TestRailCases(testCasesId = "13")
    @Test()
    @MethodOwner(owner = "Niemiah")
    public void testNavToCategoriesPage() {
        StartPageBase startPage = initPage(getDriver(), StartPageBase.class);
        Assert.assertTrue(startPage.isPageOpened(), "Start page isn't opened");
        startPage.clickNextBtn();
        SignInPageBase signInPage = startPage.clickDntAllow();
        Assert.assertTrue(signInPage.isPageOpened(), "Sign in page isn't opened");
        ShoppingPageBase shoppingPage = signInPage.clickContinueAsGuestBtn();
        shoppingPage.clickDntAllowBtn2();
        Assert.assertTrue(shoppingPage.isPageOpened(), "Shopping page isn't opened");

    }

    @TestRailCases(testCasesId = "14")
    @Test()
    @MethodOwner(owner = "Niemiah")
    public void testNavToShopCategoryPage() {
        StartPageBase startPage = initPage(getDriver(), StartPageBase.class);
        Assert.assertTrue(startPage.isPageOpened(), "Start page isn't opened");
        startPage.clickNextBtn();
        SignInPageBase signInPage = startPage.clickDntAllow();
        Assert.assertTrue(signInPage.isPageOpened(), "Sign in page isn't opened");
        ShoppingPageBase shoppingPage = signInPage.clickContinueAsGuestBtn();
        shoppingPage.clickDntAllowBtn2();
        Assert.assertTrue(shoppingPage.isPageOpened(), "Shopping page isn't opened");
        CategoriesPageBase categoriesPage = shoppingPage.clickShopBtn();
        Assert.assertTrue(categoriesPage.isPageOpened(), "Shopping page isn't opened");

    }

    @TestRailCases(testCasesId = "15")
    @Test()
    @MethodOwner(owner = "Niemiah")
    public void testNavToGuestPage() {
        StartPageBase startPage = initPage(getDriver(), StartPageBase.class);
        Assert.assertTrue(startPage.isPageOpened(), "Start page isn't opened");
        startPage.clickNextBtn();
        SignInPageBase signInPage = startPage.clickDntAllow();
        Assert.assertTrue(signInPage.isPageOpened(), "Start page isn't opened");
        ShoppingPageBase shoppingPage = signInPage.clickContinueAsGuestBtn();
        shoppingPage.clickDntAllowBtn2();
        Assert.assertTrue(shoppingPage.isPageOpened(), "Shopping page isn't opened");
        GuestPageBase guestPage = shoppingPage.clickGuestBtn();
        Assert.assertTrue(guestPage.isPageOpened(), "Shopping page isn't opened");

    }

    @TestRailCases(testCasesId = "16")
    @Test()
    @MethodOwner(owner = "Niemiah")
    public void testNavToWalletPage() {
        StartPageBase startPage = initPage(getDriver(), StartPageBase.class);
        Assert.assertTrue(startPage.isPageOpened(), "Start page isn't opened");
        startPage.clickNextBtn();
        SignInPageBase signInPage = startPage.clickDntAllow();
        Assert.assertTrue(signInPage.isPageOpened(), "Start page isn't opened");
        ShoppingPageBase shoppingPage = signInPage.clickContinueAsGuestBtn();
        shoppingPage.clickDntAllowBtn2();
        Assert.assertTrue(shoppingPage.isPageOpened(), "Shopping page isn't opened");
        WalletPageBase walletPage = shoppingPage.clickWalletBtn();
        Assert.assertTrue(walletPage.isPageOpened(), "Shopping page isn't opened");

    }

    @TestRailCases(testCasesId = "17")
    @Test()
    @MethodOwner(owner = "Niemiah")
    public void testNavFromGuestToWalletPage() {
        StartPageBase startPage = initPage(getDriver(), StartPageBase.class);
        Assert.assertTrue(startPage.isPageOpened(), "Start page isn't opened");
        startPage.clickNextBtn();
        SignInPageBase signInPage = startPage.clickDntAllow();
        Assert.assertTrue(signInPage.isPageOpened(), "Start page isn't opened");
        ShoppingPageBase shoppingPage = signInPage.clickContinueAsGuestBtn();
        shoppingPage.clickDntAllowBtn2();
        Assert.assertTrue(shoppingPage.isPageOpened(), "Shopping page isn't opened");
        GuestPageBase guestPage = shoppingPage.clickGuestBtn();
        Assert.assertTrue(guestPage.isPageOpened(), "Shopping page isn't opened");
        WalletPageBase walletPage = shoppingPage.clickWalletBtn();
        Assert.assertTrue(walletPage.isPageOpened(), "Shopping page isn't opened");


    }
}
