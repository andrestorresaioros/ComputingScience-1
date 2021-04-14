package algoritmosordenamiento;

import Graficas.VentanaDescendente;
import javax.swing.JOptionPane;

public class AlgoritmosOrdenamiento {
    
    static Ordenar orden = new Ordenar();
    
    public static void main(String[] args) {
       int tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz cuadrada"));
       double[][] m = new double[tam][tam];
       orden.InsertarMatriz(m);
       orden.Matriz(m);
       //VentanaDescendente vd = new VentanaDescendente();
       //vd.getClass();
    }
    
}
