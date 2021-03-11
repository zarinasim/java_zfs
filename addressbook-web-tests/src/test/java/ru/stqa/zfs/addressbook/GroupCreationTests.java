package ru.stqa.zfs.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test11", "test11", "test12"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
