/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.models.table;

/**
 *
 * @author Klac
 */
class FactoryCellTableRenderer {
    
    
    static javax.swing.table.DefaultTableCellRenderer createTableCellRenderer(int columna,TypeTable typeTable){
        switch(typeTable){
            case TABLE_MAIN:{
                
            }
            case TABLE_VIEW_FOOT:{
                 return new RowRendererOfClassTwo(columna);
            }
            default:
                throw new RuntimeException("No corresponde a ningun tipo de tabla");
        }
    }
    
    
    private static class RowRendererOfClassTwo extends javax.swing.table.DefaultTableCellRenderer{
    
    private final int columna;

        RowRendererOfClassTwo(int columna) {
            this.columna = columna;
        }
        
        @Override
        public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
            setBackground(java.awt.Color.WHITE);

            if(columna < 0){
                setPreferredSize(new java.awt.Dimension(12, 20));
                setFont(new java.awt.Font("Arial", 1, 15));
                setForeground(new java.awt.Color(120,120,120));
                return this;
            }
          
            if(column >= 1 && column <= 3)
            setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            
            if(isSelected){
                setBackground(table.getSelectionBackground());
                setForeground(table.getSelectionForeground());
            }else{
                setForeground(new java.awt.Color(130,130,130));
                
            }
            setFont(new java.awt.Font("Arial", 0, 13));
            return this;
        }
    }

}
