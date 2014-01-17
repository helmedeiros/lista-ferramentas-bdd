package br.com.rbs.listaFerramentas.busca.fixtures;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StoryTest {

	WebDriver browser;
	protected DadoQue dadoQue;
	protected Quando quando;
	protected Entao entao;

	@Before
	public void setUp() {
		browser = firefoxBrowsing();

		dadoQue = new DadoQue(browser);
		quando = new Quando(browser);
		entao = new Entao(browser);
	}

	/**
	 * Code used to create an ie browser.
	 * http://code.google.com/p/selenium/issues/detail?id=1795
	 * @return the ie browser
	 */
	@SuppressWarnings("unused")
	private WebDriver ieBrowsing() {
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true); 
		WebDriver browser = new InternetExplorerDriver(ieCapabilities);
		return browser;
	}
	
	
	/**
	 * Code used to create a firefox browser screen.
	 * @return The firefox browser
	 */
	public WebDriver firefoxBrowsing() {
		WebDriver browser = new FirefoxDriver();
		return browser;
	}
	
	@After
    public void tearDown() { 
        browser.quit(); 
    } 

}
