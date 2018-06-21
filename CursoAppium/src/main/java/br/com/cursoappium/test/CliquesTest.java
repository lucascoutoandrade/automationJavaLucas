package br.com.cursoappium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cursoappium.core.BaseTest;
import br.com.cursoappium.pages.CliquesPage;
import br.com.cursoappium.pages.MenuPage;

public class CliquesTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();
	
	@Before
	
	public void antesTeste() {
		// acessar menu
		menu.acesssarCliques();
	}
	
	
	@Test
	public void deveRealizarCliqueLongo() {
	
		
		//clique longo
		page.cliqueLongo();
		
		//verificar texto
		Assert.assertEquals("Clique Longo", page.obterTexto());
		
		
	}
	
	@Test
	public void deveRealizarCliqueDuplo() {
		
		page.clicarPorTexto("Clique duplo");
		page.clicarPorTexto("Clique duplo");
		
		//verificar texto
		Assert.assertEquals("Duplo Clique", page.obterTexto());
		
		
		
	}

}
