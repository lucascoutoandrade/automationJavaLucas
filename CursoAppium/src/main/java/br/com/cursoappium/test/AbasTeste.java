package br.com.cursoappium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cursoappium.core.BaseTest;
import br.com.cursoappium.pages.AbasPage;
import br.com.cursoappium.pages.MenuPage;

public class AbasTeste extends BaseTest {
	
	private static MenuPage menu = new MenuPage();
	private static AbasPage page  = new AbasPage();
	
	@Before
	public void antesTeste() {
		
		// Acessar Menu Abas
		menu.acessarAbas();
	}
	
	@Test
	public void acessarAbas() {
		// verificar que esta na aba1
		Assert.assertTrue(page.verificaSeAba1());
		
		
		//acessar aba2
		page.clicaAba2();
		
		//verificar que esta na aba2
		Assert.assertTrue(page.verificaSeAba2());
	}

}
