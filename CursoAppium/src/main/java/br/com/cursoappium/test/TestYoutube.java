package br.com.cursoappium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


import java.net.MalformedURLException;
import java.net.URL;
import org.monte.media.math.Rational;
import org.monte.media.Format;
import org.monte.screenrecorder.ScreenRecorder;
import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;
import java.awt.*;
import java.io.IOException;


public class TestYoutube {
	
	private ScreenRecorder screenRecorder;
	
	@Test
	public  void deveSomarDoisValores() throws InterruptedException, IOException, AWTException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
	    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	    
	    AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
	    
	 // Create an instance of GraphicsConfiguration to get the Graphics configuration of the Screen.
	 		// This is needed for ScreenRecorder class.
 	GraphicsConfiguration gc = GraphicsEnvironment
 			.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
	 	
	 	// Create a instance of ScreenRecorder with the required configurations
	 	screenRecorder = new ScreenRecorder(gc, new Format(MediaTypeKey,MediaType.FILE, MimeTypeKey, MIME_QUICKTIME),
	 	new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,ENCODING_QUICKTIME_JPEG, CompressorNameKey,
	ENCODING_QUICKTIME_JPEG, DepthKey, (int) 24,FrameRateKey, Rational.valueOf(15), QualityKey, 1.0f,
	 	KeyFrameIntervalKey, (int) (15 * 60)),
	 	new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black", FrameRateKey,Rational.valueOf(30)),
	 	null);
	 	
	 	
	 	// Call the start method of ScreenRecorder to begin recording
	 	screenRecorder.start();
	    
	    
	    
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
	    
	 // Call the stop method of ScreenRecorder to end the recording
	    screenRecorder.stop();
	    
	}

}
