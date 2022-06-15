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

public class CreateAnAccountControlRequiredFieldsTest extends BaseTest {

    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test(description = "Create an account control required fields for http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/")
    @Description("Create an account control required fields for http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/")
    @Link("https://github.com/FinderV")
    @Issue("FinderV")
    @TmsLink("FinderV")
    public void createAnAccountControlRequiredFieldsTest() {
        InventoryPage inventoryPage = loginPageService.createAnAccountControlRequiredFieldsTest();
        String actualTextOfCreateAnAccountControlRequiredFields = inventoryPage.getTextOfControlRequiredFields();
        String expectedTextOfCreateAnAccountControlRequiredFields = "There are 3 errors\n" +
                "lastname is required.\n" +
                "firstname is required.\n" +
                "passwd is required.";
        Assert.assertEquals(actualTextOfCreateAnAccountControlRequiredFields, expectedTextOfCreateAnAccountControlRequiredFields, "Your account not has been created!");
    }
}