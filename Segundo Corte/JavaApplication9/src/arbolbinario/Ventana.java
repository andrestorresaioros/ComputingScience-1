/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author lizet
 */
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ventana {

	ArrayList<Integer> valores = new ArrayList<Integer>();
        int x = 0;
        Nodo arbol;
        
        int pos;
        Graphics g;
	private JFrame frame;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtFecha;
	private JTextField txtPreorden;
	private JTextField txtInorden;
	private JTextField txtPosorden;
	private JTextField txtCod;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
            LocalDateTime fechHoy = LocalDateTime.now();
            
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo: ");
		lblCodigo.setBounds(21, 25, 96, 14);
		frame.getContentPane().add(lblCodigo);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(21, 55, 96, 14);
		frame.getContentPane().add(lblNombre);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(89, 22, 133, 20);
		frame.getContentPane().add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(89, 50, 133, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(89, 129, 133, 20);
		frame.getContentPane().add(txtFecha);
		txtFecha.setColumns(10);
		
		JLabel lblPreorden = new JLabel("Preorden: ");
		lblPreorden.setBounds(21, 185, 83, 14);
		frame.getContentPane().add(lblPreorden);
		
		JLabel lblInorden = new JLabel("Inorden: ");
		lblInorden.setBounds(21, 215, 83, 14);
		frame.getContentPane().add(lblInorden);
		
		JLabel lblPosorden = new JLabel("Posorden: ");
		lblPosorden.setBounds(21, 245, 83, 14);
		frame.getContentPane().add(lblPosorden);
		
		txtPreorden = new JTextField();
		txtPreorden.setBounds(89, 182, 283, 20);
		frame.getContentPane().add(txtPreorden);
		txtPreorden.setColumns(10);
		
		txtInorden = new JTextField();
		txtInorden.setBounds(89, 212, 283, 20);
		frame.getContentPane().add(txtInorden);
		txtInorden.setColumns(10);
		
		txtPosorden = new JTextField();
		txtPosorden.setBounds(89, 242, 283, 20);
		frame.getContentPane().add(txtPosorden);
		txtPosorden.setColumns(10);
		
		JLabel lblCod = new JLabel("Codigo: ");
		lblCod.setBounds(21, 107, 96, 14);
		frame.getContentPane().add(lblCod);
		
		JLabel lblFecha = new JLabel("Fecha: ");
		lblFecha.setBounds(21, 132, 96, 14);
		frame.getContentPane().add(lblFecha);
		
		txtCod = new JTextField();
		txtCod.setBounds(89, 104, 133, 20);
		frame.getContentPane().add(txtCod);
		txtCod.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent agregar) {
				try {
		            if (x < 19 && !valores.contains(Integer.parseInt(txtCodigo.getText()))) {
		                if (x == 0) {
		                    arbol = new Nodo(Integer.parseInt(txtCodigo.getText()),txtNombre.getText());

		                } else {
		                    arbol.agregar(Integer.parseInt(txtCodigo.getText()),txtNombre.getText());
		                }
		                valores.add(Integer.parseInt(txtCodigo.getText()));
		                x++;
		                txtCodigo.setText("");
                                txtNombre.setText("");
		                txtPreorden.setText(arbol.preorden());
		                txtInorden.setText(arbol.inorden());
		                txtPosorden.setText(arbol.posorden());
		            } else if (x == 19) {
		                JOptionPane.showMessageDialog(null, "Cantidad máxima de números alcanzada");
		            } else {
		                JOptionPane.showMessageDialog(null, "El código está repetido");
		            }

		        } catch (NullPointerException e) {
		            System.out.println(e);
		        }
			}
		});
		btnAgregar.setBounds(267, 10, 133, 23);
		frame.getContentPane().add(btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eliminar) {
				try {
		            if (valores.contains(Integer.parseInt(txtCodigo.getText()))) {
		              
		                pos = valores.indexOf(Integer.parseInt(txtCodigo.getText()));
		                valores.remove(pos);
		                arbol.borrar(Integer.parseInt(txtCodigo.getText()));
		                x--;
		                txtCodigo.setText("");
                                txtNombre.setText("");
		                txtPreorden.setText(arbol.preorden());
		                txtInorden.setText(arbol.inorden());
		                txtPosorden.setText(arbol.posorden());
		            }else{
		                JOptionPane.showMessageDialog(null, "El valor no se encuentra en el arbol");
		            }
		        } catch (NullPointerException e) {

		        }
			}
		});
		btnEliminar.setBounds(267, 40, 133, 23);
		frame.getContentPane().add(btnEliminar);
		
		JButton btnFecha = new JButton("Agregar Fecha");
		btnFecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent fecha) {
				SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
				Date fech = null;
                                
				try {
                                    if(txtFecha.getText().equals("")){
                                        JOptionPane.showMessageDialog(null, "Se agregará la fecha de hoy");
                                        Calendar fechActual = new GregorianCalendar();
                                        int año = fechActual.get(Calendar.YEAR);
                                        int mes = fechActual.get(Calendar.MONTH);
                                        int dia = fechActual.get(Calendar.DAY_OF_MONTH);
                                        String fAct = String.valueOf(año)+"/"+String.valueOf((mes+1))+"/"+String.valueOf(dia);
                                        System.out.println(fAct);
                                        fech = formato.parse(fAct);
                                    }else{
                                        fech = formato.parse(txtFecha.getText());
                                    }
					if(arbol.vacuna1(Integer.parseInt(txtCod.getText()), fech)){
                                            JOptionPane.showMessageDialog(null, "Fecha registrada");
                                            txtFecha.setText("");
                                        }else{
                                            if(arbol.vacuna2(Integer.parseInt(txtCod.getText()), fech)){
                                                JOptionPane.showMessageDialog(null, "Fecha registrada");
                                                txtFecha.setText("");
                                            }else{
                                                JOptionPane.showMessageDialog(null, "Fecha no gegistrada");
                                            }
                                        }
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
			}
		});
		btnFecha.setBounds(267, 122, 133, 23);
		frame.getContentPane().add(btnFecha);
		
		JButton btnDibujar = new JButton("Dibujar Arbol");
		btnDibujar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent dibujar) {
                            
                            Lienzo objLienzo = new Lienzo();
                            Controlador objControlador = new Controlador(objLienzo, arbol);
                            objControlador.iniciar();
                            JFrame ventana = new JFrame();
                            ventana.getContentPane().add(objLienzo);
                            ventana.setSize(600, 600);
                            ventana.setVisible(true);
			}
		});
		btnDibujar.setBounds(133, 285, 150, 23);
		frame.getContentPane().add(btnDibujar);
                
                JButton btnInformacion = new JButton("Informacion");
		btnInformacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent info) {
                            
                            Informacion ini = new Informacion(arbol.infoPaciente(Integer.parseInt(txtCodigo.getText())));
                            JFrame ven = new JFrame("");
                            ven.add(ini);
                            ven.setLocation(100, 150);
                            ven.setSize(450, 150);
                            ven.setVisible(true);
			}
		});
		btnInformacion.setBounds(267, 70, 133, 23);
		frame.getContentPane().add(btnInformacion);
	}
}