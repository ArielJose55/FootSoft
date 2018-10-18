/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.util;

/**
 *
 * @author Klac
 */
public abstract class AbstractIO {
    
    protected final java.io.File folder;
    private final String nameFile;
    
    protected AbstractIO(TypeProcess typeWriter){
        switch(typeWriter){
            case FINGERPRINT:{
                folder = new java.io.File(System.getProperty("java.io.tmpdir"), "FootSoft\\Fingerprints\\");
                if(!folder.exists()){
                    if(!folder.mkdirs()){
                        throw new RuntimeException("Error! no se creo la carpeta principal de registros");
                    }
                }
                nameFile = "registry.employee.ajac";
                break;
            }
            default:{
                throw new RuntimeException("Error tipo de escritor no valido");
            }
        }
    }
    
    protected String getNameFile(){
        return nameFile;
    }
}
