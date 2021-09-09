/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posfijo;

import java.util.Stack;

/**
 *
 * @author cesar
 */
public class Pila {
    Stack pila =new Stack();
    String[] infijo;
    String[] posfijo;
    float resultado;

    public Stack getPila() {
        return pila;
    }

    public String[] getInfijo() {
        return infijo;
    }

    public String[] getPosfijo() {
        return posfijo;
    }
    
    public void Operadores(String expresion){   
        infijo=expresion.split(" ");
        for(int i=0;i<infijo.length;i++){
            while(infijo[i]!=")"){
                if(infijo[i]=="("){
                    pila.push(infijo[i]);
                }
                if((infijo[i]=="+")||(infijo[i]=="-")||
                   (infijo[i]=="*")||(infijo[i]=="/")||
                   (infijo[i]=="^")){
                    //posfijo.add(infijo[i]);
                    System.out.println("vamos bien");
                }
                if(prioridad()==1){
                    infijo[i]=(String)pila.pop();
                }
                if(prioridad()==0){
                    break;
                }  
            }
            if(infijo[i]!=")"){
                   pila.push(infijo[i]);
                }
            if(infijo[i]==")"){
                    infijo[i]=(String)pila.pop();
                }
            
        }
    }
    public int prioridad(/*String op1,String op2*/){
        return 0;
    }
    public float Operar(String expresion){
        String var = expresion;
        char cad[];
        cad = var.toCharArray();
        //
        return resultado;
    }
    
    
}
