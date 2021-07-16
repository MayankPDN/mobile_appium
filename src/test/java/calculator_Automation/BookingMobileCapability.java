package calculator_Automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BookingMobileCapability {

	static AppiumDriver driver;
//	static AndroidDriver driver;
	
	public static void main(String[] args)  {

		
			try {
				BookingMobileCapability();
			}
			catch(Exception e) {
				System.out.println(e.getCause());
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
	}
	
	public static void BookingMobileCapability() throws MalformedURLException, InterruptedException {
	DesiredCapabilities desired = new DesiredCapabilities();
		
	desired.setCapability("appium:automationName", "uiautomator2");
	desired.setCapability("deviceName", "Galaxy TAb A 8");
	desired.setCapability("udid", "b21e8dab");
	desired.setCapability("platformName", "Android");
	desired.setCapability("platformVersion", "10");
	desired.setCapability("appPackage", "com.booking");
	desired.setCapability("appActivity", "com.booking.deeplink.scheme.BookingDeeplinkSchemeActivity");
	desired.setCapability("appWaitDuration", "50000");
		
//		desired.setCapability("appActivity", "com.booking.deeplink.scheme.BookingDeeplinkSchemeActivity");
//		desired.setCapability("appWaitDuration", "50000");
		//we will pass URL info of Appium server
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,desired);
//		AppiumDriver<WebElement> driver= new AppiumDriver<WebElement>(url,desired);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 Actions actions = new Actions(driver);
		 actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
//		 Actions action = new Actions(driver);  
//		 action.sendKeys(Keys.PAGE_DOWN);  
//		 Thread.sleep(5000);  
//		 action.click(driver.findElement(By.id("com.booking:id/sign_in_to_continue_action"))).perform(); 
//		
//		driver.findElement(By.id("com.booking:id/search_details_text")).click();
//		driver.findElement(By.id("com.booking:id/disambiguation_search_edittext")).sendKeys("London");
//		driver.findElement(By.xpath("//*[@class='android.widget.TextView'][@text='City in Greater London, United Kingdom']")).click();
//		driver.findElement(By.xpath("//android.view.View[@content-desc=\"25 March 2021\"]")).click();
			
//		WebElement element = driver.findElement(By.id("com.booking:id/banner_title"));
//		TouchActions action = new TouchActions(driver);
//		action.scroll(element, 10, 100);
//		action.perform();


		
		
			
			
//			WebElement scroll = driver.findElement(By.id("com.booking:id/sign_in_to_continue_action"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(scroll);
//			actions.perform();
//			
//		 WebElement Element = driver.findElement(By.xpath("//android.view.View[@content-desc=\"22 April 2021\"]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
////		js.executeScript("arguments[0].scrollIntoView();", Element);
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}

	
		
	

}
