package aula07e08;

public class Aula07e08 {

    public static void main(String[] args) {
        
/*
    Podemos cadastrar normalmente os lutadores com a chamada abaixo:
    Lutador l1 = new Lutador("Prettyboy", "Frances", 31, 1.75f, 68.9f, 11, 3, 1);
        
    Mas, ao invés de intanciar l1, l2, l3, l4... Vamos trabalhar com vetores.
*/

        Lutador l[] = new Lutador[6]; //l é um vetor. Será criado seis "objetos lutadores"; 
        
        l[0] = new Lutador("Prettyboy", "Frances", 31, 1.75f, 68.9f, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
/*       
        l[0].apresentar();
        l[0].status();
        
        l[1].ganharLuta();
        l[1].apresentar();
        l[1].status();
        
        l[2].apresentar();
        l[2].status();
        
        l[3].perderLuta();
*/

//Esse loop mostra todos os dados dos 6 atletas do array lutador.
    for(int i = 0; i < 6; i++){
        
        l[i].apresentar();
        l[i].status();
        
        }
    }
}
