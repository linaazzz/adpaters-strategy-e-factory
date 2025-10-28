package model;

public class Estatisticas {
    private int curtidas;
    private int comentarios;

    public Estatisticas(int curtidas, int comentarios) {
        this.curtidas = curtidas;
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Curtidas: " + curtidas + ", Comentários: " + comentarios;
    }
}
