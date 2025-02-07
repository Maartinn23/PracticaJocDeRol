/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package practicagestorjocrolmartin;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author alumnegs
 */
public class PanellPrincipal extends javax.swing.JPanel 
{

   
    CardLayout cardLayout;
    JPanel cardPanel;
    
    
    
    public PanellPrincipal( CardLayout cardLayout,JPanel cardPanel) 
    {
        initComponents();
        
        this.cardLayout = cardLayout;
        this.cardPanel = cardPanel;

        
    }

    public Statement connexioBBDD() throws SQLException
    {
        
            Connection conn = DriverManager.getConnection(
            "jdbc:mysql://127.0.0.1:3306/Practica3",
            "root", "1234");

            Statement stmt = conn.createStatement();
        
        return stmt;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botoEliminar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotoAfegir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botoEditar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taulaEntitats = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(876, 614));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botoEliminar.setBackground(new java.awt.Color(187, 187, 187));
        botoEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botoEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Manjari Thin", 1, 18)); // NOI18N
        jLabel3.setText("Elimina");

        javax.swing.GroupLayout botoEliminarLayout = new javax.swing.GroupLayout(botoEliminar);
        botoEliminar.setLayout(botoEliminarLayout);
        botoEliminarLayout.setHorizontalGroup(
            botoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoEliminarLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botoEliminarLayout.setVerticalGroup(
            botoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoEliminarLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(28, 28, 28))
        );

        BotoAfegir.setBackground(new java.awt.Color(187, 187, 187));
        BotoAfegir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotoAfegir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotoAfegir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotoAfegirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotoAfegirMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Manjari Thin", 1, 18)); // NOI18N
        jLabel1.setText("Afegeix");

        javax.swing.GroupLayout BotoAfegirLayout = new javax.swing.GroupLayout(BotoAfegir);
        BotoAfegir.setLayout(BotoAfegirLayout);
        BotoAfegirLayout.setHorizontalGroup(
            BotoAfegirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotoAfegirLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        BotoAfegirLayout.setVerticalGroup(
            BotoAfegirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotoAfegirLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
        );

        botoEditar.setBackground(new java.awt.Color(187, 187, 187));
        botoEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botoEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Manjari Thin", 1, 18)); // NOI18N
        jLabel2.setText("Edita");

        javax.swing.GroupLayout botoEditarLayout = new javax.swing.GroupLayout(botoEditar);
        botoEditar.setLayout(botoEditarLayout);
        botoEditarLayout.setHorizontalGroup(
            botoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoEditarLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botoEditarLayout.setVerticalGroup(
            botoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoEditarLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotoAfegir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botoEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotoAfegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );

        taulaEntitats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nom", "descripcio", "escalat salut", "escalat atac", "escalat defensa", "escalat defensa magica", "escalat velocitat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(taulaEntitats);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1552, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotoAfegirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotoAfegirMouseEntered
        // TODO add your handling code here:
        
        BotoAfegir.setBackground(new java.awt.Color(204,204,204));
        
        
    }//GEN-LAST:event_BotoAfegirMouseEntered

    private void BotoAfegirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotoAfegirMouseExited
        // TODO add your handling code here:
        
        BotoAfegir.setBackground(new java.awt.Color(187,187,187));

        
    }//GEN-LAST:event_BotoAfegirMouseExited

     
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotoAfegir;
    private javax.swing.JPanel botoEditar;
    private javax.swing.JPanel botoEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable taulaEntitats;
    // End of variables declaration//GEN-END:variables
}
