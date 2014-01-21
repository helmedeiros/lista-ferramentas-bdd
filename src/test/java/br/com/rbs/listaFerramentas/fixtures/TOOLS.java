package br.com.rbs.listaFerramentas.fixtures;

public enum TOOLS {
	ADPWEB("ADP Web",GROUPS.ADM),
    RADIOS_E_TV("Rádios e TV", GROUPS.RADIOS),
    RADIOS_SITE("Rádios Site", GROUPS.RADIOS),
    RADIOS_PLAYLIST("Rádios - PlayList (Site)", GROUPS.RADIOS),
    RADIOS_ADMIN("Rádios (RadiosAdmin)", GROUPS.RADIOS ),
    POD_CASTING("PodCasting", GROUPS.RADIOS),
    PLANETA_ATLANTIDA("Planeta Atlântida", GROUPS.RADIOS);
	
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
