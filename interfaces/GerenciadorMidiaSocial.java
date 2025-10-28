package interfaces;

import model.Conteudo;
import model.Publicacao;
import model.Estatisticas;

public interface GerenciadorMidiaSocial {
    Publicacao postar(Conteudo conteudo);
    Estatisticas obterEstatisticas(String idPublicacao);
}
