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
public class Comida extends Entity implements java.io.Serializable{
    
    private Integer codigo;
    private String nombreDeComida;
    private Double valorDeComida;

    public Comida() {
    }

    public Comida(Integer codigo) {
        this.codigo = codigo;
    }

    public Comida(Integer codigo, String nombreDeComida) {
        this.codigo = codigo;
        this.nombreDeComida = normalizeText(nombreDeComida);
    }

    public Comida(Integer codigo, String nombreDeComida, Double valorDeComida) {
        this.codigo = codigo;
        this.nombreDeComida = normalizeText(nombreDeComida);
        this.valorDeComida = valorDeComida;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreDeComida() {
        return nombreDeComida;
    }

    public void setNombreDeComida(String nombreDeComida) {
        this.nombreDeComida = normalizeText(nombreDeComida);
    }

    public Double getValorDeComida() {
        return valorDeComida;
    }

    public void setValorDeComida(Double valorDeComida) {
        this.valorDeComida = valorDeComida;
    }

    @Override
    public String toString() {
        return nombreDeComida;
    }
    
    
}
