package ru.stqa.zfs.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.zfs.addressbook.model.ContactData;

import java.util.List;

public class ContactModificationTest extends TestBase{
  @Test
  public void ContactModificationTests() {
    app.getNavigationtHelper().gotoHomePage();
    List<ContactData> before = app.getContactHelper().getContactList();
    if (app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Masha", "иванова", null, null, null));
    }
    app.getContactHelper().editContact(before.size() -1);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToContactPage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());
  }
}
