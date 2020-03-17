package aula13;

public class Mamifero extends Animal {

    protected String corDopelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public String getCorPelo() {
        return this.corDopelo;
    }

    public void setCorPelo(String corPelo) {
        this.corDopelo = corPelo;
    }

}
