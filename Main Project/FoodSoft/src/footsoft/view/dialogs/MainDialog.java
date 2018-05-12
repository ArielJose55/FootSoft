/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.dialogs;

import footsoft.model.SwingAttribute;

/**
 *
 * @author Klac
 */
public class MainDialog extends javax.swing.JDialog{
    
    protected MainDialog(){
        super(new javax.swing.JFrame(), true);
        getContentPane().setBackground(SwingAttribute.COLOR_BACKGROUND);
    }
    
    
    protected javax.swing.JButton createButton(){
        javax.swing.JButton boton = new javax.swing.JButton();
        boton.setFocusPainted(false);
        boton.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        boton.setBorder(SwingAttribute.BORDER_MAIN);
        boton.setForeground(SwingAttribute.COLOR_FOREGROUND);
        boton.setFont(SwingAttribute.FONT_MAIN);
        return boton;
    }
    
    protected javax.swing.JButton createButtonSecondary(){
        javax.swing.JButton boton = new javax.swing.JButton();
        boton.setFocusPainted(false);
        boton.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        boton.setBorder(SwingAttribute.BORDER_MAIN);
        boton.setForeground(SwingAttribute.COLOR_FOREGROUND);
        boton.setFont(new java.awt.Font("Arial", 0, 15));
        return boton;
    }
    
    protected void doClose(){
        this.setVisible(false);
        this.dispose();
    }
        
}
