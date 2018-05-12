/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.core.daos;

import footsoft.model.core.entities.BolsaDeEmpleo;
import footsoft.model.util.connections.ConnectionPool;

/**
 *
 * @author Klac
 */
public class BolsaDeEmpleoDao extends EntityDao implements java.io.Serializable{
    
    private final ResourceManager RM = new ResourceManager(BolsaDeEmpleoDao.class);
    
    public boolean addBolsaDeEmpleo(BolsaDeEmpleo bolsa) throws java.sql.SQLException {
        java.sql.Connection connection = null;
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            java.sql.PreparedStatement statement = connection.prepareStatement(RM.getSQLStatement("addBolsaDeEmpleo"));
            statement.setString(1, bolsa.getBolsaDeEmpleo());
            int i = statement.executeUpdate();
            statement.close();
            return i != 0;
        }finally{
            if(connection != null){
                ConnectionPool.getConexionPool().devolverConexion(connection);
            }
        }
        
    }
    
    public BolsaDeEmpleo getBolsaDeEmpleo(int codigo) throws java.sql.SQLException {
        java.sql.Connection connection = null;
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            java.sql.PreparedStatement statement = connection.prepareStatement(RM.getSQLStatement("getBolsaDeEmpleo"));
            statement.setInt(1, codigo);
            java.sql.ResultSet rs = statement.executeQuery();
            if(!rs.last()){
                statement.close();
                throw new java.sql.SQLException("Esta bolsa de empleo no existe");
            }
            BolsaDeEmpleo bolsa = new BolsaDeEmpleo(codigo, rs.getString(2));
            rs.close();
            statement.close();
            return bolsa;
        }finally{
            if(connection != null){
                ConnectionPool.getConexionPool().devolverConexion(connection);
            }
        }
    }
    
    public java.util.List<BolsaDeEmpleo> getAllBolsaDeEmpleo() throws java.sql.SQLException {
        java.sql.Connection connection = null;
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            final java.util.List<BolsaDeEmpleo> list = new java.util.ArrayList<BolsaDeEmpleo>();
            java.sql.Statement statement = connection.createStatement();
            java.sql.ResultSet rs = statement.executeQuery(RM.getSQLStatement("getAllBolsaDeEmpleo"));
            while(rs.next()){
                list.add(new BolsaDeEmpleo(rs.getInt(1), rs.getString(2)));
            }
            rs.close();
            statement.close();
            return list;
        }finally{
            if(connection != null){
                ConnectionPool.getConexionPool().devolverConexion(connection);
            }
        }
    }
    
    private boolean deleteBolsaDeEmpleo(int codigo) throws java.sql.SQLException {
        java.sql.Connection connection = null;
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            return false;// OJO
        }finally{
            if(connection != null){
                ConnectionPool.getConexionPool().devolverConexion(connection);
            }
        }
    }
    
    private boolean updateBolsaDeEmpleo(BolsaDeEmpleo bolsa) throws java.sql.SQLException {
        java.sql.Connection connection = null;
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            return false;// OJO
        }finally{
            if(connection != null){
                ConnectionPool.getConexionPool().devolverConexion(connection);
            }
        }
    }
}
