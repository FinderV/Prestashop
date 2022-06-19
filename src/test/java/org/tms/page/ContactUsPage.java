package org.tms.page;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class ContactUsPage extends Page{

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailaddress;

    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement messagehello;

    @FindBy(xpath = "//button[@id='submitMessage']")
    private WebElement buttonSend;

    @FindBy(xpath = "//li[text()='Please select a subject from the list provided. ']")
    private WebElement nameOfContactUs;

    @Step("Opening http://prestashop.qatestlab.com.ua/en/contact-us")
    public ContactUsPage openPage(String url) {
        log.info("Open Contact us page");
        driver.get(url);
        return this;
    }

    @Step("Entering the Email Address {emailAddress}")
    public ContactUsPage fillInEmailAddress(String emailAddress) {
        log.info("Enter email address");
        waitVisibilityOf(emailaddress).sendKeys(emailAddress);
        return this;
    }

    @Step("Entering the messageHello {message}")
    public ContactUsPage fillInMessage(String message) {
        log.info("Enter message");
        waitVisibilityOf(messagehello).sendKeys(message);
        return this;
    }

    @Step("Clicking the Send button")
    public void clickSendButton() {
        log.info("Click Send button");
        waitElementToBeClickable(buttonSend).click();
    }

    @Step("Get text of contact us")
    public String getTextOfContactUs() {
        log.info("Get text of contact us");
        return nameOfContactUs.getText();
    }
}
