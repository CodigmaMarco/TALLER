/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author luism
 */
public class clienteDao {

    public void registrarCliente(clienteVo cliente) {
        Conectarse conex = new Conectarse();

        try {
            String query = " INSERT into cliente (nombre_cliente, telefono_cliente, colonia_cliente, calle_cliente, numcasa_cliente, correo_cliente )"
                    + " values (?, ?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = conex.getConn().prepareStatement(query);
            preparedStatement.setString(1, cliente.getNombre());

            preparedStatement.execute();

            //JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informacion",JOptionPane.INFORMATION_MESSAGE);
            conex.getConn().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
        }
    }
}
