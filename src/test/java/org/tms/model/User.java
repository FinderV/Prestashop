package org.tms.model;

public class User {

  private String emailAddressCreate = "5620@mail.ru";      // new create 1
  private String emailAddressCreateNew = "5621@mail.ru";             // new
  private String emailAddress = "5618@mail.ru";          // old next 1
  private String emailAddressWishlist = "5618@mail.ru";        //  old next  add wishlist 1
  private String existingEmailAddress = "12@mail.com";
  private String password = "Y4xE27s3dSFSuCQ";
  private String wrongPassword = "123Y4xE27s3dSFSuCQ";
  private String passwordCreate = "Y4xE27s3dSFSuCQ";
  private String message = "Hello, I have problems with the calculation of the cost of the goods.";
  private String firstName = "Vika";
  private String lastName = "Finder";

  public User() {
  }

  public String getEmailAddress() {
    return emailAddress;
  }

   public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getWrongPassword() {
    return wrongPassword;
  }

  public void setWrongPassword(String wrongPassword) {
    this.wrongPassword = wrongPassword;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getEmailAddressCreate() {
    return emailAddressCreate;
  }

   public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setEmailAddressCreate(String emailAddressCreate) {
    this.emailAddressCreate = emailAddressCreate;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPasswordCreate() {
    return passwordCreate;
  }

  public void setPasswordCreate(String passwordCreate) {
    this.passwordCreate = passwordCreate;
  }

  public String getExistingEmailAddress() {
    return existingEmailAddress;
  }

  public void setExistingEmailAddress(String existingEmailAddress) {
    this.existingEmailAddress = existingEmailAddress;
  }

  public String getEmailAddressCreateNew() {
    return emailAddressCreateNew;
  }

  public void setEmailAddressCreateNew(String emailAddressCreateNew) {
    this.emailAddressCreateNew = emailAddressCreateNew;
  }

  public String getEmailAddressWishlist() {
    return emailAddressWishlist;
  }

  public void setEmailAddressWishlist(String emailAddressWishlist) {
    this.emailAddressWishlist = emailAddressWishlist;
  }
}

