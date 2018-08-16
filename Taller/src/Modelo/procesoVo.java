package Modelo;

import java.util.Date;

public class procesoVo {

    private int idproceso;
    private int status;
    private int observaciones;
    private Date fecha_inicio;
    private int imagen_proceso;
    private int id_servicio;
    private int id_orden;
    private int idauto;

    public int getIdproceso() {
        return idproceso;
    }

    public void setIdproceso(int idproceso) {
        this.idproceso = idproceso;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(int observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getImagen_proceso() {
        return imagen_proceso;
    }

    public void setImagen_proceso(int imagen_proceso) {
        this.imagen_proceso = imagen_proceso;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public int getIdauto() {
        return idauto;
    }

    public void setIdauto(int idauto) {
        this.idauto = idauto;
    }
    
    
    
    
}
