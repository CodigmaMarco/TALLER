package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class clienteDao {
    
         public ArrayList<clienteVo> getCliente() {
             
        Conectarse conn = new Conectarse();
        //Objeto de tipo cliente 
        ArrayList<clienteVo> clientes = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT idcliente, nombre_cliente, colonia_cliente, calle_cliente, "
                    + "numcasa_cliente, telefono_cliente, correo_cliente, id_trabajador "
                    + "FROM bd_taller.cliente ");


            ResultSet resultSet = preparedStatement.executeQuery();
System.out.println("entro al metodo la consulta");
            //Muestra resultados de la consulta SQL
            while (resultSet.next()) {
                clienteVo cliente = new clienteVo();
                cliente.setIdcliente(resultSet.getInt(1));
                cliente.setNombre(resultSet.getString(2));
                cliente.setColonia(resultSet.getString(3));
                cliente.setCalle(resultSet.getString(4));
                cliente.setNum_casa(resultSet.getString(5));
                cliente.setTelefono(resultSet.getInt(6));
                cliente.setId_trabajador(resultSet.getInt(7));
           
            clientes.add(cliente);
            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return clientes;
    }
    
}
