/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.models.list;

/**
 *
 * @author Klac
 */
public class FactoryCellListRenderer {
    
    public static javax.swing.DefaultListCellRenderer createListCellRendererRegistrator(){
        return new RowCellListRendererOne();
    }
    
    private static class RowCellListRendererOne extends javax.swing.DefaultListCellRenderer{

        @Override
        public java.awt.Component getListCellRendererComponent(javax.swing.JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            setBorder(javax.swing.BorderFactory.createEmptyBorder());
            setFont(new java.awt.Font("Arial", 0, 18));
            setBackground(java.awt.Color.WHITE);
            setPreferredSize(new java.awt.Dimension(35, 35));
            if(isSelected){
                setBackground(new java.awt.Color(204,210,255));
                setForeground(list.getSelectionForeground());
            }else{
                setForeground(new java.awt.Color(130,130,130));
                
            }
            return this;
        }
        
    }
}
