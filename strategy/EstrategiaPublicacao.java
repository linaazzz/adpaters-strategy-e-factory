package strategy;

import interfaces.GerenciadorMidiaSocial;
import model.Conteudo;

public interface EstrategiaPublicacao {
    void publicar(GerenciadorMidiaSocial midia, Conteudo conteudo);
}
