/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author 57320
 */
public class Calculo {

    double m = 0, n = 0.001, a, b;
    private boolean calcular = true;

    public boolean isCalcular() {
        return calcular;
    }

    public void setCalcular(boolean calcular) {
        this.calcular = calcular;
    }
    int numeros[], num;
    String operaciones[];

    public Calculo(int num, int[] numeros, String[] operaciones, double a, double b) {
        this.num = num;
        this.numeros = new int[num];
        this.numeros = numeros;
        this.operaciones = new String[num];
        this.operaciones = operaciones;
        this.a = a;
        this.b = b;
        
    }

    public void raiz() {
        Funcion f = new Funcion(num, numeros, operaciones);
        if (f.calcular(a) * f.calcular(b) > 0) {
            calcular = false;
            System.out.println("No hay");
        } else {
            m = ((a + b) / 2);
            while (Math.abs(f.calcular(m)) >= n) {
                if (f.calcular(a) * f.calcular(m) < 0) {
                    b = m;
                    m = ((a + b) / 2);
                } else {
                    a = m;
                    m = ((a + b) / 2);
                }
            }
        }

    }

}
