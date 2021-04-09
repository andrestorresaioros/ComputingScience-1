package algoritmosordenamiento;

import Graficas.VentanaDescendente;

public class AlgoritmosOrdenamiento {
    
    static Ordenar orden = new Ordenar();
    
    public static void main(String[] args) {
        double[][] m = {
            {3,5,2,1,1},
            {5,8,9,1,2},
            {1,0,7,1,3},
            {1,0,7,1,4},
            {1,0,7,1,4}
        };
        orden.Matriz(m);
//        int[] a = {135,262,356,3,1};
//        int[] b = {92,250,1000};
//        int[] c = {500,250,140,34,21,1};
//        orden.Radix(a);
//        orden.Radix(b);
//        orden.Radix(c);
        VentanaDescendente vd = new VentanaDescendente();
        vd.getClass();
    }
    
}
