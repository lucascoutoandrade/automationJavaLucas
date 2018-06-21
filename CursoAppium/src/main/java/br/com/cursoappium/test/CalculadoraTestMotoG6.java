package br.com.cursoappium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.monte.media.math.Rational;
import org.monte.media.Format;
import org.monte.screenrecorder.ScreenRecorder;
import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;
import java.awt.*;
import java.io.IOException;

public class CalculadoraTestMotoG6 {
	
	private ScreenRecorder screenRecorder;
	
//	@Before
//	public void antestTeste() throws IOException, AWTException {
		// Create an instance of GraphicsConfiguration to get the Graphics configuration of the Screen.
		// This is needed for ScreenRecorder class.
//	GraphicsConfiguration gc = GraphicsEnvironment
//			.getLocalGraphicsEnvironment().getDefaultScreenDevice()
//			.getDefaultConfiguration();
	
	// Create a instance of ScreenRecorder with the required configurations
//	screenRecorder = new ScreenRecorder(gc, new Format(MediaTypeKey,MediaType.FILE, MimeTypeKey, MIME_QUICKTIME),
//	new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,ENCODING_QUICKTIME_JPEG, CompressorNameKey,
//	ENCODING_QUICKTIME_JPEG, DepthKey, (int) 24,FrameRateKey, Rational.valueOf(15), QualityKey, 1.0f,
//	KeyFrameIntervalKey, (int) (15 * 60)),
//	new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black", FrameRateKey,Rational.valueOf(30)),
//	null);
//	// Call the start method of ScreenRecorder to begin recording
//	screenRecorder.start();
	
	//}
	
	@Test
	public  void deveSomarDoisValores() throws IOException {
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("deviceName", "emulator-5554");
	    desiredCapabilities.setCapability("automationName", "uiautomator2");
	    desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
	    desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	    
	    AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
	    
	    
	    MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
	    el4.click();
	    
	    System.out.println(el4.getText());
	    
	   Assert.assertEquals("5", el4.getText());
	    
	    driver.quit();
	    
	 // Call the stop method of ScreenRecorder to end the recording
//	    screenRecorder.stop();
	    
	}

}
