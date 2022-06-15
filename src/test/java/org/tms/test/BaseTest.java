package org.tms.test;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.tms.driver.DriverSingleton;
import org.tms.utils.TestListener;

@Log4j2
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
