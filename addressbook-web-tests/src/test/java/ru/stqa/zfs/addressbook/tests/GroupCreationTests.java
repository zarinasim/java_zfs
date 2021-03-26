package ru.stqa.zfs.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.zfs.addressbook.model.GroupData;

import java.util.List;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation()
  {
    app.getNavigationtHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("test11", null, null));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() +1);
  }
}
