/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.sql.SQLException;
import javax.swing.JPanel;

/**
 *
 * @author alumnegs
 */
public class FinestraPrincipal extends javax.swing.JFrame {

   
    int xFinestra;
    int yFinestra;
    
    
    
    public FinestraPrincipal() 
    {
        
        setUndecorated(true);
        initComponents();
        
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);
        
        PanellPrincipal panellPrincipal = new PanellPrincipal(cardLayout,cardPanel);
        PanellSecundari panellSecundari = new PanellSecundari(cardLayout,cardPanel);
        
        cardPanel.add(panellPrincipal, "panellPrincipal");
        cardPanel.add(panellSecundari, "panellSecundari");

        
        this.setLayout(new BorderLayout());
        
        this.add(cardPanel,BorderLayout.CENTER);
        
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraSuperior = new javax.swing.JPanel();
        botoTancar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            .addGap(0, 1759, Short.MAX_VALUE)
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

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
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
        );
        botoTancarLayout.setVerticalGroup(
            botoTancarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoTancarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botoTancar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(barraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botoTancar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 589, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseDragged

        int  x = evt.getXOnScreen() - xFinestra;
        int  y = evt.getYOnScreen() - yFinestra;

        this.setLocation(x, y);
    }//GEN-LAST:event_barraSuperiorMouseDragged

    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMousePressed

        xFinestra = evt.getX();
        yFinestra = evt.getY();
    }//GEN-LAST:event_barraSuperiorMousePressed

    private void botoTancarformMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoTancarformMouseClicked

        System.exit(0);

    }//GEN-LAST:event_botoTancarformMouseClicked

    private void botoTancarformMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoTancarformMouseEntered
        // TODO add your handling code here:

        botoTancar.setBackground(new java.awt.Color(255, 90,90));

    }//GEN-LAST:event_botoTancarformMouseEntered

    private void botoTancarformMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoTancarformMouseExited
        // TODO add your handling code here:

        botoTancar.setBackground(new java.awt.Color(255,0,0));

    }//GEN-LAST:event_botoTancarformMouseExited

 
    public static void main(String args[]) 
    {
        FinestraPrincipal finestraPrincipal = new FinestraPrincipal();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JPanel botoTancar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
