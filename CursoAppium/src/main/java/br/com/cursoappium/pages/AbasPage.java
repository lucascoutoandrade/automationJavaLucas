package br.com.cursoappium.pages;

import br.com.cursoappium.core.BasePage;

public class AbasPage extends BasePage {
	
	public boolean verificaSeAba1() {
		return verificaTextoNaTela("Este é o conteúdo da Aba 1");
	}
	
	public void clicaAba2() {
		clicarPorTexto("ABA 2");
	}
	
	
	public boolean verificaSeAba2() {
		return verificaTextoNaTela("Este é o conteúdo da Aba 2");
	}
}
