package factory;

import adapters.*;
import interfaces.GerenciadorMidiaSocial;

public class FabricaMidiaSocial {
    public static GerenciadorMidiaSocial criar(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "twitter" -> new TwitterAdapter();
            case "instagram" -> new InstagramAdapter();
            case "linkedin" -> new LinkedInAdapter();
            case "tiktok" -> new TikTokAdapter();
            default -> throw new IllegalArgumentException("Plataforma desconhecida: " + tipo);
        };
    }
}
