package HotelApp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Reservation_WebDriver {

	//private static final CharSequence TAB = null;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:/Users/admin/Downloads/geckodriver-v0.16.1-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://adactin.com/HotelApp/");
		
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("ID3646347");
		
		driver.findElement(By.id("password")).sendKeys("January101979");
		driver.findElement(By.id("password")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("login")).click();
		
		//element = driver.findElement(By.id("location"));
		//Select select = new Select(element);
		//select.selectByVisibleText("Melbourne");
		
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
		
	    String OrderNumber = driver.findElement(By.id("order_no")).getAttribute("value");
	    System.out.println(OrderNumber);
		
		driver.findElement(By.id("my_itinerary")).click();
		
		driver.findElement(By.id("order_id_text")).sendKeys(OrderNumber);
		driver.findElement(By.id("search_hotel_id")).click();
		
		//Thread.sleep(10000);
		int orderCount = 0;
		while(orderCount !=1){
			List<WebElement> orderList = driver.findElements(By.name("ids[]"));
			orderCount = orderList.size();
		}
	
		driver.findElement(By.id("check_all")).click();
		driver.findElement(By.name("cancelall")).click();
		
		String popupMessage= driver.switchTo().alert().getText();
		System.out.println(popupMessage);
		driver.switchTo().alert().accept();
		

		
		//driver.findElement(By.id("logout")).click();TestNG
		
//		driver.findElement(By.id("radiobutton_0")).click();
//		driver.findElement(By.id("Cancel Selected")).click();
		
//		select.selectByVisibleText("2 - Two");
		
		
	}

}
