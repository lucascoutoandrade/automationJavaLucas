package br.com.cursoappium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.cursoappium.core.BaseTest;
import br.com.cursoappium.pages.AlertasPage;
import br.com.cursoappium.pages.MenuPage;

public class AlertasTeste extends BaseTest {

	private static MenuPage menu = new MenuPage();
	private static AlertasPage page = new AlertasPage();

	@Before
	public void antesdoTeste() {
		// Acessa Menu Alertas
		menu.acessarAlertas();

	}

	@Test
	public void confirmarAlert() {

		// Clicar em alerta confirm
		page.clicarAlertConfirm();

		// Verificar os textos
		Assert.assertTrue(page.verficaTextoConfirmacao());

		// confirmar alerta
		page.clicaBtnConfirmar();

		// verificar nova mensagem
		Assert.assertTrue(page.verificaTextoConfirmar());

		// sair
		page.clicaBtnSair();
	}
	
	@Test 
	public void alertaForaCaixa() {
		
		// clicar no alerta Simples
		page.clicarAlertSimples();
		
		page.esperaImplicita(1000);
		
		
		//clicar fora da caixa
		page.clicarForaCaixa();
		
		
		// verificar que a mensagem não esta presente
		Assert.assertFalse(page.verificaTextoNaTela("Pode clicar no OK ou fora da caixa para sair"));
		
		
		
		
	}

}
