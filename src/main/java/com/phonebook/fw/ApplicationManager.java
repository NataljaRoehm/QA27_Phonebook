package com.phonebook.tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
  WebDriver driver;
  UserHelper user;
  ContactHelper contact;
  HomePageHelper homepage;

  public void init() {
    driver = new ChromeDriver();
    driver.get("https://telranedu.web.app");

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    user = new UserHelper(driver);
    contact = new ContactHelper(driver);
    homepage = new HomePageHelper(driver);
  }

  public void setUser(UserHelper user) {
    this.user = user;
  }

  public void setContact(ContactHelper contact) {
    this.contact = contact;
  }

  public UserHelper getUser() {
    return user;
  }

  public ContactHelper getContact() {
    return contact;
  }

  public HomePageHelper getHomepage() {
    return homepage;
  }

  public void setHomepage(HomePageHelper homepage) {
    this.homepage = homepage;
  }

  public void stop() {
    driver.quit();
  }

}
