package org.tms.test;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.ContactUsPage;
import org.tms.service.ContactUsService;

public class ContactUsTest extends BaseTest{

    private ContactUsService contactUsService;

    @BeforeClass
    public void setUp() {
        contactUsService = new ContactUsService();
    }

    @Test(description = "Contact us to http://prestashop.qatestlab.com.ua/en/contact-us")
    @Description("Contact us to http://prestashop.qatestlab.com.ua/en/contact-us as 33077@mail.ru")
    @Link("https://github.com/FinderV")
    @Issue("FinderV")
    @TmsLink("FinderV")
    public void contactUsTest() {
        ContactUsPage contactUsPage = contactUsService.contactUs();
        String actualTextOfContactUs = contactUsPage.getTextOfContactUs();
        String expectedTextOfContactUs = "Please select a subject from the list provided.";
        Assert.assertEquals(actualTextOfContactUs, expectedTextOfContactUs, "The actual text of the page does not match expected!");
    }
}
