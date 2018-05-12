/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.core.daos;

import footsoft.model.core.entities.Empleado;
import footsoft.model.core.entities.TipoDeEmpleado;
import footsoft.model.util.connections.ConnectionPool;

/**
 *
 * @author Klac
 */
public class EmpleadoDao extends EntityDao implements java.io.Serializable{
        
    private final ResourceManager RM = new ResourceManager(EmpleadoDao.class);
    
    public boolean addEmpleado(Empleado empleado) throws java.sql.SQLException {
        java.sql.Connection connection = null;
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            connection.setAutoCommit(false);
            java.sql.PreparedStatement statement = connection.prepareStatement(RM.getSQLStatement("addEmpleado"));
            statement.setInt(1, empleado.getCedula());
            statement.setString(2, empleado.getNombres());
            statement.setInt(3, empleado.getTipoEmpleado().getCodigo());
            statement.setInt(4, empleado.getBolsaDeEmpleo().getCodigo());
            int i = statement.executeUpdate();
            if(i == 0){
                statement.close();
                return false;
            }
//            for(TipoDeComida comida : empleado.getTipoEmpleado().getTipoDeComidas()){
//                statement = connection.prepareStatement(RM.getSQLStatement("addContabilidad"));
//                statement.setInt(1, comida.getCodigo());
//                statement.setInt(2, empleado.getCedula());
//                statement.execute();                
//            }
            connection.commit();
            return i != 0;
        }catch(java.sql.SQLException ex){
            if(connection != null){
                connection.rollback();
            }
            throw ex;
        }finally{
            if(connection != null){
                connection.setAutoCommit(true);
                ConnectionPool.getConexionPool().devolverConexion(connection);
            }
        }
    }
    
    public Integer getCodigoTipoDeEmpleado(int cedula) throws java.sql.SQLException {
        java.sql.Connection connection = null;
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            java.sql.PreparedStatement statement = connection.prepareStatement(RM.getSQLStatement("getCodigoTipoDeEmpleado"));
            statement.setInt(1, cedula);
            java.sql.ResultSet rs = statement.executeQuery();
            if(rs.last()){
                return rs.getInt(1);
            }
            throw new java.sql.SQLException();
        }finally{
            if(connection != null){
                ConnectionPool.getConexionPool().devolverConexion(connection);
            }
        }
    }
}
