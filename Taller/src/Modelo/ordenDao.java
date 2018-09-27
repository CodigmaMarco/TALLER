package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ordenDao {

    public ordenVo getOrden(int orden) {
        Conectarse conn = new Conectarse();

        ordenVo or = new ordenVo();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT o.numorden, o.id_cliente, o.id_auto, cl.nombre_cliente, au.placa, au.modelo, o.id_cliente "
                    + " FROM orden as o  "
                    + "JOIN cliente as cl  on cl.idcliente = o.id_cliente "
                    + "JOIN auto as au on au.idauto = o.id_auto "
                    + "WHERE numorden = ? ");

            preparedStatement.setInt(1, orden);
            ResultSet resultSet = preparedStatement.executeQuery();

            //Muestra resultados de la consulta SQL
            while (resultSet.next()) {

                or.setNumorden(resultSet.getInt(1));
                or.setIdcliente(resultSet.getInt(2));
                or.setIdauto(resultSet.getInt(3));
                or.setNomcliente(resultSet.getString(4));
                or.setPlaca(resultSet.getString(5));
                or.setModelo(resultSet.getString(6));
                or.setIdorden(resultSet.getInt(7));

            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return or;
    }

    public void registrarOrden(ordenVo orden) {
        Conectarse conex = new Conectarse();

        try {
            String query = " insert into orden (id_cliente, id_auto, numorden)"
                    + " values (?, ?, ?)";

            PreparedStatement preparedStatement = conex.getConn().prepareStatement(query);
            preparedStatement.setInt(1, orden.getIdcliente());
            preparedStatement.setInt(2, orden.getIdauto());
            preparedStatement.setInt(3, orden.getNumorden());
            preparedStatement.execute();
            conex.getConn().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
        }
    }
}
