/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package practicagestorjocrolmartin;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author alumnegs
 */
public class PanellPrincipal extends javax.swing.JPanel {

    
    
    CardLayout cardLayout;
    JPanel cardPanel;
    
    public PanellPrincipal(CardLayout cardLayout,JPanel cardPanel) {
        initComponents();
        
        this.cardLayout = cardLayout;
        this.cardPanel = cardPanel;
        
        
    }

   
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botoEditar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botoTancar = new javax.swing.JPanel();
        textBoto = new javax.swing.JLabel();
        textSuperior = new javax.swing.JLabel();
        botoAfegir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botoEliminar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setForeground(new java.awt.Color(102, 255, 102));
        setPreferredSize(new java.awt.Dimension(750, 520));

        jLabel2.setFont(new java.awt.Font("Manjari Thin", 1, 18)); // NOI18N
        jLabel2.setText("Afegir");

        javax.swing.GroupLayout botoEditarLayout = new javax.swing.GroupLayout(botoEditar);
        botoEditar.setLayout(botoEditarLayout);
        botoEditarLayout.setHorizontalGroup(
            botoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoEditarLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        botoEditarLayout.setVerticalGroup(
            botoEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoEditarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        botoTancar.setBackground(new java.awt.Color(255, 0, 0));
        botoTancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoTancarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botoTancarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botoTancarMouseExited(evt);
            }
        });

        textBoto.setFont(new java.awt.Font("Liberation Sans", 1, 17)); // NOI18N
        textBoto.setForeground(new java.awt.Color(255, 255, 255));
        textBoto.setText("X");

        javax.swing.GroupLayout botoTancarLayout = new javax.swing.GroupLayout(botoTancar);
        botoTancar.setLayout(botoTancarLayout);
        botoTancarLayout.setHorizontalGroup(
            botoTancarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoTancarLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(textBoto)
                .addGap(30, 30, 30))
        );
        botoTancarLayout.setVerticalGroup(
            botoTancarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoTancarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textBoto)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        textSuperior.setFont(new java.awt.Font("Manjari Thin", 1, 36)); // NOI18N
        textSuperior.setForeground(new java.awt.Color(102, 102, 255));
        textSuperior.setText("Gestiona els teus atributs ");

        jLabel1.setFont(new java.awt.Font("Manjari Thin", 1, 18)); // NOI18N
        jLabel1.setText("Afegir");

        javax.swing.GroupLayout botoAfegirLayout = new javax.swing.GroupLayout(botoAfegir);
        botoAfegir.setLayout(botoAfegirLayout);
        botoAfegirLayout.setHorizontalGroup(
            botoAfegirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoAfegirLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botoAfegirLayout.setVerticalGroup(
            botoAfegirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoAfegirLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Manjari Thin", 1, 18)); // NOI18N
        jLabel3.setText("Afegir");

        javax.swing.GroupLayout botoEliminarLayout = new javax.swing.GroupLayout(botoEliminar);
        botoEliminar.setLayout(botoEliminarLayout);
        botoEliminarLayout.setHorizontalGroup(
            botoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(85, 85, 85))
        );
        botoEliminarLayout.setVerticalGroup(
            botoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoEliminarLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textSuperior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(botoTancar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botoEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botoAfegir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botoTancar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(textSuperior)))
                .addGap(74, 74, 74)
                .addComponent(botoAfegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(botoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(botoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botoTancarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoTancarMouseClicked
        System.exit(0);

    }//GEN-LAST:event_botoTancarMouseClicked

    private void botoTancarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoTancarMouseEntered

        botoTancar.setBackground(new java.awt.Color(255, 90,90));

    }//GEN-LAST:event_botoTancarMouseEntered

    private void botoTancarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoTancarMouseExited
        
        botoTancar.setBackground(new java.awt.Color(255,0,0));

        
    }//GEN-LAST:event_botoTancarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botoAfegir;
    private javax.swing.JPanel botoEditar;
    private javax.swing.JPanel botoEliminar;
    private javax.swing.JPanel botoTancar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel textBoto;
    private javax.swing.JLabel textSuperior;
    // End of variables declaration//GEN-END:variables
}
