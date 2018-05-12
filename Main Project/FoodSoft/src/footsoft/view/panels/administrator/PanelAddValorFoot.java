/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.panels.administrator;

import footsoft.model.core.entities.Comida;
import footsoft.model.core.entities.TipoDeEmpleado;
import footsoft.model.core.entities.ValorDeComida;
import footsoft.view.models.list.FSComboBoxModelGeneric;
import footsoft.view.panels.RootPanel;
import javax.swing.JButton;

/**
 *
 * @author Klac
 */
public class PanelAddValorFoot extends RootPanel {

    private final TipoDeEmpleado centroDeCosto;
    private final javax.swing.JPanel jPanelWork;
    private final javax.swing.JButton botonRoot;
    private javax.swing.JButton botonTerminar;
    
    public PanelAddValorFoot(TipoDeEmpleado centroDeCosto, javax.swing.JPanel panelRoot, javax.swing.JButton botonRoot) {
        this.centroDeCosto = centroDeCosto;
        this.jPanelWork  = panelRoot;
        this.botonRoot = botonRoot;
        initComponents();
    }

    public void setBotonTerminar(JButton botonTerminar) {
        this.botonTerminar = botonTerminar;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jListComidas = new javax.swing.JList();
        jLabelDescuento = new javax.swing.JLabel();
        jTextFieldDescuento = createNumberField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSubsidio = createNumberField();
        jLabelValorComida = new javax.swing.JLabel();
        jButtonAgregarComida = createButtonSecondary();

        setBackground(new java.awt.Color(255, 255, 255));

        jListComidas.setBackground(getBackground());
        jListComidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jListComidas.setModel(new FSComboBoxModelGeneric(Comida.class,centroDeCosto.getListaDeValoresDeComidas()));
        jListComidas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListComidasValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListComidas);

        jLabelDescuento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDescuento.setText("Descuento:");

        jLabel3.setFont(jLabelDescuento.getFont());
        jLabel3.setText("Subsidio:");

        jTextFieldSubsidio.setFont(jTextFieldDescuento.getFont());
        jTextFieldSubsidio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubsidioActionPerformed(evt);
            }
        });

        jLabelValorComida.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jButtonAgregarComida.setText("Aceptar");
        jButtonAgregarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarComidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelValorComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSubsidio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonAgregarComida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelValorComida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldSubsidio, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabelDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jTextFieldDescuento))
                .addGap(18, 18, 18)
                .addComponent(jButtonAgregarComida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jListComidasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListComidasValueChanged
        if(evt.getValueIsAdjusting()){
            jLabelValorComida.setText("valor "+ ((Comida)jListComidas.getSelectedValue()).getNombreDeComida() +" :"
                + " $"+((Comida)jListComidas.getSelectedValue()).getValorDeComida());
        }
    }//GEN-LAST:event_jListComidasValueChanged

    private void jTextFieldSubsidioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubsidioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSubsidioActionPerformed

    private void jButtonAgregarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarComidaActionPerformed
        try{
            Double valores[] = verificaCampoComida();
            ValorDeComida valorDeComida = new ValorDeComida();
            valorDeComida.setDescuento(valores[0]);
            valorDeComida.setSubsidio(valores[1]);
            valorDeComida.setComida(((Comida)jListComidas.getSelectedValue()));
            centroDeCosto.getListaDeValoresDeComidas().add(valorDeComida);
            botonRoot.setEnabled(true);
            botonTerminar.setVisible(true);
            changedPanelFoot(new PanelViewFoot(centroDeCosto.getListaDeValoresDeComidas()));
        }catch(RuntimeException ex){
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(),"Advertencia",javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAgregarComidaActionPerformed

    private Double[] verificaCampoComida() throws RuntimeException {
        if(jListComidas.isSelectionEmpty())
            throw new RuntimeException("Seleccione un tipo de comida");
               
        if(jTextFieldDescuento.getText().compareTo("") == 0 || jTextFieldSubsidio.getText().compareTo("") == 0){
            if(jTextFieldDescuento.getText().compareTo("") != 0){
                throw new RuntimeException("El valor del subsidio no puede estar vacío");
            }else if(jTextFieldSubsidio.getText().compareTo("") != 0){
                throw new RuntimeException("El valor del descuento no puede estar vacío");
            }else{
                throw new RuntimeException("Los campos de descuento y subsidio no pueden estar vacíos");
            }
        }
        
        if((Double.parseDouble(jTextFieldDescuento.getText()) + Double.parseDouble(jTextFieldSubsidio.getText())) 
                != ((Comida)jListComidas.getSelectedValue()).getValorDeComida()){
            throw new RuntimeException("La suma del descuento más el subsidio no puede ser mayor al valor de la comida");
        }
        Double valores[] = {Double.parseDouble(jTextFieldDescuento.getText()),Double.parseDouble(jTextFieldSubsidio.getText())};
        return valores;
    }

    private void changedPanelFoot(javax.swing.JPanel panel){
        jPanelWork.removeAll();
        jPanelWork.add(panel, java.awt.BorderLayout.CENTER);
        jPanelWork.updateUI();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarComida;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDescuento;
    private javax.swing.JLabel jLabelValorComida;
    private javax.swing.JList jListComidas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldDescuento;
    private javax.swing.JTextField jTextFieldSubsidio;
    // End of variables declaration//GEN-END:variables
}
