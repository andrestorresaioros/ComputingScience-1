package algoritmosordenamiento;

public class Ordenar {
 
    public void Burbuja(int[] arreglo,String tipo){
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
        MostrarArreglo(arreglo);
    }
    
    public void Seleccion(int a[]){
        System.out.println("Ordenamiento por Seleccion");
        for(int i=0;i<a.length-1;i++){
            int min = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        MostrarArreglo(a);     
    }
    
    public void Insercion(int a[]){
        System.out.println("Ordenamiento por Insercion");
        for(int i=1;i<a.length;i++){
            int x = a[i];
            int k = i-1;
            while(k>=0 && x<a[k]){
                a[k+1] = a[k];
                k--;
            }
            a[k+1]=x; 
        }
        MostrarArreglo(a);
    }
    
    public void Radix(int a[]){
        System.out.println("Ordenamiento por Radix");
        for(int x=Integer.SIZE-1;x>=0;x--){                                     //Repetir la cantidad de dígitos maximos q soporta un int
            int aux[] = new int[a.length];                                      //Arreglo auxiliar
            int j=0;
            for(int i=0;i<a.length;i++){                                        //Recorer arreglo original
                boolean mover = a[i] << x>=0;                                   //35 << 1
                if(x==0 ? !mover:mover){
                    aux[j] = a[i];
                    j++;
                }else{
                    a[i-j]=a[i];
                }
            }
            for(int i=j;i<aux.length;i++){
                aux[i]=a[i-j];
            }
            a=aux;
        }
        MostrarArreglo(a);
    }
    
    public void MostrarArreglo(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
