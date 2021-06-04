package problema_mochila;

import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Matriz extends javax.swing.JFrame {
    
    Mochila m = new Mochila();
    
    public Matriz() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkbox1 = new java.awt.Checkbox();
        jScrollPane1 = new javax.swing.JScrollPane();
        matrizResultado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        articulos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pesoMochila = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EncontrarResultado = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cantidadArticulos = new javax.swing.JTextField();
        IngresarArticulos = new javax.swing.JButton();
        SolucionEscritaPeso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SolucionEscritaValor = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        Habilitar = new javax.swing.JButton();

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        matrizResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(matrizResultado);

        articulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Peso", "Costo", "Artículo"
            }
        ));
        articulos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(articulos);

        jLabel1.setText("Matríz Resultante");

        jLabel2.setText("Ingrese el peso máximo de la mochila:");

        pesoMochila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoMochilaActionPerformed(evt);
            }
        });

        jLabel3.setText("Artículos");

        EncontrarResultado.setText("Encontrar Resultado");
        EncontrarResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncontrarResultadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese la cantidad de artículos:");

        cantidadArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadArticulosActionPerformed(evt);
            }
        });

        IngresarArticulos.setText("Ingresar Artículos");
        IngresarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarArticulosActionPerformed(evt);
            }
        });

        jLabel5.setText("Solución escrita");

        t8.setEditable(false);
        t8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t8.setOpaque(false);

        t3.setEditable(false);
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t3.setOpaque(false);

        t9.setEditable(false);
        t9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t9.setOpaque(false);

        t4.setEditable(false);
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t4.setOpaque(false);

        t10.setEditable(false);
        t10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t10.setOpaque(false);
        t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t10ActionPerformed(evt);
            }
        });

        t5.setEditable(false);
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t5.setOpaque(false);

        t6.setEditable(false);
        t6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t6.setOpaque(false);

        t1.setEditable(false);
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t1.setOpaque(false);

        t7.setEditable(false);
        t7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t7.setOpaque(false);

        t2.setEditable(false);
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t2.setOpaque(false);

        Habilitar.setText("Habilitar Campos");
        Habilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HabilitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cantidadArticulos))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pesoMochila, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Habilitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IngresarArticulos)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(209, 209, 209))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SolucionEscritaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SolucionEscritaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(EncontrarResultado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pesoMochila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cantidadArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IngresarArticulos)
                            .addComponent(Habilitar))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SolucionEscritaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SolucionEscritaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EncontrarResultado)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesoMochilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoMochilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoMochilaActionPerformed

    private void EncontrarResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncontrarResultadoActionPerformed
        m.matriz = new int[Integer.parseInt(cantidadArticulos.getText())+1][Integer.parseInt(pesoMochila.getText())+1];
        int valor = m.Encontrar();
        String arrayCaracteres[];
        arrayCaracteres = new String[Integer.parseInt(pesoMochila.getText())];
        for(int o=0; o<Integer.parseInt(pesoMochila.getText());o++){
            arrayCaracteres[o]=""+(o+1);
        }
        MostrarMatriz(m.matriz,arrayCaracteres);
        ArrayList<Integer> pesos = m.PesosSolucion();
        String respuestaValor = "El valor optimo para una mochila de capacidad "+(m.matriz[0].length-1)+" es: "+valor+".";
        String respuestaPeso = "Usando los artículos: ";
        for(int i=0;i<pesos.size();i++){
            if(i==(pesos.size()-1)){
                respuestaPeso+=pesos.get(i)+". ";
            }else{
                respuestaPeso+=pesos.get(i)+", ";
            }
        }
        respuestaPeso+="Sumando los pesos: "+m.SumarPesos();
        SolucionEscritaValor.setText(respuestaValor);
        SolucionEscritaPeso.setText(respuestaPeso);
    }//GEN-LAST:event_EncontrarResultadoActionPerformed

    private void cantidadArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadArticulosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadArticulosActionPerformed

    private void IngresarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarArticulosActionPerformed
        int articulos = Integer.parseInt(cantidadArticulos.getText());
        setPeso(articulos);
        m.Organizar();
        MostrarArticulos(m.peso);
    }//GEN-LAST:event_IngresarArticulosActionPerformed

    public void setPeso(int articulos){
        m.peso = new int[articulos][3];
        for(int i=1;i<(m.peso.length+1);i++){
            m.peso[i-1][2]=i;
        }
        switch(articulos){  
            case 1:
                m.peso[0][0]=Integer.parseInt(t1.getText());
                m.peso[0][1]=Integer.parseInt(t6.getText());
                break;
            case 2:
                m.peso[0][0]=Integer.parseInt(t1.getText());
                m.peso[0][1]=Integer.parseInt(t6.getText());
                m.peso[1][0]=Integer.parseInt(t2.getText());
                m.peso[1][1]=Integer.parseInt(t7.getText());
                break;
            case 3:
                m.peso[0][0]=Integer.parseInt(t1.getText());
                m.peso[0][1]=Integer.parseInt(t6.getText());
                m.peso[1][0]=Integer.parseInt(t2.getText());
                m.peso[1][1]=Integer.parseInt(t7.getText());
                m.peso[2][0]=Integer.parseInt(t3.getText());
                m.peso[2][1]=Integer.parseInt(t8.getText());
                break;
            case 4:
                m.peso[0][0]=Integer.parseInt(t1.getText());
                m.peso[0][1]=Integer.parseInt(t6.getText());
                m.peso[1][0]=Integer.parseInt(t2.getText());
                m.peso[1][1]=Integer.parseInt(t7.getText());
                m.peso[2][0]=Integer.parseInt(t3.getText());
                m.peso[2][1]=Integer.parseInt(t8.getText());
                m.peso[3][0]=Integer.parseInt(t4.getText());
                m.peso[3][1]=Integer.parseInt(t9.getText());
                break;
            case 5:
                m.peso[0][0]=Integer.parseInt(t1.getText());
                m.peso[0][1]=Integer.parseInt(t6.getText());
                m.peso[1][0]=Integer.parseInt(t2.getText());
                m.peso[1][1]=Integer.parseInt(t7.getText());
                m.peso[2][0]=Integer.parseInt(t3.getText());
                m.peso[2][1]=Integer.parseInt(t8.getText());
                m.peso[3][0]=Integer.parseInt(t4.getText());
                m.peso[3][1]=Integer.parseInt(t9.getText());
                m.peso[4][0]=Integer.parseInt(t5.getText());
                m.peso[4][1]=Integer.parseInt(t10.getText());
                break;
        }
    }
    
    public void Habilitar(int articulos){
        switch(articulos){
            case 1:
                t1.setEnabled(true);
                t6.setEnabled(true);
                
                t1.setEditable(true);
                t6.setEditable(true);
                break;
            case 2:
                t1.setEnabled(true);
                t6.setEnabled(true);
                t2.setEnabled(true);
                t7.setEnabled(true);
                
                t1.setEditable(true);
                t6.setEditable(true);
                t2.setEditable(true);
                t7.setEditable(true);
                break;
            case 3:
                t1.setEnabled(true);
                t6.setEnabled(true);
                t2.setEnabled(true);
                t7.setEnabled(true);
                t3.setEnabled(true);
                t8.setEnabled(true);
                
                t1.setEditable(true);
                t6.setEditable(true);
                t2.setEditable(true);
                t7.setEditable(true);
                t3.setEditable(true);
                t8.setEditable(true);
                break;
            case 4:
                t1.setEnabled(true);
                t2.setEnabled(true);
                t3.setEnabled(true);
                t4.setEnabled(true);
                t6.setEnabled(true);
                t7.setEnabled(true);
                t8.setEnabled(true);
                t9.setEnabled(true);
                
                t1.setEditable(true);
                t2.setEditable(true);
                t3.setEditable(true);
                t4.setEditable(true);
                t6.setEditable(true);
                t7.setEditable(true);
                t8.setEditable(true);
                t9.setEditable(true);
                break;
            case 5:
                t1.setEnabled(true);
                t2.setEnabled(true);
                t3.setEnabled(true);
                t4.setEnabled(true);
                t6.setEnabled(true);
                t5.setEnabled(true);
                t7.setEnabled(true);
                t8.setEnabled(true);
                t9.setEnabled(true);
                t10.setEnabled(true);
                
                t1.setEditable(true);
                t2.setEditable(true);
                t3.setEditable(true);
                t4.setEditable(true);
                t6.setEditable(true);
                t5.setEditable(true);
                t7.setEditable(true);
                t8.setEditable(true);
                t9.setEditable(true);
                t10.setEditable(true);
                break;
        }
    }
    
    private void t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t10ActionPerformed

    private void HabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HabilitarActionPerformed
         Habilitar(Integer.parseInt(cantidadArticulos.getText()));
    }//GEN-LAST:event_HabilitarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matriz().setVisible(true);
            }
        });
    }

    public void MostrarMatriz(int[][] m,String[] array){
        DefaultTableModel modelo = (DefaultTableModel) matrizResultado.getModel();
        modelo.setRowCount(m.length-1);
        for(int o=0;o<array.length;o++){
           modelo.addColumn(array[o]);
        }
        modelo.setColumnCount(m[1].length-1);
        for(int i=1;i<m.length;i++){
            for(int j=1;j<m[1].length;j++){
                matrizResultado.setValueAt(m[i][j], (i-1), (j-1));
            }
        }
    }
    
    public void MostrarArticulos(int[][] m){
        DefaultTableModel modelo = (DefaultTableModel) articulos.getModel();
        modelo.setRowCount(m.length);
        modelo.setColumnCount(m[1].length);
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[1].length;j++){
                articulos.setValueAt(m[i][j], i, j);
            }
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EncontrarResultado;
    private javax.swing.JButton Habilitar;
    private javax.swing.JButton IngresarArticulos;
    private javax.swing.JTextField SolucionEscritaPeso;
    private javax.swing.JTextField SolucionEscritaValor;
    private javax.swing.JTable articulos;
    private javax.swing.JTextField cantidadArticulos;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable matrizResultado;
    private javax.swing.JTextField pesoMochila;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
