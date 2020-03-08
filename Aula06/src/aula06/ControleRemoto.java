package aula06;

public class ControleRemoto implements Controlador {
    
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private boolean menu;
    
    //Construtor
    public ControleRemoto(){
        //Valores pré-definidos
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        this.menu = false;
    }
    
    //Getters e Setters
    
    /* Com os métodos getters e setters privados, o que fica acessível para o usuário 
     * é apenas os métodos da interface(Os com @Override logo abaixo).
     */
    
    private int getVolume(){
        return volume;
    }
    private void setVolume(int mVolume){
        this.volume = mVolume;
    }
    private boolean getLigado(){
        return ligado;
    }
    private void setLigado(boolean mLigado){
        this.ligado = mLigado;
    }
    private boolean getTocando(){
        return tocando;
    }
    private void setTocando(boolean mTocando){
        this.tocando = mTocando;
    }
    private boolean getMenu(){
        return menu;
    }
    private void setMenu(boolean mMenu){
        this.menu = mMenu;
    }
    
    // Métodos abstratos
    @Override
    public void ligar() {
        if(!(this.getLigado())){
          this.setLigado(true);
          System.out.println("A tv foi ligada.");
        }else{
            System.out.println("A tv já esta ligada");
        }
    }

    @Override
    public void desligar() {
        if(this.getLigado()){
             this.setLigado(false);
        System.out.println("Tv desligada com sucesso.");
        }else{
            System.out.println("Ligue a TV para poder desliga-la.");
        }
    }

    @Override
    public void abrirMenu() {
        if( this.getLigado() && !(this.getMenu()) ){
            this.setMenu(true);
            System.out.println("Esta ligado: " + this.getLigado());
            System.out.println("Esta tocando: " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
             for (int i = 1; i <= this.getVolume(); i+=10){
            System.out.print("|");
             }
        }else{
            System.out.println("Menu ja foi aberto, feche ele e abra novamente para atualizar! .");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu(){
        if(this.getLigado() && this.getMenu()){
            System.out.println("Fechando o menu...");
            this.setMenu(false);
        }else{
         System.out.println("Erro! Ligue a Tv e/ou abra o menu para poder fecha-lo.");   
        }
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() && this.getVolume() >= 0 && this.getVolume() < 100){
             this.setVolume(this.getVolume() + 10);
             System.out.println(this.getVolume());
        }else if( this.getLigado() && this.getVolume() == 100 ){
            System.out.println("Limite do volume atingido");
        }else{
            System.out.println("Ligue a TV para poder aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() && this.getVolume() > 0 && this.getVolume() <= 100){
            this.setVolume(this.getVolume() - 10);
            System.out.println(this.getVolume());
        }else if(!(this.getLigado())){
            System.out.println("Ligue a TV para abaixar o volume");
        }else{
             System.out.println("Limite minimo de volume atingido");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
            System.out.println("TV esta no modo sem som");
        }else if(!(this.getLigado())){
            System.out.println("Ligue a tv para deixar no mudo");
        }else{
            System.out.println("A tv já esta no mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
            System.out.println("Volume da TV reativado para o padrão");
        }else if(this.getLigado()){
            System.out.println("Opção inválida! A som da TV está ativo");
        }else{
            System.out.println("Ligue a TV para usar esta função");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando()) ){
            this.setTocando(true);
        }else if(this.getLigado() && this.getVolume() < 50 ){
            System.out.println("Já esta tocando! Tente aumentar o volume");
        }else if(this.getLigado() && this.getVolume() > 50 ){
            System.out.println("Já esta tocando! Verifique as saídas de áudio ou caixas de som");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else if(!(this.getLigado())){
            System.out.println("Ligue a Tv para usar esta função");
        }else{
            System.out.println("Já esta pausado. Será que esta ouvindo vozes?!");
        }
    }
}
