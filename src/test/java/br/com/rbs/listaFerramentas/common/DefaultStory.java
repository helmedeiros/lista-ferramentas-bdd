package br.com.rbs.listaFerramentas.common;

import br.com.rbs.listaFerramentas.busca.fixtures.GivenContext;
import br.com.rbs.listaFerramentas.busca.fixtures.ThenAsserts;
import br.com.rbs.listaFerramentas.busca.fixtures.WhenActions;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DefaultStory {

	WebDriver browser;
	protected GivenContext given;
	protected WhenActions when;
	protected ThenAsserts then;

	@Before
	public void setUp() {
		browser = firefoxBrowsing();

		given = new GivenContext(browser);
		when = new WhenActions(browser);
		then = new ThenAsserts(browser);
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
		browser = new InternetExplorerDriver(ieCapabilities);
		return browser;
	}
	
	
	/**
	 * Code used to create a firefox browser screen.
	 * @return The firefox browser
	 */
	public WebDriver firefoxBrowsing() {
		browser = new FirefoxDriver();
		return browser;
	}
	
	@After
    public void tearDown() { 
        browser.quit(); 
    } 

}
