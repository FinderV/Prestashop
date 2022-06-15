package org.tms.service;

import org.tms.page.InventoryPage;

public class InventoryPageService {

  private InventoryPage inventoryPage;
  private LoginPageService loginPageService = new LoginPageService();

  public InventoryPageService cartPage() {
    inventoryPage = loginPageService.cartPage();
    return this;
  }

  public InventoryPageService productPage() {
    inventoryPage = loginPageService.productPage();
    return this;
  }

  public InventoryPageService addToCartItem(int itemIndex) {
    inventoryPage.clickAddToCartButtonByIndex(itemIndex);
    return this;
  }

    public InventoryPageService clickToContinueButton() {
      inventoryPage = loginPageService.clickToContinueButton();
    return this;
  }

  public InventoryPageService clickRemoveItemFromCartButtonByIndex() {
    inventoryPage = loginPageService.clickRemoveItemFromCartButtonByIndex();
    return this;
  }

  public String getNumberOfItemsInCart() {
    return inventoryPage.getTextOfNumberThingsInCart();
  }
}
