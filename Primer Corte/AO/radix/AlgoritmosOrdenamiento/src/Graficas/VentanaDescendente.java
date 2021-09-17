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
        //8x^2+64x+2
        if(e.getSource().equals(g.getB1())){
            Graficadora.plano.paintSQRFunc(Graficadora.plano.getGraphics(),0,0,0.5,2,-900,900);
            Graficadora.plano.paintSQRFunc2(Graficadora.plano.getGraphics(),0,0,0.254,1,-900,900);
            Graficadora.plano.paintSQRFunc3(Graficadora.plano.getGraphics(),0,0,0.2,0,-900,900);  
        }
        if(e.getSource().equals(g.getB4())){
            g.repaint();
        }
    }
}
