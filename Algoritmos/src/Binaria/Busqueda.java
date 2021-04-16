package Binaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Busqueda {

	int centro = 0, total, buscar, numeros[], limI = 0, limS;
	boolean existe = false;
		
	public Busqueda(int total, int buscar) {
		this.total = total;
		this.buscar = buscar;
		limS = total-1;
	}
	
	public String llenar() {
		String text = "";
		
		int numeros[] = new int[total];
		
		for(int i=0; i<total; i++) {
			numeros[i] = (int) (Math.random()*50);
		}
		
		Arrays.sort(numeros);
		
		for(int i=0; i<total-1; i++) {
			text = text + numeros[i] + ", ";
		}
		text = text + numeros[total-1] + ".";
		
		existe = busqueda(numeros, 0, numeros.length-1);
		return text;
	}
		
	public boolean busqueda(int arreglo[],int limI, int limS) {
		if (limI > limS) {
			return false;
		} else {
			centro = (int) ((limI + limS) / 2);
			if (buscar == arreglo[centro]) {
				return true;
			} else {
				if (buscar < arreglo[centro]) {
					return busqueda(arreglo, limI, centro - 1);
				} else {
					return busqueda(arreglo, centro + 1, limS);
				}
			}
		}
	}
        
        public int getCentro(){
            return centro;
        }

	public boolean isExiste() {
		return existe;
	}

	public void setExiste(boolean existe) {
		this.existe = existe;
	}
}
