package br.com.cursoappium.test;

import org.junit.Before;
import org.junit.Test;

import br.com.cursoappium.core.BaseTest;
import br.com.cursoappium.pages.AccordionPage;
import br.com.cursoappium.pages.MenuPage;

public class AccordionTeste extends BaseTest {
	
	private static MenuPage menu = new MenuPage();
	private static AccordionPage page = new AccordionPage();
	
	@Before
	public void antesTeste() {
		
		menu.acessarAccordion();
		
	}
	
	@Test
	public void interagirAcorddion() {
			
		// clicar na opcao 1
		page.clicarOp1();
		
		page.esperaImplicita(1000);
		
		// verificar o texto da opção1
		page.verificaDescricao("Esta é a descrição da opção 1");
		
		
	}

}
