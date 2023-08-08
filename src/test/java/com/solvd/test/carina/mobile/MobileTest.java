package com.solvd.test.carina.mobile;

import com.solvd.test.carina.mobile.oldcommon.WelcomePageBase;
import com.solvd.test.carina.mobile.oldcommon.EmailPageBase;
import com.solvd.test.carina.mobile.oldcommon.PasswordPageBase;
import com.solvd.test.carina.mobile.oldcommon.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.report.testrail.TestRailCases;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

@MethodOwner(owner = "Niemiah")
public class MobileTest implements IAbstractTest, IMobileUtils {

    @Test()
    @MethodOwner(owner = "Niemiah")
    public void testLoginUser() {
        String email = "testlabamobile@gmail.com";
        String password = "@Testlaba1";
        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        Assert.assertFalse(welcomePage.isPageOpened(), "Welcome page is opened");
        EmailPageBase emailPage = welcomePage.clickLoginBtn();
        emailPage.typeEmail(email);
        PasswordPageBase passwordPage = emailPage.clickContinueBtn();
    }

}
