package burbuja;

public class Burbuja {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {6,5,4,3,2,1};
        int[] c = {6,3,2,4,5,1};
        //6,5,2,3,4,1 = 2
        //6,5,4,2,3,1 = 2
        //6,5,4,3,2,1 = 1
        int n = c.length;
        int t; 
        int cont = 0, x =0;
        cont+=2;
        for(int i=0;i<(n-1);i++){
            cont+=6; 
            for(int j=i+1;j<n;j++){
                cont+=6;
                if(c[i]<c[j]){
                    x++;
                    cont+=7;
                    t=c[i];
                    c[i]=c[j];
                    c[j]=t;
                }
            }
        }
        //OD -> Ordenado descendente
        //OA -> Ordenado Ascendete
        //A  -> Aleatoriamente
        int formulaOD = 2+6*(n-1)+6*((n*n-n)/2);
        int formulaOA = 2+6*(n-1)+13*((n*n-n)/2);
        int formulaA = 2+(x*7)+6*(n-1)+(6)*((n*n-n)/2);
        System.out.println("Formula: "+formulaA);
        System.out.println("Contador: "+cont);
    }
    
}
