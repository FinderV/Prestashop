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
    driver.get(url);
    return this;
  }

  @Step("Entering the Email Address {emailAddress}")
  public LoginPage fillInEmailAddress(String emailAddress) {
    waitVisibilityOf(emailaddress).sendKeys(emailAddress);
    return this;
  }

  @Step("Entering the Existing Email Address {existingEmailAddress}")
  public LoginPage fillInExistingEmailAddress(String existingEmailAddress) {
    waitVisibilityOf(emailaddresscreate).sendKeys(existingEmailAddress);
    return this;
  }

  @Step("Entering the Email AddressCreate {emailAddressCreate}")
  public LoginPage fillInEmailAddressCreate(String emailAddressCreate) {
    waitVisibilityOf(emailaddresscreate).sendKeys(emailAddressCreate);
    return this;
  }

  @Step("Entering the First Name {firstName}")
  public LoginPage fillInFirstName(String firstName) {
    waitVisibilityOf(firstname).sendKeys(firstName);
    return this;
  }

    @Step("Entering the Last Name {lastName}")
  public LoginPage fillInLastName(String lastName) {
    waitVisibilityOf(lastname).sendKeys(lastName);
    return this;
  }

  @Step("Entering the user's password {keyPassword}")
  public LoginPage fillInPassword(String keyPassword) {
    waitVisibilityOf(password).clear();
    password.sendKeys(keyPassword);
    return this;
  }

  @Step("Entering the  new user's password {keyPassword}")
  public LoginPage fillInPasswordCreate(String keyPassword) {
    waitVisibilityOf(passwordcreate).clear();
    passwordcreate.sendKeys(keyPassword);
    return this;
  }

  @Step("Clicking the login button")
  public void clickLoginButton() {
    waitElementToBeClickable(loginButton).click();
  }

  @Step("Clicking the login button")
  public void clickLogoutButton() {
    waitElementToBeClickable(logoutButton).click();
  }

  @Step("Clicking to continue button")
  public void clickToContinueButton() {
    waitElementToBeClickable(continueShoppingButton).click();
  }

  @Step("Remove Item From Cart")
  public void clickRemoveItemFromCartButtonByIndex() {
    waitElementToBeClickable(removeItemFromCartButton).click();
  }

  @Step("click Create An Account Button")
  public void clickCreateAnAccountButton() {
    Waiter.waitForElementToBeClickable(submitCreateButton);
    waitElementToBeClickable(submitCreateButton).click();
  }

  @Step("click Create An Account Button")
  public void clickToRegisterButton() {
    waitElementToBeClickable(registerButton).click();
  }

  @Step("Entering the user's  wrong password {keyPassword}")
  public LoginPage fillInWrongPassword(String keyPassword) {
    waitVisibilityOf(password).clear();
    password.sendKeys(keyPassword);
    return this;
  }

}