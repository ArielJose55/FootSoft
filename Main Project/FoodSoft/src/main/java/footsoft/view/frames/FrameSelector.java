/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.frames;

import footsoft.controller.mouse.MouseAboveComponetListener;
import footsoft.model.TypeUser;
import footsoft.view.dialogs.components.outputmessaje.FactoryMessage;

/**
 *
 * @author Klac
 */
public class FrameSelector extends javax.swing.JFrame {

    
    private TypeUser typeUser;
    
    public FrameSelector() {
        getContentPane().setBackground(java.awt.Color.WHITE);
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public TypeUser getTypeUserSelected(){
        return typeUser;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegistrator = new javax.swing.JButton();
        jButtonAdministrator = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        setForeground(new java.awt.Color(102, 102, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButtonRegistrator.setBackground(getBackground());
        jButtonRegistrator.setFont(getFont());
        jButtonRegistrator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footsoft/view/resources/network48.png"))); // NOI18N
        jButtonRegistrator.setText("Registrador");
        jButtonRegistrator.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(0, 153, 255)));
        jButtonRegistrator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrator.setFocusPainted(false);
        jButtonRegistrator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRegistrator.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRegistrator.addMouseListener(new MouseAboveComponetListener());
        jButtonRegistrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistratorActionPerformed(evt);
            }
        });

        jButtonAdministrator.setBackground(getBackground());
        jButtonAdministrator.setFont(getFont());
        jButtonAdministrator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footsoft/view/resources/conference6.png"))); // NOI18N
        jButtonAdministrator.setText("Administrador");
        jButtonAdministrator.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(51, 153, 255)));
        jButtonAdministrator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAdministrator.setFocusPainted(false);
        jButtonAdministrator.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAdministrator.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAdministrator.addMouseListener(new MouseAboveComponetListener());
        jButtonAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministratorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegistrator, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAdministrator, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRegistrator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAdministrator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistratorActionPerformed
        if(FactoryMessage.createPanelConfirmUser(TypeUser.REGISTRATOR)){
            footsoft.FootSoft.throwThread(FrameLogger.class);
            doClose();
        }
    }//GEN-LAST:event_jButtonRegistratorActionPerformed

    private void jButtonAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministratorActionPerformed
        if(FactoryMessage.createPanelConfirmUser(TypeUser.ADMINISTRATOR)){
            footsoft.FootSoft.throwThread(FrameAdministrator.class);
            doClose();
        }
    }//GEN-LAST:event_jButtonAdministratorActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        doClose();
    }//GEN-LAST:event_formWindowClosing

    private void doClose(){
        this.setVisible(true);
        this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdministrator;
    private javax.swing.JButton jButtonRegistrator;
    // End of variables declaration//GEN-END:variables
}
