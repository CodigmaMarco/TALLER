
package Modelo;

public class LoginVo {
       private Integer id_user;
    private String user;
    private String password;
    private String nombre;
    private String apellidos; 

    public Integer getId_user() {
        return id_user;
    }

  /*  public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user
    }*/

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
    
}
