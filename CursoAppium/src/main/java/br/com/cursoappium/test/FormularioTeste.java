package br.com.cursoappium.test;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import br.com.cursoappium.core.BaseTest;
import br.com.cursoappium.pages.FormularioPage;
import br.com.cursoappium.pages.MenuPage;

public class FormularioTeste extends BaseTest {
	
	private static MenuPage menu = new MenuPage();
	private static FormularioPage formPage = new FormularioPage();
	
	@Before
	public void antesTeste() throws MalformedURLException {
		
		// acessa menu Formulário
		menu.acessarFormulario();
		
	}
	@Ignore
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
	
	@Ignore
	@Test
	public void deveAlterarData() {
		
		// clica na dataCompleta
		formPage.clicaNaData("01/01/2000");
		
		// seleciona o mes
		formPage.selecionaDia("5");
		
		// clica no botao OK
		formPage.clicaBtnOK();
		
		// verifica se data foi alterada
		Assert.assertTrue(formPage.verificaTextoNaTela("5/2/2000"));
		
		
	}
	
	@Test
	public void deveInteragircomSeekBar() {
		// clicar no seekBar
		formPage.clicarNoSeekBar(0.65);
		
		// salvar
		formPage.clicarBotaoSalvar();
		
		
		// obter o valor
	}
}
