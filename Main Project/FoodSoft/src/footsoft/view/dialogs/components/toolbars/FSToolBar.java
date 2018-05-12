/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.dialogs.components.toolbars;

/**
 *
 * @author Klac
 */
class FSToolBar extends javax.swing.JToolBar {

    public FSToolBar() {
        initComponents();
    }
    
    private void initComponents(){
        setBackground(new java.awt.Color(250, 252, 252, 255));
        setFloatable(false);
        setLayout(new java.awt.GridBagLayout());
        
        
    }
    protected javax.swing.JButton createButton(){
        javax.swing.JButton boton = new javax.swing.JButton();
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        boton.setBackground(this.getBackground());
        return boton;
    }
}
