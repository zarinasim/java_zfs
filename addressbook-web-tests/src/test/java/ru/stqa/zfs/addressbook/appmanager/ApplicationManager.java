package ru.stqa.zfs.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  private final String browser;
  protected WebDriver wd;

  private SessionHelper sessionHelper;
  private NavigationtHelper navigationtHelper;
  private GroupHelper groupHelper;
  private ContactHelper contactHelper;

  public ApplicationManager (String browser) {
    this.browser = browser;
  }

  public void init() {
    String browser = BrowserType.CHROME;
    if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver();
    } else  if (browser.equals(BrowserType.CHROME)) {
      wd = new ChromeDriver();
    } else if (browser.equals(BrowserType.IE)) {
      wd = new InternetExplorerDriver();
    }

    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    navigationtHelper = new NavigationtHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("secret","admin");
    contactHelper = new ContactHelper(wd);
  }


  public void stop() {
    wd.quit();
  }
/*
  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }*/

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationtHelper getNavigationtHelper() {
    return navigationtHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
