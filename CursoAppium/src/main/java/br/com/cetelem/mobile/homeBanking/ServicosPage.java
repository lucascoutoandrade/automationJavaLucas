package br.com.cetelem.mobile.homeBanking;

import br.com.cursoappium.core.BasePage;

public class ServicosPage extends BasePage {
	
	public void clicaSair() {
		
		clicarPorTexto("SAIR");
		aguardaTextoAparecer("ACESSAR");
	}

}
