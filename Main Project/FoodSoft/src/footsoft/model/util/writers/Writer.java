/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.util.writers;

/**
 *
 * @author Klac
 */
public interface Writer {
    public void procesar(byte[] datas) throws Exception;
    public void procesar(byte[] datas,Integer cedula) throws Exception;
}
