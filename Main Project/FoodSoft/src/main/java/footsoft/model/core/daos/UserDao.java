/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.core.daos;

import footsoft.model.core.entities.User;
import footsoft.model.util.connections.ConnectionPool;

/**
 *
 * @author Klac
 */
public class UserDao {
    
    private final ResourceManager RM = new ResourceManager(User.class);
    
    
    public String checkUserRegistrator() throws java.sql.SQLException{
        java.sql.Connection connection = null;
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            java.sql.Statement statement = connection.createStatement();
            java.sql.ResultSet rs = statement.executeQuery(RM.getSQLStatement("checkUserRegistrator"));
            rs.last();
            if(rs.getRow() == 1){
                String password = rs.getString(1);
                return password;
            }
            throw new java.sql.SQLException("Ningun Resultado Obtenido");
        }finally{
            if(connection != null){
                ConnectionPool.getConexionPool().devolverConexion(connection);
            }
        }
    }
    
    public String checkUserAdministrator() throws java.sql.SQLException{
        java.sql.Connection connection = null;
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            java.sql.Statement statement = connection.createStatement();
            java.sql.ResultSet rs = statement.executeQuery(RM.getSQLStatement("checkUserAdministrator"));
            rs.last();
            if(rs.getRow() == 1){
                String password = rs.getString(1);
                return password;
            }
            throw new java.sql.SQLException("Ningun Resultado Obtenido");
        }finally{
            if(connection != null){
                ConnectionPool.getConexionPool().devolverConexion(connection);
            }
        }
    }
}
