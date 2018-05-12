/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.core.entities;


/**
 *
 * @author Klac
 */
public class ConsumoDeComida extends Entity implements java.io.Serializable{
    
    private Integer codigo;
    private java.sql.Timestamp fechaDeConsumo;

    public ConsumoDeComida() {
    }

    public ConsumoDeComida(Integer codigo) {
        this.codigo = codigo;
    }  

    public ConsumoDeComida(Integer codigo, java.sql.Timestamp fechaDeConsumo) {
        this.codigo = codigo;
        this.fechaDeConsumo = fechaDeConsumo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public java.sql.Timestamp getFechaDeConsumo() {
        return fechaDeConsumo;
    }

    public void setFechaDeConsumo(java.sql.Timestamp fechaDeConsumo) {
        this.fechaDeConsumo = fechaDeConsumo;
    }
    
}
