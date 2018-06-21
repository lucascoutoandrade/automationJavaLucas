package br.com.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class TestYoutube {
	
	@Test
	public  void deveSomarDoisValores() throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
	    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	    
	    AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
	    
	    Thread.sleep(5000);
	    
	    MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_4");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("multiply");
	    el4.click();
	    MobileElement el5 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_3");
	    el5.click();
	    MobileElement el6 = (MobileElement) driver.findElementById("com.google.android.calculator:id/result");
	    el6.click();
	    
		System.out.println(el6.getText());
//	    
	    Assert.assertEquals("12", el6.getText());
	    
	    driver.quit();
	    
	}

}
