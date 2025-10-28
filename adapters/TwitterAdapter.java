package adapters;

import apis.TwitterAPI;
import interfaces.GerenciadorMidiaSocial;
import model.*;

public class TwitterAdapter implements GerenciadorMidiaSocial {
    private TwitterAPI api = new TwitterAPI();

    @Override
    public Publicacao postar(Conteudo conteudo) {
        String mensagem = api.tweetar(conteudo.getLegenda());
        return new Publicacao("Twitter", mensagem);
    }

    @Override
    public Estatisticas obterEstatisticas(String idPublicacao) {
        return new Estatisticas(30, 7);
    }
}
