package strategy;

import interfaces.GerenciadorMidiaSocial;
import model.*;

public class PublicacaoImediata implements EstrategiaPublicacao {
    @Override
    public void publicar(GerenciadorMidiaSocial midia, Conteudo conteudo) {
        Publicacao p = midia.postar(conteudo);
        System.out.println(p);
    }
}
