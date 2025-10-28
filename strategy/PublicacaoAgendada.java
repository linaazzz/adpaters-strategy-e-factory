package strategy;

import interfaces.GerenciadorMidiaSocial;
import model.*;

public class PublicacaoAgendada implements EstrategiaPublicacao {
    private long atrasoMs;

    public PublicacaoAgendada(long atrasoMs) {
        this.atrasoMs = atrasoMs;
    }

    @Override
    public void publicar(GerenciadorMidiaSocial midia, Conteudo conteudo) {
        new Thread(() -> {
            try {
                Thread.sleep(atrasoMs);
                Publicacao p = midia.postar(conteudo);
                System.out.println(p);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
