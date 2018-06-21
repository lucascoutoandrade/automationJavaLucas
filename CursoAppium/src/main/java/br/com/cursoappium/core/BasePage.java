package br.com.cursoappium.core;

import static br.com.cursoappium.core.DriverFactory.getDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class BasePage {
	
	public static WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	protected void clicar(By by) {

		getDriver().findElement(by).click();
	}

	public void clicarPorTexto(String texto) {
		getDriver().findElement(By.xpath("//*[@text='" + texto + "']")).click();
	}

	protected void escreverTexto(By by, String valor) {

		getDriver().findElement(by).sendKeys(valor);
	}

	public boolean verificaTextoNaTela(String texto) {

		List<MobileElement> findElements = getDriver().findElements(By.xpath("//*[@text='" + texto + "']"));

		return findElements.size() > 0;
	}

	protected void aguardaTextoSumir(String texto) {

		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='" + texto + "']")));

	}
	
	protected void aguardaTextoAparecer(String texto) {
		
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='"+texto+"']")));
		
	}

	protected String obterTexto(By by) {

		return getDriver().findElement(by).getText();
	}

	protected void selecionarCombo(By by, String value) {

		getDriver().findElement(by).click();
		getDriver().findElement(By.xpath("//android.widget.CheckedTextView[@text='" + value + "']")).click();
	}

	protected void clicaNoChk() {

		getDriver().findElement(By.xpath("//android.widget.CheckBox[@content-desc='check']")).click();

	}

	protected void clicaNoSwitch() {

		getDriver().findElement(By.xpath("//android.widget.Switch[@content-desc='switch']")).click();
	}

	protected void clicarBtnSalvar(By by) {

		getDriver().findElement(By.xpath("//android.widget.TextView[@text='SALVAR']")).click();
	}
	
	public void esperaImplicita(long millesegundos) {
		
		try {
			Thread.sleep(millesegundos);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void tap(int x, int y) {
		
		new TouchAction(getDriver()).tap(x, y).perform();
		
	}
	
	public void scroll(double inicio, double fim) {
		
		Dimension size = getDriver().manage().window().getSize();
		
		int x = size.width/2;
		
		int start_y = (int) (size.height * inicio);
		
		int fim_y = (int) (size.height * fim);
		
		new TouchAction(getDriver())
		.press(x, start_y)
		.waitAction(Duration.ofMillis(500))
		.moveTo(x, fim_y)
		.release()
		.perform();
		
	}
	
	
	public void swipe(double inicio, double fim) {
		
Dimension size = getDriver().manage().window().getSize();
		
		int y = size.height/2;
		
		int start_x = (int) (size.width * inicio);
		
		int fim_x = (int) (size.width * fim);
		
		new TouchAction(getDriver())
		.press(start_x, y)
		.waitAction(Duration.ofMillis(500))
		.moveTo(fim_x, y)
		.release()
		.perform();

		
	}
	
	public String obterTituloAlerta() {
		return obterTexto(By.id("android:id/alertTitle"));
	}
	
	public String obterMensagemAlerta() {
		return obterTexto(By.id("android:id/message"));
	}

}
