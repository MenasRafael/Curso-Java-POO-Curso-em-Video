package aula04;

public class Aula04 {

    public static void main(String[] args) {
         Caneta c1 = new Caneta("Bic", 0.5f, "Azul");
          c1.status();
         Caneta c2 = new Caneta("KKK", 1.0f, "Preta");
          c2.status();
/*
    Nenhum valor de atributo pode ser obtido/modificado aqui sem ser pelo método get e set! 
    this.modelo = "Bic"; Não funcionará! pois as variaveis são private.
*/
    }
}
