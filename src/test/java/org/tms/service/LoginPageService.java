package org.tms.service;

import io.qameta.allure.Step;
import org.tms.model.User;
import org.tms.page.InventoryPage;
import org.tms.page.LoginPage;

public class LoginPageService {

  protected static final String LOGIN_PAGE_URL = "http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/";
  protected static final String CART_PAGE_URL = "http://prestashop.qatestlab.com.ua/ru/order";
  protected static final String PRODUCT_PAGE = "http://prestashop.qatestlab.com.ua/ru/tshirts/1-faded-short-sleeve-tshirts.html";

  protected LoginPage loginPage = new LoginPage();
  protected User user = new User();

  @Step("Authorization on the site under the registered user")
  public InventoryPage login() {
    loginPage.openPage(LOGIN_PAGE_URL)
            .fillInEmailAddress(user.getEmailAddress())
            .fillInPassword(user.getPassword())
            .clickLoginButton();
    return new InventoryPage();
  }

  @Step("create new Account")
  public InventoryPage createAnAccount() {
    loginPage.openPage(LOGIN_PAGE_URL)
             .fillInEmailAddressCreate(user.getEmailAddressCreate())
             .clickCreateAnAccountButton();
    loginPage.fillInFirstName(user.getFirstName())
             .fillInLastName(user.getLastName())
             .fillInPasswordCreate(user.getPasswordCreate())
             .clickToRegisterButton();
    return new InventoryPage();
  }

  @Step("Create an account under an existing user")
  public InventoryPage createAnAccountUnderAnExistingUser() {
    loginPage.openPage(LOGIN_PAGE_URL)
            .fillInExistingEmailAddress(user.getExistingEmailAddress())
            .clickCreateAnAccountButton();
    loginPage.clickCreateAnAccountButton();
    return new InventoryPage();
  }

  @Step("Create an account control required fields")
  public InventoryPage createAnAccountControlRequiredFieldsTest() {
    loginPage.openPage(LOGIN_PAGE_URL)
              .fillInEmailAddressCreate(user.getEmailAddressCreateNew())
             .clickCreateAnAccountButton();
    loginPage.clickToRegisterButton();
    return new InventoryPage();
  }

  @Step("Authorization on the site under the wrong password")
  public InventoryPage loginWrongPassword() {
    loginPage.openPage(LOGIN_PAGE_URL)
            .fillInEmailAddress(user.getEmailAddress());
    loginPage.fillInWrongPassword(user.getWrongPassword())
            .clickLoginButton();
    return new InventoryPage();
  }

  @Step("Authorization on the site without password")
  public InventoryPage loginWithoutPassword() {
    loginPage.openPage(LOGIN_PAGE_URL)
            .fillInEmailAddress(user.getEmailAddress())
            .clickLoginButton();
    return new InventoryPage();
  }

  @Step("Logout from the site under the registered user")
  public InventoryPage logout() {
    loginPage.clickLogoutButton();
    return new InventoryPage();
  }

  @Step("Cart site")
  public InventoryPage cartPage() {
    loginPage.openPage(CART_PAGE_URL);
    return new InventoryPage();
  }

  @Step("Product site")
  public InventoryPage productPage() {
    loginPage.openPage(PRODUCT_PAGE);
    return new InventoryPage();
  }

  @Step("Remove item from cart")
  public InventoryPage clickRemoveItemFromCartButtonByIndex() {
    loginPage.clickRemoveItemFromCartButtonByIndex();
    return new InventoryPage();
  }

  @Step("Click to continue button")
  public InventoryPage clickToContinueButton() {
    loginPage.clickToContinueButton();
    return new InventoryPage();
  }
}
