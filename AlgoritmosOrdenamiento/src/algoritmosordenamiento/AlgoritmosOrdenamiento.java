package algoritmosordenamiento;

import Graficas.VentanaDescendente;
import javax.swing.JOptionPane;

public class AlgoritmosOrdenamiento {
    
    static Ordenar orden = new Ordenar();
    
    public static void main(String[] args) {
       //JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
       double[][] m = new double[4][4];
       orden.InsertarMatriz(m);
       orden.Matriz(m);
       VentanaDescendente vd = new VentanaDescendente();
       vd.getClass();
    }
    
}
