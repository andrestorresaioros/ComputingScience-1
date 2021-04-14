package algoritmos;

import javax.swing.JOptionPane;

public class Algoritmos {
    
    static int ac=0;
    
    public void Euclides(){
        String datosa = JOptionPane.showInputDialog("Ingrese el primer numero: ");
        String datosb = JOptionPane.showInputDialog("Ingrese el segundo numero: ");
        JOptionPane.showMessageDialog(
                null,"el mcd entre esos dos numeros es: "+obtener_mcd(Integer.parseInt(datosa),(Integer.parseInt(datosb))));
        JOptionPane.showMessageDialog(
                    null,"el numero de veces que se ejecutan las operaciones es: "+ac);
    }
            
    private int obtener_mcd(int a, int b) {
       if(b==0){
        return a;
       }else{
            ac++;
            return obtener_mcd(b, a % b);
       }
   }
    
    public void BusquedaRaiz(){
    
    }
    
    public void BusquedaBinaria(){
    
    }
    
}
