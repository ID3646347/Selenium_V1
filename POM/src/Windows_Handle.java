import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Windows_Handle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:/Users/admin/Downloads/geckodriver-v0.16.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.online.citibank.co.in/?eOfferCode=INHOGNTTNHOME/");
				
		//driver.findElement(By.linkText("Login")).click();
		//System.out.println("Click Login");
//		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		
//		for(String handle: driver.getWindowHandles())
//			driver.switchTo().window(handle);
//		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.id("User_Id")));
//		driver.findElement(By.id("User_Id")).sendKeys("Vijay");
//		driver.close();
		
//		for (String handle: driver.getWindowHandles())
//			driver.switchTo().window(handle);
//			driver.findElement(By.linkText("CAREERS")).click();
//			driver.wait(5000);
//			driver.quit();
		
		System.out.println("Scrolldown until Career link");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.linkText("CAREERS"));
		jse.executeScript("arguments[0].scrollIntoView(true);",element);
				

	}
	


}
