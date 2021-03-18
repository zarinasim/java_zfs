package ru.stqa.zfs.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.zfs.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToContactPage() {
    click(By.linkText("home page"));
  }

  public void submitContactCreation() {

    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());

    type(By.name("home"), contactData.getHome());
  }

  public void gotoContactPage() {
    click(By.linkText("add new"));
  }

  public void editContact() {
    click(By.xpath("(//img[@alt='Edit'])[2]"));
  }

  public void submitContactModification() {
    click(By.xpath("(//input[@name='update'])[2]"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteSelectContact() {
    click(By.name("//input[@value='Delete']"));
    wd.switchTo().alert().accept();
  }
}
