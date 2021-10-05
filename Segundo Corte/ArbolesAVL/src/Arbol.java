
import javax.swing.JOptionPane;

public class Arbol {

    private Nodo raiz;
    
    
    //GETTERS Y SETTERS

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    
    //CONSTRUCTOR
    
    public Arbol(){
        this.raiz = null;
    }
    
    public void insertar(Nodo nuevo, Nodo lista){
        if(lista != null){
            if(nuevo.getTelefono() == lista.getTelefono()){
                JOptionPane.showMessageDialog(null, "El número de telefono ya se encuentra en el árbol");
            }else{
                if(nuevo.getTelefono() < lista.getTelefono()){
                    if(lista.getIzquierda() == null){
                        lista.setIzquierda(nuevo);
                        nuevo.setRaiz(lista);
                        llenarBalance(this.raiz);
                        //BALANCEAR
                        balancearArbol(this.raiz);
                        llenarBalance(this.raiz);
                    }else{
                        insertar(nuevo,lista.getIzquierda());
                    }
                }else{
                    if(lista.getDerecha() == null){
                        lista.setDerecha(nuevo);
                        nuevo.setRaiz(lista);
                        llenarBalance(this.raiz);
                        //BALANCEAR
                        balancearArbol(this.raiz);
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
            llenarBalance(lista.getDerecha());
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
   
    public void balancearArbol(Nodo lista){
        if(lista != null){
            if(lista.getBalance() != 0 && lista.getBalance() != 1 && lista.getBalance() != -1){
                try{
                    
                if(Math.abs(lista.getIzquierda().getBalance()) == 1 
                        || Math.abs(lista.getDerecha().getBalance()) == 1){
                    
                        if(lista.getBalance() > 0){                                     //q positivo
                        if(lista.getIzquierda().getBalance() > 0){                      //p positivo                               
                            lista.getIzquierda().setRaiz(lista.getRaiz());
                            Nodo temp = lista.getIzquierda().getDerecha();
                            lista.getIzquierda().setDerecha(lista);
                            if(lista != this.raiz){
                                if(lista.getRaiz().getIzquierda() == lista){
                                    lista.getRaiz().setIzquierda(lista.getIzquierda());
                                }else{
                                    lista.getRaiz().setDerecha(lista.getIzquierda());
                                }
                                
                            }
                            lista.setRaiz(lista.getIzquierda());
                            lista.setIzquierda(temp);
                        }else{                                                           //p negativo
                            lista.getIzquierda().getDerecha().setRaiz(lista.getRaiz());
                            if(lista != this.raiz){
                                if(lista.getRaiz().getIzquierda() == lista){
                                    lista.getRaiz().setIzquierda(lista.getIzquierda().getDerecha());
                                }else{
                                    lista.getRaiz().setDerecha(lista.getIzquierda().getDerecha());
                                }
                                
                            }
                            lista.setRaiz(lista.getIzquierda().getDerecha());
                            lista.getIzquierda().setRaiz(lista.getIzquierda().getDerecha());
                            Nodo temp = lista.getRaiz().getDerecha();
                            lista.getRaiz().setDerecha(lista);
                            lista.getIzquierda().setDerecha(lista.getRaiz().getIzquierda());
                            lista.getRaiz().setIzquierda(lista.getIzquierda());
                            lista.setIzquierda(temp);
                        }
                    }else{                                                               //q negativo
                        if(lista.getDerecha().getBalance() > 0){                         //p positivo
                            lista.getDerecha().getIzquierda().setRaiz(lista.getRaiz());
                            if(lista != this.raiz){
                                if(lista.getRaiz().getDerecha() == lista){
                                    lista.getRaiz().setDerecha(lista.getDerecha().getIzquierda());
                                }else{
                                    lista.getRaiz().setIzquierda(lista.getDerecha().getIzquierda());
                                }
                                
                            }
                            lista.setRaiz(lista.getDerecha().getIzquierda());
                            lista.getDerecha().setRaiz(lista.getDerecha().getIzquierda());
                            Nodo temp = lista.getRaiz().getIzquierda();
                            lista.getRaiz().setIzquierda(lista);
                            lista.getDerecha().setIzquierda(lista.getRaiz().getDerecha());
                            lista.getRaiz().setDerecha(lista.getDerecha());
                            lista.setDerecha(temp);
                        }else{                                                             //p negativo
                            lista.getDerecha().setRaiz(lista.getRaiz());
                            Nodo temp = lista.getDerecha().getIzquierda();
                            lista.getDerecha().setIzquierda(lista);
                            if(lista != this.raiz){
                                if(lista.getRaiz().getDerecha() == lista){
                                    lista.getRaiz().setDerecha(lista.getDerecha());
                                }else{  
                                    lista.getRaiz().setIzquierda(lista.getDerecha());
                                }
                                
                            }
                            lista.setRaiz(lista.getDerecha());
                            lista.setDerecha(temp);
                        }
                    }

                    if(this.raiz == lista){
                        this.raiz = lista.getRaiz();
                    }
                }else{
                    balancearArbol(lista.getIzquierda());
                    balancearArbol(lista.getDerecha());
                }
                }catch(Exception e){
                    try{
                        if(Math.abs(lista.getDerecha().getBalance()) == 1){
                            if(lista.getBalance() > 0){                                     //q positivo
                            if(lista.getIzquierda().getBalance() > 0){                      //p positivo                               
                                lista.getIzquierda().setRaiz(lista.getRaiz());
                                Nodo temp = lista.getIzquierda().getDerecha();
                                lista.getIzquierda().setDerecha(lista);
                                if(lista != this.raiz){
                                    if(lista.getRaiz().getIzquierda() == lista){
                                        lista.getRaiz().setIzquierda(lista.getIzquierda());
                                    }else{
                                        lista.getRaiz().setDerecha(lista.getIzquierda());
                                    }

                                }
                                lista.setRaiz(lista.getIzquierda());
                                lista.setIzquierda(temp);
                            }else{                                                           //p negativo
                                lista.getIzquierda().getDerecha().setRaiz(lista.getRaiz());
                                if(lista != this.raiz){
                                    if(lista.getRaiz().getIzquierda() == lista){
                                        lista.getRaiz().setIzquierda(lista.getIzquierda().getDerecha());
                                    }else{
                                        lista.getRaiz().setDerecha(lista.getIzquierda().getDerecha());
                                    }

                                }
                                lista.setRaiz(lista.getIzquierda().getDerecha());
                                lista.getIzquierda().setRaiz(lista.getIzquierda().getDerecha());
                                Nodo temp = lista.getRaiz().getDerecha();
                                lista.getRaiz().setDerecha(lista);
                                lista.getIzquierda().setDerecha(lista.getRaiz().getIzquierda());
                                lista.getRaiz().setIzquierda(lista.getIzquierda());
                                lista.setIzquierda(temp);
                            }
                        }else{                                                               //q negativo
                            if(lista.getDerecha().getBalance() > 0){                         //p positivo
                                lista.getDerecha().getIzquierda().setRaiz(lista.getRaiz());
                                if(lista != this.raiz){
                                    if(lista.getRaiz().getDerecha() == lista){
                                        lista.getRaiz().setDerecha(lista.getDerecha().getIzquierda());
                                    }else{
                                        lista.getRaiz().setIzquierda(lista.getDerecha().getIzquierda());
                                    }

                                }
                                lista.setRaiz(lista.getDerecha().getIzquierda());
                                lista.getDerecha().setRaiz(lista.getDerecha().getIzquierda());
                                Nodo temp = lista.getRaiz().getIzquierda();
                                lista.getRaiz().setIzquierda(lista);
                                lista.getDerecha().setIzquierda(lista.getRaiz().getDerecha());
                                lista.getRaiz().setDerecha(lista.getDerecha());
                                lista.setDerecha(temp);
                            }else{                                                             //p negativo
                                lista.getDerecha().setRaiz(lista.getRaiz());
                                Nodo temp = lista.getDerecha().getIzquierda();
                                lista.getDerecha().setIzquierda(lista);
                                if(lista != this.raiz){
                                    if(lista.getRaiz().getDerecha() == lista){
                                        lista.getRaiz().setDerecha(lista.getDerecha());
                                    }else{  
                                        lista.getRaiz().setIzquierda(lista.getDerecha());
                                    }

                                }
                                lista.setRaiz(lista.getDerecha());
                                lista.setDerecha(temp);
                            }
                        }

                        if(this.raiz == lista){
                            this.raiz = lista.getRaiz();
                        }
                    }else{
                        balancearArbol(lista.getIzquierda());
                        balancearArbol(lista.getDerecha());
                    }
                    }catch(Exception e1){
                        balancearArbol(lista.getIzquierda());
                        balancearArbol(lista.getDerecha());
                    }
                }
                
            }else{
                balancearArbol(lista.getIzquierda());
                balancearArbol(lista.getDerecha());
            }
        }
    }
    
}
