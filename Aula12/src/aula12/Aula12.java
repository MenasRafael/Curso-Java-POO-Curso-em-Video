package aula12;

public class Aula12 {

    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        m.locomover();

        Canguru c1 = new Canguru();
        c1.locomover();

        Cachorro k1 = new Cachorro();
        k1.abanarRabo();
        k1.esconderOsso();

        Cobra co = new Cobra();
        co.emitirSom();
        
        Tartaruga t1 = new Tartaruga();
        t1.locomover();
        
        Arara a1 = new Arara();
        a1.alimentar();
    }

}
