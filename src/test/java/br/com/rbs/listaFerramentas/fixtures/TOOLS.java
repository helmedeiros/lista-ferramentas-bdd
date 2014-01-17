package br.com.rbs.listaFerramentas.fixtures;

public enum TOOLS {
	ADPWEB("ADP Web",GROUPS.ADM);
	
	private String toolName;
	private GROUPS group;

	private TOOLS(String toolName, GROUPS group) {
		this.toolName = toolName;
		this.group = group;
	}
			
	public String toolName() {
		return this.toolName;
	}


	public GROUPS group() {
		return this.group;
	}
}
