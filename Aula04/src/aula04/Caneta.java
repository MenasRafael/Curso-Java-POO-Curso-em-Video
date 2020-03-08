package aula04;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, float p, String c){
        this.setModelo(m);
        this.setPonta(p); //Método seguro de atribuir valor 
        this.cor = c; //Método "inseguro" de atribuir valor
        this.tampar();
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Esta tampada: " + this.tampada);
    }
    public void tampar(){
       this.tampada = true;
    }
    public void destampar(){
       this.tampada = false;
    }
 
}

