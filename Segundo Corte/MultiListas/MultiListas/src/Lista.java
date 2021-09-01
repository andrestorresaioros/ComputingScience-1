
import javax.swing.JOptionPane;

public class Lista {
    
    private String nombre;
    private NodoMateria cabeza;
    
    public void setCabeza(NodoMateria cabeza){
        this.cabeza = cabeza;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public NodoMateria getCabeza(){
        return this.cabeza;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    //CONSTRUCTOR
    public Lista(){
        this.cabeza = null;
    }
    
    //INSERTAR MATERIA
    public void insertarMateria(NodoMateria materia, NodoMateria nodoLista){
        if(nodoLista != null){
            if(materia.getNombre().equals(nodoLista.getNombre())){
                JOptionPane.showMessageDialog(null, "El nodo está repetido");
            }else{
                if(materia.getNombre().compareToIgnoreCase(nodoLista.getNombre()) < 0 ){                                 //materia < nodoLista 
                    if(nodoLista == this.cabeza){
                        materia.setSiguiente(this.cabeza);
                        this.cabeza.setAnterior(materia);
                        setCabeza(materia);
                    }else{
                       nodoLista.getAnterior().setSiguiente(materia);
                       materia.setAnterior(nodoLista.getAnterior());
                       materia.setSiguiente(nodoLista);
                       nodoLista.setAnterior(materia);
                    }
                }else{
                   if(nodoLista.getSiguiente() == null){
                        nodoLista.setSiguiente(materia);
                        materia.setAnterior(nodoLista);
                    }else{
                        insertarMateria(materia,nodoLista.getSiguiente());
                    } 
                }
            }
        }
    }
    
    //INSERTAR ESTUDIANTE
    
    //ELIMINAR MATERIA
    //ELEIMINAR ESTUDIANTE
    
    
}
