package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.service.InventoryPageService;

public class RemoveFromCartTest extends BaseTest {

    private static int firstItem = 0;
    private InventoryPageService inventoryPageService;

    @BeforeClass
    public void setUp() {
        inventoryPageService = new InventoryPageService();
    }

    @Test
    public void removeFromCartTest () {
        inventoryPageService.productPage();
        inventoryPageService.addToCartItem(firstItem);
        inventoryPageService.clickToContinueButton();
        inventoryPageService.cartPage();
        inventoryPageService.clickRemoveItemFromCartButtonByIndex();
        inventoryPageService.cartPage();
        String actualNumberOfItemsInCartAfterRemoval = getActualNumberOfItemsInCartAfterRemoval(inventoryPageService.getNumberOfItemsInCart());
        String expectedNumberOfItemsInCartAfterRemoval = "0";
        Assert.assertEquals(actualNumberOfItemsInCartAfterRemoval, expectedNumberOfItemsInCartAfterRemoval, "Number of added things doesn't match!");
    }

  private String getActualNumberOfItemsInCartAfterRemoval(String numberOfItemsInCart) {
    if (numberOfItemsInCart.equals("")) {
      return "0";
    } else {
      return numberOfItemsInCart;
    }
  }
}
