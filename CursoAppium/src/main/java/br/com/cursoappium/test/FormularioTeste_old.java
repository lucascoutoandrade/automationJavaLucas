package br.com.cursoappium.test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import br.com.cursoappium.core.DriverFactory;
import br.com.cursoappium.core.DSL_Depreceated;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FormularioTeste_old {
	
	private static AndroidDriver<MobileElement> driver;
	private static DSL_Depreceated page = new DSL_Depreceated();
	
	@BeforeClass
	public static void antesTeste() throws MalformedURLException {
		
		driver = DriverFactory.getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	

	@Test
	public void deveInstalarAPK() throws MalformedURLException {

//		List<MobileElement> elementoDoMenu = driver.findElements(By.className("android.widget.TextView"));

		// for(MobileElement element :elemento ) {
		// System.out.println(element.getText());
		// }

		// Seleciona Link Formulário
//		elementoDoMenu.get(1).click();
		
		driver.findElement(By.xpath("//*[@text='Formulário']")).click();

		// Escreve nome
		MobileElement elementoNome = driver.findElement(MobileBy.AccessibilityId("nome"));
		elementoNome.sendKeys("Lucas");

		// obtem o nome
		String getNome = elementoNome.getText();

		// Clica no combo
		driver.findElement(MobileBy.AccessibilityId("console")).click();

		// selecionaValue do combo
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='PS4']")).click();

		MobileElement elementoChk = driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc='check']"));

		MobileElement elementoSwitch = driver.findElement(By.xpath("//android.widget.Switch[@content-desc='switch']"));

		elementoChk.click();
		elementoSwitch.click();

		// Clica no botão salvar
		driver.findElement(By.xpath("//android.widget.TextView[@text='SALVAR']")).click();

		// Validações

		MobileElement elementNome = driver.findElement(By.xpath("//android.widget.TextView[@index='12']"));
		MobileElement elementConsole = driver.findElement(By.xpath("//android.widget.TextView[@index='13']"));
		MobileElement elementSwitch = driver.findElement(By.xpath("//android.widget.TextView[@index='15']"));
		MobileElement elementCheck = driver.findElement(By.xpath("//android.widget.TextView[@index='16']"));

		// Validações das informações contidas no relatório
		Assert.assertTrue(elementNome.getText().contains("Lucas"));

		Assert.assertTrue(elementConsole.getText().contains("ps4"));

		Assert.assertTrue(elementSwitch.getText().contains("Off"));

		Assert.assertTrue(elementCheck.getText().contains("Marcado"));
		

		

	}
	
	@After
	public void finalizaTeste() {
		
		DriverFactory.killDriver();
		
	}

}
