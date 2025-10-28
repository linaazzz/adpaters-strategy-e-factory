package adapters;

import apis.LinkedInAPI;
import interfaces.GerenciadorMidiaSocial;
import model.*;

public class LinkedInAdapter implements GerenciadorMidiaSocial {
    private LinkedInAPI api = new LinkedInAPI();

    @Override
    public Publicacao postar(Conteudo conteudo) {
        String mensagem = api.compartilhar(conteudo.getLegenda());
        return new Publicacao("LinkedIn", mensagem);
    }

    @Override
    public Estatisticas obterEstatisticas(String idPublicacao) {
        return new Estatisticas(20, 3);
    }
}
