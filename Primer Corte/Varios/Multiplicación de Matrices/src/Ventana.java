import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;

    @Override
    public void actionPerformed(ActionEvent e) {
       Graficadora.plano.paintSQRFunc2(Graficadora.plano.getGraphics(),11,5,4,20,-50,50);
       Graficadora.plano.paintSQRFunc(Graficadora.plano.getGraphics(),1,0,0,0,-50,50);
       Graficadora.plano.paintSQRFunc3(Graficadora.plano.getGraphics(),30,0,0,0,-50,50);
    }
}