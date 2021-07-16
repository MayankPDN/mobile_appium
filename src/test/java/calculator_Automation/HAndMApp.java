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

public class HAndMApp {
	
	static AppiumDriver driver;
	
	public static void main(String[] args) {
		try {
			HAndMApp();
		}
		catch(Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		}
	public static void HAndMApp() throws MalformedURLException {
		
		DesiredCapabilities desired = new DesiredCapabilities();
		
		desired.setCapability("deviceName", "Moto G");
		desired.setCapability("udid", "TA94800E1V");
		desired.setCapability("platformName", "Android");
		desired.setCapability("platformVersion", "5.1");
		desired.setCapability("appPackage", "com.hm.goe");
		desired.setCapability("appActivity", "com.hm.goe.app.home.HomeActivity");
		desired.setCapability("appWaitDuration", "50000");
		//we will pass URL info of Appium server
		
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,desired);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.className("android.widget.ImageButton")).click();

	}

}
