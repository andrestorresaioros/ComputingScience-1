package algoritmosordenamiento;

import Graficas.VentanaDescendente;

public class AlgoritmosOrdenamiento {
    
    static Ordenar orden = new Ordenar();
    
    public static void main(String[] args) {
        int[] a = {35,62,56,3,16};
        System.out.println("Arreglo Original:");
        orden.MostrarArreglo(a);
        orden.Radix(a);
        //VentanaDescendente vd = new VentanaDescendente();
        //vd.getClass();
    }
    
}
