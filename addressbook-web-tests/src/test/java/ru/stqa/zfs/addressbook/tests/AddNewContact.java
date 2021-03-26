package ru.stqa.zfs.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.zfs.addressbook.model.ContactData;

import java.util.List;

public class AddNewContact  extends TestBase {

  @Test
  public void testAddNewContact()  {
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().gotoContactPage();
    app.getContactHelper().createContact(new ContactData("Masha", null, null, null, null));
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() +1);
  }
}
