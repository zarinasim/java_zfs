package ru.stqa.zfs.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationtHelper extends HelperBase {

  public NavigationtHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }
  public void gotoHomePage(){
    click(By.linkText("home"));
  }

}
