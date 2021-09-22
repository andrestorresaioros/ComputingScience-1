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
    public Nodo insertar(Nodo n, String letra) {
        if (n == null)
            return new Nodo(letra);
        else if (letra.hashCode() < n.letra.hashCode())
            n.izquierda = insertar(n.izquierda, letra);
        else if (letra.hashCode() > n.letra.hashCode())
            n.derecha = insertar(n.derecha, letra);
        return n;
    }
    
    public int nodosCompletos(Nodo n) {
        if (n == null)
            return 0;
        else {
            if (n.izquierda != null && n.derecha != null)
                return nodosCompletos(n.izquierda) + nodosCompletos(n.derecha) + 1;
            return nodosCompletos(n.izquierda) + nodosCompletos(n.derecha);
        }
    }
    
}
