/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.core.daos;

import footsoft.model.core.entities.Comida;
import footsoft.model.util.connections.ConnectionPool;

/**
 *
 * @author Klac
 */
public class ComidaDao extends EntityDao implements java.io.Serializable{
    
    private final ResourceManager RM = new ResourceManager(ComidaDao.class);

    public ComidaDao() {
    }
    
    public boolean addComida(Comida comida) throws java.sql.SQLException {
        java.sql.Connection connection = null;
        
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            java.sql.PreparedStatement statement = connection.prepareStatement(RM.getSQLStatement("addComida"));
            statement.setString(1, comida.getNombreDeComida());
            statement.setDouble(2, comida.getValorDeComida());
            int i = statement.executeUpdate();
            statement.close();
            return i != 0;
        }finally{
            if(connection != null){
                ConnectionPool.getConexionPool().devolverConexion(connection);
            }
        }
    }
    
    public java.util.List<Comida> getListAllComidas() throws java.sql.SQLException{
        java.sql.Connection connection = null;
        
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            java.sql.Statement statement = connection.createStatement();
            java.util.List<Comida> list = new java.util.ArrayList<Comida>();
            java.sql.ResultSet rs = statement.executeQuery(RM.getSQLStatement("getListAllComidas"));
            while(rs.next()){
                Comida comida = new Comida(rs.getInt(1), rs.getString(2), rs.getDouble(3));
                list.add(comida);
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
}
