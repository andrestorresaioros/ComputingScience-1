package listas;

public class Nodo {
    
    private String nombre;
    private long codigo;
    private Nodo siguiente;
    private Nodo anterior;
    

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCodigo(long codigo){
        this.codigo = codigo;
    }
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public void setAnterior(Nodo anterior){
        this.anterior = anterior;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public long getCodigo(){
        return this.codigo;
    }
    
    public Nodo getSiguiente(){
        return this.siguiente;
    }
    
    public Nodo getAnterior(){
        return this.anterior;
    }
    
    
    //CONSTRUCTOR
    public Nodo(String nombre, long codigo){
        this.nombre = nombre;
        this.codigo = codigo;
        this.siguiente = null;
        this.anterior = null;
    }
    
}
