package aula14e15;

public class Aula14e15 {

    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");

        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(g[0], v[2]); //Assistir Aula 10 de HTML
        vis[0].avaliar(); //Avaliação padrão
        System.out.println(vis[0].toString());

        System.out.println("");

        vis[1] = new Visualizacao(g[0], v[1]); //Assistir Aula 12 de PHP
        vis[1] = new Visualizacao(g[0], v[1]); //Assistir Aula 12 de PHP
        //vis[1].avaliar(9); //Avaliação com nota de 0 a 10
        vis[1].avaliar(63.0f); //Avaliaão automática de acordo com a porcentagem do vídeo assistida
        System.out.println(vis[1].toString());

        /*
        System.out.println("VÍDEOS");
        System.out.println(v[0].toString());
        System.out.println("GAFANHOTOS");
        System.out.println(g[0].toString());
         */
    }
}
