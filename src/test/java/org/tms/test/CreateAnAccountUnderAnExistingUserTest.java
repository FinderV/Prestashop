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

public class CreateAnAccountUnderAnExistingUserTest extends BaseTest {

    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test(description = "Create an account under an existing user http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/")
    @Description("Create new account under an existing user http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/")
    @Link("https://github.com/FinderV")
    @Issue("FinderV")
    @TmsLink("FinderV")
    public void createAnAccountUnderAnExistingUserTest() {
        InventoryPage inventoryPage = loginPageService.createAnAccountUnderAnExistingUser();
        String actualTextOfCreateAnAccountUnderAnExistingUser = inventoryPage.getTextOfExistingAccount();
        String expectedTextOfCreateAnAccountUnderAnExistingUser = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
        Assert.assertEquals(actualTextOfCreateAnAccountUnderAnExistingUser, expectedTextOfCreateAnAccountUnderAnExistingUser, "Your account not has been created!");
    }
}

