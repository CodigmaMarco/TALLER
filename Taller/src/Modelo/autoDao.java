package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class autoDao {

    public ArrayList<autoVo> getAuto(int id) {

        Conectarse conn = new Conectarse();
        //Objeto de tipo cliente 
        ArrayList<autoVo> autos = new ArrayList();
        try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
                    "SELECT A.idauto, A.placa, A.modelo, A.marca, A.año, A.id_cliente\n"
                    + "FROM bd_taller.auto A\n"
                    + "WHERE A.id_cliente = ? ");
            
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                autoVo auto = new autoVo();

                auto.setIdauto(resultSet.getInt(1));
                auto.setPlaca(resultSet.getString(2));
                auto.setModelo(resultSet.getString(3));
                auto.setMarca(resultSet.getString(4));
                auto.setAño(resultSet.getString(5));
                auto.setIdcliente(resultSet.getInt(6));

                autos.add(auto);
            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return autos;
    }
}
