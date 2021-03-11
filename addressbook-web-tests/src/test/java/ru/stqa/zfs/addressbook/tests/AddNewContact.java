package ru.stqa.zfs.addressbook.tests;

import org.testng.annotations.Test;

public class AddNewContact  extends TestBase {

  @Test
  public void testAddNewContact() throws Exception {
    app.getContactHelper().gotoContactPage();
    app.getContactHelper().fillContactForm();
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactPage();
  }

}
