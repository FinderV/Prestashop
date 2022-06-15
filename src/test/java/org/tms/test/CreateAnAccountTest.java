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

public class CreateAnAccountTest extends BaseTest {

    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test(description = "Create an account http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/")
    @Description("Create new account http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/ as 33077erg@mail.ru")
    @Link("https://github.com/FinderV")
    @Issue("FinderV")
    @TmsLink("FinderV")
    public void createAnAccountTest() {
        InventoryPage inventoryPage = loginPageService.createAnAccount();
        String actualTextOfCreateAnAccount = inventoryPage.getTextOfCreateAnAccount();
        String expectedTextOfCreateAnAccount = "Your account has been created.";
        Assert.assertEquals(actualTextOfCreateAnAccount, expectedTextOfCreateAnAccount, "Your account not has been created!");
    }
}
