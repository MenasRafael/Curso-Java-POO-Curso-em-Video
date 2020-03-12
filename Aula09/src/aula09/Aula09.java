package aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("O mundo assombrado pelos demônios", "Carl Sagan", 412, p[0]);
        l[1] = new Livro("Sapiens", "Noah Yuval Harari", 300, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);

        //System.out.println(l[0].getTitulo());
        l[1].abrir();
        l[1].folhear(11);
        // l[0].avancarPag();
        l[1].voltarPag();
        // l[0].voltarPag();
        l[1].fechar();
       // l[1].marcador(20);
        System.out.println(l[1].detalhes());

    }

}
