package matricesdispersas;

public class NodoFila {
    
    private NodoFila arriba;
    private NodoFila abajo;
    private int fila;
    private int valor;
    
    
    //GETTERS Y SETTERS
    public NodoFila getArriba() {
        return arriba;
    }

    public void setArriba(NodoFila arriba) {
        this.arriba = arriba;
    }

    public NodoFila getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoFila abajo) {
        this.abajo = abajo;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    //CONSTRUCTOR
    public NodoFila(int fila, int valor){
        this.fila = fila;
        this.valor = valor;
    }
    
}
