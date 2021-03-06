/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.panels.administrator;

import footsoft.model.core.entities.ValorDeComida;
import footsoft.view.models.table.FactoryColumnModel;

/**
 *
 * @author Klac
 */
public class PanelViewFoot extends javax.swing.JPanel {

    private final java.util.List<ValorDeComida> LIST_COMIDA;
    
    public PanelViewFoot(java.util.List<ValorDeComida> list_comida) {
        this.LIST_COMIDA = list_comida;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        jTable1.setBackground(getBackground());
        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jTable1.setModel(new TableModel());
        jTable1.setFillsViewportHeight(true);
        jTable1.setRowHeight(20);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.setColumnModel(FactoryColumnModel.createModelColumnTableViewFoot());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado de comidas relacionados a este centro de costos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private class TableModel extends javax.swing.table.AbstractTableModel {

        @Override
        public boolean isCellEditable(int row , int column){
            return false;
        }
        
        @Override
        public Class getColumnClass(int column){
            if(column == 0) return String.class;
            return Double.class;
        }
        
        public int getRowCount() {
            return LIST_COMIDA.isEmpty() ? 0 : LIST_COMIDA.size();
        }

        public int getColumnCount() {
            return 4;
        }

        public Object getValueAt(int rowIndex, int columnIndex) {
            return get(LIST_COMIDA.get(rowIndex), columnIndex);
        }
        
        private Object get(ValorDeComida comida , int column){
            switch(column){
                case 0 : return comida.getComida().getNombreDeComida();
                case 1 : return comida.getDescuento();
                case 2 : return comida.getSubsidio();
                case 3 : return comida.getComida().getValorDeComida();
                default: return null;
            }
        }
    }
    
}
