package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class clienteDao {

    public ArrayList<clienteVo> getCliente(int idadm) {
        Conectarse conn = new Conectarse();
        ArrayList<clienteVo> clientes = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT cl.idcliente, cl.nombre_cliente, cl.telefono_cliente, "
                    + "cl.colonia_cliente, cl.calle_cliente, "
                    + "cl.numcasa_cliente, cl.correo_cliente "
                    + "FROM cliente as cl\n"
                    + "JOIN trabajador as tr on tr.idtrabajador = cl.id_trabajador\n"
                    + "JOIN admin as adm on adm.idadmin = tr.id_admin\n"
                    + "WHERE adm.idadmin = ?");
            preparedStatement.setInt(1, idadm);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                clienteVo cliente = new clienteVo();
                cliente.setIdcliente(resultSet.getInt(1));
                cliente.setNombre(resultSet.getString(2));
                cliente.setColonia(resultSet.getString(3));
                cliente.setCalle(resultSet.getString(4));
                cliente.setNum_casa(resultSet.getString(5));
                cliente.setTelefono(resultSet.getString(6));
                cliente.setId_trabajador(resultSet.getInt(8));

                clientes.add(cliente);
            }
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return clientes;
    }

    public ArrayList<clienteVo> getClienteForName(String name) {
        Conectarse conn = new Conectarse();
        ArrayList<clienteVo> clientes = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT idcliente, nombre_cliente, colonia_cliente, calle_cliente, "
                    + "numcasa_cliente, telefono_cliente, correo_cliente, id_trabajador "
                    + "FROM cliente "
                    + "WHERE nombre_cliente like '%" + name + "%'");
            // preparedStatement.setString(1, name);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                clienteVo cliente = new clienteVo();
                cliente.setIdcliente(resultSet.getInt(1));
                cliente.setNombre(resultSet.getString(2));
                cliente.setColonia(resultSet.getString(3));
                cliente.setCalle(resultSet.getString(4));
                cliente.setNum_casa(resultSet.getString(5));
                cliente.setTelefono(resultSet.getString(6));
                cliente.setId_trabajador(resultSet.getInt(8));

                clientes.add(cliente);
            }
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return clientes;
    }

    public void registrarCliente(clienteVo cliente) {
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
            preparedStatement.setString(5, cliente.getTelefono());
            preparedStatement.setString(6, cliente.getCorreo());
            preparedStatement.setInt(7, cliente.getId_trabajador());

            preparedStatement.execute();

            conex.getConn().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
        }
    }

    public clienteVo getNomCliente(int id) {

        Conectarse conn = new Conectarse();

        clienteVo cliente = new clienteVo();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT nombre_cliente "
                    + "FROM cliente "
                    + "WHERE idcliente = ? ");

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                cliente.setNombre(resultSet.getString(1));
            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return cliente;
    }
}
