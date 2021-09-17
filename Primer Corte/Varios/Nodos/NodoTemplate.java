
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NodoTemplate extends JFrame {
    private static final long serialVersionUID = 1L;
    //declaracion de objetos graficos
    private JPanel  pIzquierda;
    private JLabel lab, lab2, lab3;
    private JButton bCerrar;
    private JTextField tUsuario;

    //declaración de servicios
    private ObjG sObjGrafics;
    //declaración componente
    private NodoComponent nodoComponent;

    public NodoTemplate(NodoComponent nodoComponent) {
        sObjGrafics= ObjG.getService();
        this.nodoComponent= nodoComponent;
        //ventana
        setTitle("Nodo de usuario");
        setSize(1500, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        //setUndecorated(true);
        setLayout(null);
        setVisible(true);
        //funciones
        crearJPanels();
        crearJButton();
        crearJLabels();
        crearTextFields();
 
    }
    public void crearJPanels(){
        pIzquierda= sObjGrafics.construirPanel(1500, 750, 0,0, Color.blue);
        this.add(pIzquierda);
    }
    public void crearTextFields(){
        //usuario 
        tUsuario= sObjGrafics.construirJTextField("  Email o número de Teléfono", ((pIzquierda.getWidth()-300)/2)-20,
         130, 300, 50, 
        null, Color.darkGray, Color.gray, null, null, "l");
        tUsuario.addMouseListener(nodoComponent);
        pIzquierda.add(tUsuario);
    }
   

    public void crearJLabels(){
       //label 
        lab= sObjGrafics.construirJLabel("Programa Nodos", ((pIzquierda.getWidth())/2)-300,30, 400, 100,
        null, null, new Font("arial",Font.BOLD,30), null, Color.white, null, "c");
        pIzquierda.add(lab);

        //label2 
        lab2= sObjGrafics.construirJLabel("¿Primera vez en Netflix?", ((pIzquierda.getWidth()-150)/2)-100,410, 150, 100,
        null, null, null, null, Color.GRAY, null, "c");
        pIzquierda.add(lab2);

        //label3
        lab3= sObjGrafics.construirJLabel
        ("<HTML>Esta página está protegida por Google reCAPTCHA para comprobar que no eres un robot.<HTML>", 
        ((pIzquierda.getWidth()-300)/2)-20,500, 300, 35, null, null, null, null, Color.GRAY, null, "c");
        pIzquierda.add(lab3);

      

    }
    public void crearJButton(){
        //boton cerrar
        bCerrar= sObjGrafics.construirJButton("holi", 150,60,40, 40, 
        null, null, null,Color.black, Color.white, null, "", true);
        bCerrar.addActionListener(nodoComponent);
        bCerrar.addMouseListener(nodoComponent);
        pIzquierda.add(bCerrar);
    }

    public JButton getCerrar(){return bCerrar;}

}

