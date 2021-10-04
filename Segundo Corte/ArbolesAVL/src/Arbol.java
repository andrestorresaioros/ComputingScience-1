
import javax.swing.JOptionPane;

public class Arbol {

    private Nodo raiz;
    private String inorden;
    private String posorden;
    private String niveles;
    
    //GETTERS Y SETTERS

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public String getInorden() {
        return inorden;
    }

    public void setInorden(String inorden) {
        this.inorden = inorden;
    }

    public String getPosorden() {
        return posorden;
    }

    public void setPosorden(String posorden) {
        this.posorden = posorden;
    }

    public String getNiveles() {
        return niveles;
    }

    public void setNiveles(String niveles) {
        this.niveles = niveles;
    }
    
    
    //CONSTRUCTOR
    
    public Arbol(){
        this.raiz = null;
        this.inorden = "";
        this.posorden = "";
        this.niveles = "";
    }
    
    public void insertar(Nodo nuevo, Nodo lista){
        if(lista != null){
            if(nuevo.getTelefono() == lista.getTelefono()){
                JOptionPane.showMessageDialog(null, "El número de telefono ya se encuentra en el árbol");
            }else{
                if(nuevo.getTelefono() < lista.getTelefono()){
                    if(lista.getIzquierda() == null){
                        lista.setIzquierda(nuevo);
                        llenarBalance(this.raiz);
                    }else{
                        insertar(nuevo,lista.getIzquierda());
                    }
                }else{
                    if(lista.getDerecha() == null){
                        lista.setDerecha(nuevo);
                        llenarBalance(this.raiz);
                    }else{
                        insertar(nuevo,lista.getDerecha());
                    }
                }
            }
        }
    }
    
    public void llenarBalance(Nodo lista){
        if(lista != null){
            lista.setNivelIzq(0);
            lista.setNivelDer(0);
            lista.niveles();
            llenarBalance(lista.getIzquierda());
            llenarBalance(lista.getIzquierda());
        }
    }
    
    public void cambiarEstado(Nodo lista,int telefono){
        if(lista != null){
            if(lista.getTelefono() == telefono){
                if(lista.isBloqueado()){
                    lista.setBloqueado(false);
                }else{
                    lista.setBloqueado(true);
                }
            }else{
                cambiarEstado(lista.getDerecha(),telefono);
                cambiarEstado(lista.getIzquierda(),telefono);
            }
        }
    }
    
    public void consultar(Nodo lista, int telefono){
        if(lista != null){
            if(lista.getTelefono() == telefono){
                JOptionPane.showMessageDialog(null,"Telefono: "
                        +lista.getTelefono()+"\nUsuario: "+lista.getUsuario()
                        +"\nBalance: "+lista.getBalance()
                        +"\nBloqueado: "+lista.isBloqueado());
            }else{
                consultar(lista.getIzquierda(),telefono);
                consultar(lista.getDerecha(),telefono);
            }
        }
    }
   
    
}
