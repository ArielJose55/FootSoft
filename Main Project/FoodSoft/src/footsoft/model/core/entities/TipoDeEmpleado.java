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
public class TipoDeEmpleado extends Entity implements java.io.Serializable{
    
    private Integer codigo;
    private String nombre;
    private java.util.List<ValorDeComida> listaDeValoresDeComidas;

    public TipoDeEmpleado() {
        listaDeValoresDeComidas = new java.util.ArrayList<ValorDeComida>();
    }

    public TipoDeEmpleado(Integer codigo) {
        this();
        this.codigo = codigo;
    }

    public TipoDeEmpleado(Integer codigo, String nombre) {
        this(codigo);
        this.nombre = normalizeText(nombre);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = normalizeText(nombre);
    }

    public List<ValorDeComida> getListaDeValoresDeComidas() {
        return listaDeValoresDeComidas;
    }

    public void setListaDeValoresDeComidas(List<ValorDeComida> listaDeValoresDeComidas) {
        this.listaDeValoresDeComidas = listaDeValoresDeComidas;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
