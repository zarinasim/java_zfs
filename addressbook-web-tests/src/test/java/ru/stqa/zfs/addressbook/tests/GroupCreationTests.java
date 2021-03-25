package ru.stqa.zfs.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.zfs.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation()
  {
    app.getNavigationtHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test11", null, null));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before +1);
  }
}
