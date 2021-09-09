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
    public int Operadores(String expresion){
        String var = expresion;
        int cad;
        cad = Integer.parseInt(var);
        return cad;
    }
    public void Operar(String expresion){
        String var = expresion;
        char cad[];
        cad = var.toCharArray();
    }
    
    
}
