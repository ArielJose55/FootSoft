/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package footsoft.model.core.daos;

import footsoft.model.core.entities.TipoDeEmpleado;
import footsoft.model.core.entities.ValorDeComida;
import footsoft.model.util.connections.ConnectionPool;

/**
 *
 * @author Klac
 */
public class TipoDeEmpleadoDao extends EntityDao implements java.io.Serializable{
    
    private final ResourceManager RM = new ResourceManager(TipoDeEmpleadoDao.class);

    public TipoDeEmpleadoDao() {
    }
    
    public void addTipoEmpleado(TipoDeEmpleado tipoEmpleado) throws java.sql.SQLException {
        java.sql.Connection connection = null;
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            connection.setAutoCommit(false);
            java.sql.PreparedStatement statement = connection.prepareStatement(RM.getSQLStatement("addTipoEmpleado"),java.sql.PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, tipoEmpleado.getNombre());
            statement.execute();
            java.sql.ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
                for(ValorDeComida valor : tipoEmpleado.getListaDeValoresDeComidas()){
                    statement = connection.prepareStatement(RM.getSQLStatement("addValorComida"));
                    statement.setDouble(1, valor.getDescuento());
                    statement.setDouble(2, valor.getSubsidio());
                    statement.setInt(3, rs.getInt(1));
                    statement.setInt(4, valor.getComida().getCodigo());
                    statement.execute();
                }
            }
            connection.commit();
            rs.close();
            statement.close();
        }catch(java.sql.SQLException ex){
            if(connection != null)
                connection.rollback();
            throw ex;
        }finally{
            if(connection != null){
                connection.setAutoCommit(true);
                ConnectionPool.getConexionPool().devolverConexion(connection);
            }
        }
    }
    
    public java.util.List<TipoDeEmpleado> getAllTipoDeEmpleado() throws java.sql.SQLException{
        java.sql.Connection connection = null;
        try{
            connection = ConnectionPool.getConexionPool().getConnection();
            java.util.List<TipoDeEmpleado> list = new java.util.ArrayList<TipoDeEmpleado>();
            java.sql.Statement statement = connection.createStatement();
            java.sql.ResultSet rs = statement.executeQuery(RM.getSQLStatement("getAllTipoDeEmpleado"));
            while(rs.next()){
                TipoDeEmpleado tipo = new TipoDeEmpleado(rs.getInt(1), rs.getString(2));
                list.add(tipo);
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
