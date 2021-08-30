//
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;


class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
       //m,n x n,p = m,p
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[n][p];
        LlenarMatriz(a,"1");
        LlenarMatriz(b,"2");
        int[][] result = MultiplicarMatriz(a,b);
        int formula = ((11*m*p*n)+(5*p*m)+(4*m)+(2));
        System.out.println("Formula: "+formula);
        MostrarMatriz(result);
        Graficadora g = new Graficadora();
        g.Dibujar();
    }

    public static int[][] LlenarMatriz(int[][] x, String nombre){
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[0].length;j++){
                System.out.println("Inserte el valor de la posición "+i+" "+j+" de la matriz "+nombre);
                x[i][j]= sc.nextInt();
            }
        }
        return x;
    }
    
    public static void MostrarMatriz(int[][] x){
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[0].length;j++){
                System.out.print(x[i][j]+"  ");
            }
            System.out.println("");
        }
    }

    public static int[][] MultiplicarMatriz(int[][] a, int[][] b){
        int cont =0;
        int[][] result = new int[a.length][b[0].length];
        cont+=2;
        for(int i=0;i<a.length;i++){
            cont+=4;
            for(int j=0;j<b[0].length;j++){
                cont+=5;
                for(int k=0;k<b.length;k++){
                    cont+=11;
                    result[i][j]+=a[i][k]*b[k][j];
                }
                
            }
            
        }
        System.out.println("Contador: "+cont);
        return result;
    
    }
}