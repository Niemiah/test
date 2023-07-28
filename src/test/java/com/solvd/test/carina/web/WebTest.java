package com.solvd.test.carina.web;

import com.solvd.test.carina.gui.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.report.testrail.TestRailCases;
import org.testng.annotations.Test;

@MethodOwner(owner = "Niemiah")
public class WebTest implements IAbstractTest {

    @TestRailCases(testCasesId = "8")
    @Test(testName = "Nike men's page.", description = "Nike men's page.")
    public void testNavigationToMenPage() {
        MenPageBase menPage = initPage(getDriver(), MenPageBase.class);
        menPage.open();
        menPage.assertPageOpened();


    }

    @TestRailCases(testCasesId = "9")
    @Test(testName = "Nike women's page.", description = "Nike women's page.")
    public void testNavigationToWomenPage() {
        WomenPageBase womenPage = initPage(getDriver(), WomenPageBase.class);
    }

    @TestRailCases(testCasesId = "10")
    @Test(testName = "Nike home's page.", description = "Nike's home page.")
    public void testNavigationHomePage() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
    }

    @TestRailCases(testCasesId = "11")
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
