
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
                JOptionPane.showMessageDialog(null, "La materia está repetida en la lista "+this.nombre);
            }else{
                if(materia.getNombre().compareToIgnoreCase(nodoLista.getNombre()) < 0 ){                           //materia < nodoLista 
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
    public void insertarEstudiante(NodoEstudiante estudiante, NodoMateria nodoListaMateria, String nombreMateria){
        if(nodoListaMateria != null){
            if(nodoListaMateria.getNombre().equals(nombreMateria)){
                insertarEstudiante_2(estudiante,nodoListaMateria,nodoListaMateria.getAbajo());
            }else{
                if(nodoListaMateria.getSiguiente() == null){
                    JOptionPane.showMessageDialog(null, "La materia no se encuentra en la lista "+this.nombre);
                }else{
                    insertarEstudiante(estudiante, nodoListaMateria.getSiguiente(), nombreMateria);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "No hay materias en la lista "+this.nombre);            
        }
    }
    
    private void insertarEstudiante_2(NodoEstudiante estudiante, NodoMateria materia, NodoEstudiante nodoListaEstudiante){
        if(nodoListaEstudiante != null){
            if(estudiante.getNombre().equalsIgnoreCase(nodoListaEstudiante.getNombre())){
                JOptionPane.showMessageDialog(null, "El estudiante ya está en el curso "+materia.getNombre());
            }else{
                if(estudiante.getNombre().compareToIgnoreCase(nodoListaEstudiante.getNombre()) < 0){
                    if(nodoListaEstudiante.getArriba() == null){
                        materia.setAbajo(estudiante);
                        estudiante.setAbajo(nodoListaEstudiante);
                        nodoListaEstudiante.setArriba(estudiante);
                    }else{
                        nodoListaEstudiante.getArriba().setAbajo(estudiante);
                        estudiante.setArriba(nodoListaEstudiante.getArriba());
                        estudiante.setAbajo(nodoListaEstudiante);
                        nodoListaEstudiante.setArriba(estudiante);
                    }
                }else{
                    if(nodoListaEstudiante.getAbajo() == null){
                        nodoListaEstudiante.setAbajo(estudiante);
                        estudiante.setArriba(nodoListaEstudiante);
                    }else{
                        insertarEstudiante_2(estudiante,materia,nodoListaEstudiante.getAbajo());
                    }
                }
            }
        }else{
            if(nodoListaEstudiante == materia.getAbajo()){
                materia.setAbajo(estudiante);
            }
        }
    }
    
    //ELIMINAR MATERIA
    //ELEIMINAR ESTUDIANTE
    
    
}
