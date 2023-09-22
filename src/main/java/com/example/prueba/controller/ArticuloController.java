package com.example.prueba.controller;

import com.example.prueba.model.ArticuloModel;
import com.example.prueba.model.Respuesta;
import com.example.prueba.service.ArticulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/articulo")
public class ArticuloController {
    @Autowired
    private ArticulosService articulosService;
    @ResponseBody
    @RequestMapping(value = "/obtener", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Respuesta guardarArticulo() {
        return  articulosService.obtenerArticulos();
    }
    @ResponseBody
    @RequestMapping(value = "/guardar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Respuesta guardarArticulo(@RequestBody ArticuloModel articuloModel) {
        return  articulosService.insertarArticulo(articuloModel);
    }
    @ResponseBody
    @RequestMapping(value = "/editar", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Respuesta editarArticulo(@RequestBody ArticuloModel articuloModel) {
        return  articulosService.editarArticulo(articuloModel);
    }
    @ResponseBody
    @RequestMapping(value = "/eliminar", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Respuesta eliminarArticulo(@RequestBody Integer id) {
        return  articulosService.eliminarArticulo(id);
    }
}
