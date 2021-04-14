public class Burbuja {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {6,5,4,3,2,1};
        int[] c = {6,3,2,4,5,1}; 
        Burbuja(a,"Ascendete");
        Burbuja(b,"Descendete");
        Burbuja(c,"Aleatorio");
        VentanaDescendente v = new VentanaDescendente();
        v.getClass();
    }

    public static void Burbuja(int[] arreglo,String tipo){
        int n = arreglo.length;
        int t; 
        int cont = 0, x =0;
        cont+=2;
        for(int i=0;i<(n-1);i++){
            cont+=6; 
            for(int j=i+1;j<n;j++){
                cont+=6;
                if(arreglo[i]<arreglo[j]){
                    x++;
                    cont+=7;
                    t=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=t;
                }
            }
        }
        int formula=0;
        switch(tipo){
            case "Descendete":
                System.out.println(tipo+"\n");
                formula = 2+6*(n-1)+6*((n*n-n)/2);
                break;
            case "Ascendete":
                System.out.println(tipo+"\n");
                formula = 2+6*(n-1)+13*((n*n-n)/2);
                break;
            case "Aleatorio":
                System.out.println(tipo+"\n");
                formula = 2+(x*7)+6*(n-1)+(6)*((n*n-n)/2);
                break;
        }
        System.out.println("Contador: "+cont);
        System.out.println("Formula: "+formula+"\n");
    }

}
