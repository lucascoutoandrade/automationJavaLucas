package br.com.cursoappium.pages;

import br.com.cursoappium.core.BasePage;

public class AccordionPage extends BasePage {

	public void clicarOp1() {

		clicarPorTexto("Opção 1");
	}

	public boolean verificaDescricao(String descricao) {
		return verificaTextoNaTela(descricao);
	}

}
