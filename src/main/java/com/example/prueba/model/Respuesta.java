package com.example.prueba.model;

import java.util.HashMap;
import java.util.Map;

public class Respuesta {

    private int estatus;
    private String mensaje;
    private Map<String, Object> informacion;

    public Respuesta() {
        // TODO [codificar el cuerpo del método]
        setInformacion(new HashMap<String, Object>());
    }

    /**
     * Constructor
     * @author
     * @param estatus
     * @param mensaje
     * @param informacion
     */
    public Respuesta(int estatus, String mensaje, Map<String, Object> informacion) {
        this.estatus = estatus;
        this.mensaje = mensaje;
        this.setInformacion(informacion);
    }

    /**
     * Constructor
     * @author
     * @param estatus
     * @param mensaje
     */
    public Respuesta(int estatus, String mensaje) {
        this.estatus = estatus;
        this.mensaje = mensaje;
    }

    /**
     * Constructor
     * @author
     * @param estatus
     * @param mensaje
     * @param llave
     * @param valor
     */
    public Respuesta(int estatus, String mensaje, String llave, Object valor) {
        this.estatus = estatus;
        this.mensaje = mensaje;
        this.getInformacion().put(llave, valor);
    }



    /**
     * @return el atributo estatus
     */
    public int getEstatus() {
        return estatus;
    }

    /**
     * @param estatus parametro estatus a actualizar
     */
    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    /**
     * @return el atributo mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje parametro mensaje a actualizar
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return el atributo informacion
     */
    public Map<String, Object> getInformacion() {
        if(null == informacion){
            informacion = new HashMap<String,Object>();
        }
        return informacion;
    }

    /**
     * @param informacion parametro informacion a actualizar
     */
    public void setInformacion(Map<String, Object> informacion) {
        this.informacion = informacion;
    }
}
