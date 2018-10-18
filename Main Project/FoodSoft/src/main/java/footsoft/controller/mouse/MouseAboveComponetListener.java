/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.controller.mouse;

/**
 *
 * @author Klac
 */
public class MouseAboveComponetListener extends java.awt.event.MouseAdapter{
    
    private java.awt.Color colorOriginal;
    
    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        java.awt.Component component = e.getComponent();
        colorOriginal = component.getBackground();
        component.setBackground(new java.awt.Color(200,255,255));
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        java.awt.Component component = e.getComponent();
        component.setBackground(colorOriginal);
    }
}
