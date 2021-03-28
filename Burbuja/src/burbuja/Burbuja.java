package burbuja;

public class Burbuja {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {6,5,4,3,2,1};
        int[] c = {6,3,2,4,5,1};
        int n = c.length;
        int t; 
        int cont =0;
        cont+=2;
        for(int i=0;i<(n-1);i++){
            cont+=6; 
            for(int j=i+1;j<n;j++){
                cont+=6;
                if(c[i]<c[j]){
                    cont+=7;
                    t=c[i];
                    c[i]=c[j];
                    c[j]=t;
                }
            }
        }
        System.out.println(c[0]);
        //OD -> Ordenado descendente
        //OA -> Ordenado Ascendete
        //A  -> Aleatoriamente
        int formulaOD = 2+6*(n-1)+6*((n*n-n)/2);
        int formulaOA = 2+6*(n-1)+13*((n*n-n)/2);
        int formulaA;
        System.out.println("Formula: "+formulaOD);
        System.out.println("Contador: "+cont);
    }
    
}
