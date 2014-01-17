package br.com.rbs.listaFerramentas.busca.fixtures;


import br.com.rbs.listaFerramentas.fixtures.TOOLS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class Entao {
	private static final String LISTA_FERRAMENTAS = "form:list";
	private static final String TR = "tr";
	private static final String TD = "td";
	private static final int SEGUNDA_COLUNA = 1;
	private static final int PRIMEIRA_COLUNA = 0;
	private final WebDriver browser;

	public Entao(WebDriver browser) {
		this.browser = browser;
	}

    public void minhaBuscaRetornaAsFerramentas(TOOLS... tools) {
		//Pega a tabela com os valores.
		WebElement table = pegarA(LISTA_FERRAMENTAS);
		ConferirTabela(table, tools);
	}

	private void ConferirTabela(WebElement tabela, TOOLS... tools) {
		// Agora pegue todas as TRs da tabela.
		List<WebElement> allRows = pegarAs(TR,tabela);
		conferirLinhas(allRows, tools);
	}

	private void conferirLinhas(List<WebElement> allRows, TOOLS... tools) {
		int j = 0;
		
		// Interaja com as linhas, pegando as celulas
		for (WebElement linha : allRows) {
			if(j>0){
				List<WebElement> listaCelulas = pegarAs(TD, linha);
				conferirColunas(listaCelulas, tools[j-1]);
			}
				
			j++;
		}
	}


	private void conferirColunas(List<WebElement> listaCelulas, TOOLS tool) {
		int colunaAtual = 0;
		
		for (WebElement celula : listaCelulas) {
			if(forA(colunaAtual,PRIMEIRA_COLUNA)) assertThat(celula.getText(), containsString(tool.group().toString()));
			if(forA(colunaAtual,SEGUNDA_COLUNA)) assertThat(celula.getText(), containsString(tool.toolName()));
			
			colunaAtual++;
		}
	}

	private boolean forA(int colunaAtual, int coluna) {
		return colunaAtual == coluna;
	}
	
	/**
	 * Pesquisa e retorn todos os elementos pai para um filho.
	 * @param elementoFilho - O elemento filho a ser buscado.
	 * @param elementoPai - O elemento pai  a ser buscado.
	 * @return retorn todos os elementos pai para um filho
	 */
	private List<WebElement> pegarAs(String elementoFilho, WebElement elementoPai) {
		return elementoPai.findElements(By.tagName(elementoFilho));
	}

	
	/**
	 * Pesquisa e retorna um elemento especifico pelo seu identificador.
	 * @param IdElemento - o identificador elemento especifico.
	 * @return  retorna um elemento especifico pelo seu identificador.
	 */
	private WebElement pegarA(String IdElemento) {
		return browser.findElement(By.id(IdElemento));
	}
	
}
