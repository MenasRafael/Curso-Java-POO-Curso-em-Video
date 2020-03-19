package aula14e15;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo); //Usando os parâmetros da classe mãe
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm() {
        this.totAssistido++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        //super.toString esta buscando os textos do método toString() da classe mãe
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }

}
