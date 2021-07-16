package calculator_Automation;

import java.net.MalformedURLException;

import java.net.URL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BookingAPP {
	
	private static final Dimension MobileDriver = null;
	static AppiumDriver driver;
//	static AndroidDriver driver;
	public static void main(String[] args) {
		try {
			BookingAPP();
		}
		catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
			//
		}
		}
	
	@BeforeMethod
	public static void BookingAPP() throws MalformedURLException {
		
		DesiredCapabilities desired = new DesiredCapabilities();
		
		desired.setCapability("appium:automationName", "uiautomator2");
		desired.setCapability("deviceName", "Galaxy TAb A 8");
		desired.setCapability("udid", "b21e8dab");
		desired.setCapability("platformName", "Android");
		desired.setCapability("platformVersion", "10");
		desired.setCapability("appPackage", "com.booking");
		desired.setCapability("appActivity", "com.booking.deeplink.scheme.BookingDeeplinkSchemeActivity");
		desired.setCapability("appWaitDuration", "50000");
		//we will pass URL info of Appium server
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,desired);
//		driver = new AndroidDriver<MobileElement>(url,desired);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
		@Test
		public void verifySearchResult_Test1() {
		driver.findElement(By.id("com.booking:id/search_details_text")).click();
		driver.findElement(By.id("com.booking:id/disambiguation_search_edittext")).sendKeys("London");
		
		Boolean GBLondon= driver.findElement(By.xpath("//*[@class='android.widget.TextView'][@text='City in Greater London, United Kingdom']")).isDisplayed();
	      //verified bell icon is on page.
	      System.out.println(GBLondon+" -London,UK is available to select.");
	      Assert.assertTrue(GBLondon);
		}
	      
		@Test
		public void verifySearchResult_Test2() {
		driver.findElement(By.id("com.booking:id/search_details_text")).click();
		driver.findElement(By.id("com.booking:id/disambiguation_search_edittext")).sendKeys("London");
		
		Boolean ONLondon= driver.findElement(By.xpath("//*[@class='android.widget.TextView'][@text='City in Ontario, Canada']")).isDisplayed();
	      //verified bell icon is on page.
	      System.out.println(ONLondon+" -London,ON.Canada is available to select.");
	      Assert.assertTrue(ONLondon);
		}
		
	      ////		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.chrome:id/negative_button")));
	      @Test
			public void verifySearchResult_Test3() {
			driver.findElement(By.id("com.booking:id/search_details_text")).click();
			driver.findElement(By.id("com.booking:id/disambiguation_search_edittext")).sendKeys("London");
			
			Boolean USLondon= driver.findElement(By.xpath("//*[@class='android.widget.TextView'][@text='City in Kentucky, United States']")).isDisplayed();
		      //verified bell icon is on page.
		      System.out.println(USLondon+" -London,City in Kentucky, United States is available to select.");
		      Assert.assertTrue(USLondon);
	      }
	      @Test
			public void verifySearchResult_Test4() {
	    	  Boolean Menu= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open\"]")).isEnabled();
	    	  Assert.assertTrue(Menu);
	    	  System.out.println(Menu+" - Menu is Enabled");
		      Boolean Bell= driver.findElement(By.id("com.booking:id/mnuNotifications")).isDisplayed();
		      Assert.assertTrue(Bell);
		      System.out.println(Bell+" - Bell Icon is Enabled");
	      }
	      @Test
			public void verifySearchResult_Test5() {
			driver.findElement(By.id("com.booking:id/search_details_text")).click();
			driver.findElement(By.id("com.booking:id/disambiguation_search_edittext")).sendKeys("London");
			driver.findElement(By.xpath("//*[@class='android.widget.TextView'][@text='City in Greater London, United Kingdom']")).click();
			driver.findElement(By.xpath("//android.view.View[@content-desc=\"25 March 2021\"]")).click();
			driver.findElement(By.xpath("//android.view.View[@content-desc=\"28 March 2021\"]")).click();
			driver.findElement(By.id("com.booking:id/calendar_confirm")).click();
			driver.findElement(By.id("com.booking:id/search_search")).click();
			driver.findElement(By.xpath("//*[@class='android.widget.TextView'][@text='Sort']")).click();
			driver.findElement(By.xpath("//*[@class='android.widget.CheckedTextView'][@text='Price (low to high)']")).click();
			
//			WebElement CheckOutdate=driver.findElement(By.xpath("//android.view.View[@content-desc=\"%June 2021\"]"));
//			String dateVal ="25";
//
//			selectCheckOutdate(driver,CheckOutdate,dateVal);
			
	      }

//	      public static void selectCheckOutdate(WebDriver driver, WebElement element, String dateVal) {
//	    	  
//	    	  JavascriptExecutor js = (JavascriptExecutor)driver;
//    	 	js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
//
//     }
	      @Test
			public void verifySearchResult_Test6() {
//			driver.findElement(By.id("com.booking:id/search_details_text")).click();
//			driver.findElement(By.id("com.booking:id/disambiguation_search_edittext")).sendKeys("London");
//			driver.findElement(By.xpath("//*[@class='android.widget.TextView'][@text='City in Greater London, United Kingdom']")).click();
//			driver.findElement(By.xpath("//android.view.View[@content-desc=\"25 March 2021\"]")).click();
//			
			
	    	 
			

	      }
	    
	    
	  
	  
}
