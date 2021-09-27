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

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;

public class Informacion extends JPanel {
	
	public Informacion( String texto) {
		setLayout(null);
		
		JTextPane txtInfo = new JTextPane();
		txtInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtInfo.setBounds(10, 11, 412, 266);
		txtInfo.setOpaque(false);
                txtInfo.setText(texto);
		add(txtInfo);

	}
}