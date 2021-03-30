import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;

public class Graficadora {
    //Importante, plano debe ser publico y estatico
    public static plano plano;
    private JButton start1,start2,start3;

    public void Dibujar() {
        //Creando la ventana y el plano de dibujo
        Ventana frame = new Ventana();
        frame.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
        frame.setBounds(550, 100, 410, 600);
        frame.setLayout(new BorderLayout());
        plano = new plano();

        //Configuración del Boton Iniciar
        JButton start = new JButton("Iniciar");
        start.addActionListener(frame);
        start.setText("Iniciar");

        //Configuración del Boton Ordenado descendente
        start1 = new JButton("Ordenado descendente");
        start1.addActionListener(frame);
        start1.setText("Ordenado Descendente");
        start1.setLayout(null);
        start1.setLocation(0, 25);
        start1.setSize(400, 30);
        start1.setContentAreaFilled(true);
        
        //Configuración del Boton Ordenado Ascendente
        start2 = new JButton("Ordenado Ascendente");
        start2.addActionListener(frame);
        start2.setText("Ordenado Ascendente");
        start2.setLocation(0, 0);
        start2.setSize(400, 30);
       // start2.setContentAreaFilled(true);

        //Configuración del Boton Aleatoriamente
        start3 = new JButton("Aleatoriamente");
        start3.addActionListener(frame);
        start3.setText("Aleatoriamente");
        

        //Bordes al panel
        frame.add( plano, BorderLayout.CENTER);
       // frame.add(start, BorderLayout.SOUTH);
        frame.add(start1,BorderLayout.NORTH);
        frame.add(start2,BorderLayout.NORTH);
        frame.add(start3,BorderLayout.SOUTH);
        frame.setVisible( true );
        
    }
        public JButton getBottom1(){return start1;}
        public JButton getBottom2(){return start2;}
        public JButton getBottom3(){return start3;}
}