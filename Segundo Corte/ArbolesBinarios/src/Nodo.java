public class Nodo {
    
    private Nodo izquierda;
    private Nodo derecha;
    private String[] in;
    private String[] pos;
    private Nodo raiz;
    private String letra;
    
    
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
 
    public String getLetra(){
        return this.letra;
    }
    
    public void setNum(String letra){
        this.letra = letra;
    }
    
    public Nodo getRaiz(){
        return raiz;
    }
    
    public void setRaiz(Nodo raiz){
        this.raiz = raiz;
    }
    
    public String[] getIn(){
        return this.in;
    }
    
    public void setIn(String[] in){
        this.in = in;
    }
    
    public String[] getPos(){
        return this.pos;
    }
    
    public void setPos(String[] pos){
        this.pos = pos;
    }
    
    
    //CONSTRUCTOR
    
    public Nodo(String letra){
        this.izquierda = null;
        this.derecha = null;
        this.letra = letra;
        this.raiz = null;
        this.in = null;
        this.pos = null;
    }
    
    public static void main(String[] args) {
        Arbol a = new Arbol();
        a.reconstruirPosOrden("1 4 7 8 9 11 12 16 19 21 25","2 4 8 11 9 7 19 16 25 21 12");
    }
    
}
