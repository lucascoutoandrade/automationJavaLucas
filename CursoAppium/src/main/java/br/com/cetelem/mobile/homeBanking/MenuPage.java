package br.com.cetelem.mobile.homeBanking;

import br.com.cursoappium.core.BasePage;

public class MenuPage extends BasePage {
	
	
	public void acessarCartoes() {

		clicarPorTexto("Meu cart�o");

	}

	public void acessarFatura() {
		
		clicarPorTexto("VER FATURA");
	}
	
	public void acessarServicos() {
		
		clicarPorTexto("SERVI�OS");
		aguardaTextoAparecer("Alterar senha");
	}

}
