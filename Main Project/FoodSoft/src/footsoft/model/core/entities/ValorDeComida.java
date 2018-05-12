/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.core.entities;

import java.util.List;

/**
 *
 * @author Klac
 */
public class ValorDeComida extends Entity implements java.io.Serializable{

    private Integer codigo;
    private Double descuento;
    private Double subsidio;
    private Comida comida;
    
    
    public ValorDeComida() {
        
    }

    public ValorDeComida(Integer codigo) {
        this();
        this.codigo = codigo;
    }

    public ValorDeComida(Integer codigo, Double descuento) {
        this(codigo);
        this.descuento = descuento;
    }

    public ValorDeComida(Integer codigo, Double descuento, Double subsidio) {
        this(codigo, descuento);
        this.subsidio = subsidio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getSubsidio() {
        return subsidio;
    }

    public void setSubsidio(Double subsidio) {
        this.subsidio = subsidio;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }
    
}
