/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Principal;

import Utilities.Actualitzable;
import Utilities.Visualitzable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author domin
 */
public class FinestraEmergentDeleteUpdate extends javax.swing.JDialog {

    private int xFinestra;
    private int yFinestra;

    private static String titolFinestra;

    private static Connection conn;

    private Actualitzable panellActualitzable;
    private Visualitzable panellVisualitzable;

    private String tipusConsulta;

    public FinestraEmergentDeleteUpdate(java.awt.Frame parent, boolean modal, Actualitzable panell, Visualitzable panell2, String titolFinestra, String tipusConsulta) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();

        this.titolFinestra = titolFinestra;

        this.panellActualitzable = panell;
        this.panellVisualitzable = panell2;

        this.tipusConsulta = tipusConsulta;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        botoConfirmar = new javax.swing.JPanel();
        textBotoAfegir6 = new javax.swing.JLabel();
        barraSuperior = new javax.swing.JPanel();
        botoTancar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campTextId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));
        jPanel7.setLayout(null);

        botoConfirmar.setBackground(new java.awt.Color(187, 187, 187));
        botoConfirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botoConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botoConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botoConfirmarMouseExited(evt);
            }
        });

        textBotoAfegir6.setFont(new java.awt.Font("Manjari Thin", 1, 18)); // NOI18N
        textBotoAfegir6.setText("Confirmar");

        javax.swing.GroupLayout botoConfirmarLayout = new javax.swing.GroupLayout(botoConfirmar);
        botoConfirmar.setLayout(botoConfirmarLayout);
        botoConfirmarLayout.setHorizontalGroup(
            botoConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoConfirmarLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(textBotoAfegir6)
                .addGap(78, 78, 78))
        );
        botoConfirmarLayout.setVerticalGroup(
            botoConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoConfirmarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(textBotoAfegir6)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel7.add(botoConfirmar);
        botoConfirmar.setBounds(220, 220, 251, 63);

        barraSuperior.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        barraSuperior.setOpaque(false);
        barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraSuperiorMouseDragged(evt);
            }
        });
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraSuperiorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        jPanel7.add(barraSuperior);
        barraSuperior.setBounds(0, 0, 570, 41);

        botoTancar.setBackground(new java.awt.Color(255, 0, 0));
        botoTancar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoTancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoTancarformMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botoTancarformMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botoTancarformMouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");

        javax.swing.GroupLayout botoTancarLayout = new javax.swing.GroupLayout(botoTancar);
        botoTancar.setLayout(botoTancarLayout);
        botoTancarLayout.setHorizontalGroup(
            botoTancarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoTancarLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
        );
        botoTancarLayout.setVerticalGroup(
            botoTancarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoTancarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(botoTancar);
        botoTancar.setBounds(580, 0, 91, 40);
        jPanel7.add(campTextId);
        campTextId.setBounds(220, 160, 250, 22);

        jLabel2.setText("Introdueix el Id del registre:");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(220, 120, 250, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoConfirmarMouseClicked

        String id = campTextId.getText();

        if (tipusConsulta.equals("Delete")) {

            consultaDelete(id, titolFinestra);

            if (panellActualitzable != null) {
                panellActualitzable.actualitzarTaula();
            }

        } else {
            panellVisualitzable.visualitzarFinestra(id);
        }
            this.setVisible(false);


    }//GEN-LAST:event_botoConfirmarMouseClicked

    private void botoConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoConfirmarMouseEntered
        botoConfirmar.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_botoConfirmarMouseEntered

    private void botoConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoConfirmarMouseExited
        botoConfirmar.setBackground(new java.awt.Color(187, 187, 187));
    }//GEN-LAST:event_botoConfirmarMouseExited

    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseDragged

        int x = evt.getXOnScreen() - xFinestra;
        int y = evt.getYOnScreen() - yFinestra;

        this.setLocation(x, y);
    }//GEN-LAST:event_barraSuperiorMouseDragged

    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMousePressed

        xFinestra = evt.getX();
        yFinestra = evt.getY();
    }//GEN-LAST:event_barraSuperiorMousePressed

    private void botoTancarformMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoTancarformMouseClicked
        this.dispose();
    }//GEN-LAST:event_botoTancarformMouseClicked

    private void botoTancarformMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoTancarformMouseEntered
        // TODO add your handling code here:

        botoTancar.setBackground(new java.awt.Color(255, 90, 90));
    }//GEN-LAST:event_botoTancarformMouseEntered

    private void botoTancarformMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoTancarformMouseExited
        // TODO add your handling code here:

        botoTancar.setBackground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_botoTancarformMouseExited

    public void consultaDelete(String id, String titolFinestra) {
        try {

            try {
                Class.forName("org.hsqldb.jdbcDriver");
            } catch (ClassNotFoundException ex) {
                ex.getMessage();
            }
            try {
                conn = DriverManager.getConnection(
                        "jdbc:hsqldb:file:C:/Users/domin/Documents/NetBeansProjects/PracticaGestioJocRol/DataBase/PracticaJocRol",
                        "root",
                        "1234");
            } catch (SQLException ex) {
                Logger.getLogger(PanellPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

            PreparedStatement stmt = null;

            String deleteRecord = "DELETE FROM " + titolFinestra + " WHERE id = ?";
            try {
                stmt = conn.prepareStatement(deleteRecord);
                stmt.setString(1, id);

                stmt.execute();

                stmt.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("Hi ha hagut un error durant l'eliminació del registre " + e.getMessage());
            }
        } catch (Throwable e) {

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JPanel botoConfirmar;
    private javax.swing.JPanel botoTancar;
    private javax.swing.JTextField campTextId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel textBotoAfegir6;
    // End of variables declaration//GEN-END:variables
}
