package com.example.prueba.service;

import com.example.prueba.model.ImprimirModel;
import com.example.prueba.model.PartidasPedidoModel;
import com.example.prueba.model.PedidosModel;
import com.example.prueba.model.Respuesta;

import java.util.List;
import java.util.Map;

public interface PartidasPedidoService {
    public Respuesta insertarPedido(PartidasPedidoModel partidasPedidoModel);
    public List<ImprimirModel> imprimirPedido(Integer idCliente);
}
