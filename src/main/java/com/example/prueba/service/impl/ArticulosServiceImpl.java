package com.example.prueba.service.impl;

import com.example.prueba.model.ArticuloModel;
import com.example.prueba.model.Respuesta;
import com.example.prueba.repository.ArticuloRepo;
import com.example.prueba.service.ArticulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("ArticuloService")
public class ArticulosServiceImpl implements ArticulosService {

    @Autowired
    private ArticuloRepo articuloRepo;


    @Override
    public Respuesta obtenerArticulos() {
        return new Respuesta(1,"Ejecutado", "articulos", articuloRepo.obtenerArticulos());
    }
    @Override
    public Respuesta insertarArticulo(ArticuloModel articuloModel){
        return new Respuesta(1,"Ejecutado", "exito", articuloRepo.agregarArticulo(articuloModel));
    }
    @Override
    public Respuesta editarArticulo(ArticuloModel articuloModel){
        ArticuloModel articulo = articuloRepo.obtenerArticulosId(articuloModel.getIdArticulo());
        articulo.setDescripcion(articuloModel.getDescripcion());
        articulo.setNombre(articuloModel.getNombre());
        articulo.setPrecio(articuloModel.getPrecio());
        try {
            articuloRepo.editarArticulo(articulo);
            return new Respuesta(1,"Ejecutado", "exito", 1);
        }catch (Exception e){
            return new Respuesta(0,"Ejecutado", "exito", e.getMessage());
        }
    }

    @Override
    public Respuesta eliminarArticulo(Integer id) {
        return new Respuesta(1,"Ejecutado", "exito", articuloRepo.eliminarArticulo(id));
    }
}
