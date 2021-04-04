package algoritmosordenamiento;

import Graficas.VentanaDescendente;

public class AlgoritmosOrdenamiento {
    
    static Ordenar orden = new Ordenar();
    
    public static void main(String[] args) {
        int[] a = {135,262,356,3,1};
        int[] b = {92,250,1000};
        int[] c = {500,250,140,34,21,1};
        orden.Radix(a);
        orden.Radix(b);
        orden.Radix(c);
        VentanaDescendente vd = new VentanaDescendente();
        vd.getClass();
    }
    
}
