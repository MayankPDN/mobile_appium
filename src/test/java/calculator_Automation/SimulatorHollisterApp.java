package calculator_Automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;

public class SimulatorHollisterApp {

	static AppiumDriver driver;
	public static void main(String[] args) {
		try {
			SimulatorHollisterApp();
		}
		catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		}
	
	public static void SimulatorHollisterApp() throws MalformedURLException {
		
		DesiredCapabilities desired = new DesiredCapabilities();
		
		desired.setCapability("deviceName", "sdk_gphone_x86_arm");
		desired.setCapability("udid", "emulator-5554");
		desired.setCapability("platformName", "Android");
		desired.setCapability("platformVersion", "11");
		desired.setCapability("appPackage", "com.abercrombie.hollister");
		desired.setCapability("appActivity", "com.abercrombie.abercrombie.ui.splash.SplashScreenActivity");
		//we will pass URL info of Appium server
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,desired);
		System.out.println("Hollister App Launched");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("com.abercrombie.hollister:id/login_button")).click();
		driver.findElement(By.id("com.abercrombie.hollister:id/email_input")).sendKeys("tt2955107@gmail.com");
		driver.findElement(By.id("com.abercrombie.hollister:id/password_input")).sendKeys("Jwilson#1");
	
//		Alert alert= driver.switchTo().alert();
		driver.findElement(By.id("com.abercrombie.hollister:id/login_button")).click();
		driver.findElement(By.id("com.abercrombie.hollister:id/onboarding_push_disable")).click();
		
		
		
//		driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
	
//		
		
		
	}

}
