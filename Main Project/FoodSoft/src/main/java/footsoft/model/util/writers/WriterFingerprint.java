/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.util.writers;

import footsoft.model.util.AbstractIO;
import footsoft.model.util.TypeProcess;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Klac
 */
public class WriterFingerprint extends AbstractIO implements Writer{
    
    public WriterFingerprint() throws FileNotFoundException {
        super(TypeProcess.FINGERPRINT);
    }

    private void startProcess(byte[] datas, Integer cedula) throws FileNotFoundException, IOException {
        
        java.io.File file = new java.io.File(folder, getNameFile());
        
        if(file.exists()){
            java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file,true)));
            writer.newLine();
            StringBuilder sb = new StringBuilder();
            sb.append(new String(datas));
            sb.append("_");
            sb.append(cedula);
            writer.write(sb.toString());
            writer.close();
        }else{
            java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(file));
            StringBuilder sb = new StringBuilder();
            sb.append(new String(datas));
            sb.append("_");
            sb.append(cedula);
            writer.write(sb.toString());
            writer.close();
        }
    }
    
    @Override
    public void procesar(byte[] datas) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void procesar(byte[] datas, Integer cedula) throws Exception {
        startProcess(datas, cedula);
    }    
}
