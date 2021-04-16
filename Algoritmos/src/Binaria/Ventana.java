package Binaria;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Font;

public class Ventana {
    private JFrame frame;
    int num, i,numeros[],a,b;    
    String operaciones[];
    private JTextField txtCantidad;
    private JTextField txtBuscar;
    private JTextPane textPane;
    private JTextPane txtResultado;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ventana window = new Ventana();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    private Ventana(){
   
        frame = new JFrame();
        frame.setBounds(100, 100, 355, 351);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblCantidad = new JLabel("Cantidad de números del arreglo: ");
        lblCantidad.setBounds(20, 29, 224, 14);
        frame.getContentPane().add(lblCantidad);
        
        txtCantidad = new JTextField();
        txtCantidad.setBounds(222, 26, 86, 20);
        frame.getContentPane().add(txtCantidad);
        txtCantidad.setColumns(10);
        
        //JLabel lblBuscar = new JLabel("N\u00FAmero a buscar (0 - 50): ");
        JLabel lblBuscar = new JLabel("Número a buscar entre 0 y 50: ");
        lblBuscar.setBounds(20, 69, 224, 14);
        frame.getContentPane().add(lblBuscar);
        
        //JLabel lista
        JLabel lbl = new JLabel("la lista creada es: ");
        lbl.setBounds(20, 140, 224, 14);
        frame.getContentPane().add(lbl);
        
        txtBuscar = new JTextField();
        txtBuscar.setBounds(192, 66, 86, 20);
        frame.getContentPane().add(txtBuscar);
        txtBuscar.setColumns(10);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 160, 295, 77);
        frame.getContentPane().add(scrollPane);
        
        textPane = new JTextPane();
        scrollPane.setViewportView(textPane);
        textPane.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 15));
         
         txtResultado = new JTextPane();
         txtResultado.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 20));
         txtResultado.setForeground(Color.red);
         txtResultado.setBounds(20, 100, 288, 32);
         txtResultado.setOpaque(false);
         frame.getContentPane().add(txtResultado);
         
         JButton btnCalcular = new JButton("Buscar");
         btnCalcular.addActionListener(new ActionListener() {
         	
			public void actionPerformed(ActionEvent e) {
				Busqueda ob = new Busqueda(Integer.parseInt(txtCantidad.getText()), Integer.parseInt(txtBuscar.getText()));
				textPane.setText(ob.llenar());
				if(ob.isExiste()) {
					txtResultado.setText("El numero se encuentra en el arreglo");
				}else {
					txtResultado.setText("El numero no fue encontrado");
				}
				
			}
         });
         
          btnCalcular.setBounds(104, 250, 125, 44);
          btnCalcular.setBackground(Color.red);
          frame.getContentPane().add(btnCalcular);
    }
}

