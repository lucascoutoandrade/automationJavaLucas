package br.com.cursoappium.pages;

import br.com.cursoappium.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarFormulario() {

		clicarPorTexto("Formulário");

	}

	public void acessarSplash() {

		clicarPorTexto("Splash");
	}

	public void acessarAlertas() {

		clicarPorTexto("Alertas");
	}
	
	public void acesssarCliques() {
		
		clicarPorTexto("Cliques");
	}

	public void acessarAbas() {
		clicarPorTexto("Abas");
	}

	public void acessarAccordion() {
		clicarPorTexto("Accordion");
	}
	
	public void acessarSwipe() {
		
		clicarPorTexto("Swipe");
	}

}
