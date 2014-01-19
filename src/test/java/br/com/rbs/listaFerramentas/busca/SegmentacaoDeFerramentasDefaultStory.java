package br.com.rbs.listaFerramentas.busca;

import br.com.rbs.listaFerramentas.common.DefaultStory;
import br.com.rbs.listaFerramentas.fixtures.TOOLS;
import org.junit.Test;

/**
 * Fatos "sobre a segmentação de ferramentas"
 * 		Fato "Devo visualizar todos os agrupamentos de ferramentas"
 * 		Fato "Posso selecionar e pesquisar ferramentas pelo seu agrupamento"
 * 		Fato "Posso preencher e pesquisar pelo nome de uma ferramenta "
 * @author helio_medeiros
 */
public class SegmentacaoDeFerramentasDefaultStory extends DefaultStory {
	
	
	/**
	 * 		Fato "Posso preencher e pesquisar pelo nome de uma ferramenta "
	 */
	@Test public void quandoProcuroPeloNomeDaFerramentaEExisteRetornaNaLista() {
		given.imInTheMainPage();
		quando.procuroPeloNome(TOOLS.ADPWEB.toolName())
                .e()
                .clicoBuscar();
		entao.minhaBuscaRetornaAsFerramentas(TOOLS.ADPWEB);
	}
	
}
