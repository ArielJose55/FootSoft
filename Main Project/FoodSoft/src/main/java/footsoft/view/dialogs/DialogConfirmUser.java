/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.dialogs;

import footsoft.model.SwingAttribute;
import footsoft.model.TypeUser;
import footsoft.model.core.daos.UserDao;
import footsoft.view.dialogs.components.outputmessaje.FactoryMessage;
import footsoft.view.dialogs.components.outputmessaje.TypeOperationDataBase;

/**
 *
 * @author Klac
 */
public class DialogConfirmUser extends javax.swing.JDialog {

    private static final byte SI = 0;
    private static final byte NO = 1;
    private static final byte ERROR = 2;
    
    private String password;
    private byte option;
    
    public DialogConfirmUser(TypeUser typeUser) {
        super(new javax.swing.JFrame(), "Verificación" ,true);
        getContentPane().setBackground(SwingAttribute.COLOR_BACKGROUND);
        initComponents();
        setLocationRelativeTo(null);
        consultPassWord(typeUser);
    }    
    
    private void consultPassWord(TypeUser typeUser){
        try{
            UserDao userDao = new UserDao();
            
            if(typeUser.compareTo(TypeUser.ADMINISTRATOR) == 0){
                jLabelPass.setText("Contraseña de Administrador");
                password = userDao.checkUserAdministrator();
            }else{
                jLabelPass.setText("Contraseña de Registrador");
                password = userDao.checkUserRegistrator();
            }
            setVisible(true);
        }catch(java.sql.SQLException ex){
            ex.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(rootPane, "No hay comunicación con el servidor de la base de datos\n\n"
                    + "Intentelo más tarde", "Problema inesperado",
                    javax.swing.JOptionPane.WARNING_MESSAGE,FactoryMessage.createImageDatabase(TypeOperationDataBase.ALERT));
            doClose(ERROR);
        }
    }
    
    public boolean getCorrectConfirmUser(){
        return option == SI;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jTextFieldPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButtonAceptar.setFont(SwingAttribute.FONT_MAIN);
        jButtonAceptar.setForeground(SwingAttribute.COLOR_FOREGROUND);
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setBorder(SwingAttribute.BORDER_MAIN);
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(jButtonAceptar.getFont());
        jButtonCancel.setForeground(jButtonAceptar.getForeground());
        jButtonCancel.setText("Cancelar");
        jButtonCancel.setBorder(jButtonAceptar.getBorder());
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/footsoft/view/resources/key197.png"))); // NOI18N

        jLabelPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextFieldPass.setFont(jButtonAceptar.getFont());
        jTextFieldPass.setForeground(jButtonAceptar.getForeground());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldPass, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getRootPane().setDefaultButton(jButtonAceptar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        doClose(NO);
    }//GEN-LAST:event_formWindowClosing

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        doClose(NO);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        if(jTextFieldPass.getText().compareTo("") == 0) return;
        
        if(jTextFieldPass.getText().compareTo(password) == 0){
            doClose(SI);
        }else{
            javax.swing.JOptionPane.showMessageDialog(rootPane, "La Contraseña digitada no coincide.\nIngrese la contrasena correcta","Contraseña Incorrecta",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE,FactoryMessage.createImageDatabase(TypeOperationDataBase.INCORRECT));
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    
    private void doClose(byte option){
        this.option = option;
        this.setVisible(false);
        this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldPass;
    // End of variables declaration//GEN-END:variables
}
