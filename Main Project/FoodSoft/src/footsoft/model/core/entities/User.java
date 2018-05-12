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
public class User implements java.io.Serializable,Comparable<String>{
    
    private Integer codigo;
    private String password;

    public User() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int compareTo(String pseudoPassword) {
        if(pseudoPassword == null || password == null) return -1;
        return password.compareTo(pseudoPassword);
    }

}
