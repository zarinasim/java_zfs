package ru.stqa.zfs.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.zfs.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase{
  @Test
  public void ContactModificationTests() {
    app.getNavigationtHelper().gotoHomePage();
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("Masha", "Ivanova", "web", "yellow street, 6", "89456985"));
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToContactPage();
  }
}
