package com.example.prueba.service;

import com.example.prueba.model.ArticuloModel;
import com.example.prueba.model.Respuesta;

import java.util.List;
import java.util.Map;

public interface ArticulosService {
    public Respuesta obtenerArticulos();
    public Respuesta insertarArticulo(ArticuloModel articuloModel);
    public Respuesta editarArticulo(ArticuloModel articuloModel);
    public Respuesta eliminarArticulo(Integer id);
}
