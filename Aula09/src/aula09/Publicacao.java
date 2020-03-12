package aula09;

public interface Publicacao {

    public abstract void abrir();

    public abstract void fechar();

    public abstract void folhear(int p); //Folheia páginas em qualquer quantidade <= que o total de páginas

    public abstract void avancarPag();

    public abstract void voltarPag();
    
    public abstract void marcador(int pagMarcada);
    
}
