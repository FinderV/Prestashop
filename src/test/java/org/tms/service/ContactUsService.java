package org.tms.service;

import io.qameta.allure.Step;
import org.tms.model.User;
import org.tms.page.ContactUsPage;

public class ContactUsService {

    protected static final String CONTACT_US_URL = "http://prestashop.qatestlab.com.ua/en/contact-us";
    protected User user = new User();
    protected ContactUsPage contactUsPage = new ContactUsPage();

    @Step("Contact us message")
    public ContactUsPage contactUs() {
        contactUsPage.openPage(CONTACT_US_URL)
                .fillInMessage(user.getMessage())
                .fillInEmailAddress(user.getEmailAddress())
                .clickSendButton();
        return new ContactUsPage();
    }
}
