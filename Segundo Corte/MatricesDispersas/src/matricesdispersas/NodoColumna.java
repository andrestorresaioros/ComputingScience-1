package matricesdispersas;

public class NodoColumna {
    
    private int columna;
    private NodoColumna siguiente;
    private NodoColumna anterior;
    private NodoFila abajo;
    
    
    //GETTERS Y SETTERS
    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public NodoColumna getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoColumna siguiente) {
        this.siguiente = siguiente;
    }

    public NodoColumna getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoColumna anterior) {
        this.anterior = anterior;
    }

    public NodoFila getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoFila abajo) {
        this.abajo = abajo;
    }
    
    //CONSTRUCTOR
    public NodoColumna(int columna){
        this.columna = columna;
        this.siguiente = null;
        this.anterior = null;
        this.abajo = null;
    }
    
    
}
