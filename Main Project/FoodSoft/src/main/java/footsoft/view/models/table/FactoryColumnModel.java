/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.view.models.table;

/**
 *
 * @author Klac
 */
public class FactoryColumnModel {
    
    public static javax.swing.table.TableColumnModel createModelColumnTableViewFoot(){
        
        javax.swing.table.DefaultTableColumnModel tablaColumn = new  javax.swing.table.DefaultTableColumnModel();
        tablaColumn.setColumnMargin(0);
        int ancho[] ={60,30,30,40};
        String cabeceras[] = {"Comida","Descuento","Subsidio","Valor Total"};
        for(int i = 0; i < 4 ; i++){
                javax.swing.table.TableColumn columna = new javax.swing.table.TableColumn(i,ancho[i]);
                columna.setHeaderValue(cabeceras[i]);
                javax.swing.table.DefaultTableCellRenderer rowRenderer = FactoryCellTableRenderer.createTableCellRenderer(-1, TypeTable.TABLE_VIEW_FOOT);
                columna.setHeaderRenderer(rowRenderer);
                rowRenderer = FactoryCellTableRenderer.createTableCellRenderer(i, TypeTable.TABLE_VIEW_FOOT);
                columna.setCellRenderer(rowRenderer);
                tablaColumn.addColumn(columna);
        }
        return tablaColumn;
    }
}
