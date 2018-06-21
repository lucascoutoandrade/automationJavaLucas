package br.com.cetelem.mobile.homeBanking;

import static br.com.cursoappium.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import br.com.cursoappium.core.BasePage;

public class LoginPage extends BasePage {
	private static WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	public void efetuarLogin(String valueCPF) {

		// digita CPF
		escreverTexto(By.id("br.com.cetelem.mobilebank.uat:id/edittext_cpf"), valueCPF);

		// clica no botao acessar
		clicar(By.xpath("//*[@text='ACESSAR']"));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='CONFIRMAR']")));

		// senha padrão 101010
		clicarPorTexto("1");
		clicarPorTexto("0");
		clicarPorTexto("1");
		clicarPorTexto("0");
		clicarPorTexto("1");
		clicarPorTexto("0");

		// clica no botao confirmar
		clicarPorTexto("CONFIRMAR");

		// aguarda aparecer a tela cartões
		aguardaTextoAparecer("Cartões");

	}

	public boolean validaSeLoginSucesso() {
		return verificaTextoNaTela("Cartões");
	}

	public void preencheCampoCPF(String cpf) {

		// digita CPF
		escreverTexto(By.id("br.com.cetelem.mobilebank.uat:id/edittext_cpf"), cpf);

	}

	public void clicaAcessar() {

		// clica no botao acessar
		clicar(By.xpath("//*[@text='ACESSAR']"));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='CONFIRMAR']")));

	}
	
	public void preencheSenha() {
		
		// senha padrão 101010
		clicarPorTexto("1");
		clicarPorTexto("0");
		clicarPorTexto("1");
		clicarPorTexto("0");
		clicarPorTexto("1");
		clicarPorTexto("0");
	
	}
	
	public void clicaConfirmar() {
		
		// clica no botao confirmar
		clicarPorTexto("CONFIRMAR");

		// aguarda aparecer a tela cartões
		aguardaTextoAparecer("Cartões");
		
	}

}
