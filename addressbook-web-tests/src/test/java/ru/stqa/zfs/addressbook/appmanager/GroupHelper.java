package ru.stqa.zfs.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.stqa.zfs.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.*;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {
    click(xpath("//div[@id='content']/div"));
    click(linkText("group page"));
    //click(By.linkText("Logout"));
  }

  public void submitGroupCreation() {

    click(name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(name("group_name"), groupData.getName());
    type(name("group_header"), groupData.getHeader());
    type(name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(name("new"));
  }

  public void deleteSelectGroups() {
    click(name("delete"));
  }

  public void selectGroup(int index) {
    wd.findElements(name("selected[]")).get(index).click();
    //click(By.name("selected[]"));
  }

  public void initGroupModification() {
    click(name("edit"));
  }

  public void submitGroupModification() {
    click(name("update"));
  }

  public void createGroup(GroupData group) {
    initGroupCreation();
    fillGroupForm(group);
    submitGroupCreation();
    returnToGroupPage();
  }

  public boolean isThereAGroup() {
    return isElementPresent(name("selected[]"));
  }

  public int getGroupCount() {
    return wd.findElements (name("selected[]")).size();
  }

  public List<GroupData> getGroupList() {
    List<GroupData> groups = new ArrayList<GroupData>();
    List<WebElement> elements = wd.findElements(cssSelector("span.group"));
    for (WebElement element : elements) {
      String name = element.getText();
      String id = element.findElement(By.tagName("input")).getAttribute("value");
      GroupData group = new GroupData(id, name,null,null);
      groups.add(group);
    }
    return groups;
  }
}
