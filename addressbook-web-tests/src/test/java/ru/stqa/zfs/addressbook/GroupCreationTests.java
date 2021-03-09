package ru.stqa.zfs.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class GroupCreationTests {
  private WebDriver wb;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wb = new FirefoxDriver();
    wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wb.get("http://localhost/addressbook/group.php");
    login("secret","admin");
  }

  private void login(String password,String username) {
    wb.findElement(By.name("user")).click();
    wb.findElement(By.name("user")).clear();
    wb.findElement(By.name("user")).sendKeys(username);
    wb.findElement(By.name("pass")).click();
    wb.findElement(By.name("pass")).clear();
    wb.findElement(By.name("pass")).sendKeys(password);
    wb.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test11", "test11", "test12"));
    submitGroupCreation();
    returnToGroupPage();
  }

  private void returnToGroupPage() {
    wb.findElement(By.xpath("//div[@id='content']/div")).click();
    wb.findElement(By.linkText("group page")).click();
    wb.findElement(By.linkText("Logout")).click();
  }

  private void submitGroupCreation() {
    wb.findElement(By.name("submit")).click();
  }

  private void fillGroupForm(GroupData groupData) {
    wb.findElement(By.name("group_name")).click();
    wb.findElement(By.name("group_name")).clear();
    wb.findElement(By.name("group_name")).sendKeys(groupData.getName());
    wb.findElement(By.name("group_header")).click();
    wb.findElement(By.name("group_header")).clear();
    wb.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    wb.findElement(By.name("group_footer")).click();
    wb.findElement(By.name("group_footer")).clear();
    wb.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  private void initGroupCreation() {
    wb.findElement(By.name("new")).click();
  }

  private void gotoGroupPage() {
    wb.findElement(By.linkText("groups")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wb.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      wb.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wb.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
