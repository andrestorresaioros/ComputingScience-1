public class Nodo {
    
    Nodo izquierda;
    Nodo derecha;
    int num;
    
    
    //GETTERS Y SETTERS

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
 
    public int getNum(){
        return this.num;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    
    //CONSTRUCTOR
    
    public Nodo(int num){
        this.izquierda = null;
        this.derecha = null;
        this.num = num;
    }
}
