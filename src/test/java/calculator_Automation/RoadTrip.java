package calculator_Automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class RoadTrip {
	
	static AppiumDriver driver;
	
	public static void main(String[] args) {
		try {
			RoadTrip();
		}
		catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		}
	public static void RoadTrip() throws MalformedURLException {
		
		DesiredCapabilities desired = new DesiredCapabilities();
		
		desired.setCapability("deviceName", "sdk_gphone_x86_arm");
		desired.setCapability("udid", "emulator-5554");
		desired.setCapability("platformName", "Android");
		desired.setCapability("platformVersion", "11");
		desired.setCapability("appPackage", "com.roadtrippers");
		desired.setCapability("appActivity", "com.roadtrippers.ui.activities.SplashActivity");
		desired.setCapability("appWaitDuration", "50000");
		
		//we will pass URL info of Appium server
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,desired);
		System.out.println(" App Launched");
		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		driver.findElement(By.id("com.android.chrome:id/terms_accept")).click();
//		
////		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.chrome:id/negative_button")));
//		driver.findElement(By.id("com.android.chrome:id/negative_button")).click();
//		driver.findElement(By.id("com.android.chrome:id/search_box_text")).click();
//		driver.findElement(By.id("com.android.chrome:id/url_bar")).sendKeys("godzilla vs kong");
//		driver.getKeyboard().pressKey(Keys.ENTER);// because we will not be able to click on keybord with element.ô
//		System.out.println("Google Searched godzilla vs kong");
	}

}
