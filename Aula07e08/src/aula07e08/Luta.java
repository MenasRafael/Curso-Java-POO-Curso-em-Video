package aula07e08;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Luta {

    //Atributos
    private Lutador desafiado; //Esse atributo é do tipo abstrado!
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            System.out.println("Luta marcada.");
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Luta inválida");
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println();
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();

            System.out.println();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            LocalDate data = LocalDate.now(); //Pega a data local.
            LocalTime horas = LocalTime.now(); //Pega a hora local.

            Random gerador = new Random();
            int vencedor = gerador.nextInt(3); //Gera números aleatórios entre 0 e 2.

            switch (vencedor) {
                case 0:
                    System.out.println();
                    System.out.println("Resultado da Luta: Empate. Resultado obtido hoje: " + data + " às: " + horas);
                    System.out.println();
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println();
                    System.out.println("Vitória do: " + this.desafiado.getNome() + ". Resultado obtido hoje: " + data + " às: " + horas);
                    System.out.println();
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Vítória do: " + this.desafiante.getNome() + ". Resultado obtido hoje: " + data + " às: " + horas);
                    System.out.println();
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    //Getter e Setter
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
