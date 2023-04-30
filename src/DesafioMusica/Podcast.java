package DesafioMusica;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    //-----------------getters e setter--------------//
    public String getHost() {
        return host;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public int getClassificacao() {
       if (this.getTotalCurtidas()>500){
           return 10;
       }else{
           return 7;
       }
    }
}
