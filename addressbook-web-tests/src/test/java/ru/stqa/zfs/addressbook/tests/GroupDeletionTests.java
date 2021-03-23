package ru.stqa.zfs.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.zfs.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion()
  {
    app.getNavigationtHelper().gotoGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test11", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectGroups();
    app.getGroupHelper().returnToGroupPage();
  }
}
