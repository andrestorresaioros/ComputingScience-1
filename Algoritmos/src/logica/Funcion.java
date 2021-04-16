/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author 57320
 */
public class Funcion{
    int num,x,i;
    int numeros[];
    String operaciones[];
    
    Funcion(int num,int numeros[], String operaciones []){
        this.num = num;
        this.numeros = new int[num];
        this.numeros = numeros;
        this.operaciones = new String[num];
        this.operaciones = operaciones;
        
    }
    
    double calcular(double x){
        double com = 0;
        com = numeros[0]*Math.pow(x,num);//2
        
        for(i = 1; i <= num; i++){
          
            if(operaciones[i-1].equals("+")){
                
                com = com + numeros[i]*Math.pow(x, num-i);
                
            }else{
                
                com = com - numeros[i]*Math.pow(x, num-i);
                
            }
            
        }
        
        return com;
    }
    
    
}
