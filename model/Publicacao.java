package model;

import java.time.LocalDateTime;

public class Publicacao {
    private String plataforma;
    private String mensagem;
    private LocalDateTime data;

    public Publicacao(String plataforma, String mensagem) {
        this.plataforma = plataforma;
        this.mensagem = mensagem;
        this.data = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "[" + plataforma + "] " + mensagem + " (" + data + ")";
    }
}
