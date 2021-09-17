import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
public class plano extends JPanel{
    private static final long serialVersionUID = 1L;
    public plano() {
        init();
    }

    public void init() {
        this.setBorder(BorderFactory.createLineBorder(Color.black));
    }

    @Override 
     public void paintComponent( Graphics g ) {
                    super.paintComponent(g);
                    g.setColor(Color.red);
                    g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
                    g.drawLine(this.getWidth()/2, 0,this.getWidth()/2 , this.getHeight());
                 }

    // y=c*x2 +c*x +c

     public void paintSQRFunc(Graphics g, double x3mult, double x2mult,double x1mult,double cons, double x1,double x2){
         for(double i=x1;i<x2;i++){
             double y = ((double)Math.pow(i,3)*x3mult)+((double)Math.pow(i,2)*x2mult)+i*x1mult+cons;
             double xp = i+1;
             double yp = ((double)Math.pow(xp,3)*x3mult)+((double)Math.pow(xp,2)*x2mult)+xp*x1mult+cons;
             g.drawLine((int)coord_x(i), (int)coord_y(y), (int)coord_x(xp), (int)coord_y(yp));
             g.setColor(Color.blue);
         }
     }

     public void paintSQRFunc2(Graphics g, double x3mult, double x2mult,double x1mult,double cons, double x1,double x2){
        for(double i=x1;i<x2;i++){
            double y = ((double)Math.pow(i,3)*x3mult)+((double)Math.pow(i,2)*x2mult)+i*x1mult+cons;
            double xp = i+1;
            double yp = ((double)Math.pow(xp,3)*x3mult)+((double)Math.pow(xp,2)*x2mult)+xp*x1mult+cons;
            g.drawLine((int)coord_x(i), (int)coord_y(y), (int)coord_x(xp), (int)coord_y(yp));
            g.setColor(Color.black);
        }
    }

    public void paintSQRFunc3(Graphics g, double x3mult ,double x2mult,double x1mult,double cons, double x1,double x2){
        for(double i=x1;i<x2;i++){
            double y = ((double)Math.pow(i,3)*x3mult)+((double)Math.pow(i,2)*x2mult)+i*x1mult+cons;
            double xp = i+1;
            double yp = ((double)Math.pow(xp,3)*x3mult)+((double)Math.pow(xp,2)*x2mult)+xp*x1mult+cons;
            g.drawLine((int)coord_x(i), (int)coord_y(y), (int)coord_x(xp), (int)coord_y(yp));
            g.setColor(Color.green);
        }
    }


     private double coord_x(double x){
         double real_x = x+this.getWidth()/2;
        return real_x;
     }

     private double coord_y(double y){
          double real_y = -y+this.getHeight()/2;
          return (real_y);
     }
}
