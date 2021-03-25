package ru.stqa.zfs.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.zfs.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToContactPage() {
    click(By.linkText("home"));
    //click(By.linkText("Logout"));
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

  public void editContact(int index) {
    ///click(By.xpath("(//img[@alt='Edit'])[2]"));
    wd.findElements(By.name("selected[]")).get(index).click();
    //click(By.name("selected[]"));
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void submitContactModification() {
    click(By.xpath("(//input[@name='update'])[2]"));
  }

  public void selectContact(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
    //click(By.name("selected[]"));
  }

  public void deleteSelectContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    wd.switchTo().alert().accept();
  }

  public void createContact(ContactData contact) {
    gotoContactPage();
    fillContactForm(contact);
    submitContactCreation();
    returnToContactPage();
  }

  public boolean isThereAContact() {
    return !isElementPresent(By.name("selected[]"));
  }

  public int getContactCount() {
    return wd.findElements (By.name("selected[]")).size();
  }
}
