package com.example.prueba.service.impl;

import com.example.prueba.model.ImprimirModel;
import com.example.prueba.model.PartidasPedidoModel;
import com.example.prueba.model.PedidosModel;
import com.example.prueba.model.Respuesta;
import com.example.prueba.repository.ParidasPedidoRepo;
import com.example.prueba.service.PartidasPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("PartidasPedidoService")
public class PartidasPedidoServiceImpl implements PartidasPedidoService {
    @Autowired
    private ParidasPedidoRepo pedidosModelPedidoRepo;
    @Override
    public Respuesta insertarPedido(PartidasPedidoModel partidasPedidoModel) {
        return new Respuesta(1,"Ejecutado", "exito", pedidosModelPedidoRepo.guardarPedido(partidasPedidoModel));
    }

    @Override
    public List<ImprimirModel> imprimirPedido(Integer idCliente) {
        return pedidosModelPedidoRepo.imprimir(idCliente);
    }
}
