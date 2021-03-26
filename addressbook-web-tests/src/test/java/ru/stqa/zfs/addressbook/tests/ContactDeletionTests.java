package ru.stqa.zfs.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.zfs.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion()
  {
    app.getNavigationtHelper().gotoHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();
    if (app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Masha", null, null, null, null));
    }
    app.getContactHelper().selectContact(before.size() -1);
    app.getContactHelper().deleteSelectContact();
    app.getContactHelper().returnToContactPage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() -1);
  }
}
