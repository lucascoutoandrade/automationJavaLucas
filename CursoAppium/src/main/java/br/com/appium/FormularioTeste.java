package br.com.appium;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import br.com.cursoappium.core.BaseTest;
import br.com.cursoappium.pages.FormularioPage;
import br.com.cursoappium.pages.MenuPage;

public class FormularioTeste extends BaseTest {
	
//	private static AndroidDriver<MobileElement> driver;
	private static MenuPage menu = new MenuPage();
	private static FormularioPage formPage = new FormularioPage();
	
	@BeforeClass
	public static void antesTeste() throws MalformedURLException {
		
		// acessa menu Formulário
		menu.acessarFormulario();
		
	}

	@Test
	public void cadastroNoFormulario() throws MalformedURLException {
		
		// Escreve nome
		formPage.escreverNome("Lucas");
		
		//Seleciona Combo
		formPage.selecionarCombo("PS4");
		
		// clica no checkBox
		
		formPage.clicarChk();

		// clica no switch
		formPage.clicarSwitch();

		// clica no botão salvar
		formPage.clicarBotaoSalvar();

		// Validações das informações contidas no relatório
		Assert.assertTrue(formPage.obterNomeCadastrado().contains("Lucas"));

		Assert.assertTrue(formPage.obterConsoleCadastrado().contains("ps4"));

		Assert.assertTrue(formPage.obterSwitchCadastrado().contains("Off"));

		Assert.assertTrue(formPage.obterChkCadastrado().contains("Marcado"));
		

	}


}
