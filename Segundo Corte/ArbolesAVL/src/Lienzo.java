import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Lienzo extends JPanel {
    private Arbol objArbol;
    public static final int DIAMETRO = 50;
    public static final int RADIO = DIAMETRO / 2;
    public static final int ANCHO = 50;

    public void setObjArbol(Arbol objArbol) {
        this.objArbol = objArbol;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        pintar(g, getWidth() / 2, 20, objArbol.getRaiz());
    }
    
    private void pintar(Graphics g, int x, int y, Nodo n) {
        
        if (n == null)
        {}
        else {
            int EXTRA = n.nodosCompletos(n) * (ANCHO / 2);
            g.drawOval(x, y, DIAMETRO, DIAMETRO);
           
            if(n.getBalance()==0){
                g.setColor(Color.black);
                g.drawString(n.getBalance()+"", x + 75, y + 28);
                g.setColor(Color.black);
            }
            else if(n.getBalance()==-1){
                g.setColor(Color.red);
                g.drawString(n.getBalance() +"", x +75, y +28);
                g.setColor(Color.black);
            }
            else if(n.getBalance()==1){
                g.setColor(Color.blue);
                g.drawString(n.getBalance()+"", x + 75, y + 28);
                g.setColor(Color.black);
            }
           // g.setColor(Color.black);
            g.drawString(n.getTelefono()+"", x + 15, y + 28);
            //g.drawString(n.getTelefono()+"       "+n.getBalance()+"", x + 15, y + 28);
            
            if (n.getIzquierda() != null)
                
                g.drawLine(x+RADIO, y+RADIO+25, x-ANCHO-EXTRA+RADIO+25, y+ANCHO+RADIO);
                
            if (n.getDerecha() != null)
                g.drawLine(x+RADIO, y+RADIO+25, x+ANCHO+EXTRA+RADIO-25, y+ANCHO+RADIO);
              //  g.setColor(Color.black);
            pintar(g,x-ANCHO-EXTRA,y+ANCHO,n.getIzquierda());
            pintar(g,x+ANCHO+EXTRA,y+ANCHO,n.getDerecha());
        }
    }
}