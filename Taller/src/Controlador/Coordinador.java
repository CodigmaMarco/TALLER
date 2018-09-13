package Controlador;

import Modelo.LoginDao;
import Modelo.LoginVo;
import Modelo.adminVo;
import Modelo.areaVo;
import Modelo.autoDao;
import Modelo.autoVo;
import Modelo.chatVo;
import Modelo.clienteDao;
import Modelo.clienteVo;
import Modelo.ordenDao;
import Modelo.ordenVo;
import Modelo.procesoDao;
import Modelo.procesoVo;
import Modelo.servicioVo;
import Modelo.tpVo;
import Modelo.trabajadorDao;
import Modelo.trabajadorVo;
import Vista.*;
import java.util.ArrayList;

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

    public static LoginVo buscarTrabajador(String nombre, String password) {
        LoginDao system = new LoginDao();
        return system.getTrabajador(nombre, password);
    }

    public LoginVo buscarAdministrador(String nombre, String password) {
        LoginDao system = new LoginDao();
        return system.getAdministrador(nombre, password);
    }

    public static ArrayList<clienteVo> buscarUsuario() {
        clienteDao cliente = new clienteDao();
        return cliente.getCliente();
    }

    public static ArrayList<autoVo> buscarAuto(int id) {
        autoDao auto = new autoDao();
        return auto.getAuto(id);
    }

    public static void agregarCliente(clienteVo cliente) {
        clienteDao client = new clienteDao();
        client.registrarCliente(cliente);
    }

       public static void agregarAuto(autoVo auto) {
        autoDao aut = new autoDao();
        aut.registrarAuto(auto);
    }
    
    public static void addTrabajador(trabajadorVo tv) {
        trabajadorDao tra = new trabajadorDao();
        tra.addTrabajador(tv);
    }

    public static ArrayList<trabajadorVo> getTrabajadores() {
        trabajadorDao traba = new trabajadorDao();
        return traba.getTrabajadores();
    }

    public static trabajadorVo getTrabajadorID(int id) {
        trabajadorDao trab = new trabajadorDao();
        return trab.getTrabajadorID(id);
    }

    public static void updateTrabajador(trabajadorVo t) {
        trabajadorDao trabajador = new trabajadorDao();
        trabajador.updateTrabajador(t);
    }

    public static void BorrarTrabajador(trabajadorVo t) {
        trabajadorDao trabajador = new trabajadorDao();
        trabajador.borrarTrabajador(t);
    }
    
    public static ordenVo getOrden(int orden){
    ordenDao ord = new ordenDao();
    return ord.getOrden(orden);
    }
    
    public static ArrayList<procesoVo> getProcesos (int orden){
    procesoDao pr = new procesoDao();
    return pr.getProcesos(orden);
    }
    
    public static String getComentarios(int proceso){
    procesoDao pr = new procesoDao();
    return pr.getComentarios(proceso);
    }
    
    public static void updateProceso (procesoVo pro){
    procesoDao p = new procesoDao();
    p.updateProceso(pro);
    }
    
}
