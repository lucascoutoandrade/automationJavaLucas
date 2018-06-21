package br.com.cursoappium.pages;

import br.com.cursoappium.core.BasePage;

public class SplashPage extends BasePage {
	
	public boolean verificaSeSplashAparece() {
		
		return verificaTextoNaTela("Splash!");
	}
	
	public void aguardaTextoSplashSumir() {
		
		aguardaTextoSumir("Splash!");
	}

}
