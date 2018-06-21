package br.com.cursoappium.test;

import static br.com.cursoappium.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.cursoappium.core.BaseTest;
import br.com.cursoappium.pages.MenuPage;


public class OpcaoEscondidaTeste extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	 
	
	@Test
	public void deveEncontrarOpcaoEscondida() {
		
		WebDriverWait wait = new WebDriverWait(getDriver(),10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formul�rio']")));
		
		// scroll down
		menu.scroll(0.9, 0.1);
		
		// clicar menu
		menu.clicarPorTexto("Op��o bem escondida");
		
		// verificar mensagem
		Assert.assertEquals("Voc� achou essa op��o", menu.obterMensagemAlerta());
		
		//sair
		menu.clicarPorTexto("OK");
	}

}
