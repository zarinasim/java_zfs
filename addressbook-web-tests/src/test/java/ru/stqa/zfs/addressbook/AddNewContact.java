package ru.stqa.zfs.addressbook;

import org.testng.annotations.Test;

public class AddNewContact  extends TestBase{

  @Test
  public void testAddNewContact() throws Exception {
    gotoContactPage();
    fillContactForm();
    submitContactCreation();
    returnToContactPage();
  }

}
