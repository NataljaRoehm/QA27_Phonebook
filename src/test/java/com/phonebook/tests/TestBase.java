package com.phonebook.tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

  WebDriver driver;

  @BeforeMethod
  public void setUp(){
    driver = new ChromeDriver();
    driver.get("https://telranedu.web.app");

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod(enabled = false)
  public void tearDown(){
    driver.quit();
  }

  public boolean isElementPresent(By locator){
    return driver.findElements(locator).size()>0;
  }
}
