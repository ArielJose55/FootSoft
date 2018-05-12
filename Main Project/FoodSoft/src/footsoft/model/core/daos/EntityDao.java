/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.core.daos;


abstract class EntityDao implements java.io.Serializable{
    
    protected String checkNull(Double real){
        if(real == null){
            return "NULL";
        }else{
            return "'"+real.intValue()+"'";
        }
    }
    
    protected String checkNull(Integer entero){
        if(entero == null){
            return "NULL";
        }else{
            return "'"+entero.intValue()+"'";
        }
    }
    
    protected String checkNull(Boolean bool){
        if(bool == null){
            return "NULL";
        }else{
            return "b'"+((bool.booleanValue())? "1" : "0")+"'";
        }
    }
    
    protected String checkNull(String text){
        if(text == null || text.compareTo("") == 0){
            return "NULL";
        }else{
            return "'"+text+"'";
        }
    }

    
    protected Integer getWasNullInteger(java.sql.ResultSet rs, int column) throws java.sql.SQLException{
        Integer i = rs.getInt(column);
        return rs.wasNull() ? null: i ;
    }
    
    protected String getWasNullString(java.sql.ResultSet rs, int column) throws java.sql.SQLException{
        String i = rs.getString(column);
        return rs.wasNull() ? null:i;
    }
    
    protected Boolean getWasNullBoolean(java.sql.ResultSet rs, int column) throws java.sql.SQLException{
        Boolean i = rs.getBoolean(column);
        return rs.wasNull()? null: i;
    }
    
    protected void checkNull(java.sql.PreparedStatement sentencia,int column,Integer entero) throws java.sql.SQLException{
        if(entero == null){
            sentencia.setNull(column, java.sql.Types.INTEGER);
        }else{
            sentencia.setInt(column, entero);
        }
    }
    
    protected void checkNull(java.sql.PreparedStatement sentencia,int column,Boolean bool) throws java.sql.SQLException{
        if(bool == null){
            sentencia.setNull(column, java.sql.Types.BIT);
        }else{
            sentencia.setBoolean(column,bool);
        }
    }
    
    protected void checkNull(java.sql.PreparedStatement sentencia,int column , String text) throws java.sql.SQLException{
        if(text == null || text.compareTo("") == 0){
            sentencia.setNull(column, java.sql.Types.VARCHAR);
        }else{
            sentencia.setString(column, text);
        }
    }
}
