
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.dialogs.components.toolbars;


import footsoft.view.frames.FrameLogger;
import java.util.Observable;
import javax.swing.JFrame;

/**
 *
 * @author Klac
 */
public class FSToolBarRegistrator extends FSToolBar{
    
    private final JFrame frameLogger;

    public FSToolBarRegistrator(JFrame frameLogger) {
        super();
        this.frameLogger = frameLogger;
        initComponents();
    }
    
    private void initComponents(){

        javax.swing.JSeparator separator = new javax.swing.JSeparator();
        
        java.awt.GridBagConstraints co = new java.awt.GridBagConstraints();
        co.anchor = java.awt.GridBagConstraints.NORTH;
        co.fill = java.awt.GridBagConstraints.HORIZONTAL;
        co.gridx = 0;
        co.gridy = 0;
        co.gridwidth = 2;
        co.weightx = 1f;
        add(separator,co);
               
        
        co.anchor = java.awt.GridBagConstraints.SOUTH;
        co.gridy = 2;
        add(separator,co);
        
        
        javax.swing.JButton boton = createButton();
        boton.setToolTipText("Registrar nuevo empleado");
        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("businessman248.png")));
        co.anchor = java.awt.GridBagConstraints.WEST;
        co.fill = java.awt.GridBagConstraints.NONE;
        co.insets = new java.awt.Insets(3, 5, 3, 5);
        co.gridwidth = 1;
        co.gridy = 1;
        co.weightx = 0f;
        add(boton,co);
        
        
        iconLoad = new javax.swing.JLabel();
        co.anchor = java.awt.GridBagConstraints.EAST;
        co.gridx = 1;
        add(iconLoad, co);
        
    }
    
    private javax.swing.JLabel iconLoad;
}
