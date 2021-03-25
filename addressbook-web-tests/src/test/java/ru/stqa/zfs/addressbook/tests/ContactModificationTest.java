package ru.stqa.zfs.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.zfs.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase{
  @Test
  public void ContactModificationTests() {
    app.getNavigationtHelper().gotoHomePage();
    int before = app.getContactHelper().getContactCount();
    if (app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Masha", "иванова", null, null, null));
    }
    app.getContactHelper().editContact();
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToContactPage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before );
  }
}
