import java.awt.Graphics;
import javax.swing.JPanel;

public class Lienzo extends JPanel {
    private Arbol objArbol;
    public static final int DIAMETRO = 30;
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
            g.drawString(n.getTelefono()+"", x + 12, y + 18);
            if (n.getIzquierda() != null)
                g.drawLine(x+RADIO, y+RADIO+15, x-ANCHO-EXTRA+RADIO+15, y+ANCHO+RADIO);
            if (n.getDerecha() != null)
                g.drawLine(x+RADIO, y+RADIO+15, x+ANCHO+EXTRA+RADIO-15, y+ANCHO+RADIO);
            pintar(g,x-ANCHO-EXTRA,y+ANCHO,n.getIzquierda());
            pintar(g,x+ANCHO+EXTRA,y+ANCHO,n.getDerecha());
        }
    }
}