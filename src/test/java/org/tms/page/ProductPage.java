package org.tms.page;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.tms.utils.Waiter;


@Log4j2
public class ProductPage extends Page {

    @FindBy(xpath = "//a[@id='wishlist_button']")
    private WebElement buttonAddToWhishlist;

    @FindBy(xpath = "//td[@class='bold align_center']")
    private WebElement nameOfWishlistQuantityOfItem;

    @Step("Opening product page http://prestashop.qatestlab.com.ua/en/tshirts/1-faded-short-sleeve-tshirts.html")
    public ProductPage openProductPage(String url) {
        log.info("Open product page");
        driver.get(url);
        return this;
    }

    @Step("Clicking Add To Wishlist button")
    public void clickAddToWishlistButton() {
        log.info("Click Add to wishlist button");
        Waiter.waitForElementToBeClickable(buttonAddToWhishlist);
        waitElementToBeClickable(buttonAddToWhishlist).click();
    }

    @Step("Get Quantity Of Item in Wishlist")
    public String getQuantityOfItemWishlist() {
        log.info("Get quantity of item in Wishlist");
        Waiter.waitForElementToBeClickable(nameOfWishlistQuantityOfItem);
        return nameOfWishlistQuantityOfItem.getText();
    }
}
