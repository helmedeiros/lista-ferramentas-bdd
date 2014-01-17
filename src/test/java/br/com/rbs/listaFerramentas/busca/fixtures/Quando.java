package br.com.rbs.listaFerramentas.busca.fixtures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Quando {
	private final WebDriver browser;

	public Quando(WebDriver browser) {
		this.browser = browser;
	}


	public void procuroPeloNome(String toolName) {
		browser.findElement(By.name("form:tool")).sendKeys(toolName);
		clicarBuscar();
	}


	private void clicarBuscar() {
		browser.findElement(By.name("form:searchButton")).click();
	}

}
