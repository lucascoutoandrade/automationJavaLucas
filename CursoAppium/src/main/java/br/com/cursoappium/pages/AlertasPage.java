package br.com.cursoappium.pages;

import br.com.cursoappium.core.BasePage;

public class AlertasPage extends BasePage {
	
	public void clicarAlertConfirm() {
		
		clicarPorTexto("ALERTA CONFIRM");
	}
	
	public void clicarAlertSimples() {
		
		clicarPorTexto("ALERTA SIMPLES");
	}
	
	public boolean verficaTextoConfirmacao() {
		return verificaTextoNaTela("Confirma a operação?");
	}
	
	public void clicaBtnConfirmar() {
		clicarPorTexto("CONFIRMAR");
	}
	
	public boolean verificaTextoConfirmar() {
		
		return verificaTextoNaTela("Confirmado");
	}
	
	public void clicaBtnSair() {
		
		clicarPorTexto("SAIR");
	}
	
	public void clicarForaCaixa() {
		
		tap(100, 150);
	}

}
