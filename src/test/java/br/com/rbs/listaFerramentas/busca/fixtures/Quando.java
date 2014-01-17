package br.com.rbs.listaFerramentas.busca.fixtures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Quando {
	private final WebDriver browser;

	public Quando(WebDriver browser) {
		this.browser = browser;
	}

	public Quando procuroPeloNome(String toolName) {
		browser.findElement(By.name("form:tool")).sendKeys(toolName);
        return this;
    }

    public Quando e(){
        return this;
    }

	public void clicoBuscar() {
		browser.findElement(By.name("form:searchButton")).click();
	}

}
