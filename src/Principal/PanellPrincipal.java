/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Principal;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.sql.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import static javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN;
import javax.swing.table.DefaultTableModel;
import Taules.Classe;

/**
 *
 * @author alumnegs
 */
public class PanellPrincipal extends javax.swing.JPanel {

    private CardLayout cardLayout;
    private JPanel cardPanel;

    private Connection conn = null;

    FinestraPrincipal finestraPrincipal;

    public PanellPrincipal(CardLayout cardLayout, JPanel cardPanel ) {
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
                Logger.getLogger(PanellPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

            ArrayList<Classe> classe = new ArrayList<>();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM CLASSE");
            ResultSet rs = ps.executeQuery();

            try {
                while (rs.next()) {
                    Classe c = new Classe(rs.getInt(1), rs.getString(2), rs.getString(3),
                            rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8));

                    classe.add(c);
                }

            } catch (Exception e) {
                e.getMessage();

            }

            DefaultTableModel dtm = new DefaultTableModel();
            taulaEntitats.setModel(dtm);
            dtm.setColumnIdentifiers(new Object[]{"Id", "Nom", "Descripcio", "Escalat_salut", "Escalat_atac", "Escalat_defensa", "Escalat_defensa_magica", "Escalat_velocitat"});
            taulaEntitats.getColumnModel().getColumn(0).setPreferredWidth(20);
            taulaEntitats.getColumnModel().getColumn(1).setPreferredWidth(20);
            taulaEntitats.getColumnModel().getColumn(2).setPreferredWidth(20);
            taulaEntitats.getColumnModel().getColumn(3).setPreferredWidth(20);
            taulaEntitats.getColumnModel().getColumn(4).setPreferredWidth(20);
            taulaEntitats.getColumnModel().getColumn(5).setPreferredWidth(20);
            taulaEntitats.getColumnModel().getColumn(6).setPreferredWidth(20);
            taulaEntitats.getColumnModel().getColumn(7).setPreferredWidth(20);

            taulaEntitats.setAutoResizeMode(taulaEntitats.AUTO_RESIZE_LAST_COLUMN);

            try {

                for (Classe c : classe) {
                    dtm.addRow(new Object[]{
                        c.getId(),
                        c.getNom(),
                        c.getDescripcio(),
                        c.getEscalat_salut(),
                        c.getEscalat_atac(),
                        c.getEscalat_defensa(),
                        c.getEscalat_defensa_magica(),
                        c.getEscalat_velocitat()
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

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PanellPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seccioLateral = new javax.swing.JPanel();
        botoAfegir = new javax.swing.JPanel();
        textBotoAfegir = new javax.swing.JLabel();
        botoEditar = new javax.swing.JPanel();
        textBotoEditar = new javax.swing.JLabel();
        botoEliminar = new javax.swing.JPanel();
        textBotoEliminar1 = new javax.swing.JLabel();
        botoCambiarFinestraSeguent = new javax.swing.JLabel();
        scrollTaulaClasse = new javax.swing.JScrollPane();
        taulaEntitats = new javax.swing.JTable();
        titolFinestra = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 255, 255));
        setPreferredSize(new java.awt.Dimension(876, 614));

        seccioLateral.setBackground(new java.awt.Color(0, 153, 255));
        seccioLateral.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        textBotoEliminar1.setFont(new java.awt.Font("Manjari Thin", 1, 18)); // NOI18N
        textBotoEliminar1.setText("Elimina");

        javax.swing.GroupLayout botoEliminarLayout = new javax.swing.GroupLayout(botoEliminar);
        botoEliminar.setLayout(botoEliminarLayout);
        botoEliminarLayout.setHorizontalGroup(
            botoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoEliminarLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(textBotoEliminar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botoEliminarLayout.setVerticalGroup(
            botoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoEliminarLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(textBotoEliminar1)
                .addGap(28, 28, 28))
        );

        botoCambiarFinestraSeguent.setFont(new java.awt.Font("Rubik", 0, 24)); // NOI18N
        botoCambiarFinestraSeguent.setText("Taula següent ->");
        botoCambiarFinestraSeguent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoCambiarFinestraSeguent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoCambiarFinestraSeguentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botoCambiarFinestraSeguentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botoCambiarFinestraSeguentMouseExited(evt);
            }
        });

        javax.swing.GroupLayout seccioLateralLayout = new javax.swing.GroupLayout(seccioLateral);
        seccioLateral.setLayout(seccioLateralLayout);
        seccioLateralLayout.setHorizontalGroup(
            seccioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccioLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seccioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botoEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seccioLateralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(seccioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botoAfegir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botoEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seccioLateralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botoCambiarFinestraSeguent)
                .addGap(35, 35, 35))
        );
        seccioLateralLayout.setVerticalGroup(
            seccioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seccioLateralLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(botoAfegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(botoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(botoCambiarFinestraSeguent)
                .addGap(66, 66, 66))
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
        scrollTaulaClasse.setViewportView(taulaEntitats);

        titolFinestra.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        titolFinestra.setForeground(new java.awt.Color(51, 102, 255));
        titolFinestra.setText("Taula Classe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(621, 621, 621)
                        .addComponent(titolFinestra))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollTaulaClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 1551, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seccioLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seccioLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titolFinestra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollTaulaClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private void botoCambiarFinestraSeguentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoCambiarFinestraSeguentMouseEntered
        botoCambiarFinestraSeguent.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_botoCambiarFinestraSeguentMouseEntered

    private void botoCambiarFinestraSeguentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoCambiarFinestraSeguentMouseClicked

        cardLayout.show(cardPanel, "panellSecundari");

    }//GEN-LAST:event_botoCambiarFinestraSeguentMouseClicked

    private void botoCambiarFinestraSeguentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoCambiarFinestraSeguentMouseExited
        botoCambiarFinestraSeguent.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_botoCambiarFinestraSeguentMouseExited

    private void botoAfegirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoAfegirMouseClicked
        FinestraEmergentClasse finestraEmergent = new FinestraEmergentClasse(finestraPrincipal, true, this);
        finestraEmergent.setVisible(true);
    }//GEN-LAST:event_botoAfegirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botoAfegir;
    private javax.swing.JLabel botoCambiarFinestraSeguent;
    private javax.swing.JPanel botoEditar;
    private javax.swing.JPanel botoEliminar;
    private javax.swing.JScrollPane scrollTaulaClasse;
    private javax.swing.JPanel seccioLateral;
    private javax.swing.JTable taulaEntitats;
    private javax.swing.JLabel textBotoAfegir;
    private javax.swing.JLabel textBotoEditar;
    private javax.swing.JLabel textBotoEliminar1;
    private javax.swing.JLabel titolFinestra;
    // End of variables declaration//GEN-END:variables
}
