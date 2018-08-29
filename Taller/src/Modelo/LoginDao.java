package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    
    public LoginVo getTrabajador(String nombre, String password){
           System.out.println("hace consulta");
        Conectarse conn = new Conectarse();

              LoginVo usuario = new LoginVo();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT nombres_tra, password  "
                    + "FROM bd_taller.trabajador "
                    + "WHERE nombres_tra =? and password =? ");

            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            //Muestra resultados de la consulta SQL
            while (resultSet.next()) {
                
                //usuario.setId_user(resultSet.getInt(1));
                //usuario.setUser(resultSet.getString(2));
                usuario.setNombre(resultSet.getString(1));
                usuario.setPassword(resultSet.getString(2));
                // usuario.setApellidos(resultSet.getString(5));
                
            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return usuario;
    }
    
    public LoginVo getAdministrador(String nombre, String password){
           System.out.println("hace consulta 2");
        Conectarse conn = new Conectarse();

              LoginVo usuario = new LoginVo();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT nombre_admin, password  "
                    + "FROM bd_taller.admin "
                    + "WHERE nombre_admin =? and password =? ");

            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            //Muestra resultados de la consulta SQL
            while (resultSet.next()) {
                
                //usuario.setId_user(resultSet.getInt(1));
                //usuario.setUser(resultSet.getString(2));
                usuario.setNombre(resultSet.getString(1));
                usuario.setPassword(resultSet.getString(2));
                // usuario.setApellidos(resultSet.getString(5));
                
            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return usuario;
    }
    
    }