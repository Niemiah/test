package com.solvd.test.carina.web;

import com.solvd.test.carina.mobile.common.WelcomePageBase;
import com.solvd.test.carina.mobile.common.SignInPageBase;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.report.testrail.TestRailCases;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.zebrunner.carina.utils.mobile.IMobileUtils;

@MethodOwner(owner = "Niemiah")
public class MobileTest implements IAbstractTest, IMobileUtils {

    @Test()
    @MethodOwner(owner = "qpsdemo")
    @TestLabel(name = "feature", value = {"mobile", "regression"})
    public void testLoginUser() {
        String username = "testlabamobile@gmail.com";
        String email = "testlabamobile@gmail.com";
        String password = "@Testlaba1";
        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page is opened");
        SignInPageBase signInPage = welcomePage.clickSignInBtn();
        signInPage.typeName(username);
        signInPage.typeEmail(email);
    }

    @TestRailCases(testCasesId = "9")
    @Test(testName = "Nike home to accessories", description = "Nike home to men's page.")
    public void testNavigationHomeToAccessoriesPage() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        homePage.assertPageOpened();
        homePage.pause(8);
        AccessoriesPageBase accessoriesPage = initPage(getDriver(), AccessoriesPageBase.class);
        accessoriesPage.open();
        accessoriesPage.assertPageOpened();
        accessoriesPage.pause(5);
    }

    @TestRailCases(testCasesId = "10")
    @Test(testName = "Nike home to sales", description = "Nike home to men's page.")
    public void testNavigationHomeToSalePage() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        homePage.assertPageOpened();
        homePage.pause(8);
        SalePageBase salePage = initPage(getDriver(), SalePageBase.class);
        salePage.open();
        salePage.assertPageOpened();
        salePage.pause(5);
    }

    @TestRailCases(testCasesId = "11")
    @Test(testName = "Nike home to kids", description = "Nike home page to kid's page.")
    public void testNavigationFromHomeToKidsPage() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        homePage.assertPageOpened();
        homePage.pause(8);
        KidPageBase kidPageBase = initPage(getDriver(), KidPageBase.class);
        kidPageBase.assertPageOpened();
        kidPageBase.pause(5);
    }

    @TestRailCases(testCasesId = "12")
    @Test(testName = "Nike home to women", description = "Nike home page to women page.")
    public void testNavigationFromHomeToWomenPage() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        homePage.assertPageOpened();
        homePage.pause(8);
        WomenPageBase womenPageBase = initPage(getDriver(), WomenPageBase.class);
        womenPageBase.assertPageOpened();
        womenPageBase.pause(5);
    }
}
