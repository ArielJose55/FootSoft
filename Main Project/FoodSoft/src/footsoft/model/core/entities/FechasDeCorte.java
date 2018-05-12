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
public class FechasDeCorte  extends  Entity implements java.io.Serializable{
    
    private Integer codigo;
    private java.sql.Date fechaDeInicio;
    private java.sql.Date fechaDeCierre;
    private Boolean fechaDeCortePredominante;

    public FechasDeCorte() {
    }

    public FechasDeCorte(Integer codigo) {
        this.codigo = codigo;
    }
    
    public FechasDeCorte(Integer codigo, java.sql.Date fechaDeInicio, java.sql.Date fechaDeCierre) {
        this.codigo = codigo;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeCierre = fechaDeCierre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public java.sql.Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(java.sql.Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public java.sql.Date getFechaDeCierre() {
        return fechaDeCierre;
    }

    public void setFechaDeCierre(java.sql.Date fechaDeCierre) {
        this.fechaDeCierre = fechaDeCierre;
    }

    public Boolean isFechaDeCortePredominante() {
        return fechaDeCortePredominante;
    }

    public void setFechaDeCortePredominante(Boolean fechaDeCortePredominante) {
        this.fechaDeCortePredominante = fechaDeCortePredominante;
    }
}
