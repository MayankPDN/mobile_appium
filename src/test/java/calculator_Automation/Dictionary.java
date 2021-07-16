package calculator_Automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.tools.javac.util.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Dictionary {

	static AppiumDriver driver;
	public static void main(String[] args) {
		try {
			Dictionary();
		}
		catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		}
	public static void Dictionary() throws MalformedURLException {
		
		DesiredCapabilities desired = new DesiredCapabilities();
		
		desired.setCapability("deviceName", "Moto G");
		desired.setCapability("udid", "TA94800E1V");
		desired.setCapability("platformName", "Android");
		desired.setCapability("platformVersion", "5.1");
		desired.setCapability("appPackage", "com.tfd.mobile.TfdSearch");
		desired.setCapability("appActivity", "com.tfd.activity.MainActivity");
		//we will pass URL info of Appium server
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,desired);
		System.out.println("Dictionary opened fine");
		
	
		
		driver.findElement(By.id("android:id/search_button")).click();
		driver.findElement(By.id("android:id/search_src_text")).sendKeys("conspiracy");
		System.out.println("conspiracy is typed on App");
	}

}
