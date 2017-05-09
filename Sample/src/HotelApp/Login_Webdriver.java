package HotelApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_Webdriver {

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
}
	
}
