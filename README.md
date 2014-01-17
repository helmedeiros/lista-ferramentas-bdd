lista-ferramentas-bdd
=================

A simple project using [BDD][4] to present gains in the understanding of a project described in a verbose and executable documentation.

Behavior Driven Development (BDD) is a way to develop software that, among other things, encourages the writing of more similar tests with a specification, as suggested by Dan North. The idea is that your tests describe what a module should do or how certain functionality should work. Something like:
> **GIVEN (dado que)** I'm on the main page,
> **WHEN (quando)** searching by name ADPWEB,
> **THEN (então)** my search returns ADPWEB tools.

Do we really need any special tools to use BDD? We can not do everything using only JUnit? But it was not enough just to use it, BDD is all about verbosity, so following is given an way to organize it as a specification. (The following pattern was proposed by [Cauê Guerra][1], [Cecilia Fernandes][2] and [Lucas Cavalcanti][3]).

```java
    /** Fato "Posso preencher e pesquisar pelo nome de uma ferramenta "	 */
   	@Test public void quandoProcuroPeloNomeDaFerramentaEExisteRetornaNaLista() {
   		dadoQue.estouNaPaginaPrincipal();
   		quando.procuroPeloNome(TOOLS.ADPWEB.toolName());
   		entao.minhaBuscaRetornaAsFerramentas(TOOLS.ADPWEB);
   	}
```

This is a simple code, that anyone who knows Portuguese would understand, from Developers to [Product Owners][5], and that tells us exactly what to expect when someone use the searching field to look for an tool. But what exactly are these "dado que", "quando" and "entao"? Following the proposed model, they are simple objects that do not need to implement any interface or extend any class, they will only perform what was asked of them by the test.

Following the convention to name these objects, according to their responsibilities:
* **GIVEN** GivenSteps => Preconditions => object that will prepare the context of the test. Ex: Going into a page, insert certain objects in the database, log in to a given user, etc..
* **WHEN** WhenSteps => the action to be tested => object that will perform the actions of the test. It is the most important part of the test. Ex: Fill out a form, click the Submit button, select an item in a comboBox, etc..
* **THEN** ThenSteps => Post-conditions => object that checks whether the result of the actions is expected. Ex: The user is logged in? Appeared to "Inserted successfully" message? Gave validation error?


### Other references
You can check and download an entirely project made by Caelum, that is using these ideas, in: [calopsita][http://github.com/caueguerra/calopsita].

[1]: https://github.com/caueguerra
[2]: https://github.com/ceci
[3]: https://github.com/lucascs
[4]: http://en.wikipedia.org/wiki/Behavior_Driven_Development
[5]: http://en.wikipedia.org/wiki/Scrum_(software_development)#Product_Owner