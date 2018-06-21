package br.com.cetelem.mobile.homeBanking;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import br.com.appium.cucumber.mobile.homebanking.feature.GravaTest;
import br.com.cursoappium.core.BaseTest;

public class HomeBankingPocTeste extends BaseTest {

	private static LoginPage login = new LoginPage();
	private static MenuPage menu = new MenuPage();
	private static ServicosPage servicos = new ServicosPage();
	private static GravaTest gravaTest = new GravaTest();

	@Test
	public void deveAcessarHomeBankingComSucesso() throws IOException, AWTException {

		gravaTest.startRecorder();
		// efetua login HB
		login.efetuarLogin("24258594385");
		// valida se login com sucesso
		Assert.assertTrue(login.validaSeLoginSucesso());

	}

	@Test
	public void deveAcessarTelaCartao() {

		// acessa menu cartoes
		menu.acessarCartoes();

		// verifica se esta na tela Meu cartão
		Assert.assertTrue(menu.verificaTextoNaTela("Meu cartão"));

	}

	@Test
	public void deveAcessarTelaFatura() {

		// acessa menu fatura
		menu.acessarFatura();

		// verifica se esta na tela Faturas
		Assert.assertTrue(menu.verificaTextoNaTela("Faturas"));

	}

	@Test
	public void deveSairDaAplicacao() throws IOException {

		// acessa menu fatura
		menu.acessarServicos();

		// faz o scroll
		menu.scroll(0.9, 0.1);

		menu.esperaImplicita(2000);

		// clica no botão sair
		servicos.clicaSair();
		
		gravaTest.finishRecorder();

		// verifica se esta na tela de Login
		Assert.assertTrue(menu.verificaTextoNaTela("ACESSAR"));
		
		

	}

}
