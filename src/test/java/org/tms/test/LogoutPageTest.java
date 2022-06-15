package org.tms.test;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.InventoryPage;
import org.tms.service.LoginPageService;

public class LogoutPageTest extends BaseTest {

    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test(description = "Login to http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/")
    @Description("Login to http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/")
    @Link("https://github.com/FinderV")
    @Issue("FinderV")
    @TmsLink("FinderV")
    public void loginTest() {
        InventoryPage inventoryPage = loginPageService.login();
        String actualTextOfInventoryPage = inventoryPage.getTextOfNameOfMainPageSection();
        String expectedPageText = "MY ACCOUNT";
        Assert.assertEquals(actualTextOfInventoryPage, expectedPageText, "The actual text of the page does not match expected!");
    }

    @Test (dependsOnMethods = "loginTest")
    @Description("Logout from http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/")
    @Link("https://github.com/FinderV")
    @Issue("FinderV")
    @TmsLink("FinderV")
    public void logoutTest() {
        InventoryPage inventoryPage = loginPageService.logout();
        String actualTextOfInventoryPage = inventoryPage.getTextOfNameOfMainPageAuthentificationSection();
        String expectedPageText = "AUTHENTICATION";
        Assert.assertEquals(actualTextOfInventoryPage, expectedPageText, "The actual text of the page does not match expected!");
    }
}
