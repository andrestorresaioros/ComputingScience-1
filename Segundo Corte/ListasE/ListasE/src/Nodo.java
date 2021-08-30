public class Nodo {

    private int numero;
    private Nodo siguiente;
    private Nodo anterior;
    
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public void setAnterior(Nodo anterior){
        this.anterior = anterior;
    }
    
    public void setNumero(int num){
        this.numero = num;
    }
    
    public Nodo getSiguiente(){
        return this.siguiente;
    }
    
    public Nodo getAnterior(){
        return this.anterior;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    
    //CONSTRUCTOR
    public Nodo(int num){
        this.numero = num;
        this.siguiente = null;
        this.anterior = null;
    }
    
}