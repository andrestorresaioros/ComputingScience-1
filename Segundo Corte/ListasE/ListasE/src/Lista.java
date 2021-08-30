public class Lista {

    //VARIABLE cabeza de la lista
    private Nodo cabeza;
    private Nodo cola;
    private String lista = "";
    
    
    public Nodo getCabeza(){
        return this.cabeza;
    }
    
    public String getLista(){
        return this.lista;
    }
    
    public Nodo getCola(){
        return this.cola;
    }
    
    public void setCabeza(Nodo cabeza){
        this.cabeza = cabeza;
    }
    
    public void setLista(String lista){
        this.lista = lista;
    }
    
    public void setCola(Nodo cola){
        this.cola = cola;
    }
    
    
    //CONSTRUCTOR
    public Lista(){
        this.cabeza = null;
        this.cola = null;
    }
    
    
    //METODOS IMPORTANTES
    
    //nmostrarLista(lista.getCabeza());
    public void mostrarLista(Nodo nodoLista){
        if(nodoLista != null){
            lista += nodoLista.getNumero();
            mostrarLista(nodoLista.getSiguiente());
        }
    }
    
    
    //llinarLista(String num, lista.getCabeza());
    public void llenarLista(String[] numero, Nodo nodoLista, int iterador){
        if(iterador < numero.length){
            String num = numero[iterador]+numero[++iterador]+numero[++iterador]+numero[++iterador];
            Nodo nuevo = new Nodo(Integer.parseInt(num));
            nodoLista.setSiguiente(nuevo);
            nuevo.setAnterior(nodoLista);
            llenarLista(numero,nodoLista.getSiguiente(),++iterador);
        }
    }
    
    public void encontrarCola(Nodo nodoLista){
        if(nodoLista.getSiguiente() == null){
            this.cola = nodoLista;
        }else{
            encontrarCola(nodoLista.getSiguiente());
        }
    }
    
}
