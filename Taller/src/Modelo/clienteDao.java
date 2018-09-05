package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class clienteDao {

    public ArrayList<clienteVo> getCliente() {

        Conectarse conn = new Conectarse();

        ArrayList<clienteVo> clientes = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT idcliente, nombre_cliente, colonia_cliente, calle_cliente, "
                    + "numcasa_cliente, telefono_cliente, correo_cliente, id_trabajador "
                    + "FROM bd_taller.cliente ");

            ResultSet resultSet = preparedStatement.executeQuery();

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

    public void registrarColor(clienteVo cliente) {
        Conectarse conex = new Conectarse();

        try {
            String query = " insert into cliente (nombre_cliente, colonia_cliente, calle_cliente, "
                    + "numcasa_cliente, telefono_cliente, correo_cliente, id_trabajador)"
                    + " values (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = conex.getConn().prepareStatement(query);
            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getColonia());
            preparedStatement.setString(3, cliente.getCalle());
            preparedStatement.setString(4, cliente.getNum_casa());
            preparedStatement.setInt(5, cliente.getTelefono());
            preparedStatement.setString(6, cliente.getCorreo());
            preparedStatement.setInt(7, cliente.getId_trabajador());

            preparedStatement.execute();

            conex.getConn().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
        }
    }

}
