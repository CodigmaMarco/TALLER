package Controlador;

import Modelo.LoginDao;
import Modelo.LoginVo;
import Modelo.adminVo;
import Modelo.areaVo;
import Modelo.autoVo;
import Modelo.chatVo;
import Modelo.clienteVo;
import Modelo.ordenVo;
import Modelo.procesoVo;
import Modelo.servicioVo;
import Modelo.tpVo;
import Modelo.trabajadorVo;
import Vista.*;

public class Coordinador {

    private Login login;
    private Registro registro;
    private Inicio inicio;
    private Usuarios usuario;
    private ActRegistro actRegistro;

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public Inicio getInicio() {
        return inicio;
    }

    public void setInicio(Inicio inicio) {
        this.inicio = inicio;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public ActRegistro getActRegistro() {
        return actRegistro;
    }

    public void setActRegistro(ActRegistro actRegistro) {
        this.actRegistro = actRegistro;
    }

    public LoginVo buscarUser(String nombre,String password){
    LoginDao system = new LoginDao();
    return system.getUser(nombre, password);   
    }

}
