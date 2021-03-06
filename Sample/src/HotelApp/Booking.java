package HotelApp;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Booking {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.gecko.driver","C:/Users/admin/Downloads/geckodriver-v0.16.1-win64.geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "http://adactin.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testBooking() throws Exception {
    driver.get(baseUrl + "/HotelApp/SearchHotel.php");
    new Select(driver.findElement(By.id("location"))).selectByVisibleText("Melbourne");
    new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Sunshine");
    new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard");
    new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("2 - Two");
    driver.findElement(By.id("datepick_in")).clear();
    driver.findElement(By.id("datepick_in")).sendKeys("05/05/2017");
    driver.findElement(By.id("datepick_out")).clear();
    driver.findElement(By.id("datepick_out")).sendKeys("10/05/2017");
    new Select(driver.findElement(By.id("child_room"))).selectByVisibleText("1 - One");
    driver.findElement(By.id("Submit")).click();
    driver.findElement(By.id("continue")).click();
    driver.findElement(By.id("radiobutton_0")).click();
    driver.findElement(By.id("continue")).click();
    driver.findElement(By.id("first_name")).clear();
    driver.findElement(By.id("first_name")).sendKeys("Vijay");
    driver.findElement(By.id("last_name")).clear();
    driver.findElement(By.id("last_name")).sendKeys("Chandran");
    driver.findElement(By.id("address")).clear();
    driver.findElement(By.id("address")).sendKeys("No:4, South Mada Street, Thirumullaivoyal, Chennai");
    driver.findElement(By.id("cc_num")).clear();
    driver.findElement(By.id("cc_num")).sendKeys("1111222233334444");
    new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("Master Card");
    new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("November");
    new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2020");
    driver.findElement(By.id("cc_cvv")).clear();
    driver.findElement(By.id("cc_cvv")).sendKeys("001");
    driver.findElement(By.id("book_now")).click();
    try {
      assertTrue(driver.findElement(By.id("order_no")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    String OrderNumber = driver.findElement(By.id("order_no")).getAttribute("value");
    System.out.println(OrderNumber);
    driver.findElement(By.id("my_itinerary")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
