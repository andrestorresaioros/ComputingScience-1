package Graficas;

import javax.swing.*;
import java.awt.*;

public class Graficadora extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    //Importante, plano debe ser publico y estatico
    public static Plano plano;
    private JButton start1,start2,start3,start4;
    private VentanaDescendente ventanaD;
   // private VentanaAscendente ventanaAs;
    //private VentanaAleatoria ventanaAl;
   // private VentanaDescendente ventana;
    public Graficadora(VentanaDescendente ventanaD) {
        setLayout(new BorderLayout());
        this.ventanaD =ventanaD;
        //ventana
        setTitle("login de usuario");
        setSize(1500, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);        
        plano = new Plano();
        this.add(plano);
        //funciones
        crearJButton();
        setVisible(true);
    }
        public void crearJButton() {
            //Configuración del Boton Graficar
            start1 = new JButton("Graficar");
            start1.addActionListener(ventanaD);
            start1.setText("Graficar");
            start1.setLayout(null);
            start1.setLocation(0, 25);
            start1.setSize(400, 25);
            plano.add(start1);

            //Configuración del Boton Limpiar
            start4 = new JButton("limpiar");
            start4.addActionListener(ventanaD);
            start4.setText("limpiar");
            start4.setLocation(0, 55);
            start4.setSize(400, 25);
            plano.add(start4);
    }
    public JButton getB1(){return start1;}
    public JButton getB4(){return start4;}
}

