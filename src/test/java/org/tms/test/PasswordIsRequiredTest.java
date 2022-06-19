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
import org.tms.utils.Retry;

public class PasswordIsRequiredTest extends BaseTest {

    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test(retryAnalyzer = Retry.class, description = "Login without password http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/")
    @Description("Login without password http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/")
    @Link("https://github.com/FinderV")
    @Issue("FinderV")
    @TmsLink("FinderV")
    public void loginWithoutPasswordTest() {
        InventoryPage inventoryPage = loginPageService.loginWithoutPassword();
        String actualNameOfAuthenticationWithoutPassword = inventoryPage.getNameOfAuthenticationWithoutPassword();
        String expectedNameOfAuthenticationWithoutPassword = "Password1 is required.";
        Assert.assertEquals(actualNameOfAuthenticationWithoutPassword, expectedNameOfAuthenticationWithoutPassword, "The actual text of the page does not match expected!");
    }
}
