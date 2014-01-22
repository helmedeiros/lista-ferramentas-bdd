package br.com.rbs.listaFerramentas.search.fixtures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Object that will perform the actions of the test.
 * @author helmedeiros
 */
public class WhenActions {
	private final WebDriver browser;

    /** Default constructor
     * @param browser - The actual browser where the given context pages should be open;
     */
	public WhenActions(WebDriver browser) {
		this.browser = browser;
	}

    /**
     * Perform the search by the given {@link String} toolName.
     * @param toolName - The {@link String} tool name;
     * @return The {@link WhenActions} so it could be used inline.                 
     */
	public WhenActions searchByAToolName(String toolName) {
		browser.findElement(By.name("form:tool")).sendKeys(toolName);
        iClickOn("form:searchButton");
        return this;
    }

    /**
     * Turn verbose the inline method call;
     * @return The {@link WhenActions} so it could be used inline.
     */
    public WhenActions and(){
        return this;
    }

    /**
     * Click on the given {@link String} linkName.
     * @param linkName - The {@link String} that represents the element's link name that should be clicked.
     */
	public void iClickOn(final String linkName) {
		browser.findElement(By.name(linkName)).click();
	}

    /**
     * Perform the search by the given {@link String} group name;
     * @param group - The {@link String} group name to be searched for;
     * @return The {@link WhenActions} so it could be used inline.
     */
    public WhenActions searchByToolsGroup(String group) {
        Select groupSelect = new Select(browser.findElement(By.name("form:group")));
        groupSelect.selectByVisibleText(group);
        iClickOn("form:searchButton");
        return this;
    }
}
