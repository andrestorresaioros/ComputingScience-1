import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Color;


public class NodoComponent extends MouseAdapter implements ActionListener{
    private NodoTemplate nodoTemplate;
    public NodoComponent(){
        nodoTemplate= new NodoTemplate(this);
    }
    public NodoTemplate getnodoTemplate(){
        return nodoTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    public void enviarDatosUsuario() {
       
        
    }
    public void entrar(){
       
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
      
        }
    public void restaurarValores(){
    }

    
    

    
}
