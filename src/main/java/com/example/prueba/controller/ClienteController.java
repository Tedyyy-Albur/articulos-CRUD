package com.example.prueba.controller;

import com.example.prueba.model.ClienteModel;
import com.example.prueba.model.Respuesta;
import com.example.prueba.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @ResponseBody
    @RequestMapping(value = "/obtener", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Respuesta guardarArticulo() {
        return  clienteService.obtenerCliente();
    }
    @ResponseBody
    @RequestMapping(value = "/guardar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Respuesta guardarArticulo(@RequestBody ClienteModel clienteModel) {
        return  clienteService.guardarCliente(clienteModel);
    }
    @ResponseBody
    @RequestMapping(value = "/editar", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Respuesta editarArticulo(@RequestBody ClienteModel clienteModel) {
        return  clienteService.editarCliente(clienteModel);
    }
    @ResponseBody
    @RequestMapping(value = "/eliminar", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Respuesta eliminarArticulo(@RequestBody Integer id) {
        return  clienteService.eliminarCliente(id);
    }
}
