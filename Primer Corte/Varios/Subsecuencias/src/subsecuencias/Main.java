package subsecuencias;

import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    String sol1;
    String sol2;
    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tx = new javax.swing.JTextField();
        ty = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        solucion1 = new javax.swing.JTextField();
        solucion2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("X:");

        jLabel2.setText("Y:");

        calcular.setText("Calcular Subsecuencias");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        tabla.setAutoCreateRowSorter(true);
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.setToolTipText("");
        tabla.setAutoscrolls(false);
        tabla.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(ty, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tx)))
                        .addGap(43, 43, 43)
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(solucion2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(solucion1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ty, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(solucion1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(solucion2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        char[] x = (tx.getText()).toCharArray();
        char[] y = (ty.getText()).toCharArray();
        
        char[] auxx = (" "+tx.getText()).toCharArray();
        char[] auxy = (" "+ty.getText()).toCharArray();
        
        int[][] c = new int[50][50];
        
        int[][] b = getLength(auxx, auxy);
        int[][] d = getLength(auxy, auxx);
        
        for (int i = 0; i < x.length; i++)
            c[0][i] = 0;
        for (int i = 0; i < y.length; i++)
            c[i][0] = 0;
        for (int i = 1; i <= x.length; i++) {
            for (int j = 1; j <= y.length; j++) {
                if (x[i-1] == y[j-1])
                    c[i][j] = c[i - 1][j - 1] + 1;     
                else
                    c[i][j] = Math.max((c[i - 1][j]), (c[i][j - 1]));
            }
        }
        
        MostrarMatriz(c,auxx,auxy);
        sol1 = "Sigue por el oeste en caso de igualdad: ";
        sol2 = "Sigue por el norte en caso de igualdad: ";
        DisplaySol1(d,auxy,auxy.length-1,auxx.length-1);
        DisplaySol2(b,auxx,auxx.length-1,auxy.length-1);
        solucion1.setText(sol1);
        solucion2.setText(sol2);
    }//GEN-LAST:event_calcularActionPerformed
    
    public void MostrarMatriz(int[][] m, char[] x, char[] y){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setColumnCount(0);
        for(int i=1;i<y.length+2;i++){
            if(i>=2){
                modelo.addColumn(y[i-2]);
            }else{
                modelo.addColumn("-");
            }
        }
        modelo.setRowCount(x.length);
        modelo.setColumnCount(y.length+1);
        for(int i=1;i<x.length+1;i++){
            tabla.setValueAt(x[i-1], i-1, 0);
        }
        for(int i=0;i<x.length;i++){
            for(int j=1;j<y.length+1;j++){
                tabla.setValueAt(m[i][j-1],i,j);
            }
        }
    }
    
    public int[][] getLength(char[] x, char[] y){
        int[][] b = new int[x.length][y.length];
	int[][] c = new int[x.length][y.length];
        
	for(int i=1; i<x.length; i++){
            for(int j=1; j<y.length; j++){
                if( x[i] == y[j]){
                    c[i][j] = c[i-1][j-1] + 1;
                    b[i][j] = 1;
                }else if(c[i-1][j] >= c[i][j-1]){
                    c[i][j] = c[i-1][j];
                    b[i][j] = 0;
                }else{
                    c[i][j] = c[i][j-1];
                    b[i][j] = -1;		}
            }
	}	
	return b;
    }
    
    public void DisplaySol1(int[][] b, char[] x, int i, int j){
        if(i == 0 || j == 0)
            return;	
	if(b[i][j] == 1){
            DisplaySol1(b, x, i-1, j-1);
            sol1+=x[i]+" ";
	}else if(b[i][j] == 0){
            DisplaySol1(b, x, i-1, j);
	}else if(b[i][j] == -1){
            DisplaySol1(b, x, i, j-1);
	}
    }
    
    public void DisplaySol2(int[][] b, char[] x, int i, int j){
        if(i == 0 || j == 0)
            return;	
	if(b[i][j] == 1){
            DisplaySol2(b, x, i-1, j-1);
            sol2+=x[i]+" ";
	}else if(b[i][j] == 0){
            DisplaySol2(b, x, i-1, j);
	}else if(b[i][j] == -1){
            DisplaySol2(b, x, i, j-1);
	}
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField solucion1;
    private javax.swing.JTextField solucion2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tx;
    private javax.swing.JTextField ty;
    // End of variables declaration//GEN-END:variables
}
