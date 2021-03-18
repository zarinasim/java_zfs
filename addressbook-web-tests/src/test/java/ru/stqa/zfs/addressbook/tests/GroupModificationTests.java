package ru.stqa.zfs.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.zfs.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase{
  @Test
  public void testGroupModification() {
    app.getNavigationtHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("test11", "test11", "test12"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
