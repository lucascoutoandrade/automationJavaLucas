package br.com.cursoappium.test;

import org.junit.Test;
import br.com.cursoappium.core.BaseTest;
import br.com.cursoappium.pages.MenuPage;

public class SwipeTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveRealizarSwipe() throws InterruptedException {
		// acessar menu
		menu.acessarSwipe();
		Thread.sleep(5000);
		
		// swipe direita
		menu.swipe(0.9, 0.1);
		Thread.sleep(5000);
		
		// verificar o texto
		
		//clicar botao direita 
		menu.clicarPorTexto("›");
		Thread.sleep(7000);
		
		// verificar o texto 'Chegar até o fim!'
		
		// swipe esquerda
		menu.swipe(0.1, 0.9);
		Thread.sleep(7000);
		
		// clicar botao esquerda
		menu.clicarPorTexto("‹");
		// verificar texto 'a esquerda'
	}

}
