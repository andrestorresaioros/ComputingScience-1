/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

/**
 *
 * @author 57320
 */
public class Ventana {
    private JFrame frame;
    int num, i,numeros[],a,b;    
    String operaciones[];
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana window = new Ventana();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    private Ventana(){
        datos();
        
        frame = new JFrame();
        frame.setBounds(100, 100, 292, 270);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        
        JLabel lblRaiz = new JLabel("Raiz: ");
        lblRaiz.setBounds(24, 30, 159, 14);
        frame.getContentPane().add(lblRaiz);
        
        JLabel lblIntervalo = new JLabel("Intervalo: ["+a+" , "+b+"]");
        lblIntervalo.setBounds(24, 50, 159, 14);
        frame.getContentPane().add(lblIntervalo);
        
        JTextPane txtPolinomio = new JTextPane();
        txtPolinomio.setOpaque(false);
        txtPolinomio.setBounds(185, 50, 64, 20);
        frame.getContentPane().add(txtPolinomio);

        JTextPane txtRaiz = new JTextPane();
        txtRaiz.setOpaque(false);
        txtRaiz.setBounds(185, 30, 64, 20);
        frame.getContentPane().add(txtRaiz);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener((ActionEvent e) -> {
            Calculo cal = new Calculo(num,numeros,operaciones,a,b);
            cal.raiz();
            if(cal.isCalcular()){
                txtPolinomio.setText(String.valueOf(cal.m));
            }else{
                txtPolinomio.setText("No hay raiz en el intervalo");
            }
            });
        btnCalcular.setBounds(72, 100, 125, 44);
        frame.getContentPane().add(btnCalcular);
    }
        
        private void datos(){
        
        num = Integer.parseInt(JOptionPane.showInputDialog("¿De qué grado es tu polinómio?"));
        operaciones = new String[(num)];
        numeros = new int[(num+1)];
        for(i = 0; i < (num+1); i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número x^"+(num-i)));
            if( i != num){
                operaciones[i] = JOptionPane.showInputDialog("Ingresa una suma o resta.");
            }
            
        }
        a = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el extremo izquierdo del intervalo?"));
        b = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el extremo derecho del intervalo?"));
    }
    
}
