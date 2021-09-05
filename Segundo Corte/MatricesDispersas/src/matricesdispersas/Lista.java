package matricesdispersas;

import javax.swing.JOptionPane;

public class Lista {
    
    private NodoColumna cabeza;
    
    
    //GETTERS Y SETTERS
    public NodoColumna getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoColumna cabeza) {
        this.cabeza = cabeza;
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
                        insertar2(nuevaFila,nodoListaColumna.getSiguiente().getAbajo(),nodoListaColumna.getSiguiente());
                    }else{
                        nodoListaColumna.getAnterior().setSiguiente(nuevaColumna);
                        nuevaColumna.setAnterior(nodoListaColumna.getAnterior());
                        nuevaColumna.setSiguiente(nodoListaColumna);
                        nodoListaColumna.setAnterior(nuevaColumna);
                        insertar2(nuevaFila,nodoListaColumna.getSiguiente().getAbajo(),nodoListaColumna.getSiguiente());
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
    
}
