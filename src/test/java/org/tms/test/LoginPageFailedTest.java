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


public class LoginPageFailedTest extends BaseTest {

    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test(description = "Login to http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/ with wrong password")
    @Description("Login to http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/ as 33077@mail.ru with wrong password")
    @Link("https://github.com/FinderV")
    @Issue("FinderV")
    @TmsLink("FinderV")
    public void loginWrongPasswordTest() {
        InventoryPage inventoryPage = loginPageService.loginWrongPassword();
        String actualTextOfMyAccountAuthenticationFailedSection = inventoryPage.getNameOfMyAccountAuthenticationFailedSection();
        String expectedTextOfMyAccountAuthenticationFailedSection = "Authentication failed.";
        Assert.assertEquals(actualTextOfMyAccountAuthenticationFailedSection, expectedTextOfMyAccountAuthenticationFailedSection, "The actual text of the page does not match expected!");
    }
}
