/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posfijo;
import java.util.ArrayList;
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
    int[][] jerarquia= {
            {1,1,0,0,0,0,1},
            {1,1,0,0,0,0,1},
            {1,1,1,1,0,0,1},
            {1,1,1,1,0,0,1},
            {1,1,1,1,1,0,1},
            {0,0,0,0,0,0,0}
    };
    public void Operadores(String expresion){ 
        System.out.println(expresion);
        infijo=expresion.split(""); 
        int i=0;
        for(i=0;i<infijo.length;i++){
            String elemento= infijo[i];
            if(esOperando(elemento)){
                posfijo.add(infijo[i]);
            }else{
                while(!pila.isEmpty()&& prioridad((String)
                        pila.get(pila.size()-1),infijo[i])==1){
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
        while(!pila.isEmpty()){
            String elemento=(String)pila.pop();
            posfijo.add(elemento);
        }
    }
    public boolean esOperando(String elemento){
        try{
            Integer.parseInt(elemento);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
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
    public int prioridad(String op1,String op2){
        return jerarquia[rowPosition(op1)][colPosition(op2)];
    }
    public String operar(double a,double b,String operador){
        switch(operador){
            case "+": return String.valueOf(a+b);
            case "-": return String.valueOf(a-b);
            case "*": return String.valueOf(a*b);
            case "/": return String.valueOf((b==0)?0:a/b);
            case "^": return String.valueOf(Math.pow(b, a));
            default : return "0";
            }        
    }
    public String Resultado(){
        pila.clear();
        for(int i=0;i<posfijo.size();i++){
            
            if(esOperando(posfijo.get(i))){
                pila.push(posfijo.get(i));
            }else{
                double a=Double.parseDouble((String)pila.pop());
                double b=Double.parseDouble((String)pila.pop());
                pila.push(operar(a,b,posfijo.get(i)));
                
            }
            System.out.println(pila);
        }
        String result=(String)pila.get(0);
        pila.clear();
        return result;
    }
}