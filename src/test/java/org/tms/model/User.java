package org.tms.model;

import lombok.Data;

@Data
public class User {

  private String emailAddressCreate = "5819@mail.ru";      // new create 1
  private String emailAddressCreateNew = "5820@mail.ru";             // new
  private String emailAddress = "5817@mail.ru";          // old next 1
  private String emailAddressWishlist = "5817@mail.ru";        //  old next  add wishlist 1
  private String existingEmailAddress = "12@mail.com";
  private String password = "Y4xE27s3dSFSuCQ";
  private String wrongPassword = "123Y4xE27s3dSFSuCQ";
  private String passwordCreate = "Y4xE27s3dSFSuCQ";
  private String message = "Hello, I have problems with the calculation of the cost of the goods.";
  private String firstName = "Vika";
  private String lastName = "Finder";

  public User() {
  }
}
