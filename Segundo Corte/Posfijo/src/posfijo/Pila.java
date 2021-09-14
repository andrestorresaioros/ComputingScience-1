package posfijo;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;
/**
 *
 * @author cesar
 */
public class Pila {
    Stack pila =new Stack();
    String[] infijo;
    ArrayList<String> posfijo= new ArrayList<>();
    float resultado;
    // Creo la matriz de Jerarquia de operaciones
    int[][] jerarquia= {
            {1,1,0,0,0,0,1},
            {1,1,0,0,0,0,1},
            {1,1,1,1,0,0,1},
            {1,1,1,1,0,0,1},
            {1,1,1,1,1,0,1},
            {0,0,0,0,0,0,0}
    };

    public Stack getPila() {
        return pila;
    }
    
    public void Operadores(String expresion){ 
        // convierto de String a array
        infijo=expresion.split(" "); 
        int i=0;
        for(i=0;i<infijo.length;i++){
            /* convierto el infijo en la posicion i a string para verificar
               si es un operando
            */
            String elemento= infijo[i];
            if(esOperando(elemento)){
                posfijo.add(infijo[i]);
            }else{
                /*verifico si la pila es vacia y le paso 
                los dos parametros del metodo prioridad (fila y columna)
                */
                while(!pila.isEmpty()&& 
                        prioridad((String)pila.get(pila.size()-1)
                        ,infijo[i])==1){
                    elemento=(String)pila.pop();
                    posfijo.add(elemento);
                }
                if(infijo[i].equals(")")){
                    elemento=(String)pila.pop();
                }else{
                    pila.push(infijo[i]);
                }
            }
        }
        // literal esto lo copie del paso a paso que tiene Becerra en 
        // porcomputador
        while(!pila.isEmpty()){
            String elemento=(String)pila.pop();
            posfijo.add(elemento);
        }
    }
    // aca verifica si es un numero, si no lo es, entonces es un operando
    public boolean esOperando(String elemento){
        try{
            Integer.parseInt(elemento);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    // fila de la matriz de jerarquia
    private int rowPosition(String op1){
            switch(op1){
            case "+": return 0;
            case "-": return 1;
            case "*": return 2;
            case "/": return 3;
            case "^": return 4;
            case "(": return 5;
            default : return -1;
        }
    }
    // columna de la matriz de jerarquia
    private int colPosition(String op2){
            switch(op2){
            case "+": return 0;
            case "-": return 1;
            case "*": return 2;
            case "/": return 3;
            case "^": return 4;
            case "(": return 5;
            case ")": return 6;
            default : return -1;
        }   
    }
    // recibe de parametros la fila y la columna de la matriz jerarquia
    // devuelve 0 o 1
    public int prioridad(String op1,String op2){
        return jerarquia[rowPosition(op1)][colPosition(op2)];
    }
    public String operar(double a,double b,String operador){
        switch(operador){
            case "+": return String.valueOf(b+a);
            case "-": return String.valueOf(b-a);
            case "*": return String.valueOf(b*a);
            // coloco un operador ternario por si al marica de becerra le da 
            // por dividir entre 0 hp ese, lo odio 
            case "/":
                if(a==0){
                    String divisionE="Error. división por 0";
                    return divisionE;
                }else{
                    return String.valueOf((b==0)?0:b/a);
                }
                
            case "^": return String.valueOf(Math.pow(b, a));
            default : return "0";
            }        
    }
    public String Resultado(){
        String result = null;
        String error= "Faltan datos en la expresión";
        pila.clear();
        for(int i=0;i<posfijo.size();i++){
            if(esOperando(posfijo.get(i))){
                // aqui lo que hago es sacar las expresiones en forma de cola
                // osea que si la expresion esta asi 11+
                // saco el operando, luego los dos 1 y los opero, asi con todo
                pila.push(posfijo.get(i));
            }else{
                try{
                    double a=Double.parseDouble((String)pila.pop());
                    double b=Double.parseDouble((String)pila.pop());
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(posfijo.get(i));
                    System.out.println("resultado");
                    System.out.println(operar(a,b,posfijo.get(i)));
                    System.out.println("");
                    pila.push(operar(a,b,posfijo.get(i)));
                    
                    
                }catch(EmptyStackException e){ 
            }
        }
        if(pila.isEmpty()){
            result=error;
        }else{
            result="Resultado: "+(String)pila.get(0);
        }
        }
        // limpio la pila y devuelvo el resultado
        pila.clear();
        return result;
    }
}
