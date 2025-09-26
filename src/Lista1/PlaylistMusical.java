package Lista1;
import java.util.ArrayList;

public class PlaylistMusical {

    public String nome;
    public ArrayList<String> musicas;
    public int musicaAtual;

    public PlaylistMusical(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
        this.musicaAtual = 0;
    }

    public void adicionarMusica(String musica) {
        musicas.add(musica);
    }

    public void tocarProxima() {
        musicaAtual++;
        if (musicaAtual >= musicas.size()) {
            musicaAtual = 0;
        }
    }

    public void mostrarMusicaAtual() {
        if (musicas.isEmpty()) {
            System.out.println("Nenhuma música na playlist.");
        } else {
            System.out.println(" Tocando agora: " +musicas.get(musicaAtual));
        }
    }


    public static void main (String [] args) {

        PlaylistMusical minhaPlaylist = new PlaylistMusical("Favoritas");

        minhaPlaylist.adicionarMusica("The Last Day");
        minhaPlaylist.adicionarMusica("Without Me");
        minhaPlaylist.adicionarMusica("Levitating");
        minhaPlaylist.adicionarMusica("Sentimental");
        minhaPlaylist.adicionarMusica("Itamambuca");

        for (int i = 0; i < 5; i++) {
            minhaPlaylist.mostrarMusicaAtual();
            minhaPlaylist.tocarProxima();
        }
    }
}
