package calculator_Automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorWifi {

		static AppiumDriver driver;
		public static void main(String[] args) {
			try {
				Calculator();
			}
			catch(Exception e) {
				System.out.println(e.getCause());
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			}
		public static void Calculator() throws MalformedURLException {
			
			DesiredCapabilities desired = new DesiredCapabilities();
			
			desired.setCapability("deviceName", "Moto G");
			desired.setCapability("udid", "10.0.0.181:5555");
			desired.setCapability("platformName", "Android");
			desired.setCapability("platformVersion", "5.1");
			desired.setCapability("appPackage", "com.android.calculator2");
			desired.setCapability("appActivity", "com.android.calculator2.Calculator");
			//we will pass URL info of Appium server
			
			URL url= new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url,desired);
			System.out.println("calculator opened fine");
			
			driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
			driver.findElement(By.id("com.android.calculator2:id/op_mul")).click();
			driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
			driver.findElement(By.id("com.android.calculator2:id/eq")).click();
			String result =driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
			
			System.out.println(result);
			System.out.println("\n Result is :"+ result);
			
			driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
			driver.findElement(By.id("com.android.calculator2:id/op_mul")).click();
			driver.findElement(By.id("com.android.calculator2:id/digit_4")).click();
			driver.findElement(By.id("com.android.calculator2:id/eq")).click();
			String result2 =driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
			
			System.out.println(result2);
			System.out.println("\n Result is :"+ result2);
		}

}
