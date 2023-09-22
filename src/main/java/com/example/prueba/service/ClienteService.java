package com.example.prueba.service;


import com.example.prueba.model.ClienteModel;
import com.example.prueba.model.Respuesta;

public interface ClienteService {
    public Respuesta obtenerCliente();
    public Respuesta guardarCliente(ClienteModel clienteModel);
    public Respuesta editarCliente(ClienteModel clienteModel);
    public Respuesta eliminarCliente(Integer id);
}
