package org.tms.page;

import java.util.List;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.tms.utils.Waiter;

@Log4j2

public class InventoryPage extends Page {

    @FindBy(xpath = "//h1[text()='My account']")
    private WebElement nameOfMyAccountSection;

    @FindBy(xpath = "//h1[text()='Authentication']")
    private WebElement nameOfAuthenticationSection;

    @FindBy(xpath = "//li[text()='Authentication failed.']")
    private WebElement nameOfMyAccountAuthenticationFailedSection;

    @FindBy(xpath = "//li[text()='Password is required.']")
    private WebElement nameOfAuthenticationWithoutPassword;

    @FindBy(xpath = "//div[@id='center_column']/p[1]")
    private WebElement nameOfCreateAnAccount;

    @FindBy(xpath = "//div[@id='create_account_error']")
    private WebElement existingEmailMessage;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement controlRequiredFields;

    @FindBy(xpath = "//span[text()='Add to cart']")
    private List<WebElement> AddToCartButton;

    @FindBy(xpath = "//span[@id='layer_cart_product_quantity']")
    private WebElement indicatorOfCart;

    @FindBy(xpath = "//button[contains(@id,'remove')]")
    private List<WebElement> removeItemFromCartButton;

    public void clickAddToCartButtonByIndex(int index) {
        AddToCartButton.get(index).click();
    }

    public String getTextOfNumberThingsInCart() {
        return indicatorOfCart.getAttribute("innerText");
    }

    public String getTextOfNameOfMainPageSection() {
        return nameOfMyAccountSection.getText();
    }

    public String getTextOfCreateAnAccount() {
        return nameOfCreateAnAccount.getText();
    }

    public String getTextOfExistingAccount() {
        Waiter.waitForElementToBeClickable(existingEmailMessage);
        return existingEmailMessage.getText();
    }

      public String getTextOfControlRequiredFields() {
        return controlRequiredFields.getText();
    }

    public String getTextOfNameOfMainPageAuthentificationSection() {
        return nameOfAuthenticationSection.getText();
    }

    public String getNameOfMyAccountAuthenticationFailedSection() {
        return nameOfMyAccountAuthenticationFailedSection.getText();
    }

    public String getNameOfAuthenticationWithoutPassword () {
        return nameOfAuthenticationWithoutPassword.getText();
    }
}
