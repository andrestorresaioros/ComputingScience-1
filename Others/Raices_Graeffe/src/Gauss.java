public class Gauss { 

    private void pivote(double matriz[][], int piv, int var) {
        double temp = 0;
        temp = matriz[piv][piv];
        for (int y = 0; y < (var + 1); y++) {

            matriz[piv][y] = matriz[piv][y] / temp;
        }
    }
    
    private void hacerceros(double matriz[][], int piv, int var) {
        for (int x = 0; x < var; x++) {
            if (x != piv) {
                double c = matriz[x][piv];
                for (int z = 0; z < (var + 1); z++) {
                    matriz[x][z] = ((-1 * c) * matriz[piv][z]) + matriz[x][z];
                }
            }
        }
    }
    
    public double[] jordan(double[][] matrix){
        int piv=0;
        int var=matrix.length;
        double[] sal = new double[var];
        
        for (int a = 0; a < var; a++) {
            pivote(matrix, piv, var);
            hacerceros(matrix, piv, var);
            piv++;
        }

        for (int x = 0; x < var; x++) {
            sal[x]= matrix[x][var];	
        }        
        
        return sal;
    }

}
