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
            //Configuración del Boton Ordenado descendente
            start1 = new JButton("Ordenado descendente");
            start1.addActionListener(ventanaD);
            start1.setText("Ordenado Descendente");
            start1.setLayout(null);
            start1.setLocation(0, 25);
            start1.setSize(400, 25);
            plano.add(start1);

            
            //Configuración del Boton Ordenado Ascendente
            start2 = new JButton("Ordenado Ascendente");
            start2.addActionListener(ventanaD);
            start2.setText("Ordenado Ascendente");
            start2.setLocation(0, 60);
            start2.setSize(400, 25);
            plano.add(start2);


            //Configuración del Boton Aleatoriamente
            start3 = new JButton("Aleatoriamente");
            start3.addActionListener(ventanaD);
            start3.setText("Aleatoriamente");
            start3.setLocation(0, 95);
            start3.setSize(400, 25);
            plano.add(start3);

            //Configuración del Boton Aleatoriamente
            start4 = new JButton("limpiar");
            start4.addActionListener(ventanaD);
            start4.setText("limpiar");
            start4.setLocation(0, 130);
            start4.setSize(400, 25);
            plano.add(start4);
    }
    public JButton getB1(){return start1;}
    public JButton getB2(){return start2;}
    public JButton getB3(){return start3;}
    public JButton getB4(){return start4;}
}

