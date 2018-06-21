package br.com.cursoappium.core;

import static br.com.cursoappium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class DSL_Depreceated {

	public void clicar(By by) {

		getDriver().findElement(by).click();
	}

	public void escreverTexto(By by, String valor) {

		getDriver().findElement(by).sendKeys(valor);
	}

	public String obterTexto(By by) {

		return getDriver().findElement(by).getText();
	}

	public void selecionarCombo(By by, String value) {

		getDriver().findElement(by).click();
		getDriver().findElement(By.xpath("//android.widget.CheckedTextView[@text='" + value + "']")).click();
	}

	public void clicaNoChk() {

		getDriver().findElement(By.xpath("//android.widget.CheckBox[@content-desc='check']")).click();

	}

	public void clicaNoSwitch() {

		getDriver().findElement(By.xpath("//android.widget.Switch[@content-desc='switch']")).click();
	}

	public void clicarBtnSalvar(By by) {

		getDriver().findElement(By.xpath("//android.widget.TextView[@text='SALVAR']")).click();
	}

}
