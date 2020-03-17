package aula13;

public class Cachorro extends Lobo {

    //Métodos de sobrecarga
    //1 sobrecarga
    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    //2ª sobrecarga
    public void reagir(String frase) {
        if (frase == "toma comida" || frase.equals("Ola")) {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    //3ª sobrecarga
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    @Override
    public void emitirSom() {
        System.out.println("AU ua au au au");
    }
}
