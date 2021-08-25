package listas;

public class Lista {
    
    //VARIABLE cabeza de la lista
    private Nodo cabeza;
    private String lista = "";
    
    
    public Nodo getCabeza(){
        return this.cabeza;
    }
    
    public String getLista(){
        return this.lista;
    }
    
    public void setCabeza(Nodo cabeza){
        this.cabeza = cabeza;
    }
    
    public void setLista(String lista){
        this.lista = lista;
    }
    
    
    //CONSTRUCTOR
    public Lista(){
        this.cabeza = null;
    }
    
    
    //METODOS IMPORTANTES
    public void mostrarLista(Nodo nodoLista){
        if(nodoLista != null){
            lista += "Nombre: "+nodoLista.getNombre()+"\n";
            lista += "Código: "+nodoLista.getCodigo()+"\n";
            mostrarLista(nodoLista.getSiguiente());
        }
    }
    
    //cuando llame al metodo nodoLista = cabeza;
    public void insertarNodo(Nodo nodo, Nodo nodoLista){
        if(nodo != nodoLista){
            if(nodo.getCodigo() <= nodoLista.getCodigo()){
                nodo.setSiguiente(nodoLista);
                nodoLista.setAnterior(nodo);
                if(cabeza == nodoLista)
                    cabeza = nodo;
            }else{
                if(nodo.getCodigo() <= nodoLista.getSiguiente().getCodigo()){
                    nodo.setSiguiente(nodoLista.getSiguiente());
                    nodo.setAnterior(nodoLista);
                    nodoLista.setSiguiente(nodo);
                    nodoLista.getSiguiente().setAnterior(nodo);                
                }else{
                    insertarNodo(nodo,nodoLista.getSiguiente());
                }
            }
        }
    }
            
}
