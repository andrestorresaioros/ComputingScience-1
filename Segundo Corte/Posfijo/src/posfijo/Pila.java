/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posfijo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
    Map<String,Integer> jerarquia= new HashMap<>();
    public Pila(){
        jerarquia.put("(", 0);
        jerarquia.put("+", 3);
        jerarquia.put("-", 3);
        jerarquia.put("*", 5);
        jerarquia.put("/", 5);
        jerarquia.put("^", 6);
    }

    public Stack getPila() {
        return pila;
    }

    public String[] getInfijo() {
        return infijo;
    }

    public ArrayList<String> getPosfijo() {
        return posfijo;
    }

    public float getResultado() {
        return resultado;
    }

    public void Operadores(String expresion){ 
        System.out.println(expresion);
        infijo=expresion.split(""); 
        /*for(String yisus:infijo){
            System.out.println(yisus);
        }*/
        for(int i=0;i<infijo.length;i++){
            while(!infijo[i].equals(")")){
                if(infijo[i].equals("(")){
                    pila.push(infijo[i]);
                }
                if((infijo[i].equals("+") )||(infijo[i].equals("-"))||
                   (infijo[i].equals("*"))||(infijo[i].equals("/"))||
                   (infijo[i].equals("^"))){
                    posfijo.add(infijo[i]);
                    System.out.println("vamos bien");
                }
                if(posfijo.size()!=0){
                    if(prioridad(posfijo.get(i-1),posfijo.get(i))){
                      infijo[i]=(String)pila.pop();
                    }
                    if(!prioridad(posfijo.get(i-1),posfijo.get(i))){
                        break;
                    }  
                }else{
                    posfijo
                }
            }
            if(!infijo[i].equals(")")){
                   pila.push(infijo[i]);
                }
            if(infijo[i].equals(")")){
                    infijo[i]=(String)pila.pop();
                }
            
        }
    }
    public boolean prioridad(String op1,String op2){
        return jerarquia.get(op1)>jerarquia.get(op2);
    }
    public float Operar(String expresion){
        String var = expresion;
        char cad[];
        cad = var.toCharArray();
        //
        return resultado;
    }
    
    
}
