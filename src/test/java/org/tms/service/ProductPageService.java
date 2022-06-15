package org.tms.service;

import io.qameta.allure.Step;
import org.tms.model.User;
import org.tms.page.LoginPage;
import org.tms.page.ProductPage;

public class ProductPageService {

    protected static final String PRODUCT_PAGE = "http://prestashop.qatestlab.com.ua/ru/tshirts/1-faded-short-sleeve-tshirts.html";
    protected static final String LOGIN_PAGE_URL = "http://prestashop.qatestlab.com.ua/en/authentication?back=my-account/";
    protected static final String MYWISHLIST_PAGE_URL = "http://prestashop.qatestlab.com.ua/en/module/blockwishlist/mywishlist";
    protected User user = new User();
    protected ProductPage productPage = new ProductPage();
    protected LoginPage loginPage = new LoginPage();

    @Step("Add product to Wishlist")
    public ProductPage addToWishlist() {
        loginPage.openPage(LOGIN_PAGE_URL)
                 .fillInEmailAddress(user.getEmailAddressWishlist())
                 .fillInPassword(user.getPassword())
                 .clickLoginButton();
        productPage.openProductPage(PRODUCT_PAGE)
                   .clickAddToWishlistButton();
        productPage.openProductPage(MYWISHLIST_PAGE_URL);
        return new ProductPage();
    }
}
