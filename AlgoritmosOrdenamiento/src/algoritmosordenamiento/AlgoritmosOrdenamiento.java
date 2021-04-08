package algoritmosordenamiento;

import Graficas.VentanaDescendente;

public class AlgoritmosOrdenamiento {
    
    static Ordenar orden = new Ordenar();
    
    public static void main(String[] args) {
        int n=2, h=0, c=0;
        c++;
        for(int i=0;i<n;i++){
            c+=4;
            for(int j=i;j<n;i++){
                c+=3;
                h++;
            }
        }
        c++;
        System.out.println(c);
//        int[] a = {135,262,356,3,1};
//        int[] b = {92,250,1000};
//        int[] c = {500,250,140,34,21,1};
//        orden.Radix(a);
//        orden.Radix(b);
//        orden.Radix(c);
//        VentanaDescendente vd = new VentanaDescendente();
//        vd.getClass();
    }
    
}
