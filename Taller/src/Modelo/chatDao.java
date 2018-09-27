package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class chatDao {

public ArrayList<chatVo> getMensajes(int orden){
        Conectarse conn = new Conectarse();
        ArrayList<chatVo> conversacion = new ArrayList<>();
        
            try {
            PreparedStatement preparedStatement = conn.getConn().prepareStatement(
            "SELECT c.idchat,c.cometario,c.fechacomentario, c.id_cliente,c.id_trabajador,c.id_orden "
                    + " FROM chat as c "
                    + " JOIN orden as ord on ord.idorden = c.id_orden "
                    + " WHERE ord.numorden = ? "
                    + " ORDER BY c.fechacomentario ");
            
            preparedStatement.setInt(1, orden);
            ResultSet resultSet = preparedStatement.executeQuery();

            //Muestra resultados de la consulta SQL
            while (resultSet.next()) {
                chatVo mensaje = new chatVo();
                
                mensaje.setIdchat(resultSet.getInt(1));
                mensaje.setComentario(resultSet.getString(2));
                mensaje.setFechacomentario(resultSet.getString(3));
                mensaje.setId_cliente(resultSet.getInt(4));
                mensaje.setId_trabajador(resultSet.getInt(5));
                mensaje.setId_orden(resultSet.getInt(6));
                
                conversacion.add(mensaje);

            }
            //Cierra todo
            conn.getConn().close();
            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        //Retorna el usuario
        return conversacion;
    }
    
    public void insertMensaje(chatVo mensaje) {
        Conectarse conex = new Conectarse();

        try {
            String query = " insert into chat (cometario, id_trabajador, id_orden)"
                    + " values (?, ?, ?)";

            PreparedStatement preparedStatement = conex.getConn().prepareStatement(query);
            preparedStatement.setString(1, mensaje.getComentario());
            preparedStatement.setInt(2, mensaje.getId_trabajador());
            preparedStatement.setInt(3, mensaje.getId_orden());
            
            preparedStatement.execute();

            conex.getConn().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se Registro");
        }
    }

}
