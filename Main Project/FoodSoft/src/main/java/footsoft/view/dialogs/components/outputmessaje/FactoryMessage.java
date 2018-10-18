/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.dialogs.components.outputmessaje;

import footsoft.model.TypeUser;
import footsoft.view.dialogs.DialogConfirmUser;

/**
 *
 * @author Klac
 */
public class FactoryMessage {
    
    public static boolean createPanelConfirmUser(TypeUser typeUser){
        DialogConfirmUser dialog = new DialogConfirmUser(typeUser);
        return dialog.getCorrectConfirmUser();
    }
    
    
    private static javax.swing.JOptionPane createOptionPanel(){
        javax.swing.JOptionPane option = new javax.swing.JOptionPane();
        option.setComponentOrientation(javax.swing.JOptionPane.getRootFrame().getComponentOrientation());
        return option;
    }
    
    public static javax.swing.ImageIcon createImageDatabase(TypeOperationDataBase operaction){
        javax.swing.ImageIcon image = null;
        java.util.Random rd = new java.util.Random();
        switch(operaction){
            case ALERT:{
                int i = rd.nextInt(7);
                image = new javax.swing.ImageIcon(FactoryMessage.class.getResource("sad"+((i >=0 && i <= 6)? i:0)+".png"));
                break;
            }
            case INCORRECT:{
                int i = rd.nextInt(4);
                image = new javax.swing.ImageIcon(FactoryMessage.class.getResource("winking"+((i >=0 && i <= 3)? i:0)+".png"));
                break;
            }
        }
        return image;
    }
}
