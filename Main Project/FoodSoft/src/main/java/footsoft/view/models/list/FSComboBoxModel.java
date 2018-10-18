/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.models.list;

import footsoft.model.core.daos.BolsaDeEmpleoDao;
import footsoft.model.core.daos.TipoDeEmpleadoDao;

/**
 *
 * @author Klac
 */
public class FSComboBoxModel extends javax.swing.DefaultComboBoxModel<Object>{
    
    private final TypeData tipoDato;
    private java.util.List<Object> list;

    public FSComboBoxModel(TypeData tipoDato) {
        super();
        this.tipoDato = tipoDato;
        initComponents();
    }
    
    private void initComponents(){
        switch(tipoDato){
            case BOLSA_DE_EMPLEO:{
                list = new java.util.ArrayList<Object>();
                try{
                    list.addAll(new BolsaDeEmpleoDao().getAllBolsaDeEmpleo());
                }catch(java.sql.SQLException ex){
                    list.add("Error al obtener las bolsas de empleo");
                }finally{
                    fireIntervalAdded(this, 0, list.size());
                }
                break;
            }
            case TIPO_DE_EMPLEADO:{
                list = new java.util.ArrayList<Object>();
                try{
                    list.addAll(new TipoDeEmpleadoDao().getAllTipoDeEmpleado());
                }catch(java.sql.SQLException ex){
                    list.add("Error al obtener los centros de costos");
                }finally{
                    fireIntervalAdded(this, 0, list.size());
                }
                break;
            }
            case OTHER:{
                list = new java.util.ArrayList<Object>();
                break;
            }
        }
    }

    public void showItems(boolean ocultar){
        if(ocultar){
            fireIntervalRemoved(this, 0, list.size());
        }else{
            fireIntervalAdded(this, 0, list.size());
        }
    }
    
    public TypeData getTipoDato() {
        return tipoDato;
    }
    
    @Override
    public Object getElementAt(int index) {
        return ( list == null || list.isEmpty()) ? null : list.get(index);
    }

    @Override
    public int getSize() {
        return ( list == null || list.isEmpty()) ? 0 : list.size();
    }
    
    
}
