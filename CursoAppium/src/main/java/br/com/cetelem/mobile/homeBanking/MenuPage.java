package br.com.cetelem.mobile.homeBanking;

import br.com.cursoappium.core.BasePage;

public class MenuPage extends BasePage {
	
	
	public void acessarCartoes() {

		clicarPorTexto("Meu cartão");

	}

	public void acessarFatura() {
		
		clicarPorTexto("VER FATURA");
	}
	
	public void acessarServicos() {
		
		clicarPorTexto("SERVIÇOS");
		aguardaTextoAparecer("Alterar senha");
	}

}
