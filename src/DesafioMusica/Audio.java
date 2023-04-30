package DesafioMusica;
public class Audio {
    private String titulo;
    private double tempoAudio = 0;
    private int totalReproducoes=0;
    private int totalCurtidas =0 ;

    private int classificacao = 0;

    //-----------------getters e setter--------------//
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getTempoAudio() {
        return tempoAudio;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void reproduzir (){
        this.totalReproducoes++;
    }

    public void curtir (){
        this.totalCurtidas++;

    }

}
