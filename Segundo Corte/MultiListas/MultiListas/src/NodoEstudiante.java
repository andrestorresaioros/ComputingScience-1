public class NodoEstudiante {
    
    private String nombre;
    private NodoEstudiante abajo;
    private NodoEstudiante arriba;
    

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setAbajo(NodoEstudiante abajo){
        this.abajo = abajo;
    }
    
    public void setArriba(NodoEstudiante arriba){
        this.arriba = arriba;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    
    public NodoEstudiante getArriba(){
        return this.arriba;
    }
    
    public NodoEstudiante getAbajo(){
        return this.abajo;
    }
    
    
    //CONSTRUCTOR
    public NodoEstudiante(String nombre){
        this.nombre = nombre;
        this.abajo = null;
        this.arriba = null;
    }
    
}
