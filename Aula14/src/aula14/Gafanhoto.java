package aula14;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, String sexo, int experiencia, String login) {
        super(nome, sexo, experiencia); //Usando os parametros da classe mãe
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
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }

}
