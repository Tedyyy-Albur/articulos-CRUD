package com.example.prueba.service.impl;

import com.example.prueba.model.PedidosModel;
import com.example.prueba.model.Respuesta;
import com.example.prueba.repository.PedidosRepo;
import com.example.prueba.service.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PedidosService")
public class PedidosServiceImpl implements PedidosService {
    @Autowired
    private PedidosRepo pedidosRepo;
    @Override
    public Respuesta insertarPedido(PedidosModel pedidosModel) {
        return new Respuesta(1,"Ejecutado", "exito", pedidosRepo.guardarPedido(pedidosModel));
    }

    @Override
    public Respuesta listarPedido(Integer id) {
        return new Respuesta(1,"Ejecutado", "exito", pedidosRepo.listarPedido(id));
    }
}
