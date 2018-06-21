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
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		
		// scroll down
		menu.scroll(0.9, 0.1);
		
		// clicar menu
		menu.clicarPorTexto("Opção bem escondida");
		
		// verificar mensagem
		Assert.assertEquals("Você achou essa opção", menu.obterMensagemAlerta());
		
		//sair
		menu.clicarPorTexto("OK");
	}

}
