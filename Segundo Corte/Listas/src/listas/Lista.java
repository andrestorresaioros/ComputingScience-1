package listas;

import javax.swing.JOptionPane;

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
            lista += "Código: "+nodoLista.getCodigo()+"\n\n";
            mostrarLista(nodoLista.getSiguiente());
        }
    }
    
    //cuando llame al metodo nodoLista = cabeza;
    public void insertarNodo(Nodo nodo, Nodo nodoLista){
        if(nodo.getCodigo() == nodoLista.getCodigo()){
            JOptionPane.showMessageDialog(null, "El nodo está repetido");
        }else{
            if(nodo != nodoLista){
                if(nodo.getCodigo() < nodoLista.getCodigo()){
                    nodo.setSiguiente(nodoLista);
                    nodoLista.setAnterior(nodo);
                    if(cabeza == nodoLista)
                        cabeza = nodo;
                }else{
                    if(nodoLista.getSiguiente() != null){
                        if(nodo.getCodigo() < nodoLista.getSiguiente().getCodigo()){
                            nodo.setSiguiente(nodoLista.getSiguiente());
                            nodo.setAnterior(nodoLista);
                            nodoLista.setSiguiente(nodo);                
                        }else{
                            insertarNodo(nodo,nodoLista.getSiguiente());
                        }
                    }else{
                        nodoLista.setSiguiente(nodo);
                        nodo.setAnterior(nodoLista);
                        nodo.setSiguiente(null);
                    }
                }
            }
        }
        
    }
    
    public void eliminarNodo(Nodo nodoLista, long codigo){
        if(nodoLista.getCodigo() == codigo){ // nodoLista será el nodo a eliminar
            //PRIMERO
            if(nodoLista.getAnterior() == null){
                this.cabeza = nodoLista.getSiguiente();
                nodoLista.getSiguiente().setAnterior(null);
            }
            //ULTIMO
            if(nodoLista.getSiguiente() == null){
                nodoLista.getAnterior().setSiguiente(null);
            }
            //MEDIO
            if(nodoLista.getAnterior() != null && nodoLista.getSiguiente() != null){
                nodoLista.getAnterior().setSiguiente(nodoLista.getSiguiente());
                nodoLista.getSiguiente().setAnterior(nodoLista.getAnterior());
            }
        }else{
            eliminarNodo(nodoLista.getSiguiente(), codigo);
        }
    }
    
    public void buscarNodo(Nodo nodoLista,long codigo){
        if(codigo==nodoLista.getCodigo()){
            JOptionPane.showMessageDialog(null, "El nodo se encuentra en la lista");
        }else{
            if(nodoLista.getSiguiente()==null){
                JOptionPane.showMessageDialog(null, "El nodo no se encuentra en la lista");
            }else{
                buscarNodo(nodoLista.getSiguiente(),codigo);
            }
            
        }
    }
            
}
