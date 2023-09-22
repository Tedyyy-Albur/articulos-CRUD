package com.example.prueba.repository;

import com.example.prueba.model.ArticuloModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ArticuloRepo {

    @Select("SELECT " +
            " id_articulo as idArticulo, " +
            " nombre, " +
            " descripcion, " +
            " precio " +
            " FROM articulo ")
    List<ArticuloModel> obtenerArticulos();
    @Select("SELECT " +
            " id_articulo as idArticulo, " +
            " nombre, " +
            " descripcion, " +
            " precio " +
            " FROM articulo where id_articulo=#{id}")
    ArticuloModel obtenerArticulosId(Integer id);
    @Insert(" INSERT INTO articulo\n" +
            " (nombre, descripcion, precio)\n" +
            " VALUES(#{nombre}, #{descripcion}, #{precio})" )
    Integer agregarArticulo(ArticuloModel articuloModel);
    @Update(" UPDATE articulo " +
            " SET nombre=#{nombre}, descripcion=#{descripcion}, precio=#{precio} " +
            " WHERE id_articulo=#{idArticulo} ")
    Integer editarArticulo(ArticuloModel articuloModel);
    @Delete(" DELETE FROM articulo WHERE id_articulo=#{id} ")
    Integer eliminarArticulo(Integer id);
}
