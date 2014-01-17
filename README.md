lista-ferramentas-bdd
=================

A simple project using BDD to present gains in the understanding of a project described in a verbose and executable documentation.

Behavior Driven Development (BDD) is a way to develop software that, among other things, encourages the writing of more similar tests with a specification, as suggested by Dan North. The idea is that your tests describe what a module should do or how certain functionality should work. Something like:
> **GIVEN** I'm on the main page, **WHEN** searching by name ADPWEB, **THEN** my search returns ADPWEB tools.

Do we really need any special tools to use BDD? We can not do everything using only JUnit? The good old JUnit! But it was not enough just to use it, BDD is all about verbosity, so following is given an way to organize it as a specification.

```java
   /**
   	 * 		Fato "Posso preencher e pesquisar pelo nome de uma ferramenta "
   	 */
   	@Test public void quandoProcuroPeloNomeDaFerramentaEExisteRetornaNaLista() {
   		dadoQue.estouNaPaginaPrincipal();
   		quando.procuroPeloNome(TOOLS.ADPWEB.toolName());
   		entao.minhaBuscaRetornaAsFerramentas(TOOLS.ADPWEB);
   	}
```

