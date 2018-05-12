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
public class BolsaDeEmpleo extends Entity implements java.io.Serializable{
    
    private Integer codigo;
    private String bolsaDeEmpleo;

    public BolsaDeEmpleo(Integer codigo) {
        this.codigo = codigo;
    }

    public BolsaDeEmpleo(String bolsaDeEmpleo) {
        this.bolsaDeEmpleo = normalizeText(bolsaDeEmpleo);
    }
    
    public BolsaDeEmpleo(Integer codigo, String bolsaDeEmpleo) {
        this.codigo = codigo;
        this.bolsaDeEmpleo = normalizeText(bolsaDeEmpleo);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getBolsaDeEmpleo() {
        return bolsaDeEmpleo;
    }

    public void setBolsaDeEmpleo(String bolsaDeEmpleo) {
        this.bolsaDeEmpleo = normalizeText(bolsaDeEmpleo);
    }

    @Override
    public String toString() {
        return bolsaDeEmpleo;
    }
    
}
