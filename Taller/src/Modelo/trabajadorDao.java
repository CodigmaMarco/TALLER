package Modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class trabajadorDao {
   
    public void addTrabajador(trabajadorVo empleado){
        Conectarse conn = new Conectarse();
        
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
            "INSERT INTO trabajador (nombres_tra, apellidop_tra, apellidom_tra, edadt, tipo_trabajo, id_admin, password) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?)");
            
            preparedStatement.setString(1, empleado.getNombre());
            preparedStatement.setString(2, empleado.getApaterno());
            preparedStatement.setString(3, empleado.getAmaterno());
            preparedStatement.setInt(4, empleado.getEdad());
            preparedStatement.setString(5,empleado.getTipo_trabajo());
            preparedStatement.setInt(6, empleado.getId_admin());
            preparedStatement.setString(7, empleado.getPassword());
            
            preparedStatement.executeUpdate();
            
            //Cierra todo
            conn.getConn().close();
            //resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
