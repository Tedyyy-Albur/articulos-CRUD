package com.example.prueba.model;

public class ImprimirModel {
    private Integer idPedido;
    private String nombre;
    private String nombreCliente;
    private Integer cantidad;
    private Float precio;
    private Float totalPago;

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Float getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(Float totalPago) {
        this.totalPago = totalPago;
    }
}
