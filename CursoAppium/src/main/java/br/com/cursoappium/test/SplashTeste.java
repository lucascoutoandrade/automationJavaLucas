package br.com.cursoappium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cursoappium.core.BaseTest;
import br.com.cursoappium.pages.MenuPage;
import br.com.cursoappium.pages.SplashPage;

public class SplashTeste extends BaseTest {

	private static MenuPage menu = new MenuPage();
	private static SplashPage splash = new SplashPage();

	@Before

	public void antesTeste() {
		// acessar menu splash
		menu.acessarSplash();
	}

	@Test
	public void deveAguardarSplashSumir() {

		// verificar que o splash esta sendo exibido
		Assert.assertTrue(splash.verificaSeSplashAparece());

		// aguardar saida do splash
		splash.aguardaTextoSplashSumir();

		// verificar que o formulario esta aparecendo
		Assert.assertTrue(splash.verificaTextoNaTela("Formulário"));

	}

}
