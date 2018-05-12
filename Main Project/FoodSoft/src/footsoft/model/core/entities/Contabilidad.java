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
public class Contabilidad extends Entity implements java.io.Serializable{
    
    private Integer codigo;
    private Empleado empleado;
    private Comida comida;
    private java.util.List<ConsumoDeComida> listaDeConsumoComidas;

    public Contabilidad() {
        listaDeConsumoComidas = new java.util.ArrayList<ConsumoDeComida>();
    }

    public Contabilidad(Integer codigo) {
        this();
        this.codigo = codigo;
    }

    public Contabilidad(Integer codigo, Empleado empleado) {
        this(codigo);
        this.empleado = empleado;
    }

    public Contabilidad(Integer codigo, Empleado empleado, Comida comida) {
        this(codigo, empleado);
        this.comida = comida;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public List<ConsumoDeComida> getListaDeConsumoComidas() {
        return listaDeConsumoComidas;
    }

    public void setListaDeConsumoComidas(List<ConsumoDeComida> listaDeConsumoComidas) {
        this.listaDeConsumoComidas = listaDeConsumoComidas;
    }
    
}
