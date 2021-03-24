package ru.stqa.zfs.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.zfs.addressbook.model.ContactData;

public class AddNewContact  extends TestBase {

  @Test
  public void testAddNewContact()  {
    app.getContactHelper().gotoContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Masha", null, null, null, null));

  }

}
