package br.com.rbs.listaFerramentas.busca;

import br.com.rbs.listaFerramentas.busca.fixtures.StoryTest;
import br.com.rbs.listaFerramentas.fixtures.TOOLS;
import org.junit.Test;

/**
 * Fatos "sobre a segmentação de ferramentas"
 * 		Fato "Devo visualizar todos os agrupamentos de ferramentas"
 * 		Fato "Posso selecionar e pesquisar ferramentas pelo seu agrupamento"
 * 		Fato "Posso preencher e pesquisar pelo nome de uma ferramenta "
 * @author helio_medeiros
 */
public class SegmentacaoDeFerramentasStory extends StoryTest {
	
	
	/**
	 * 		Fato "Posso preencher e pesquisar pelo nome de uma ferramenta "
	 */
	@Test public void quandoProcuroPeloNomeDaFerramentaEExisteRetornaNaLista() {
		dadoQue.estouNaPaginaPrincipal();
		quando.procuroPeloNome(TOOLS.ADPWEB.toolName()).clicarBuscar();
		entao.minhaBuscaRetornaAsFerramentas(TOOLS.ADPWEB);
	}
	
}
