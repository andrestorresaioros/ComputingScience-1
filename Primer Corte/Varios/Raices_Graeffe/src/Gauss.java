public class Gauss { 

    public void pivote(double matriz[][], int piv, int var) {
        double temp = 0;
        temp = matriz[piv][piv];
        for (int y = 0; y < (var + 1); y++) {
            if (matriz[piv][piv]==0){
                cambiarFilas(piv, matriz);
                temp = matriz[piv][piv];
                matriz[piv][y] = matriz[piv][y] / temp;
            }
            else{
                matriz[piv][y] = matriz[piv][y] / temp;
            }
        }
    }
    public void cambiarFilas(int a, double matriz[][]){
        double array[]= matriz[a+1];
        matriz[a+1]=matriz[a];
        matriz[a]= array;
    }
    
    public void hacerceros(double matriz[][], int piv, int var) {
        for (int x = 0; x < var; x++) {
            if (x != piv) {
                double c = matriz[x][piv];
                for (int z = 0; z < (var + 1); z++) {
                    matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
                }
            }
        }
    }

    public double[] jordan(double matriz[][]){
        int piv=0;
        int var= matriz.length;
        double[] sal = new double[var];
        
        for (int a = 0; a < var; a++) {
            pivote(matriz, piv, var);
            hacerceros(matriz, piv, var);
            piv++;
        }
        
        for (int x = 0; x < var; x++) {
            sal[x]= matriz[x][var];	
        }  
        
        return sal;    
    }

}