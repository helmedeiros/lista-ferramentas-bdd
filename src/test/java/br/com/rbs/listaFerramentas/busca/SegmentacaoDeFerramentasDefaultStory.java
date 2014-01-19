package br.com.rbs.listaFerramentas.busca;

import br.com.rbs.listaFerramentas.common.DefaultStory;
import br.com.rbs.listaFerramentas.fixtures.TOOLS;
import org.junit.Test;

/**
 * Fatos "sobre a segmentação de ferramentas"
 * 		Fato "Devo visualizar todos os agrupamentos de ferramentas"
 * 		Fato "Posso selecionar and pesquisar ferramentas pelo seu agrupamento"
 * 		Fato "Posso preencher and pesquisar pelo nome de uma ferramenta "
 * @author helio_medeiros
 */
public class SegmentacaoDeFerramentasDefaultStory extends DefaultStory {
	
	
	/**
	 * 		Fato "Posso preencher and pesquisar pelo nome de uma ferramenta "
	 */
	@Test public void quandoProcuroPeloNomeDaFerramentaEExisteRetornaNaLista() {
		given.imInTheMainPage();
		when.searchByAToolName(TOOLS.ADPWEB.toolName());
		entao.minhaBuscaRetornaAsFerramentas(TOOLS.ADPWEB);
	}
	
}
