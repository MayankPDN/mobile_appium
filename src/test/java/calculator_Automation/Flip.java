package calculator_Automation;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.ListView;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class Flip {
	
//	static AppiumDriver driver;
	static AndroidDriver driver;
	
	public static void main(String[] args) {
		try {
			Flip();
		}
		catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		}
	
	public static void Flip() throws MalformedURLException {
		
		DesiredCapabilities desired = new DesiredCapabilities();
		
		desired.setCapability("deviceName", "Galaxy TAb A 8");
		desired.setCapability("udid", "b21e8dab");
		desired.setCapability("platformName", "Android");
		desired.setCapability("platformVersion", "10");
		desired.setCapability("appPackage", "com.wishabi.flipp");
		desired.setCapability("appActivity", "com.wishabi.flipp.ui.launcher.DefaultLauncherActivity");
//		desired.setCapability("unicodeKeyboard", "True");
//		desired.setCapability("resetKeyboard", "True");
		//we will pass URL info of Appium server
	
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
//		driver = new AppiumDriver<MobileElement>(url,desired);
		driver = new AndroidDriver<MobileElement>(url,desired);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("com.wishabi.flipp:id/btn_skip")).click();
		driver.findElement(By.xpath("//*[@class='android.widget.Button'][@text='Enter postal code']")).click();
//		driver.findElement(By.xpath("//*[@text='Enter Zip Code']")).click();

		driver.findElement(By.id("com.wishabi.flipp:id/onboarding_postal_code_entry")).sendKeys("N2C2C1");
//		driver.findElement(By.id("com.wishabi.flipp:id/onboarding_postal_code_entry")).sendKeys(Keys.ENTER);
		driver.getKeyboard().pressKey(Keys.ENTER);
		driver.findElement(By.id("com.wishabi.flipp:id/onboarding_skip")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Lists, New notification\"]/android.widget.ImageView")).click();
		driver.findElement(By.xpath("//*[@class='android.widget.EditText'][@text='Add Item']")).sendKeys("Milk");
		driver.findElement(By.id("com.wishabi.flipp:id/text")).click();
		
//		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		
		
		
//		driver.getMouse().hashCode();
		Boolean bell= driver.findElement(By.id("com.wishabi.flipp:id/collapsible_section_header_notification")).isDisplayed();
	      //verified bell icon is on page.
	      System.out.println(bell+" -Bell Icon is visible."); // prints boolean value true or false.
	     
	      Boolean WatchList= driver.findElement(By.id("com.wishabi.flipp:id/custom_tab")).isDisplayed();
	      //verified bell icon is on page.
	      System.out.println(WatchList+" -Watch List is visible.");
	      
	      Boolean ShoppingList= driver.findElement(By.xpath("//*[@class='android.widget.TextView'][@text='SHOPPING LIST']")).isDisplayed();
	      //verified bell icon is on page.
	      System.out.println(ShoppingList+" -Shopping List is visible.");
		
	      
		
//		 JavascriptExecutor search = (JavascriptExecutor) driver;
//	        HashMap<String, Double> sObject = new HashMap<String, Double>();
//	        sObject.put("tapCount",(double) 1);
//	        sObject.put("touchCount",(double)1);
//	        sObject.put("duration", 0.5);
//	        sObject.put("x", (double) 730);
//	        sObject.put("y", (double) 1045);
//	        search.executeScript("mobile: tap", sObject);
		
		driver.getKeyboard().pressKey(Keys.ENTER);	
		driver.getKeyboard().pressKey(Keys.INSERT);
//		driver.hideKeyboard();
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc='Search']")).click();
		driver.findElement(By.id("com.wishabi.flipp:id/search_src_text")).sendKeys("chocolate");
		driver.findElement(By.id("com.wishabi.flipp:id/search_src_text")).click();
		driver.getKeyboard().pressKey(Keys.ENTER);
//		driver.getKeyboard().releaseKey(Keys.END);
//		driver.getKeyboard().pressKey(Keys.INSERT);
		
		
		List<WebElement> SearchItems=driver.findElements(By.id("com.wishabi.flipp:id/item_name"));
//		List<WebElement> ViewDetailsItems=driver.findElements(By.xpath("//button[contains(.,'Choose options')]"));
//		List<WebElement> ItemsLink=driver.findElements(By.tagName("a"));
//		System.out.println(ItemsLink.size());
		
		
		
		System.out.println(SearchItems.size());
//		System.out.println(ViewDetailsItems.size());
	 for(int i=0; i<SearchItems.size(); i++) { //loop to get all number of link
		 String itemslisted =SearchItems.get(i).getText();//  this is to make it  String value
//		System.out.println(itemslisted);// this is to print all links form website.
	 }
				 System.out.println(SearchItems.size());
				
	}

	private static void KeyEvent(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
}
