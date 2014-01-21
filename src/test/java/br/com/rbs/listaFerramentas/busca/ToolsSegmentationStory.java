package br.com.rbs.listaFerramentas.busca;

import br.com.rbs.listaFerramentas.common.DefaultStory;
import br.com.rbs.listaFerramentas.fixtures.TOOLS;
import org.junit.Test;

/**
 * Facts "about tools segmentation"
 * 		Fact "Devo visualizar todos os agrupamentos de ferramentas"
 * 		Fact "I can select and search tools by grouping"
 * 		Fact "I can fill out and search for the name of a tool"
 * @author helio_medeiros
 */
public class ToolsSegmentationStory extends DefaultStory {
	
	
	/** Fact "I can fill out and search for the name of a tool"	*/
	@Test public void quandoProcuroPeloNomeDaFerramentaEExisteRetornaNaLista() {
		given.imInTheMainPage();
		when.searchByAToolName(TOOLS.ADPWEB.toolName());
		then.mySearchWillReturnTheTools(TOOLS.ADPWEB);
	}
	
}
