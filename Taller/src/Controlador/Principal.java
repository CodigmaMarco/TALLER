
package Controlador;

import Vista.*;

public class Principal {
    Coordinador miCoordinador;
    
    private void Iniciar(){
        /**
         * Se instancian las clases
         */
        miCoordinador = new Coordinador();
        Registro registro = new Registro();
        Usuarios usuario = new Usuarios();
        ActRegistro actRegistro = new ActRegistro();

        Inicio inicio = new Inicio();
        Login login = new Login();

        /**
         * Se establecen las relaciones entre clases
         */
        login.setCoordinador(miCoordinador);
        registro.setCoordinador(miCoordinador);
        usuario.setCoordinador(miCoordinador);
        usuario.setCoordinador(miCoordinador);
        actRegistro.setCoordinador(miCoordinador);
        
        /*Se establecen relaciones con la clase coordinador*/

        miCoordinador.setLogin(login);
        miCoordinador.setRegistro(registro);
        miCoordinador.setInicio(inicio);
        miCoordinador.setUsuario(usuario);
        miCoordinador.setActRegistro(actRegistro);

        login.setVisible(true);

        /*Se establecen relaciones con la clase coordinador*/
        //  color.setVisible(true);
        // usuario.setVisible(true);
        //  detalle.setVisible(true);
        // productos.setVisible(true);
        // reportes.setVisible(true);
        // total.setVisible(true);
//inicio.setVisible(true);
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal principal = new Principal();
                principal.Iniciar();
            }
        });
    }
    
}
