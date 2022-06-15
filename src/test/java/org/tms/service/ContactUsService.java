package org.tms.service;

import io.qameta.allure.Step;
import org.tms.model.User;
import org.tms.page.ContactUsPage;
import org.tms.utils.Constants;

public class ContactUsService {

    protected User user = new User();
    protected ContactUsPage contactUsPage = new ContactUsPage();
    protected Constants constants = new Constants();

    @Step("Contact us message")
    public ContactUsPage contactUs() {
        contactUsPage.openPage(constants.CONTACT_US_URL)
                .fillInMessage(user.getMessage())
                .fillInEmailAddress(user.getEmailAddress())
                .clickSendButton();
        return new ContactUsPage();
    }
}
