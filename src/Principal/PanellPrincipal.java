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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import static javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN;
import javax.swing.table.DefaultTableModel;
import taules.Classe;

/**
 *
 * @author alumnegs
 */
public class PanellPrincipal extends javax.swing.JPanel {

    CardLayout cardLayout;
    JPanel cardPanel;

    Connection conn = null;

    public PanellPrincipal(CardLayout cardLayout, JPanel cardPanel) {
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
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM PUBLIC.CLASSE");
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
        botoEliminar1 = new javax.swing.JPanel();
        textBotoEliminar1 = new javax.swing.JLabel();
        botoCambiarFinestra = new javax.swing.JLabel();
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

        botoEliminar1.setBackground(new java.awt.Color(187, 187, 187));
        botoEliminar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botoEliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botoEliminar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botoEliminar1MouseExited(evt);
            }
        });

        textBotoEliminar1.setFont(new java.awt.Font("Manjari Thin", 1, 18)); // NOI18N
        textBotoEliminar1.setText("Elimina");

        javax.swing.GroupLayout botoEliminar1Layout = new javax.swing.GroupLayout(botoEliminar1);
        botoEliminar1.setLayout(botoEliminar1Layout);
        botoEliminar1Layout.setHorizontalGroup(
            botoEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoEliminar1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(textBotoEliminar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botoEliminar1Layout.setVerticalGroup(
            botoEliminar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoEliminar1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(textBotoEliminar1)
                .addGap(28, 28, 28))
        );

        botoCambiarFinestra.setFont(new java.awt.Font("Rubik", 0, 24)); // NOI18N
        botoCambiarFinestra.setText("Taula següent ->");
        botoCambiarFinestra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoCambiarFinestra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoCambiarFinestraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botoCambiarFinestraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botoCambiarFinestraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout seccioLateralLayout = new javax.swing.GroupLayout(seccioLateral);
        seccioLateral.setLayout(seccioLateralLayout);
        seccioLateralLayout.setHorizontalGroup(
            seccioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccioLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seccioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botoEliminar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seccioLateralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(seccioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botoAfegir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botoEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(seccioLateralLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(botoCambiarFinestra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        seccioLateralLayout.setVerticalGroup(
            seccioLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seccioLateralLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(botoAfegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(botoEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(botoCambiarFinestra)
                .addGap(71, 71, 71))
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
                        .addContainerGap()
                        .addComponent(scrollTaulaClasse)
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

    private void botoEliminar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoEliminar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botoEliminar1MouseEntered

    private void botoEliminar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoEliminar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_botoEliminar1MouseExited
    private void botoCambiarFinestraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoCambiarFinestraMouseEntered

        botoCambiarFinestra.setForeground(new java.awt.Color(153, 255, 255));
        Font font = botoCambiarFinestra.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        botoCambiarFinestra.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_botoCambiarFinestraMouseEntered

    private void botoCambiarFinestraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoCambiarFinestraMouseClicked

        cardLayout.show(cardPanel, "panellSecundari");

    }//GEN-LAST:event_botoCambiarFinestraMouseClicked

    private void botoCambiarFinestraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoCambiarFinestraMouseExited
        botoCambiarFinestra.setForeground(new java.awt.Color(153, 255, 255));
        botoCambiarFinestra.setText("Taula següent ->");
    }//GEN-LAST:event_botoCambiarFinestraMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botoAfegir;
    private javax.swing.JLabel botoCambiarFinestra;
    private javax.swing.JPanel botoEditar;
    private javax.swing.JPanel botoEliminar1;
    private javax.swing.JScrollPane scrollTaulaClasse;
    private javax.swing.JPanel seccioLateral;
    private javax.swing.JTable taulaEntitats;
    private javax.swing.JLabel textBotoAfegir;
    private javax.swing.JLabel textBotoEditar;
    private javax.swing.JLabel textBotoEliminar1;
    private javax.swing.JLabel titolFinestra;
    // End of variables declaration//GEN-END:variables
}
