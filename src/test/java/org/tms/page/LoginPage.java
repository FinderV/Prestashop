package org.tms.page;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.tms.utils.Waiter;

@Log4j2
public class LoginPage extends Page {

  @FindBy(xpath = "//*[@id='email']")
  private WebElement emailaddress;

  @FindBy(xpath = "//input[@id='email_create']")
  private WebElement emailaddresscreate;

  @FindBy(xpath = "//*[@id='passwd']")
  private WebElement password;

  @FindBy(xpath = "//input[@id='customer_firstname']")
  private WebElement firstname;

  @FindBy(xpath = "//input[@id='customer_lastname']")
  private WebElement lastname;

  @FindBy(xpath = "//input[@id='passwd']")
  private WebElement passwordcreate;

  @FindBy(xpath = "//*[@id='SubmitLogin']")
  private WebElement loginButton;

  @FindBy(xpath = "//a[@class='logout']")
  private WebElement logoutButton;

  @FindBy(xpath = "//span[@title='Продолжить покупки']")
  private WebElement continueShoppingButton;

  @FindBy(xpath = "//a[@title='Delete']")
  private WebElement removeItemFromCartButton;

  @FindBy(xpath = "//button[@id='SubmitCreate']")
  private WebElement submitCreateButton;

  @FindBy(xpath = "//button[@id='submitAccount']/span")
  private WebElement registerButton;

  @Step("Opening http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/")
  public LoginPage openPage(String url) {
    log.info("Open Login page");
    driver.get(url);
    return this;
  }

  @Step("Entering the Email Address {emailAddress}")
  public LoginPage fillInEmailAddress(String emailAddress) {
    log.info("Enter email address");
    waitVisibilityOf(emailaddress).sendKeys(emailAddress);
    return this;
  }

  @Step("Entering the Existing Email Address {existingEmailAddress}")
  public LoginPage fillInExistingEmailAddress(String existingEmailAddress) {
    log.info("Enter the existing email address");
    waitVisibilityOf(emailaddresscreate).sendKeys(existingEmailAddress);
    return this;
  }

  @Step("Entering the Email AddressCreate {emailAddressCreate}")
  public LoginPage fillInEmailAddressCreate(String emailAddressCreate) {
    log.info("Enter email address");
    waitVisibilityOf(emailaddresscreate).sendKeys(emailAddressCreate);
    return this;
  }

  @Step("Entering the First Name {firstName}")
  public LoginPage fillInFirstName(String firstName) {
    log.info("Enter the first name");
    waitVisibilityOf(firstname).sendKeys(firstName);
    return this;
  }

    @Step("Entering the Last Name {lastName}")
  public LoginPage fillInLastName(String lastName) {
    log.info("Enter the last name");
    waitVisibilityOf(lastname).sendKeys(lastName);
    return this;
  }

  @Step("Entering the user's password {keyPassword}")
  public LoginPage fillInPassword(String keyPassword) {
    log.info("Enter password");
    waitVisibilityOf(password).clear();
    password.sendKeys(keyPassword);
    return this;
  }

  @Step("Entering the  new user's password {keyPassword}")
  public LoginPage fillInPasswordCreate(String keyPassword) {
    log.info("Enter password");
    waitVisibilityOf(passwordcreate).clear();
    passwordcreate.sendKeys(keyPassword);
    return this;
  }

  @Step("Clicking the login button")
  public void clickLoginButton() {
    log.info("Click login button");
    waitElementToBeClickable(loginButton).click();
  }

  @Step("Clicking the logout button")
  public void clickLogoutButton() {
    log.info("Click logout button");
    waitElementToBeClickable(logoutButton).click();
  }

  @Step("Clicking to continue button")
  public void clickToContinueButton() {
    log.info("Click continue button");
    waitElementToBeClickable(continueShoppingButton).click();
  }

  @Step("Remove Item From Cart")
  public void clickRemoveItemFromCartButtonByIndex() {
    log.info("Click remove button");
    waitElementToBeClickable(removeItemFromCartButton).click();
  }

  @Step("Click Create An Account Button")
  public void clickCreateAnAccountButton() {
    log.info("Click create an account button");
    Waiter.waitForElementToBeClickable(submitCreateButton);
    waitElementToBeClickable(submitCreateButton).click();
  }

  @Step("Click to Register Button")
  public void clickToRegisterButton() {
    log.info("Click register button");
    waitElementToBeClickable(registerButton).click();
  }

  @Step("Entering the user's  wrong password {keyPassword}")
  public LoginPage fillInWrongPassword(String keyPassword) {
    log.info("Enter wrong password");
    waitVisibilityOf(password).clear();
    password.sendKeys(keyPassword);
    return this;
  }
}
