package com.example.prueba.controller;

import com.example.prueba.model.ArticuloModel;
import com.example.prueba.model.PedidosModel;
import com.example.prueba.model.Respuesta;
import com.example.prueba.service.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {
    @Autowired
    private PedidosService pedidosService;

    @ResponseBody
    @RequestMapping(value = "/guardar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Respuesta guardarPedido(@RequestBody PedidosModel pedidosModel) {
        return  pedidosService.insertarPedido(pedidosModel);
    }
    @ResponseBody
    @RequestMapping(value = "/listar", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Respuesta listarPedido(@RequestParam Integer id) {
        return  pedidosService.listarPedido(id);
    }
}
