package ru.stqa.zfs.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.zfs.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception
  {
    app.getNavigationtHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test11", null, null));
  }
}
