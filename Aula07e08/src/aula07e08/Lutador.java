package aula07e08;

public class Lutador {
    
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Métodos públicos
    public void apresentar(){
        System.out.println("------Lutador------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Categoria: " + this.getCategoria());
    }
    public void status(){
        System.out.println("------Status------");
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("------------------");
        System.out.println();
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //Métodos especiais
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
      
    //Métodos getter e setter
    private void setNome(String nome){
        this.nome = nome;
    }
    private String getNome(){
        return this.nome;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getAltura(){
        return this.altura;
    }
    public void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
    }
    public float getPeso(){
        return this.peso;
    }
    
    private void setCategoria(){
        if(this.getPeso() < 52.2){
            this.categoria = "Invalido";
        }else if (this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }
    
    public String getCategoria(){
        return this.categoria;
    }
    public void setVitorias(int vitoria){
        this.vitorias = vitoria;
    }
    public int getVitorias(){
        return this.vitorias;
    }
    public void setDerrotas(int derrota){
        this.derrotas = derrota;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public void setEmpates(int empate){
        this.empates = empate;
    }
    public int getEmpates(){
        return this.empates;
    }
}
