package model;

public class Conteudo {
    private String legenda;
    private String midia;

    public Conteudo(String legenda, String midia) {
        this.legenda = legenda;
        this.midia = midia;
    }

    public String getLegenda() {
        return legenda;
    }

    public String getMidia() {
        return midia;
    }
}
