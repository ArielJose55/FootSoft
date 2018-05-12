/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft;

import footsoft.view.frames.FrameAdministrator;
import footsoft.view.frames.FrameLogger;
import footsoft.view.frames.FrameSelector;
import javax.swing.text.html.HTML;

/**
 *
 * @author Klac
 */
public class FootSoft {

    private static void initSkin(){
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.JDialog.setDefaultLookAndFeelDecorated(true);//org.jvnet.substance.theme.SubstanceAquaTheme
        org.jvnet.substance.SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeBlue2007Skin");
        org.jvnet.substance.SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceAquaTheme");
        org.jvnet.substance.SubstanceLookAndFeel.setCurrentBorderPainter("org.jvnet.substance.border.NullBorderPainter");
        org.jvnet.substance.SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceNoneWatermark");
    }
    
    private static void initSkin2(){
         try{   
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
         }catch(Exception ex){ex.printStackTrace();}
    }
    
    public static void main(String[] args) {
        initSkin();
//        initSkin2();
        FrameSelector selector = new FrameSelector();
    }
    
    public static void throwThread(final Class ventana){
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                if(ventana.getSimpleName().equals("FrameAdministrator")){
                    try {
                        FrameAdministrator mainFrame = (FrameAdministrator) ventana.newInstance();
                        mainFrame.setVisible(true);
                    } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(FootSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(FootSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                }else{
                    try {
                        FrameLogger mainFrame = (FrameLogger) ventana.newInstance();
                        mainFrame.setVisible(true);
                    } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(FootSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(FootSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                }
            } 
        });
    }
}
