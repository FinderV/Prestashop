package org.tms.test;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.page.ProductPage;
import org.tms.service.ProductPageService;
import org.tms.utils.Constants;

public class AddToWishlistTest extends BaseTest{

        private ProductPageService productPageService;

        @BeforeClass
        public void setUp() {
            productPageService = new  ProductPageService();
        }

        protected Constants constants = new Constants();

        @Test(description = "Add to wishlist http://prestashop.qatestlab.com.ua/en/tshirts/1-faded-short-sleeve-tshirts.html")
        @Description("Add to wishlist http://prestashop.qatestlab.com.ua/en/tshirts/1-faded-short-sleeve-tshirts.html")
        @Link("https://github.com/FinderV")
        @Issue("FinderV")
        @TmsLink("FinderV")
        public void addToWishlistTest() {
            ProductPage productPage = productPageService.addToWishlist();
            String actualQuantityOfItemWishlist = productPage.getQuantityOfItemWishlist();
            String expectedQuantityOfItemWishlist = constants.ONE;
            Assert.assertEquals(actualQuantityOfItemWishlist, expectedQuantityOfItemWishlist, "The actual quantity of the item added to the wishlist does not match expected!");
    }
}
