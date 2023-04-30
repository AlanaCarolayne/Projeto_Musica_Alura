package DesafioMusica;

public class MinhasPreferidas {
    public void incluir(Audio audio){
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " é um sucesso!");
        }else{
            System.out.println(audio.getTitulo() + " adicione em sua playlist!");
        }


    }




}
