public class Nodo {
    
    private int telefono;
    private String usuario;
    private boolean bloqueado;
    private Nodo izquierda;
    private Nodo derecha;
    private int nivelIzq;
    private int nivelDer;
    private int balance;
    
    
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
 
    public int getNivelIzq() {
        return nivelIzq;
    }

    public void setNivelIzq(int nivelIzq) {
        this.nivelIzq = nivelIzq;
    }
    
    public int getNivelDer() {
        return nivelDer;
    }

    public void setNivelDer(int nivelDer) {
        this.nivelDer = nivelDer;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
    //CONSTRUCTOR
    public Nodo(int telefono, String usuario){
        this.izquierda = null;
        this.derecha = null;
        this.telefono = telefono;
        this.usuario = usuario;
        this.bloqueado = false;
        this.nivelDer = 0;
        this.nivelIzq = 0;
    }
    
    
    public void niveles(){
        if(this.izquierda != null){
            this.nivelIzq++;
            niveles2(this.izquierda,"izq");
        }
        
        if(this.derecha != null){
            this.nivelDer++;
            niveles2(this.derecha,"der");
        }
        
        this.balance = this.nivelIzq-this.nivelDer;
    }
    
    public void niveles2(Nodo lista, String dir){
        if(dir.equals("izq")){
            if(lista.izquierda != null){
                this.nivelIzq++;
                if(lista.derecha != null){
                    niveles2(lista.izquierda,dir);
                    niveles2(lista.derecha,dir);
                }else{
                    niveles2(lista.izquierda,dir);
                }
            }else{
                if(lista.derecha != null){
                    this.nivelIzq++;
                    niveles2(lista.derecha,dir);
                }
            }
        }else{
            if(lista.izquierda != null){
                this.nivelDer++;
                if(lista.derecha != null){
                    niveles2(lista.izquierda,dir);
                    niveles2(lista.derecha,dir);
                }else{
                    niveles2(lista.izquierda,dir);
                }
            }else{
                if(lista.derecha != null){
                    this.nivelDer++;
                    niveles2(lista.derecha,dir);
                }
            }
        }
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
    
    public String inorden() {
        String in = "";
        if (izquierda != null) {
            in = in + izquierda.inorden()+",";
        }
        in = in + String.valueOf(telefono);
        if (derecha != null) {
            in = in + ","+derecha.inorden();
        }
        return in;
    }
    
    public String posorden() {
        String pos = "";
        
        if (izquierda != null) {
            pos = pos + izquierda.posorden() + ",";
        }
        if (derecha != null) {
            pos = pos +derecha.posorden() + ",";
        }
        pos +=  String.valueOf(telefono);

        return pos;
    }
    public String nivel(){
        String niv = "";
            niv +=  String.valueOf(telefono)+",";
                if (izquierda != null) {
                     niv = niv + izquierda.nivel();
                     }
                if (derecha != null) {
                        niv = niv +derecha.nivel();
                    }
        return niv;
    } 
     
        
    

        
    
    public Nodo anterior() {
        if (this.getDerecha() == null) {
            return this;
        } else {
            return this.getDerecha().anterior();
        }
    }
 
    public Nodo siguiente() {
        if (this.getIzquierda() == null) {
            return this;
        } else {
            return this.getIzquierda().siguiente();
        }
    }
    public Nodo borrar(int telefono) {
        Nodo response = this;
        if (telefono < this.telefono) {  
            this.izquierda = this.izquierda.borrar(telefono);
        } else if (telefono > this.telefono) {
            this.derecha = this.derecha.borrar(telefono);
        } else {
            if (this.izquierda != null && this.derecha != null) {
                Nodo temp = this;
                Nodo mayIzq = this.izquierda.anterior();
                this.telefono= mayIzq.getTelefono();
                temp.izquierda = temp.izquierda.borrar(mayIzq.getTelefono());
            } else if (this.izquierda != null) {
                response = this.izquierda;
            } else if (this.derecha != null) {
                response = this.derecha;
            } else {
                response = null;
            }
        }
        return response;
    }
    
}