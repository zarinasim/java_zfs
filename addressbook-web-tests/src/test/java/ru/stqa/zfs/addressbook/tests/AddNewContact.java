package ru.stqa.zfs.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.zfs.addressbook.model.ContactData;

public class AddNewContact  extends TestBase {

  @Test
  public void testAddNewContact() throws Exception {
    app.getContactHelper().gotoContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Masha", "Ivanova", "web", "yellow street, 6", "89456985"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactPage();
  }

}
