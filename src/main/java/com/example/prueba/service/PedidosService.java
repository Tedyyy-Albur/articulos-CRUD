package com.example.prueba.service;

import com.example.prueba.model.PedidosModel;
import com.example.prueba.model.Respuesta;

public interface PedidosService {
    public Respuesta insertarPedido(PedidosModel pedidosModel);
    public Respuesta listarPedido(Integer id);

}
