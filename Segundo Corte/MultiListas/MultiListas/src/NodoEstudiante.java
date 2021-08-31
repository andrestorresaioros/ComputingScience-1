public class NodoEstudiante {
    
    private String nombre;
    private NodoEstudiante siguiente_abajo;
    private NodoEstudiante anterior_arriba;
    

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    public void setSiguiente(NodoEstudiante siguiente){
        this.siguiente_abajo = siguiente_abajo;
    }
    
    public void setAnterior(NodoEstudiante anterior){
        this.anterior_arriba = anterior;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    
    public NodoEstudiante getSiguiente(){
        return this.siguiente_abajo;
    }
    
    public NodoEstudiante getAnterior(){
        return this.anterior_arriba;
    }
    
    
    //CONSTRUCTOR
    public NodoEstudiante(String nombre){
        this.nombre = nombre;
        this.siguiente_abajo = null;
        this.anterior_arriba = null;
    }
    
}
