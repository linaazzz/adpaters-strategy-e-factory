package adapters;

import apis.TikTokAPI;
import interfaces.GerenciadorMidiaSocial;
import model.*;

public class TikTokAdapter implements GerenciadorMidiaSocial {
    private TikTokAPI api = new TikTokAPI();

    @Override
    public Publicacao postar(Conteudo conteudo) {
        String mensagem = api.enviarVideo(conteudo.getLegenda(), conteudo.getMidia());
        return new Publicacao("TikTok", mensagem);
    }

    @Override
    public Estatisticas obterEstatisticas(String idPublicacao) {
        return new Estatisticas(100, 25);
    }
}
