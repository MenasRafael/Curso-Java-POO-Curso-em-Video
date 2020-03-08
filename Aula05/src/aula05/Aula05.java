package aula05;

public class Aula05 {

    public static void main(String[] args) {
        ContaBanco j1 = new ContaBanco(1433, "cc", "Jubileu"); //cc = Conta Corrente
        ContaBanco c2 = new ContaBanco(2256, "cp", "Creuza"); //cp = Conta Poupança

        j1.abrirConta();

        c2.abrirConta();
        j1.depositar(100);
        c2.depositar(500);
        c2.sacar(100);

        j1.sacar(150);
        j1.fecharConta();

        j1.estadoAtual();
        c2.estadoAtual();
    }
}
