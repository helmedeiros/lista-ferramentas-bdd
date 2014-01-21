package br.com.rbs.listaFerramentas.search.fixtures;

import org.openqa.selenium.WebDriver;

/**
 * Object that will prepare the context of the test.
 * @author helmedeiros
 */
public class GivenContext {
	private final WebDriver browser;

    /** Default constructor
     * @param browser - The actual browser where the given context pages should be open;
     */
	public GivenContext(WebDriver browser) {
		this.browser = browser;
	}

    /** Put the user context in the main page. */
	public void imInTheMainPage() {
		browser.get("http://www.listaferramentas.rbs.com.br");
	}

}
