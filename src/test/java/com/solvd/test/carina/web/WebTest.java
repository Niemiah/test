package com.solvd.test.carina.web;

import com.solvd.test.carina.gui.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.report.testrail.TestRailCases;
import org.testng.annotations.Test;

@MethodOwner(owner = "Niemiah")
public class WebTest implements IAbstractTest {

    @TestRailCases(testCasesId = "8")
    @Test(testName = "Nike home to men.", description = "Nike home to men's page.")
    public void testNavigationHomeToMenPage() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        homePage.assertPageOpened();
        homePage.pause(10);
        MenPageBase menPage = initPage(getDriver(), MenPageBase.class);
        menPage.open();
        menPage.assertPageOpened();
        menPage.pause(5);
    }

    @TestRailCases(testCasesId = "9")
    @Test(testName = "Nike home to accessories.", description = "Nike home to men's page.")
    public void testNavigationHomeToAccessoriesPage() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        homePage.assertPageOpened();
        homePage.pause(10);
        AccessoriesPageBase accessoriesPage = initPage(getDriver(), AccessoriesPageBase.class);
        accessoriesPage.open();
        accessoriesPage.assertPageOpened();
    }

    @TestRailCases(testCasesId = "10")
    @Test(testName = "Nike women's page.", description = "Nike women's page.")
    public void testNavigationToWomenPage() {
        WomenPageBase womenPage = initPage(getDriver(), WomenPageBase.class);
    }

    @TestRailCases(testCasesId = "11")
    @Test(testName = "Nike home to kids.", description = "Nike home page to kid's page.")
    public void testNavigationFromHomeToKidsPage() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        homePage.assertPageOpened();
        homePage.pause(10);
        KidPageBase kidPageBase = initPage(getDriver(), KidPageBase.class);
        kidPageBase.assertPageOpened();
    }

    @TestRailCases(testCasesId = "12")
    @Test(testName = "Nike home to women.", description = "Nike home page to women page.")
    public void testNavigationFromHomeToWomenPage() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        homePage.assertPageOpened();
        homePage.pause(10);
        WomenPageBase womenPageBase = initPage(getDriver(), WomenPageBase.class);
        womenPageBase.assertPageOpened();
    }


}
