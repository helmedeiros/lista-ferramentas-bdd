package br.com.rbs.listaFerramentas.fixtures;

public enum GROUPS {
    RADIOS("Rádios"), ADM("ADM");

    private String groupName;

    private GROUPS(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
}
