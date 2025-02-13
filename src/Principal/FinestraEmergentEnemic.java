/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Principal;

import java.sql.Connection;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FinestraEmergentEnemic extends javax.swing.JDialog {

    private int xFinestra;
    private int yFinestra;
    private static Connection conn;
    
    private static PanellTerciari panellTerciari;
    public FinestraEmergentEnemic(java.awt.Frame parent, boolean modal, PanellTerciari panellTerciari  ) {
        super(parent, modal);
        setUndecorated(true);
        setBackground(new java.awt.Color(153, 255, 255));
        
        
        initComponents();
        this.panellTerciari = panellTerciari;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titolNom = new javax.swing.JLabel();
        campTextNom = new javax.swing.JTextField();
        titolDescripcio = new javax.swing.JLabel();
        campTextDescripcio = new javax.swing.JTextField();
        titolTextSalutMaxima = new javax.swing.JLabel();
        campTextSalutMaxima = new javax.swing.JTextField();
        titolTextNivell = new javax.swing.JLabel();
        campTextNivell = new javax.swing.JTextField();
        titolAtac = new javax.swing.JLabel();
        campTextAtac = new javax.swing.JTextField();
        titolDefensa = new javax.swing.JLabel();
        campTextDefensa = new javax.swing.JTextField();
        titolMagia = new javax.swing.JLabel();
        campTextMagia = new javax.swing.JTextField();
        titolDefensaMagica = new javax.swing.JLabel();
        campTextDefensaMagica = new javax.swing.JTextField();
        titolVelocitat = new javax.swing.JLabel();
        campTextVelocitat = new javax.swing.JTextField();
        botoAfegir = new javax.swing.JPanel();
        textBotoAfegir = new javax.swing.JLabel();
        barraSuperior = new javax.swing.JPanel();
        botoTancar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(null);

        titolNom.setText("Nom");
        jPanel1.add(titolNom);
        titolNom.setBounds(10, 50, 27, 16);

        campTextNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campTextNomActionPerformed(evt);
            }
        });
        jPanel1.add(campTextNom);
        campTextNom.setBounds(10, 70, 180, 22);

        titolDescripcio.setText("Descripcio");
        jPanel1.add(titolDescripcio);
        titolDescripcio.setBounds(10, 110, 210, 16);

        campTextDescripcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campTextDescripcioActionPerformed(evt);
            }
        });
        jPanel1.add(campTextDescripcio);
        campTextDescripcio.setBounds(10, 130, 300, 22);

        titolTextSalutMaxima.setText("Salut maxima");
        jPanel1.add(titolTextSalutMaxima);
        titolTextSalutMaxima.setBounds(10, 230, 190, 16);

        campTextSalutMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campTextSalutMaximaActionPerformed(evt);
            }
        });
        jPanel1.add(campTextSalutMaxima);
        campTextSalutMaxima.setBounds(10, 250, 180, 22);

        titolTextNivell.setText("Nivell");
        jPanel1.add(titolTextNivell);
        titolTextNivell.setBounds(10, 170, 190, 16);

        campTextNivell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campTextNivellActionPerformed(evt);
            }
        });
        jPanel1.add(campTextNivell);
        campTextNivell.setBounds(10, 190, 180, 22);

        titolAtac.setText("Atac");
        jPanel1.add(titolAtac);
        titolAtac.setBounds(10, 290, 180, 16);

        campTextAtac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campTextAtacActionPerformed(evt);
            }
        });
        jPanel1.add(campTextAtac);
        campTextAtac.setBounds(10, 310, 180, 22);

        titolDefensa.setText("Defensa");
        jPanel1.add(titolDefensa);
        titolDefensa.setBounds(390, 50, 180, 16);

        campTextDefensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campTextDefensaActionPerformed(evt);
            }
        });
        jPanel1.add(campTextDefensa);
        campTextDefensa.setBounds(390, 70, 180, 22);

        titolMagia.setText("Magia");
        jPanel1.add(titolMagia);
        titolMagia.setBounds(390, 110, 180, 16);

        campTextMagia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campTextMagiaActionPerformed(evt);
            }
        });
        jPanel1.add(campTextMagia);
        campTextMagia.setBounds(390, 130, 180, 22);

        titolDefensaMagica.setText("Defensa magica");
        jPanel1.add(titolDefensaMagica);
        titolDefensaMagica.setBounds(390, 160, 180, 16);

        campTextDefensaMagica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campTextDefensaMagicaActionPerformed(evt);
            }
        });
        jPanel1.add(campTextDefensaMagica);
        campTextDefensaMagica.setBounds(390, 180, 180, 22);

        titolVelocitat.setText("Velocitat");
        jPanel1.add(titolVelocitat);
        titolVelocitat.setBounds(390, 220, 180, 16);

        campTextVelocitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campTextVelocitatActionPerformed(evt);
            }
        });
        jPanel1.add(campTextVelocitat);
        campTextVelocitat.setBounds(390, 240, 180, 22);

        botoAfegir.setBackground(new java.awt.Color(187, 187, 187));
        botoAfegir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botoAfegir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoAfegir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoAfegirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botoAfegirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botoAfegirMouseExited(evt);
            }
        });

        textBotoAfegir.setFont(new java.awt.Font("Manjari Thin", 1, 18)); // NOI18N
        textBotoAfegir.setText("Afegeix");

        javax.swing.GroupLayout botoAfegirLayout = new javax.swing.GroupLayout(botoAfegir);
        botoAfegir.setLayout(botoAfegirLayout);
        botoAfegirLayout.setHorizontalGroup(
            botoAfegirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoAfegirLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(textBotoAfegir)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        botoAfegirLayout.setVerticalGroup(
            botoAfegirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoAfegirLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(textBotoAfegir)
                .addGap(16, 16, 16))
        );

        jPanel1.add(botoAfegir);
        botoAfegir.setBounds(380, 290, 251, 63);

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

        jPanel1.add(barraSuperior);
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

        jPanel1.add(botoTancar);
        botoTancar.setBounds(580, 0, 91, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campTextNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campTextNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campTextNomActionPerformed

    private void campTextDescripcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campTextDescripcioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campTextDescripcioActionPerformed

    private void campTextSalutMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campTextSalutMaximaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campTextSalutMaximaActionPerformed

    private void campTextAtacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campTextAtacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campTextAtacActionPerformed

    private void campTextDefensaMagicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campTextDefensaMagicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campTextDefensaMagicaActionPerformed

    private void campTextVelocitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campTextVelocitatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campTextVelocitatActionPerformed

    private void botoAfegirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoAfegirMouseClicked

        String nom = campTextNom.getText();
        String descripcio = campTextDescripcio.getText();
        String nivellString = campTextNivell.getText();
        String salutMaximaString = campTextSalutMaxima.getText();
        String atacString = campTextAtac.getText();
        String defensaString = campTextDefensa.getText();
        String magiaString = campTextMagia.getText();
        String defensaMagicaString = campTextDefensaMagica.getText();
        String velocitatString = campTextVelocitat.getText();
        
        int nivell = Integer.parseInt(nivellString);
        int salutMaxima = Integer.parseInt(salutMaximaString);
        int atac = Integer.parseInt(atacString);
        int defensa = Integer.parseInt(defensaString);
        int magia = Integer.parseInt(magiaString);
        int defensaMagica = Integer.parseInt(defensaMagicaString);
        int velocitat = Integer.parseInt(velocitatString);
        
        consultaInsert(nom, descripcio, nivell, salutMaxima, atac, defensa, magia, defensaMagica, velocitat);
        
        panellTerciari.carregaTaulaBBDD();
        

    }//GEN-LAST:event_botoAfegirMouseClicked

    private void botoAfegirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoAfegirMouseEntered
        botoAfegir.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_botoAfegirMouseEntered

    private void botoAfegirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoAfegirMouseExited
        botoAfegir.setBackground(new java.awt.Color(187, 187, 187));
    }//GEN-LAST:event_botoAfegirMouseExited

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

    private void campTextDefensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campTextDefensaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campTextDefensaActionPerformed

    private void campTextNivellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campTextNivellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campTextNivellActionPerformed

    private void campTextMagiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campTextMagiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campTextMagiaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FinestraEmergentEnemic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinestraEmergentEnemic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinestraEmergentEnemic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinestraEmergentEnemic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FinestraEmergentEnemic dialog = new FinestraEmergentEnemic(new javax.swing.JFrame(), true, panellTerciari);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void consultaInsert(String nom, String descripcio,  int nivell, int salutMaxima, int atac,
            int defensa,  int magia, int defensaMagica, int velocitat
    ) {
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

            String insertClasse = "INSERT INTO ENEMIC (nom, descripcio, nivell, salut_maxima, atac, defensa,  magia, defensa_magica, "
                    + "velocitat) VALUES (?,?,?,?,?,?,?,?,?)";

            try {
                stmt = conn.prepareStatement(insertClasse);

                stmt.setString(1, nom);
                stmt.setString(2, descripcio);
                stmt.setInt(3, nivell);
                stmt.setInt(4, salutMaxima);
                stmt.setInt(5, atac);
                stmt.setInt(6, defensa);
                stmt.setInt(7, magia);
                stmt.setInt(8, defensaMagica);
                stmt.setInt(9, velocitat);

                stmt.execute();
                
                stmt.close();
                conn.close();

            } catch (SQLException ex) {

                System.out.println("Error en l'inserció" + ex.getMessage());
            }
        } catch (Throwable e) {

        } 

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JPanel botoAfegir;
    private javax.swing.JPanel botoTancar;
    private javax.swing.JTextField campTextAtac;
    private javax.swing.JTextField campTextDefensa;
    private javax.swing.JTextField campTextDefensaMagica;
    private javax.swing.JTextField campTextDescripcio;
    private javax.swing.JTextField campTextMagia;
    private javax.swing.JTextField campTextNivell;
    private javax.swing.JTextField campTextNom;
    private javax.swing.JTextField campTextSalutMaxima;
    private javax.swing.JTextField campTextVelocitat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textBotoAfegir;
    private javax.swing.JLabel titolAtac;
    private javax.swing.JLabel titolDefensa;
    private javax.swing.JLabel titolDefensaMagica;
    private javax.swing.JLabel titolDescripcio;
    private javax.swing.JLabel titolMagia;
    private javax.swing.JLabel titolNom;
    private javax.swing.JLabel titolTextNivell;
    private javax.swing.JLabel titolTextSalutMaxima;
    private javax.swing.JLabel titolVelocitat;
    // End of variables declaration//GEN-END:variables
}
