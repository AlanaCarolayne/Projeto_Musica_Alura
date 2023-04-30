package DesafioMusica;

public class Musica  extends Audio{
    private String artista;
    private String album;
    private int faixa;
    private String genero;

//-----------------getters e setter--------------//
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getFaixa() {
        return faixa;
    }

    public void setFaixa(int faixa) {
        this.faixa = faixa;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalReproducoes()> 500){
            return 10;
        }else{
            return 7;
        }
    }
}
