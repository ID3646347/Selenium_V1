import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_TestNG {
	WebDriver driver;
	String expected, actual;
	String OrderNumber;
	
@BeforeClass
	public void beforeTest() throws Exception{
	System.setProperty("webdriver.gecko.driver","C:/Users/admin/Downloads/geckodriver-v0.16.1-win64/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	  driver.get("http://adactin.com/HotelApp/");
	  WebElement element = driver.findElement(By.id("username"));
	  element.sendKeys("ID3646347");
		
	  driver.findElement(By.id("password")).sendKeys("January101979");
	  driver.findElement(By.id("password")).sendKeys(Keys.TAB);
	  
		
	  driver.findElement(By.id("login")).click();
	  expected = "Hello ID3646347!";
	  actual = driver.findElement(By.id("username_show")).getAttribute("value");
	  Assert.assertEquals(expected,actual);
	  Thread.sleep(3000);
	  }

  @BeforeMethod
  public void beforeMethod() {

	  
  }
  
  @Test
  public void Booking() throws Exception {
	  //System.out.println("VIjay");
	  	new Select(driver.findElement(By.id("location"))).selectByVisibleText("Melbourne");
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Sunshine");
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard");
		new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("2 - Two");
		
		//WebElement element = driver.findElement(By.id("datepick_in"));
		//element.sendKeys("07/05/2017");
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("07/05/2017");
		driver.findElement(By.id("datepick_in")).sendKeys(Keys.TAB);
		driver.findElement(By.id("datepick_out")).sendKeys("10/05/2017");
		//driver.findElement(By.id("datepick_out")).sendKeys(Keys.TAB);
		
		new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText("2 - Two");
		new Select(driver.findElement(By.id("child_room"))).selectByVisibleText("2 - Two");
		
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Vijay");
		driver.findElement(By.id("last_name")).sendKeys("Chandran");
		driver.findElement(By.id("address")).sendKeys("No:4, South Mada Street, Chennai");
		driver.findElement(By.id("cc_num")).sendKeys("1111222233334444");
		
		new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("Master Card");
		new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("January");
		new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2020");
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		
		driver.findElement(By.id("book_now")).click();
		
	    OrderNumber = driver.findElement(By.id("order_no")).getAttribute("value");
	    System.out.println(OrderNumber);
		
		driver.findElement(By.id("my_itinerary")).click();
		Thread.sleep(3000);
	  
  }
  
//  @Test
//  	public void Cancellation() {
//	driver.findElement(By.id("order_id_text")).sendKeys(OrderNumber);
//	driver.findElement(By.id("search_hotel_id")).click();
//	
//	//Thread.sleep(10000);
//	int orderCount = 0;
//	while(orderCount !=1){
//		List<WebElement> orderList = driver.findElements(By.name("ids[]"));
//		orderCount = orderList.size();
//	}
//
//	driver.findElement(By.id("check_all")).click();
//	driver.findElement(By.name("cancelall")).click();
//	
//	String popupMessage= driver.switchTo().alert().getText();
//	System.out.println(popupMessage);
//	driver.switchTo().alert().accept();
//  	}
//  public void IncorrectLogin() {
//	  WebElement element = driver.findElement(By.id("username"));
//	  element.sendKeys("ID3646347");
//		
//	  driver.findElement(By.id("password")).sendKeys("January101979T");
//	  driver.findElement(By.id("password")).sendKeys(Keys.TAB);
//		
//	  driver.findElement(By.id("login")).click();
//	  
//	  expected = "Invalid Login Details";
//	  actual = driver.findElement(By.tagName("b")).getText();
//	  Assert.assertEquals(expected,actual);
//	  
//  }
  
  @AfterMethod
  public void afterMethod() {
	 // System.out.println("After Method");
	  
  }
  
  @AfterClass
  public void afterclass() {
	  driver.quit();
  }
  
}
