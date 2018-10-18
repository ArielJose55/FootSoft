/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.core.daos;

/**
 *
 * @author Klac
 */
class ResourceManager {
    
    private final java.util.ResourceBundle RB;
    private final Class rootTag;

    ResourceManager(Class rootTagClass) {
        this.RB = java.util.ResourceBundle.getBundle("footsoft/model/core/daos/sentencias");
        this.rootTag = rootTagClass;
    }
 
    String getSQLStatement(String tag){
        return RB.getString(rootTag.getSimpleName()+"."+tag);
    }
}
