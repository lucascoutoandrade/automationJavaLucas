package br.com.cursoappium.pages;

import static br.com.cursoappium.core.DriverFactory.getDriver;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;

public class ServicosPage {
	
public void scroll(double inicio, double fim,WebDriver driver) {
		
		Dimension size = driver.manage().window().getSize();
		
		int x = size.width/2;
		
		int start_y = (int) (size.height * inicio);
		
		int fim_y = (int) (size.height * fim);
		
		new TouchAction((PerformsTouchActions) driver).press(x, start_y)
		.waitAction(Duration.ofMillis(500))
		.moveTo(x, fim_y)
		.release()
		.perform();
		
		
	}

}
