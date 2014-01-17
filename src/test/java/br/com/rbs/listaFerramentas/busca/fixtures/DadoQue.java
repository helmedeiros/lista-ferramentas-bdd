package br.com.rbs.listaFerramentas.busca.fixtures;

import org.openqa.selenium.WebDriver;

public class DadoQue{
	private final WebDriver browser;
	
	public DadoQue(WebDriver browser) {
		this.browser = browser;
	}

	public void estouNaPaginaPrincipal() {
		browser.get("http://www.listaferramentas.rbs.com.br");
	}

}
