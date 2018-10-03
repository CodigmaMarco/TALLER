
package Modelo;

public class ordenVo {
        private int idcliente;
        private int idorden;
        private int idauto;
        private String nomcliente;
        private String modelo;
        private String placa;
        private String numorden;

    public String getNomcliente() {
        return nomcliente;
    }

    public String getNumorden() {
        return numorden;
    }

    public void setNumorden(String numorden) {
        this.numorden = numorden;
    }

    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdorden() {
        return idorden;
    }

    public void setIdorden(int idorden) {
        this.idorden = idorden;
    }

    public int getIdauto() {
        return idauto;
    }

    public void setIdauto(int idauto) {
        this.idauto = idauto;
    }      
        
}
