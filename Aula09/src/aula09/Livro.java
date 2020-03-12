package aula09;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    private int pagMarcada;

    //Método personalizado toString()
    public String detalhes() {
        return "Livro{" + "Titulo = " + titulo + ",\n Autor = "
                + autor + ",\n Total de Páginas = " + this.getTotPaginas()
                + ",\n Página Atual = " + this.getPagAtual() + ",\n Página marcada = " + pagMarcada + ",\n Aberto = "
                + aberto + '}' + "\n\nLeitor{" + "Nome = " + leitor.getNome()
                + ",\n Idade = " + leitor.getIdade()
                + ",\n Sexo = " + leitor.getSexo() + '}';
    }

    //Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0; //Valor pré-definido
        this.aberto = false; //Valor pré-definido
        this.leitor = leitor;
    }

    //Getter e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Métodos abstratos 
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        if (this.aberto == true) {
            this.aberto = false;
            this.pagMarcada = this.pagAtual;
            this.pagAtual = 0;
            System.out.println("O livro foi fechado!");
            System.out.println();
        } else {
            System.out.println("Livro já esta fechado!");
        }
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas || p <= 0 || this.aberto == false) {
            this.pagAtual = 0;
            System.out.println("Impossível folhear.");
            System.out.println();
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        if (this.aberto == true && this.pagAtual >= 0 && this.pagAtual < this.totPaginas) {
            this.pagAtual++;
        } else {
            System.out.println("Impossível avançar.");
            System.out.println();
        }
    }

    @Override
    public void voltarPag() {
        if (this.aberto == true && this.pagAtual > 0) {
            this.pagAtual--;
        } else {
            System.out.println("Impossível voltar página.");
            System.out.println();
        }
    }

    /*
        Como usar: Ao fechar um livro a pagAtual é zerada.
        Então, você pode usar o marcador a qualquer momento depois que um livro for fechado.
        Se não usar esta função, o marcador grava automáticamente onde você parou no livro. 
     */
    @Override
    public void marcador(int pagMarcada) {
        this.pagMarcada = pagMarcada;
    }

}
