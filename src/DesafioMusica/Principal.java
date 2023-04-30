package DesafioMusica;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Like Crazy");
        musica.setArtista("Jimin");
        musica.setAlbum("Face");

        for (int i = 0; i < 1000; i++) {
            musica.reproduzir();
        }
        for (int i = 0; i < 500; i++) {
            musica.curtir();
        }

        Podcast pod = new Podcast();
        pod.setTitulo("PodMeu");
        pod.setHost("Ana Maria");
        pod.setDescricao("Podcast de culinaria");

        for (int i = 0; i < 1000; i++) {
            pod.reproduzir();
        }
        for (int i = 0; i < 500; i++) {
            pod.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incluir(musica);
        preferidas.incluir(pod);



    }
}
