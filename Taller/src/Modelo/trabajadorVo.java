
package Modelo;


public class trabajadorVo {
   
    private int idtrabajador;
    private String nombre;
    private int edad;
    private String tipo_trabajo; 
    private int id_admin;

    public int getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo_trabajo() {
        return tipo_trabajo;
    }

    public void setTipo_trabajo(String tipo_trabajo) {
        this.tipo_trabajo = tipo_trabajo;
    }

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }
    
    
}
