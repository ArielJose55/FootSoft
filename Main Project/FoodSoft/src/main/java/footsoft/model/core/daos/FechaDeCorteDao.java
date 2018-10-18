/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.core.daos;

import footsoft.model.core.entities.FechasDeCorte;
import footsoft.model.util.connections.ConnectionPool;

/**
 *
 * @author Klac
 */
public class FechaDeCorteDao extends EntityDao implements java.io.Serializable{

    private final ResourceManager RM = new ResourceManager(FechaDeCorteDao.class);
    
    public FechaDeCorteDao() {
    }
    
    public void updateFechaDeCorte(FechasDeCorte fechas) throws java.sql.SQLException {
        java.sql.Connection connection = null;
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            connection.setAutoCommit(false);
            
            java.sql.Statement statement = connection.createStatement();
            java.sql.ResultSet rs = statement.executeQuery(RM.getSQLStatement("getCountFechaDeCorte"));
            java.sql.PreparedStatement pstatement;
            if(rs.last() && rs.getInt(1) == 1){
                pstatement = connection.prepareStatement(RM.getSQLStatement("updateFechaDeCorte"));
                pstatement.setDate(1, fechas.getFechaDeInicio());
                pstatement.setDate(2, fechas.getFechaDeCierre());
                pstatement.setBoolean(3, fechas.isFechaDeCortePredominante());
                pstatement.execute();
            }else{
                pstatement = connection.prepareStatement(RM.getSQLStatement("addFechaDeCorte"));
                pstatement.setDate(1, fechas.getFechaDeInicio());
                pstatement.setDate(2, fechas.getFechaDeCierre());
                pstatement.setBoolean(3, fechas.isFechaDeCortePredominante());
                pstatement.execute();
            }
            connection.commit();
            pstatement.close();
            rs.close();
            statement.close();
        }catch (java.sql.SQLException ex){
            if(connection != null)
                connection.rollback();
            throw  ex;
        }finally{
            if(connection != null){
                connection.setAutoCommit(true);
                ConnectionPool.getConexionPool().devolverConexion(connection);
            }
        }
    }
    
    public FechasDeCorte getFechasDeCorte() throws java.sql.SQLException {
        java.sql.Connection connection = null;
       
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            java.sql.Statement statement = connection.createStatement();
            java.sql.ResultSet rs = statement.executeQuery(RM.getSQLStatement("getFechasDeCorte"));
            if(rs.last()){
                FechasDeCorte fecha = new FechasDeCorte(rs.getInt(1), rs.getDate(2), rs.getDate(3));
                fecha.setFechaDeCortePredominante(rs.getBoolean(4));
                return fecha;
            }
            throw new java.sql.SQLException("Fechas de corte aún no registradas");
        }finally{
            if(connection != null){
                ConnectionPool.getConexionPool().devolverConexion(connection);
            }
        }
    }
    
}
