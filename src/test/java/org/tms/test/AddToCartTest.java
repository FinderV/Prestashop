package org.tms.test;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.TmsLink;
import lombok.extern.log4j.Log4j2;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.service.InventoryPageService;

@Log4j2
public class AddToCartTest extends BaseTest {

  private static int firstItem = 0;
  private InventoryPageService inventoryPageService;

  @BeforeClass
  public void setUp() {
    inventoryPageService = new InventoryPageService();
  }

    @Test(description = "Add product to cart")
    @Description("Add product to cart")
    @Link("https://github.com/FinderV")
    @Issue("FinderV")
    @TmsLink("FinderV")
    public void addToCartTest () {
    inventoryPageService.cartPage();
    String initialNumberOfItemsInCart = inventoryPageService.getNumberOfItemsInCart();
    String expectedNumberOfItemsInCart = getExpectedNumberOfItemsInCartAfterAdding(initialNumberOfItemsInCart);
    inventoryPageService.productPage();
    inventoryPageService.addToCartItem(firstItem);
    inventoryPageService.clickToContinueButton();
    String actualNumberOfItemsInCart = inventoryPageService.getNumberOfItemsInCart();
    Assert.assertEquals (actualNumberOfItemsInCart, expectedNumberOfItemsInCart, "Number of added things doesn't match!");
  }

  private String getExpectedNumberOfItemsInCartAfterAdding(String numberOfItemsInCart) {
    if (numberOfItemsInCart.equals("")) {
      return "1";
    } else {
      return Integer.toString(Integer.parseInt(numberOfItemsInCart) + 1);
    }
  }
}
