package ru.stqa.zfs.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.zfs.addressbook.model.ContactData;

public class AddNewContact  extends TestBase {

  @Test
  public void testAddNewContact()  {
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().gotoContactPage();
    app.getContactHelper().createContact(new ContactData("Masha", null, null, null, null));
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before +1);
  }

}
