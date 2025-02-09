/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Principal;

import java.awt.CardLayout;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import taules.Classe;
import taules.Habilitat;

/**
 *
 * @author alumnegs
 */
public class PanellSecundari extends javax.swing.JPanel {

    CardLayout cardLayout;
    JPanel cardPanel;

    Connection conn = null;

    public PanellSecundari(CardLayout cardLayout, JPanel cardPanel) {
        initComponents();

        this.cardLayout = cardLayout;
        this.cardPanel = cardPanel;

        carregaTaulaBBDD();
        taulaEntitats.setEnabled(false);

    }

    public void carregaTaulaBBDD() {

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
                Logger.getLogger(PanellSecundari.class.getName()).log(Level.SEVERE, null, ex);
            }

            ArrayList<Habilitat> habilitat = new ArrayList<>();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM PUBLIC.HABILITAT");
            ResultSet rs = ps.executeQuery();

            try {
                while (rs.next()) {
                    Habilitat h = new Habilitat(rs.getInt(1), rs.getString(2), rs.getString(3),
                            rs.getString(4));

                    habilitat.add(h);
                }

            } catch (Exception e) {
                e.getMessage();

            }

            DefaultTableModel dtm = new DefaultTableModel();
            taulaEntitats.setModel(dtm);
            dtm.setColumnIdentifiers(new Object[]{"Id", "Nom", "Descripcio", "Script"});
            taulaEntitats.getColumnModel().getColumn(0).setPreferredWidth(20);
            taulaEntitats.getColumnModel().getColumn(1).setPreferredWidth(20);
            taulaEntitats.getColumnModel().getColumn(2).setPreferredWidth(20);
            taulaEntitats.getColumnModel().getColumn(3).setPreferredWidth(20);

            taulaEntitats.setAutoResizeMode(taulaEntitats.AUTO_RESIZE_LAST_COLUMN);

            try {

                for (Habilitat h : habilitat) {
                    dtm.addRow(new Object[]{
                        h.getId(),
                        h.getNom(),
                        h.getDescripcio(),
                        h.getScript()
                    });
                }

            } catch (Throwable e) {
                e.getMessage();
            } finally {
                try {

                    if (rs != null) {
                        rs.close();
                    }
                    if (ps != null) {
                        ps.close();
                    }
                    if (conn != null) {
                        Statement stmt = conn.createStatement();
                        stmt.execute("SHUTDOWN");
                        stmt.close();

                        conn.close();
                    } 

                } catch( Exception e){
                    e.printStackTrace();
                }
            } 
        }  catch (SQLException ex) {
                    Logger.getLogger(PanellSecundari.class.getName()).log(Level.SEVERE, null, ex);
                }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seccioLateral = new javax.swing.JPanel();
        botoEliminar = new javax.swing.JPanel();
        textBotoEliminar = new javax.swing.JLabel();
        botoAfegir = new javax.swing.JPanel();
        textBotoAfegir = new javax.swing.JLabel();
        botoEditar = new javax.swing.JPanel();
        textBotoEditar = new javax.swing.JLabel();
        scrollTaulaHabilitats = new javax.swing.JScrollPane();
        taulaEntitats = new javax.swing.JTable();
        titolFinestra = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setPreferredSize(new java.awt.Dimension(876, 614));

        seccioLateral.setBackground(new java.awt.Color(0, 153, 255));
        seccioLateral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botoEliminar.setBackground(new java.awt.Color(187, 187, 187));
        botoEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botoEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botoEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botoEliminarMouseExited(evt);
            }
        });

        textBotoEliminar.setFont(new java.awt.Font("Manjari Thin", 1, 18)); // NOI18N
        textBotoEliminar.setText("Elimina");

        javax.swing.GroupLayout botoEliminarLayout = new javax.swing.GroupLayout(botoEliminar);
        botoEliminar.setLayout(botoEliminarLayout);
        botoEliminarLayout.setHorizontalGroup(
            botoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoEliminarLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(textBotoEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botoEliminarLayout.setVerticalGroup(
            botoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoEliminarLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(textBotoEliminar)
                .addGap(28, 28, 28))
        );

        botoAfegir.setBackground(new java.awt.Color(187, 187, 187));
        botoAfegir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botoAfegir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoAfegir.addMouseListener(new java.awt.event.MouseAdapter() {
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
                .addGap(92, 92, 92)
                .addComponent(textBotoAfegir)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        botoAfegirLayout.setVerticalGroup(
            botoAfegirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoAfegirLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(textBotoAfegir)
                .addGap(27, 27, 27))
        );

        botoEditar.setBackground(new java.awt.Color(187, 187, 187));
        botoEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botoEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botoEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botoEditarMouseExited(evt);
            }
        });

        textBotoEditar.setFont(new java.awt.Font("Manjari Thin", 1, 18)); // NOI18N
        textBotoEditar.setText("Edita");

        javax.swing.GroupLayout botoEditarLayout = new javax.swing.GroupLayout(botoEditar);
        botoEditar.setLayout(botoEditarLayout);
        botoEditarLayout.setHorizontalGroup(
            botoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoEditarLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(textBotoEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botoEditarLayout.setVerticalGroup(
            botoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoEditarLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(textBotoEditar)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout seccioLateralLayout = new javax.swing.GroupLayout(seccioLateral);
        seccioLateral.setLayout(seccioLateralLayout);
        seccioLateralLayout.setHorizontalGroup(
            seccioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccioLateralLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(seccioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botoAfegir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botoEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        seccioLateralLayout.setVerticalGroup(
            seccioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seccioLateralLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(botoAfegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );

        taulaEntitats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "nom", "descripcio", "script"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollTaulaHabilitats.setViewportView(taulaEntitats);

        titolFinestra.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        titolFinestra.setForeground(new java.awt.Color(51, 102, 255));
        titolFinestra.setText("Taula Habilitats");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollTaulaHabilitats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(621, 621, 621)
                        .addComponent(titolFinestra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(seccioLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seccioLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titolFinestra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollTaulaHabilitats, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botoAfegirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoAfegirMouseEntered
        botoAfegir.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_botoAfegirMouseEntered

    private void botoAfegirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoAfegirMouseExited
        botoAfegir.setBackground(new java.awt.Color(187, 187, 187));
    }//GEN-LAST:event_botoAfegirMouseExited

    private void botoEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoEditarMouseEntered
        botoEditar.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_botoEditarMouseEntered

    private void botoEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoEditarMouseExited
        botoEditar.setBackground(new java.awt.Color(187, 187, 187));
    }//GEN-LAST:event_botoEditarMouseExited

    private void botoEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoEliminarMouseEntered
        botoEliminar.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_botoEliminarMouseEntered

    private void botoEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoEliminarMouseExited
        botoEliminar.setBackground(new java.awt.Color(187, 187, 187));
    }//GEN-LAST:event_botoEliminarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botoAfegir;
    private javax.swing.JPanel botoEditar;
    private javax.swing.JPanel botoEliminar;
    private javax.swing.JScrollPane scrollTaulaHabilitats;
    private javax.swing.JPanel seccioLateral;
    private javax.swing.JTable taulaEntitats;
    private javax.swing.JLabel textBotoAfegir;
    private javax.swing.JLabel textBotoEditar;
    private javax.swing.JLabel textBotoEliminar;
    private javax.swing.JLabel titolFinestra;
    // End of variables declaration//GEN-END:variables
}
