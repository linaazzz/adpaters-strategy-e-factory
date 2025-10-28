package adapters;

import apis.InstagramAPI;
import interfaces.GerenciadorMidiaSocial;
import model.*;

public class InstagramAdapter implements GerenciadorMidiaSocial {
    private InstagramAPI api = new InstagramAPI();

    @Override
    public Publicacao postar(Conteudo conteudo) {
        String mensagem = api.postar(conteudo.getLegenda(), conteudo.getMidia());
        return new Publicacao("Instagram", mensagem);
    }

    @Override
    public Estatisticas obterEstatisticas(String idPublicacao) {
        return new Estatisticas(50, 12);
    }
}
