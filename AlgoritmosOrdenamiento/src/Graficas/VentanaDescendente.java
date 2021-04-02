package Graficas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaDescendente implements ActionListener{
    private Graficadora g;
    public VentanaDescendente(){
        g= new Graficadora(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(g.getB1())){
            Graficadora.plano.paintSQRFunc(Graficadora.plano.getGraphics(),0.02,0,0,0,-200,200);
            Graficadora.plano.paintSQRFunc3(Graficadora.plano.getGraphics(),0.0003,0,0,0,-200,200);
            Graficadora.plano.paintSQRFunc2(Graficadora.plano.getGraphics(),0.002,0,0,0,-200,200);  
        }
        if(e.getSource().equals(g.getB4())){
            g.repaint();
        }
    }
}
