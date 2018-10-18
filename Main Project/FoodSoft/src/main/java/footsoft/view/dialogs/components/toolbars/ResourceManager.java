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
public class ResourceManager {
    
    public static java.net.URL getResourceImage(Class clase, String tag){
        return clase.getResource(tag+".png");
    }
}
