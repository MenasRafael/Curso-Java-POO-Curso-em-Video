package aula05;

public class ContaBanco {

    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos especiais Construtor
    public ContaBanco(int numContaG, String tipoG, String donoG) {
        
        //Valores sendo recebidos.
        this.numConta = numContaG;
        this.tipo = tipoG;
        this.dono = donoG;
        
        //Valores pré-definidos 
        this.status = false;
    }

    //Getters and Setters
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numContaS) {
        this.numConta = numContaS;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipoS) {
        this.tipo = tipoS;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String donoS) {
        this.dono = donoS;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldoS) {
        this.saldo = saldoS;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean statusS) {
        this.status = statusS;
    }

    //Métodos personalizados
    public void abrirConta() {
        if (this.tipo == "cc" && this.status == false) {
            this.saldo += 50;
            this.status = true;
            System.out.println("Abertura de conta realizada com sucesso!");
        } else if (this.tipo == "cp" && this.status == false) {
            this.saldo += 150;
            this.status = true;
            System.out.println("Abertura de conta realizada com sucesso!");
        } else {
            System.out.println("Cliente ja possui uma conta do tipo: " + this.tipo);
        }
    }

    public void fecharConta() {
        if (this.status == true && this.saldo == 0) {
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        } else if (this.saldo > 0) {
            System.out.println("ERRO! Você possui saldo na conta. Retire seus fundos. Total: " + this.saldo);
        } else if (this.saldo < 0) {
            System.out.println("Você tem débito de " + this.saldo + " para pagar");
        } else {
            System.out.println("Não há conta para fechar!");
        }
    }

    public void depositar(float vDeposito) {
        if (this.status == true && vDeposito >= 1) {
            this.saldo += vDeposito;
            System.out.println("Deposito de: " + vDeposito + " realizado. Total: " + this.saldo);
        } else {
            System.out.println("ERRO conta não encontrada e/ou valor incorreto");
        }
    }

    public void sacar(float vSaque) {
        if (this.status == true && vSaque >= 1 && vSaque <= this.saldo) {
            this.saldo -= vSaque;
            System.out.println("Saque de " + vSaque + " realizado! Seu saldo é: " + this.saldo);
        } else {
            System.out.println("ERRO! Valor de saque inválido. Seu saldo é: " + this.saldo);
        }
    }

    public void pagarMensal() {

        int v = 0; //v = Valor da Mensalidade

        if (this.tipo == "cc") {
            v = 12;
        } else if (this.tipo == "cp") {
            v = 20;
        }

        if (this.status == true && this.saldo >= v) {
            if (this.tipo == "cp") {
                this.saldo -= v;
            } else if (this.tipo == "cc") {
                this.saldo -= v;
            }
        } else {
            System.out.println(this.dono + " Sua conta possui menos dinheiro do que o valor da mensalidade. Efetue um depósito!");
        }
    }

    public void estadoAtual() {
        System.out.println("----------------------------------------");
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
