package br.com.appium.cucumber.mobile.homebanking.feature;

import static br.com.cursoappium.core.DriverFactory.getDriver;

import org.junit.Assert;

import br.com.cetelem.mobile.homeBanking.LoginPage;
import br.com.cetelem.mobile.homeBanking.MenuPage;
import br.com.cetelem.mobile.homeBanking.ServicosPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	private static LoginPage login = new LoginPage();
	private static MenuPage menu = new MenuPage();
	private static ServicosPage servicos = new ServicosPage();
	private static GravaTest gravaTest = new GravaTest();

	@Given("^estou logada na VPN Banco Cetelem e no aplicativo HomeBanking informo o numero de CPF \"([^\"]*)\"$")
	public void openAPK(String valueCPF) throws Throwable {
		// inicia gravação
		gravaTest.startRecorder();
		// preenche campo CPF
		login.preencheCampoCPF(valueCPF);

	}

	@When("^clico no botao Acessar$")
	public void clicaBotaoAcessar() throws Throwable {
		// clica no botão acessar
		login.clicaAcessar();

	}

	@And("^informo a senha de acesso cadastrada$")
	public void preencheSenha() throws Throwable {
		// preenche senha no teclado virtual
		login.preencheSenha();
	}

	@And("^clico no botao Confirmar$")
	public void clicaBotaoConfirmar() throws Throwable {
		// clica no botão confirmar
		login.clicaConfirmar();

	}

	@Then("^o usuario se loga no aplicativo cetelem$")
	public void verificaSeUsuarioLogadoComSucesso() throws Throwable {

		// verifica se logou com sucesso
		Assert.assertTrue(login.validaSeLoginSucesso());

	}

	@Given("^que estou logada no aplicativo Cetelem menu cartoes$")
	public void verificaSeMenuCartoes() throws Throwable {
		Assert.assertTrue(login.validaSeLoginSucesso());

	}

	@When("^clico na opcao Meu cartao$")
	public void clicaMeuCartao() throws Throwable {
		menu.acessarCartoes();

	}

	@Then("^o aplicativo carrega a pagina Meu cartao$")
	public void verificaSeTelaMeuCartao() throws Throwable {
		// verifica se esta na tela Meu cartão
		Assert.assertTrue(menu.verificaTextoNaTela("Meu cartão"));

	}

	@Given("^que estou na tela Meu Cartao$")
	public void que_estou_na_tela_Meu_Cartao() throws Throwable {
		Assert.assertTrue(menu.verificaTextoNaTela("Meu cartão"));

	}

	@When("^clico no botao <Ver Fatura>$")
	public void clicarVerFatura() throws Throwable {

		menu.acessarFatura();

	}

	@Then("^o aplicativo carrega a tela Faturas$")
	public void verificaSeTelaFaturas() throws Throwable {
		// verifica se esta na tela Faturas
		Assert.assertTrue(menu.verificaTextoNaTela("Faturas"));

	}

	@Given("^estou logada no aplicativo cetelem$")
	public void estou_logada_no_aplicativo_cetelem() throws Throwable {

		Assert.assertTrue(menu.verificaTextoNaTela("Faturas"));

	}

	@Given("^clico no menu Servicos$")
	public void acessaServicos() throws Throwable {

		menu.acessarServicos();

	}

	@When("^clico no botao <SAIR>$")
	public void clicaBotaoSair() throws Throwable {
		// faz o scroll
		menu.scroll(0.9, 0.1);

		menu.esperaImplicita(6000);

		// clica no botão sair
		servicos.clicaSair();
	}

	@Then("^o usuario sera direcionado para tela de login$")
	public void verificaSeTelaLogin() throws Throwable {
		// verifica se esta na tela de Login
		Assert.assertTrue(menu.verificaTextoNaTela("ACESSAR"));
		
		// finaliza gravação
		gravaTest.finishRecorder();
		
		// fecha driver
		getDriver().quit();

	}

}
