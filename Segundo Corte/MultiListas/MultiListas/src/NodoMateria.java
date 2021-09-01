public class NodoMateria {
  
      
    private String nombre;
    private NodoMateria siguiente;
    private NodoMateria anterior;
    private NodoEstudiante abajo;

     
    //GETTERS Y SETTERS
    public String getNombre() {
        return this.nombre;
    }

    public void setMateria(String nombre) {
        this.nombre = nombre;
    }

    public NodoMateria getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(NodoMateria siguiente) {
        this.siguiente = siguiente;
    }

    public NodoMateria getAnterior() {
        return this.anterior;
    }

    public void setAnterior(NodoMateria anterior) {
        this.anterior = anterior;
    }

    public NodoEstudiante getAbajo() {
        return this.abajo;
    }

    public void setAbajo(NodoEstudiante abajo) {
        this.abajo = abajo;
    }
    
    
    //CONSTRUCTOR
    public NodoMateria(String nombre){
        this.nombre = nombre;
        this.siguiente = null;
        this.anterior = null;
        this.abajo = null;
    }
    
}
