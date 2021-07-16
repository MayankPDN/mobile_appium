package calculator_Automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class GoogleSearch {
	
	static AppiumDriver driver;
	
	public static void main(String[] args) {
		try {
			GoogleSearch();
		}
		catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		}
	public static void GoogleSearch() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities desired = new DesiredCapabilities();
		
		desired.setCapability("deviceName", "Galaxy TAb A 8");
		desired.setCapability("udid", "b21e8dab");
		desired.setCapability("platformName", "Android");
		desired.setCapability("platformVersion", "10");
		desired.setCapability("appPackage", "com.android.chrome");
		desired.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		//we will pass URL info of Appium server
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,desired);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.android.chrome:id/terms_accept")).click();
//		
////		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.chrome:id/negative_button")));
		driver.findElement(By.id("com.android.chrome:id/negative_button")).click();
//		driver.findElement(By.id("com.android.chrome:id/search_box_text")).click();
		driver.findElement(By.id("com.android.chrome:id/url_bar")).click();
		driver.findElement(By.id("com.android.chrome:id/url_bar")).sendKeys("godzilla vs kong");
		driver.getKeyboard().pressKey(Keys.ENTER);// because we will not be able to click on keybord with element.ô
		System.out.println("Google Searched godzilla vs kong");
		
			Actions action = new Actions(driver);  
		 action.sendKeys(Keys.PAGE_DOWN);  
		 Thread.sleep(5000);  
		 action.click(driver.findElement(By.xpath("//*[@class='android.widget.Button'][@text='Watched it?']"))).perform();
		
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(0,1000)");
	}

}
