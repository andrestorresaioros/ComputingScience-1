public class Nodo {
    
    private Nodo izquierda;
    private Nodo derecha;
    private String[] in;
    private String[] pos;
    private Nodo raiz;
    private String letra;
    private String elemento;
    
    
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
    //yuneider, modifique tu constructor, lo deje como elemento y no como letra
    public Nodo(String elemento){
        this.izquierda = null;
        this.derecha = null;
        this.letra = letra;
        this.raiz = null;
        this.in = null;
        this.pos = null;
        this.elemento = elemento;
    }
    public Nodo insertar(Nodo n, String elemento) {
        if (n == null)
            return new Nodo(elemento);
        else if (elemento.hashCode() < n.elemento.hashCode())
            n.izquierda = insertar(n.izquierda, elemento);
        else if (elemento.hashCode() > n.elemento.hashCode())
            n.derecha = insertar(n.derecha, elemento);
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

    public String getElemento() {
        return elemento;
    }
    
}
