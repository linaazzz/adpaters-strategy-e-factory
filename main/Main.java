package main;

import factory.FabricaMidiaSocial;
import interfaces.GerenciadorMidiaSocial;
import model.Conteudo;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        Conteudo post1 = new Conteudo("Foto nova!!", "img1.png");
        Conteudo post2 = new Conteudo("Vídeo novo!!", "video1.mp4");

        GerenciadorMidiaSocial instagram = FabricaMidiaSocial.criar("instagram");
        GerenciadorMidiaSocial twitter = FabricaMidiaSocial.criar("twitter");

        EstrategiaPublicacao imediata = new PublicacaoImediata();
        EstrategiaPublicacao agendada = new PublicacaoAgendada(5000);

        System.out.println("--- Publicação imediata ---");
        imediata.publicar(instagram, post1);

        System.out.println("--- Publicação agendada ---");
        agendada.publicar(twitter, post2);
    }
}
