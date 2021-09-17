import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;
    private Graficadora g;
    public Ventana() {
        g = new Graficadora();
        //g.Dibujar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource().equals(g.getBottom1())) {
           //Ordenado descendente
            Graficadora.plano.paintSQRFunc(Graficadora.plano.getGraphics(),0,3,3,-4,-200,200);
            Graficadora.plano.paintSQRFunc3(Graficadora.plano.getGraphics(),0.0002,0,0,0,-200,200);
            Graficadora.plano.paintSQRFunc2(Graficadora.plano.getGraphics(),0.002,0,0,0,-200,200);
    }
        if (e.getSource().equals(g.getBottom2())) {
            //Ordenado Ascendente
            Graficadora.plano.paintSQRFunc(Graficadora.plano.getGraphics(),0,13/2,-1/2,-4,-200,200);
            Graficadora.plano.paintSQRFunc3(Graficadora.plano.getGraphics(),0.0002,0,0,0,-200,200);
            Graficadora.plano.paintSQRFunc2(Graficadora.plano.getGraphics(),0.002,0,0,0,-200,200);
    }
        if (e.getSource().equals(g.getBottom3())) {
            //Aleatoriamente
            Graficadora.plano.paintSQRFunc(Graficadora.plano.getGraphics(),0,3,10,-4,-200,200);
            Graficadora.plano.paintSQRFunc3(Graficadora.plano.getGraphics(),0.0002,0,0,0,-200,200);
            Graficadora.plano.paintSQRFunc2(Graficadora.plano.getGraphics(),0.002,0,0,0,-200,200);
}
    }
}