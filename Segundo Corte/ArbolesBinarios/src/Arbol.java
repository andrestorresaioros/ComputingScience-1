
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
    
    public void reconstruirPreOrden(String inorden, String preorden){
        String[] inRaiz = inorden.split(" ");     //ARRAY INORDEN
        String[] preRaiz = preorden.split(" ");   //ARRAY PREORDEN

        if(inRaiz.length == preRaiz.length){      //VALIDACIÓN DE QUE LOS ORDENAMIENTOS TENGAN EN MISMO TAMAÑO
            boolean rep = false;              
            for(int i=0;i<inRaiz.length-1;i++){    
                String caracterIn = inRaiz[i];
                String caracterPos = preRaiz[i];
                for(int j=i+1;j<inRaiz.length;j++){
                    if(inRaiz[j].equals(caracterIn) || preRaiz[j].equals(caracterPos)){
                        rep=true;
                    }
                }
            }
            if(!rep){    //VALIDAR QUE NO SE REPITAN LETRAS
                
                if(inRaiz[0].equals(preRaiz[preRaiz.length-1]) && inRaiz[inRaiz.length-1].equals(preRaiz[0])){
                    JOptionPane.showMessageDialog(null,"Los arboles no coinciden");
                }else{
                
                
                //ARREGLOS INORDEN POSORDEN
                String[] inIz, preIz, inDe, preDe;
                    
                Nodo nuevo = new Nodo(preRaiz[0]); 
                
                //RECORER IN BUSCANDO LA RAÍZ
                int pos = 0;
                for(int i=0;i<inRaiz.length;i++){
                    if(inRaiz[i].equals(preRaiz[0])){
                        pos = i;
                    }
                }
                        
                //LLENAR SUBSTRINGS IZQUIERDA
                inIz = new String[pos];
                for(int j=0;j<pos;j++){
                    inIz[j]=inRaiz[j];
                }
                preIz = new String[inIz.length];
                int aux=0;
                for(int j=1;j<inIz.length+1;j++){
                    preIz[aux]=preRaiz[j];
                    aux++;
                }
                            
                //LLENAR SUBSTRINGS DERECHA
                inDe = new String[inRaiz.length-pos-1];
                aux = 0;
                for(int j=pos+1;j<inRaiz.length;j++){
                    inDe[aux]=inRaiz[j];
                    aux++;
                }
                preDe = new String[inDe.length];
                aux=0;
                for(int j=inIz.length+1;j<preRaiz.length;j++){
                    preDe[aux]=preRaiz[j];
                    aux++;
                }
                
                //VALIDAR PREIZ
                if(preIz.length != 0){
                    Nodo izq = new Nodo(preIz[0]);
                    izq.setRaiz(nuevo);
                    izq.setIn(inIz);
                    izq.setPos(preIz);
                    nuevo.setIzquierda(izq);
                    
                    if(izq.getIn().equals("")){
                    }else{
                        reconstruirPreOrden(izq);
                    }
                }
                
                //VALIDAR POSDE
                if(preDe.length != 0){
                    Nodo der = new Nodo(preDe[0]);
                    der.setRaiz(nuevo);
                    der.setIn(inDe);
                    der.setPos(preDe);
                    nuevo.setDerecha(der);
                    
                    if(der.getIn().equals("")){
                    }else{
                        reconstruirPreOrden(der);
                    }
                }
                
                this.raiz = nuevo;
                }
            }else{
                JOptionPane.showMessageDialog(null, "No se pueden repetir letras");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Los ordenamientos no tienen la misma longitud");
        }
    }
    
    public void reconstruirPreOrden(Nodo raiz){
        
        //RECORER IN BUSCANDO LA RAÍZ
        int pos = 0;
        for(int i=0;i<raiz.getIn().length;i++){
            if(raiz.getIn()[i].equals(raiz.getPos()[0])){
                pos = i;
            }
        }
        
        //LLENAR SUBSTRINGS IZQUIERDA
        String[] inIz = new String[pos];
        for(int j=0;j<pos;j++){
            inIz[j]=raiz.getIn()[j];
        }
        String[] preIz = new String[inIz.length];
        int aux=0;
        for(int j=1;j<inIz.length+1;j++){
            preIz[aux]=raiz.getPos()[j];
            aux++;
        }
                            
        //LLENAR SUBSTRINGS DERECHA
        String[] inDe = new String[raiz.getIn().length-pos-1];
        aux = 0;
        for(int j=pos+1;j<raiz.getIn().length;j++){
            inDe[aux]=raiz.getIn()[j];
            aux++;
        }
        String[] preDe = new String[inDe.length];
        aux=0;
        for(int j=inIz.length+1;j<raiz.getPos().length;j++){
            preDe[aux]=raiz.getPos()[j];
            aux++;
        }
        
        //VALIDAR TAMAÑO DE PREIZ
        if(preIz.length != 0){
            Nodo izq = new Nodo(preIz[0]);
            izq.setRaiz(raiz);
            izq.setIn(inIz);
            izq.setPos(preIz);
            raiz.setIzquierda(izq);
            
            if(izq.getIn().equals("")){
            }else{
                reconstruirPreOrden(izq);
            }
        }
        
        //VALIDAR TAMAÑO DE PREDE
        if(preDe.length != 0){
            Nodo der = new Nodo(preDe[0]);
            der.setRaiz(raiz);
            der.setIn(inDe);
            der.setPos(preDe);
            raiz.setDerecha(der);
            
            if(der.getIn().equals("")){
            }else{
                reconstruirPreOrden(der);
            }
        }
        
    }
    
    public void reconstruirPosOrden(String inorden, String posorden){
        String[] inRaiz = inorden.split(" ");     //ARRAY INORDEN
        String[] posRaiz = posorden.split(" ");   //ARRAY POSORDEN

        if(inRaiz.length == posRaiz.length){      //VALIDACIÓN DE QUE LOS ORDENAMIENTOS TENGAN EN MISMO TAMAÑO
            boolean rep = false;              
            for(int i=0;i<inRaiz.length-1;i++){    
                String caracterIn = inRaiz[i];
                String caracterPos = posRaiz[i];
                for(int j=i+1;j<inRaiz.length;j++){
                    if(inRaiz[j].equals(caracterIn) || posRaiz[j].equals(caracterPos)){
                        rep=true;
                    }
                }
            }
            if(!rep){    //VALIDAR QUE NO SE REPITAN LETRAS
    
                if(inRaiz[0].equals(posRaiz[posRaiz.length-1]) && inRaiz[inRaiz.length-1].equals(posRaiz[0])){
                    JOptionPane.showMessageDialog(null,"Los arboles no coinciden");
                }else{
                
                
                //ARREGLOS INORDEN POSORDEN
                String[] inIz, posIz, inDe, posDe;
                    
                Nodo nuevo = new Nodo(posRaiz[posRaiz.length-1]);
                
                //RECORER IN BUSCANDO LA RAÍZ
                int pos = 0;
                for(int i=0;i<inRaiz.length;i++){
                    if(inRaiz[i].equals(posRaiz[posRaiz.length-1])){
                        pos = i;
                    }
                }
                        
                //LLENAR SUBSTRINGS IZQUIERDA
                inIz = new String[pos];
                for(int j=0;j<=pos-1;j++){
                    inIz[j]=inRaiz[j];
                }
                posIz = new String[inIz.length];
                for(int j=0;j<inIz.length;j++){
                    posIz[j]=posRaiz[j];
                }
                            
                //LLENAR SUBSTRINGS DERECHA
                inDe = new String[inRaiz.length-pos-1];
                int aux = 0;
                for(int j=pos+1;j<=inRaiz.length-1;j++){
                    inDe[aux]=inRaiz[j];
                    aux++;
                }
                posDe = new String[inDe.length];
                aux=0;
                for(int j=pos;j<inDe.length+pos;j++){
                    posDe[aux]=posRaiz[j];
                    aux++;
                }
                
                //VALIDAR POSIZ
                if(posIz.length != 0){
                    Nodo izq = new Nodo(posIz[posIz.length-1]);
                    izq.setRaiz(nuevo);
                    izq.setIn(inIz);
                    izq.setPos(posIz);
                    nuevo.setIzquierda(izq);
                    
                    if(izq.getIn().equals("")){
                    }else{
                        reconstruirPosOrden(izq);
                    }
                }
                
                //VALIDAR POSDE
                if(posDe.length != 0){
                    Nodo der = new Nodo(posDe[posDe.length-1]);
                    der.setRaiz(nuevo);
                    der.setIn(inDe);
                    der.setPos(posDe);
                    nuevo.setDerecha(der);
                    
                    if(der.getIn().equals("")){
                    }else{
                        reconstruirPosOrden(der);
                    }
                }
                
                this.raiz = nuevo;
                
                System.out.println("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No se pueden repetir letras");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Los ordenamientos no tienen la misma longitud");
        }
    }
    
    public void reconstruirPosOrden(Nodo raiz){
        
        //RECORER IN BUSCANDO LA RAÍZ
        int pos = 0;
        for(int i=0;i<raiz.getIn().length;i++){
            if(raiz.getIn()[i].equals(raiz.getPos()[raiz.getPos().length-1])){
                pos = i;
            }
        }
        
        //LLENAR SUBSTRINGS IZQUIERDA
        String[] inIz = new String[pos];
        for(int j=0;j<=pos-1;j++){
            inIz[j]=raiz.getIn()[j];
        }
        String[] posIz = new String[inIz.length];
        for(int j=0;j<inIz.length;j++){
            posIz[j]=raiz.getPos()[j];
        }
                            
        //LLENAR SUBSTRINGS DERECHA
        String[] inDe = new String[raiz.getIn().length-pos-1];
        int aux = 0;
        for(int j=pos+1;j<=raiz.getIn().length-1;j++){
            inDe[aux]=raiz.getIn()[j];
            aux++;
        }
        String[] posDe = new String[inDe.length];
        aux=0;
        for(int j=pos;j<inDe.length+pos;j++){
            posDe[aux]=raiz.getPos()[j];
            aux++;
        }
        
        //VALIDAR TAMAÑO DE POSIZ
        if(posIz.length != 0){
            Nodo izq = new Nodo(posIz[posIz.length-1]);
            izq.setRaiz(raiz);
            izq.setIn(inIz);
            izq.setPos(posIz);
            raiz.setIzquierda(izq);
            
            if(izq.getIn().equals("")){
            }else{
                reconstruirPosOrden(izq);
            }
        }
        
        //VALIDAR TAMAÑO DE POSDE
        if(posDe.length != 0){
            Nodo der = new Nodo(posDe[posDe.length-1]);
            der.setRaiz(raiz);
            der.setIn(inDe);
            der.setPos(posDe);
            raiz.setDerecha(der);
            
            if(der.getIn().equals("")){
            }else{
                reconstruirPosOrden(der);
            }
        }
        
    }
    public void insertar(String elemento) {
        if (raiz == null)
            raiz = new Nodo(elemento);
        else
            raiz = raiz.insertar(raiz, elemento);
    }
    
}
