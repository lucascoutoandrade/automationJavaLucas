package br.com.cursoappium.pages;

import static br.com.cursoappium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.cursoappium.core.BasePage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class FormularioPage extends BasePage {

	public void escreverNome(String nome) {
		escreverTexto(MobileBy.AccessibilityId("nome"), nome);
	}

	public String obterNome() {

		return obterTexto(MobileBy.AccessibilityId("nome"));

	}

	public void selecionarCombo(String valor) {

		selecionarCombo(MobileBy.AccessibilityId("console"), valor);

	}

	public void clicarChk() {

		clicaNoChk();

	}

	public void clicarSwitch() {

		clicaNoSwitch();
	}

	public void clicarBotaoSalvar() {

		clicar(By.xpath("//android.widget.TextView[@text='SALVAR']"));
	}
	
	public void clicaNaData(String dataCompleta) {
		clicarPorTexto(dataCompleta);
	}
	
	public void selecionaDia(String mes) {
		clicarPorTexto(mes);
	}
	
	public void clicaBtnOK() {
		clicarPorTexto("OK");
	}

	public String obterNomeCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Nome:')]"));
	}

	public String obterConsoleCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Console:')]"));
	}

	public String obterSwitchCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]"));
	}

	public String obterChkCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]"));
	}
	
	public void clicarNoSeekBar(double posicao) {
		
	int delta = 50;	
	 MobileElement seek = getDriver().findElement(MobileBy.AccessibilityId("slid"));
	 int y = seek.getLocation().y + seek.getSize().height/2;
	 System.out.println(y);
	 
	 int xinicial = seek.getLocation().x + delta ;
	 int x = (int)(xinicial+ ((seek.getSize().width -2*delta) * posicao));
	 System.out.println(x);
	 
	 tap(x, y);
	}
}
