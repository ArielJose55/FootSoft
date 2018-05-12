/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.util.readers;

import footsoft.model.util.AbstractIO;
import footsoft.model.util.TypeProcess;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Klac
 */
public class ReaderFingerprint extends AbstractIO implements Reader{

    public ReaderFingerprint() {
        super(TypeProcess.FINGERPRINT);
    }
    
    private Integer startProcess(byte[] datas) throws FileNotFoundException, IOException{
        java.io.File file = new java.io.File(folder, getNameFile());
        if(!file.exists())
            throw new RuntimeException("Error! no se encontro el archivo principal de registros");
        
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(file));
        String line;
        do{
            line = reader.readLine();
            if(line != null && line.compareTo("") != 0){
                String metadatas[] = line.split("_");
                if(java.util.Arrays.equals(metadatas[0].getBytes(), datas)){
                    return Integer.parseInt(metadatas[1]);
                }
            }
        }while(line != null && line.compareTo("") != 0);
        
        throw new RuntimeException("Esta huella no pertenece a ningun empleado registrado");
    }

    public Integer procesar(byte[] datas) throws Exception {
        return startProcess(datas);
    }
}
