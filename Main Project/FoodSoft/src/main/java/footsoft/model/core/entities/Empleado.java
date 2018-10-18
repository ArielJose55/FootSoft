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
public class Empleado extends Entity implements java.io.Serializable{
    
    private Integer cedula;
    private String nombres;
    private BolsaDeEmpleo bolsaDeEmpleo;
    private TipoDeEmpleado tipoEmpleado;

    public Empleado(Integer cedula) {
        this.cedula = cedula;
    }

    public Empleado(Integer cedula, String nombres) {
        this.cedula = cedula;
        this.nombres = normalizeText(nombres);
    }

    public BolsaDeEmpleo getBolsaDeEmpleo() {
        return bolsaDeEmpleo;
    }

    public void setBolsaDeEmpleo(BolsaDeEmpleo bolsaDeEmpleo) {
        this.bolsaDeEmpleo = bolsaDeEmpleo;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = normalizeText(nombres);
    }

    public TipoDeEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoDeEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        return nombres;
    }
    
    
}
