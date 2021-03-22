package ru.stqa.zfs.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() throws Exception
  {
    app.getNavigationtHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectContact();
    app.getContactHelper().returnToContactPage();
  }
}
