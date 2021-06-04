package problema_mochila;

import java.util.ArrayList;

public class Mochila {
    
    public int[][] matriz;
    public int[][] peso;  
    
    public int Encontrar(){
        for(int i=1;i<matriz.length;i++){
            for(int j=1;j<matriz[1].length;j++){
                if(j>=peso[i-1][0]){
                    if(matriz[i-1][j]<peso[i-1][1]+matriz[i-1][j-peso[i-1][0]]){
                        matriz[i][j]=peso[i-1][1]+matriz[i-1][j-peso[i-1][0]];
                    }else{
                        matriz[i][j]=matriz[i-1][j];
                    }
                }else{
                    matriz[i][j]=matriz[i-1][j];
                }
            }
        }
        return matriz[matriz.length-1][matriz[1].length-1];    
    }
    
    public void Organizar(){
        int n = peso.length;
        int t[];
        for(int i=0;i<(n-1);i++){
            for(int j=0;j<(n-i-1);j++){
                if(peso[i+1][0]<peso[j][0]){
                    t=peso[i+1];
                    peso[i+1]=peso[j];
                    peso[j]=t;
                }
            }
        }
    }
    
    public ArrayList<Integer> PesosSolucion(){
        ArrayList<Integer> solucion = new ArrayList<Integer>();
        int j = (matriz[1].length)-1;
        for(int i=(matriz.length-1);i>0;i--){
            if(matriz[i][j]==this.matriz[i-1][j]){
                continue;
            }else{
                solucion.add(peso[i-1][2]);
                j -= peso[i-1][0];
            }
        }
        return solucion;
    }
    
    public int SumarPesos(){
        int sol = 0;
        int j = (matriz[1].length)-1;
        for(int i=(matriz.length-1);i>0;i--){
            if(matriz[i][j]==this.matriz[i-1][j]){
                continue;
            }else{
                sol+=peso[i-1][0];
                j -= peso[i-1][0];
            }
        }
        return sol;
    }
    
    public void MostrarMatriz(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[1].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
