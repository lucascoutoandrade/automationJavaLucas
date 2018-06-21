package br.com.cursoappium.pages;

import static br.com.cursoappium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.cursoappium.core.BasePage;
import io.appium.java_client.TouchAction;

public class CliquesPage extends BasePage {
	
	public void cliqueLongo() {
		
		new TouchAction(getDriver())
		.longPress(getDriver().findElement(By.xpath("//*[@text='Clique Longo']")))
		.perform();
		
	}
	
	public String obterTexto() {
		
		return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
	}

}
