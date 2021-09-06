package matricesdispersas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lista {
    
    private NodoColumna cabeza;
    private int columnaMayor;
    private int filaMayor;
    private ArrayList<NodoColumna> listaColumna = new ArrayList();

    public ArrayList<NodoColumna> getListaColumna() {
        return listaColumna;
    }

    public void setListaColumna(ArrayList<NodoColumna> listaColumna) {
        this.listaColumna = listaColumna;
    }
    
    
    //GETTERS Y SETTERS
    public NodoColumna getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoColumna cabeza) {
        this.cabeza = cabeza;
    }

    public int getColumnaMayor() {
        return columnaMayor;
    }

    public void setColumnaMayor(int columnaMayor) {
        this.columnaMayor = columnaMayor;
    }

    public int getFilaMayor() {
        return filaMayor;
    }

    public void setFilaMayor(int filaMayor) {
        this.filaMayor = filaMayor;
    }
    
    
    
    
    //CONSTRUCTOR
    public void Lista(){
        this.cabeza = null;
    }
    
    
    //METODOS IMPORTANTES
    public void insertar(NodoColumna nuevaColumna, NodoFila nuevaFila, NodoColumna nodoListaColumna){
        if(nodoListaColumna != null){
            if(nuevaColumna.getColumna() == nodoListaColumna.getColumna()){
                insertar2(nuevaFila,nodoListaColumna.getAbajo(),nodoListaColumna);
            }else{
                if(nuevaColumna.getColumna()<nodoListaColumna.getColumna()){
                    if(nodoListaColumna == this.cabeza){
                        nuevaColumna.setSiguiente(cabeza);
                        this.cabeza.setAnterior(nuevaColumna);
                        this.cabeza = nuevaColumna;
                        insertar2(nuevaFila,nuevaColumna.getAbajo(),nuevaColumna);
                    }else{
                        nodoListaColumna.getAnterior().setSiguiente(nuevaColumna);
                        nuevaColumna.setAnterior(nodoListaColumna.getAnterior());
                        nuevaColumna.setSiguiente(nodoListaColumna);
                        nodoListaColumna.setAnterior(nuevaColumna);
                        insertar2(nuevaFila,nuevaColumna.getAbajo(),nuevaColumna);
                    }
                }else{
                    if(nodoListaColumna.getSiguiente() == null){
                        nodoListaColumna.setSiguiente(nuevaColumna);
                        nuevaColumna.setAnterior(nodoListaColumna);
                        insertar2(nuevaFila,nodoListaColumna.getSiguiente().getAbajo(),nodoListaColumna.getSiguiente());
                    }else{
                        insertar(nuevaColumna, nuevaFila, nodoListaColumna.getSiguiente());
                    }
                }
            }
        }
    }
    
    private void insertar2(NodoFila nuevaFila, NodoFila nodoListaFila, NodoColumna columna){
        if(nodoListaFila != null){
            if(nuevaFila.getFila() == nodoListaFila.getFila()){
                JOptionPane.showMessageDialog(null, "Ya existe un valor en esta posición");
            }else{
                if(nuevaFila.getFila()<nodoListaFila.getFila()){
                    if(nodoListaFila == columna.getAbajo()){
                        columna.getAbajo().setArriba(nuevaFila);
                        nuevaFila.setAbajo(columna.getAbajo());
                        columna.setAbajo(nuevaFila);
                    }else{
                        nodoListaFila.getArriba().setAbajo(nuevaFila);
                        nuevaFila.setArriba(nodoListaFila.getArriba());
                        nuevaFila.setAbajo(nodoListaFila);
                        nodoListaFila.setArriba(nuevaFila);
                    }
                }else{
                    if(nodoListaFila.getAbajo() == null){
                        nodoListaFila.setAbajo(nuevaFila);
                        nuevaFila.setArriba(nodoListaFila);
                    }else{
                        insertar2(nuevaFila,nodoListaFila.getAbajo(),columna);
                    }
                }
            }
        }else{
            columna.setAbajo(nuevaFila);
        }
    }

    public void insertarResultado(NodoColumna nuevaColumna, NodoFila nuevaFila, NodoColumna nodoListaColumna){
        if(nodoListaColumna != null){
            if(nuevaColumna.getColumna() == nodoListaColumna.getColumna()){
                insertarResultado2(nuevaFila,nodoListaColumna.getAbajo(),nodoListaColumna);
            }else{
                if(nuevaColumna.getColumna()<nodoListaColumna.getColumna()){
                    if(nodoListaColumna == this.cabeza){
                        nuevaColumna.setSiguiente(cabeza);
                        this.cabeza.setAnterior(nuevaColumna);
                        this.cabeza = nuevaColumna;
                        insertarResultado2(nuevaFila,nodoListaColumna.getSiguiente().getAbajo(),nodoListaColumna.getSiguiente());
                    }else{
                        nodoListaColumna.getAnterior().setSiguiente(nuevaColumna);
                        nuevaColumna.setAnterior(nodoListaColumna.getAnterior());
                        nuevaColumna.setSiguiente(nodoListaColumna);
                        nodoListaColumna.setAnterior(nuevaColumna);
                        insertarResultado2(nuevaFila,nuevaColumna.getAbajo(),nuevaColumna);
                    }
                }else{
                    if(nodoListaColumna.getSiguiente() == null){
                        nodoListaColumna.setSiguiente(nuevaColumna);
                        nuevaColumna.setAnterior(nodoListaColumna);
                        insertarResultado2(nuevaFila,nuevaColumna.getAbajo(),nuevaColumna);
                    }else{
                        insertarResultado(nuevaColumna, nuevaFila, nodoListaColumna.getSiguiente());
                    }
                }
            }
        }
    }
    
    private void insertarResultado2(NodoFila nuevaFila, NodoFila nodoListaFila, NodoColumna columna){
        if(nodoListaFila != null){
            if(nuevaFila.getFila() == nodoListaFila.getFila()){
                nodoListaFila.setValor(nodoListaFila.getValor()+nuevaFila.getValor());
            }else{
                if(nuevaFila.getFila()<nodoListaFila.getFila()){
                    if(nodoListaFila == columna.getAbajo()){
                        columna.getAbajo().setArriba(nuevaFila);
                        nuevaFila.setAbajo(columna.getAbajo());
                        columna.setAbajo(nuevaFila);
                    }else{
                        nodoListaFila.getArriba().setAbajo(nuevaFila);
                        nuevaFila.setArriba(nodoListaFila.getArriba());
                        nuevaFila.setAbajo(nodoListaFila);
                        nodoListaFila.setArriba(nuevaFila);
                    }
                }else{
                    if(nodoListaFila.getAbajo() == null){
                        nodoListaFila.setAbajo(nuevaFila);
                        nuevaFila.setArriba(nodoListaFila);
                    }else{
                        insertarResultado2(nuevaFila,nodoListaFila.getAbajo(),columna);
                    }
                }
            }
        }else{
            columna.setAbajo(nuevaFila);
        }
    }
        
    public void mayores(){
        NodoColumna lista = this.cabeza;
        NodoFila lista2 = this.cabeza.getAbajo();
        this.columnaMayor = lista.getColumna();
        this.filaMayor = lista2.getFila();
        while(lista != null){
            if(lista.getSiguiente() != null){
                if(this.columnaMayor < lista.getSiguiente().getColumna()){
                    this.columnaMayor = lista.getSiguiente().getColumna();
                }
            }
            lista = lista.getSiguiente();
            if(lista != null){
                lista2 = lista.getAbajo();
                while(lista2 != null){
                    if(lista2 != null){
                        if(this.filaMayor < lista2.getFila()){
                            this.filaMayor = lista2.getFila();
                        }
                    }
                    lista2 = lista2.getAbajo();
                }
            }    
        }
    }
    
    public void mostrarListaColumna(NodoColumna nodoLista){
        if(nodoLista != null){
           listaColumna.add(nodoLista);
           mostrarListaColumna(nodoLista.getSiguiente());
        }
            
       }
    public void mostrarListaFila(NodoFila nodoLista,ArrayList<String> arreglo){
        if(nodoLista != null){
           arreglo.add(nodoLista.getFila()+"");
           mostrarListaFila(nodoLista.getAbajo(),arreglo);
        }
            
       }
    
    
    
}
