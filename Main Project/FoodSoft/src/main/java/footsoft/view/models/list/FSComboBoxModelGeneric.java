/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.models.list;

import footsoft.model.core.daos.BolsaDeEmpleoDao;
import footsoft.model.core.daos.ComidaDao;
import footsoft.model.core.daos.TipoDeEmpleadoDao;
import footsoft.model.core.entities.Comida;
import footsoft.model.core.entities.ValorDeComida;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Klac
 */
public class FSComboBoxModelGeneric extends javax.swing.DefaultComboBoxModel<Object>{
    
    private final java.util.List<Object> list;
    

    public FSComboBoxModelGeneric(Class clase) {
        list = new java.util.ArrayList<Object>();
        try {
            initComponents(clase);
        } catch (SQLException ex) {
            Logger.getLogger(FSComboBoxModelGeneric.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public FSComboBoxModelGeneric(Class clase, java.util.List<ValorDeComida> elements){
        this(clase);
        limitViewElements(clase, elements);
    }
    
    private void limitViewElements(Class clase, java.util.List<ValorDeComida> elements){
        if(clase.getSimpleName().equals("Comida")){
            if(elements != null && !elements.isEmpty()){
                for (ValorDeComida valor : elements) {
                    removeElement(valor);
                }
            }
        }
    }
    
   
    @Override
    public void removeElement(Object element){
        for (Object object : list) {
            Comida comida = (Comida) object;
            if(comida.getNombreDeComida().compareTo(((ValorDeComida)element).getComida().getNombreDeComida()) == 0){
                if(list.remove(object)){
                    fireIntervalRemoved(this, list.size(), list.size() + 1);
                    break;
                }
            }
        }
    }
    
    private void initComponents(Class clase) throws SQLException {
        if(clase.getSimpleName().equals("BolsaDeEmpleo")){
            list.addAll(new BolsaDeEmpleoDao().getAllBolsaDeEmpleo());
        }else if(clase.getSimpleName().equals("TipoDeEmpleado")){
            list.addAll(new TipoDeEmpleadoDao().getAllTipoDeEmpleado());
        }else if(clase.getSimpleName().equals("Comida")){
            list.addAll(new ComidaDao().getListAllComidas());
        }
    }

    @Override
    public void addElement(Object element) {
        int ultimo = list.size();
        list.add(element);
        fireIntervalAdded(this, ultimo, list.size());
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
