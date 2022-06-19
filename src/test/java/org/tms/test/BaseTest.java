package org.tms.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.tms.driver.DriverSingleton;
import org.tms.utils.TestListener;

@Listeners(TestListener.class)
public class BaseTest {

  protected WebDriver driver;

  @BeforeClass
  public void startBrowser() {
    driver = DriverSingleton.getInstance().getDriver();
  }

  @AfterClass(alwaysRun = true)
  public void stopBrowser() {
    DriverSingleton.getInstance().closeDriver();
  }
}
