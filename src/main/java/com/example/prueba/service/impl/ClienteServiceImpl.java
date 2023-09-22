package com.example.prueba.service.impl;

import com.example.prueba.model.ClienteModel;
import com.example.prueba.model.Respuesta;
import com.example.prueba.repository.ClienteRepo;
import com.example.prueba.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ClienteService")
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    public ClienteRepo clienteRepository;

    @Override
    public Respuesta obtenerCliente() {
        return new Respuesta(1,"Ejecutado", "clientes", clienteRepository.obtenerClientes());
    }

    @Override
    public Respuesta guardarCliente(ClienteModel clienteModel) {
        return new Respuesta(1,"Ejecutado", "exito",clienteRepository.guardarCliente(clienteModel));
    }

    @Override
    public Respuesta editarCliente(ClienteModel clienteModel) {
        return new Respuesta(1,"Ejecutado", "exito",clienteRepository.editarCliente(clienteModel));
    }

    @Override
    public Respuesta eliminarCliente(Integer id) {
        return new Respuesta(1,"Ejecutado", "exito", clienteRepository.eliminarCliente(id));
    }
}
