/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.frames;

import footsoft.model.SwingAttribute;
import footsoft.view.panels.RootPanel;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author Klac
 */
public class MainFrame extends javax.swing.JFrame{
    
    private javax.swing.JPanel panelWorkCenter;
    private javax.swing.JPanel panelStateSouth;
    
    public MainFrame(String title) {
        super(title);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(SwingAttribute.COLOR_BACKGROUND);
    }
    
    public MainFrame(String title , boolean isMaxinized) {
        super(title);
        setExtendedState(isMaxinized ? javax.swing.JFrame.MAXIMIZED_BOTH : javax.swing.JFrame.NORMAL);
        getContentPane().setBackground(SwingAttribute.COLOR_BACKGROUND);
    }
    
    protected void setPanelWorkCenter(javax.swing.JPanel panelWorkCenter) {
        this.panelWorkCenter = panelWorkCenter;
    }

    protected void setPanelStateSouth(javax.swing.JPanel panelStateSouth) {
        this.panelStateSouth = panelStateSouth;
        this.panelStateSouth.setVisible(false);
    }
    
    protected javax.swing.JButton createButton(){
        javax.swing.JButton boton = new javax.swing.JButton();
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.HAND_CURSOR));
        boton.setBackground(SwingAttribute.COLOR_BACKGROUND);
        boton.setForeground(SwingAttribute.COLOR_FOREGROUND);
        boton.setFont(SwingAttribute.FONT_MAIN);
        return boton;
    }
    
    protected javax.swing.JButton createButtonMenu(){
        javax.swing.JButton boton = createButton();
        boton.setBorderPainted(true);
        boton.setBorder(SwingAttribute.BORDER_MAIN);
        boton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        return boton;
    }
    
    
    
    protected void runDialog(final Class dialogClass){
        Runnable run = new Runnable(){
            public void run(){
                try {
                    javax.swing.JDialog dialog = (javax.swing.JDialog)dialogClass.newInstance();
                    dialog.setVisible(true);
                } catch (InstantiationException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        runThread(run);
    }
    
    protected void runDialog(final Class dialogClass,final MainFrame mainFrame){
        Runnable run = new Runnable(){
            public void run(){
                try {
                    javax.swing.JDialog dialog = (javax.swing.JDialog)dialogClass.newInstance();
                    mainFrame.stoppingWaitDialog();
                    dialog.setVisible(true);
                } catch (InstantiationException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        runThread(run);
    }
    
    protected void runThread(Runnable run){
        new Thread(run).start();
    }
    
    protected void waitingPanel(){
        if(panelWorkCenter != null){
            panelWorkCenter.removeAll();
            panelWorkCenter.add(
                    new javax.swing.JLabel(new javax.swing.ImageIcon(MainFrame.class.getResource("CircleLoadingEspereWrite.gif"))),
                    java.awt.BorderLayout.CENTER
            );
            panelWorkCenter.updateUI();
        }
    }
    
    protected void stoppingWaitPanel(){
        if(panelWorkCenter != null){
            panelWorkCenter.removeAll();
        }
    }
    
    protected void waitingDialog(){
        if(panelStateSouth != null && !panelStateSouth.isVisible()){
            panelStateSouth.removeAll();
            panelStateSouth.setVisible(true);
            panelStateSouth.add(
                    new javax.swing.JLabel(new javax.swing.ImageIcon(MainFrame.class.getResource("294.gif"))),
                    java.awt.BorderLayout.CENTER
            );
            panelStateSouth.updateUI();
            
        }
        System.out.println("Hola");
    }
    
    protected void stoppingWaitDialog(){
        if(panelStateSouth != null && panelStateSouth.isVisible()){
            panelStateSouth.removeAll();
            panelStateSouth.setVisible(false);
        }
    }
    
    protected void changePanelWork(javax.swing.JPanel panel){
        panelWorkCenter.removeAll();
        panelWorkCenter.add(panel, java.awt.BorderLayout.CENTER);
        panelWorkCenter.updateUI();
    }
}
