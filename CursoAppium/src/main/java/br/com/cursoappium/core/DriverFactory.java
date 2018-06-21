package br.com.cursoappium.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.java.properties.Manipulador;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

	private static AndroidDriver<MobileElement> driver;
	
	private static Properties prop = Manipulador.getProp();
	
	public static String appPackage = prop.getProperty("prop.appium.appPackage");
	public static String appActivity = prop.getProperty("prop.appium.appActivity");

	public static AndroidDriver<MobileElement> getDriver() {

		if (driver == null) {
			createDriver();
		}

		return driver;

	}

	private static void createDriver() {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
//		desiredCapabilities.setCapability("appPackage", "com.ctappium");
//		desiredCapabilities.setCapability("appActivity", "com.ctappium.MainActivity");
		desiredCapabilities.setCapability("appPackage",appPackage );
		desiredCapabilities.setCapability("appActivity", appActivity);
		desiredCapabilities.setCapability("autoGrantPermissions", "true");

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void killDriver() {

		if (driver != null) {
			driver.quit();
			driver = null;

		}
	}

}
