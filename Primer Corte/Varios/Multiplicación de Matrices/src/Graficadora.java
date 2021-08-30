import javax.swing.*;
import java.awt.*;

public class Graficadora {
    //Importante, plano debe ser publico y estatico
    public static plano plano;

    public void Dibujar() {

        //Creando la ventana y el plano de dibujo
        Ventana frame = new Ventana();
        frame.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
        frame.setBounds(550, 100, 410, 600);
        frame.setLayout(new BorderLayout());
        plano = new plano();

        //Configuración del Boton
        JButton start = new JButton("Iniciar");
        start.addActionListener(frame);
        start.setText("Iniciar");

        //Bordes al panel
        frame.add( plano, BorderLayout.CENTER);
        frame.add(start, BorderLayout.SOUTH);
        frame.setVisible( true );
    }
}